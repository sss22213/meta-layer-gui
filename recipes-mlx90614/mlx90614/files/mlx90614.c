#include <linux/module.h>
#include <linux/kernel.h>
#include <linux/init.h>
#include <linux/i2c.h>
#include <linux/string.h>
#include <linux/fs.h>
#include <linux/slab.h>
#include <linux/cdev.h>
#include <linux/device.h>
#include <linux/delay.h>

#define MLX90614_DEV_NAME "mlx90614"

/* Follow spec */
/*  EEPROM region */
/* RAM region */
#define MLX90614_AREA_TEMPERATURE   0x06
#define MLX90614_OBJ1_TEMPERATURE   0x07
#define MLX90614_OBJ2_TEMPERATURE   0x08

static struct class *mlx90614_class = NULL;

/* mlx90614 mutex */
struct mutex mlx90614_clients_lock;

static dev_t dev = 0;

/* mlx90614 character device struct*/
struct mlx90614_i2c_cdev {
    struct i2c_client *client;
    struct cdev cdev;
};

/**
 * Read temperature from sensor.
 * Follow spec, sensor provide smbus protocol with PEC.
 */
static void read_temperature(struct i2c_client *client, u8 *temperature)
{
    /* Record temperature from sensor */
    int ta = 0;
    int tobj1 = 0;
    int tobj2 = 0;

    /* Read temperature of area from sensor */
    ta = i2c_smbus_read_word_data(client, MLX90614_AREA_TEMPERATURE);

    msleep(1);

    /* Read temperature of obj1 from sensor */
    tobj1 = i2c_smbus_read_word_data(client, MLX90614_OBJ1_TEMPERATURE);

    msleep(1);

    /* Read temperature of obj2 from sensor */
    tobj2 = i2c_smbus_read_word_data(client, MLX90614_OBJ2_TEMPERATURE);

    msleep(1);

    /* Due to type of retuen value is u8, split value of temperature */
    temperature[0] = ta & 0xFF;
    temperature[1] = ta >> 8;
    temperature[2] = tobj1 & 0xFF;
    temperature[3] = tobj1 >> 8;
    temperature[4] = tobj2 & 0xFF;
    temperature[5] = tobj2 >> 8;
}

static int mlx90614_i2c_open(struct inode *inode, struct file *filp)
{
    struct mlx90614_i2c_cdev *mlx90614 = container_of(inode->i_cdev, struct mlx90614_i2c_cdev, cdev);

    pr_info("Open device.\n");

    filp->private_data = mlx90614->client;

    return 0;
}

static ssize_t mlx90614_i2c_read(struct file *filp, char __user *buf, size_t count, loff_t *offset)
{
    struct i2c_client *client = filp->private_data;
    if (!client) {
    	pr_err("Failed to get struct i2c_client.\n");
	    return -EINVAL;
    }
 
    /* Mutex for prevent mutiuser */
    mutex_lock(&mlx90614_clients_lock);

    /* Read temperature from sensor */
    read_temperature(client, buf);

    count = 6;

    mutex_unlock(&mlx90614_clients_lock);

    /* Return byte size*/
    return 6;
}

struct file_operations mlx90614_i2c_fops = {
    .open = mlx90614_i2c_open,
    .read = mlx90614_i2c_read,
};


static int mlx90614_probe(struct i2c_client *client, const struct i2c_device_id *id)
{
    struct mlx90614_i2c_cdev *mlx90614 = NULL;

    struct device *device = NULL;

    pr_info("Probe device of mlx90614.\n");

    /* Alloc space for cdev */
    alloc_chrdev_region(&dev, 0, 1, MLX90614_DEV_NAME);

    /* Create class for mlx90614 */
    mlx90614_class = class_create(THIS_MODULE, MLX90614_DEV_NAME);

    mlx90614 = kzalloc(sizeof(struct mlx90614_i2c_cdev), GFP_KERNEL);

    mlx90614->client = client;

    /* Initialize character */
    cdev_init(&(mlx90614->cdev), &mlx90614_i2c_fops);

    mlx90614->cdev.owner = THIS_MODULE;

    /* Add character to system */
    cdev_add(&(mlx90614->cdev), dev, 1);

    /* Create device */
    device = device_create(mlx90614_class, NULL, dev, NULL, MLX90614_DEV_NAME);

    i2c_set_clientdata(client, mlx90614);

    /* Initialize mutex */
    mutex_init(&mlx90614_clients_lock);

    return 0;
  
}

static int mlx90614_remove(struct i2c_client *client)
{
    pr_info("Remove device of mlx90614.\n");

    device_destroy(mlx90614_class, dev);

    class_destroy(mlx90614_class);

    unregister_chrdev_region(dev, 1);

    return 0;
}

static struct of_device_id mlx90614_id_tables[] = {
    { .compatible="mlx90614", },
    { }
};

MODULE_DEVICE_TABLE(of, mlx90614_id_tables);

static struct i2c_driver mlx90614_drv = {
    .probe = mlx90614_probe,
    .remove = mlx90614_remove,
    .driver = {
    	.name = "mlx90614 device 0.1",
	.owner = THIS_MODULE,
	.of_match_table = mlx90614_id_tables,
    },
};

MODULE_AUTHOR("Bohung Nian <n0404.n0404 at="" gmail.com="">");
module_i2c_driver(mlx90614_drv);
MODULE_LICENSE("GPL");
