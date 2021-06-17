# Package summary
SUMMARY = "amg8833 driver"

inherit module

PR = "r24"

# Package license
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# Source code
SRC_URI = "file://amg8833.c \
            file://Makefile"

# Change source directory to workdirectory where hello-world.cpp is
S = "${WORKDIR}"

RPROVIDES_${PN} += "kernel-module-amg8833"