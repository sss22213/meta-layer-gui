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

#define AMG8833_DEV_NAME "amg8833"

/* Follow spec */
#define AMG8833_TEMPERATURE_START_REGISTER 0x80
#define PIXEL_AMOUNT 64

static struct class *amg8833_class = NULL;

/* amg8833 mutex */
struct mutex amg8833_clients_lock;

static dev_t dev = 0;

/* amg8833 character device struct*/
struct amg8833_i2c_cdev {
    struct i2c_client *client;
    struct cdev cdev;
};

/* Read temperature from one pixel */
static void read_temperature_pixel(struct i2c_client *client, int pixel_number, u8 *temperature)
{
   
    /* Record i2c transfer status*/
    int status = 0;

    /* Check if pixel number is exist or not */
    if (pixel_number < 0 || pixel_number > PIXEL_AMOUNT-1) {
        return;
    }

    /* Read temperature from sensor */
    status = i2c_smbus_write_byte(client, AMG8833_TEMPERATURE_START_REGISTER + (pixel_number * 2));
    if(status < 0) {
        return;
    }

    /* Follow spec, LSB is first byte, and MSB is second byte */
    status = i2c_master_recv(client, temperature, 2);
    if(status < 0) {
        return;
    }
}

/* Read temperature from amg8833 */
static int read_temperature(struct i2c_client *client, u8 *buf)
{
    int temp_pixel_idx = 0;

    /* For save temperature */
    u8 *ptr_tmp = buf;

    u8 tmp_buff[2] = {0}; 

    /* Read all temperature of pixel */
    for(temp_pixel_idx = 0; temp_pixel_idx < PIXEL_AMOUNT; temp_pixel_idx++) {
        read_temperature_pixel(client, temp_pixel_idx, tmp_buff);
        *ptr_tmp = tmp_buff[0];
        ptr_tmp++;
        *ptr_tmp = tmp_buff[1];
        ptr_tmp++;
    }

    /* Success obtain temperature */
    return 0;
}

static ssize_t amg8833_i2c_open(struct inode *inode, struct file *filp)
{
    struct amg8833_i2c_cdev *amg8833 = container_of(inode->i_cdev, struct amg8833_i2c_cdev, cdev);

    pr_info("Open device.\n");

    filp->private_data = amg8833->client;

    return 0;
}

static ssize_t amg8833_i2c_read(struct file *filp, char __user *buf, size_t count, loff_t *offset)
{
    int status = -1;

    struct i2c_client *client = filp->private_data;
    if (!client) {
    	pr_err("Failed to get struct i2c_client.\n");
	    return -EINVAL;
    }
 
    /* Mutex for prevent mutiuser */
    mutex_lock(&amg8833_clients_lock);

    /* Read temperature from sensor */
    read_temperature(client, buf);

    count = 128;

    mutex_unlock(&amg8833_clients_lock);

    return 0;
}

struct file_operations amg8833_i2c_fops = {
    .open = amg8833_i2c_open,
    .read = amg8833_i2c_read,
};


static int amg8833_probe(struct i2c_client *client, const struct i2c_device_id *id)
{
    struct amg8833_i2c_cdev *amg8833 = NULL;

    struct device *device = NULL;

    pr_info("Probe device of amg8833.\n");

    /* Alloc space for cdev */
    alloc_chrdev_region(&dev, 0, 1, AMG8833_DEV_NAME);

    /* Create class for amg8833 */
    amg8833_class = class_create(THIS_MODULE, AMG8833_DEV_NAME);

    amg8833 = kzalloc(sizeof(struct amg8833_i2c_cdev), GFP_KERNEL);

    amg8833->client = client;

    /* Initialize character */
    cdev_init(&(amg8833->cdev), &amg8833_i2c_fops);

    amg8833->cdev.owner = THIS_MODULE;

    /* Add character to system */
    cdev_add(&(amg8833->cdev), dev, 1);

    /* Create device */
    device = device_create(amg8833_class, NULL, dev, NULL, AMG8833_DEV_NAME);

    i2c_set_clientdata(client, amg8833);

    /* Initialize mutex */
    mutex_init(&amg8833_clients_lock);

    return 0;
  
}

static int amg8833_remove(struct i2c_client *client)
{
    pr_info("Remove device of amg8833.\n");

    device_destroy(amg8833_class, dev);

    class_destroy(amg8833_class);

    unregister_chrdev_region(dev, 1);

    return 0;
}

static struct of_device_id amg8833_id_tables [] = {
    { .compatible="amg8833", },
    { }
};

MODULE_DEVICE_TABLE(of, amg8833_id_tables);

static struct i2c_driver amg8833_drv = {
    .probe = amg8833_probe,
    .remove = amg8833_remove,
    .driver = {
    	.name = "amg8833 device 0.1",
	.owner = THIS_MODULE,
	.of_match_table = amg8833_id_tables,
    },
};

MODULE_AUTHOR("Bohung Nian <n0404.n0404 at="" gmail.com="">");
module_i2c_driver(amg8833_drv);
MODULE_LICENSE("GPL");