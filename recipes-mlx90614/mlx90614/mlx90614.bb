# Package summary
SUMMARY = "mlx90614 driver"

inherit module

PR = "r42"

# Package license
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# Source code
SRC_URI = "file://mlx90614.c \
            file://Makefile"

# Change source directory to workdirectory where hello-world.cpp is
S = "${WORKDIR}"

RPROVIDES_${PR} += "kernel-module-mlx90614"