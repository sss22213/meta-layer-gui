SRC := $(shell pwd)

MODULE_NAME = mlx90614
obj-m := $(MODULE_NAME).o

all:
	make -C $(KERNEL_SRC) M=$(SRC)
modules_install:
	make -C $(KERNEL_SRC) M=$(SRC) modules_install
clean:
	make -C $(KERNEL_DIR) M=$(SRC) clean
