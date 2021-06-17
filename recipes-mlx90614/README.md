# Linux-driver-for-amg8833

## Test Environment:
 - Board: Raspberry pi 4b

## Install guide:
  1. Compile device tree
  ```bash=
    dtc -@ -I dts -O dtb -o amg8833-i2c.dtbo amg8833-i2c.dti
  ```
  2. Move device tree binary code to /boot/firmware/overlays/
  3. Add line on /boot/firmware/config.txt
  ```text=
  + dtoverlay=amg8833-i2c  
  ```
  4. reboot
  5. Compile driver
  ```bash=
  make
  ```
  6. Load module
  ```bash=
  sudo insmod amg8833_i2c_drv.ko
  ```
  7. Compile test program
  ```bash=
  make test
  ```
  8. Give permission
  ```bash=
  sudo chmod 666 /dev/amg8833
  ```
  9. Excute test
  ```bash=
  ./test
  ```

## Spec
[amg8833 spec](https://industry.panasonic.eu/components/sensors/industrial-sensors/grid-eye/amg88xx-high-performance-type/amg8833-amg8833)

## Data format
```text=
0x55 0x00 ... 0x55 0x00
```

Every two bytes represent temperature of one pixel.

The First byte is LSB, and second is MSB.

The sign in fourth bit on MSB.

