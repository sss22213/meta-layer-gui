# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://PAL/Crypto/MbedTLS/Ed25519/LICENSE;md5=9ca5a9d3fcf447a1090c0e12167684ec"

SRC_URI = "git://github.com/apple/HomeKitADK;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "eeee1a336164398b7a48f7d5c31a03f43d8ed100"

S = "${WORKDIR}/git"

# NOTE: the following library dependencies are unknown, ignoring: mbedcrypto
#       (this is based on recipes that have previously been built and packaged)
# NOTE: some of these dependencies may be optional, check the Makefile and/or upstream documentation
DEPENDS = "openssl"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	make DOCKER=0
	oe_runmake
}

do_install () {
	# NOTE: unable to determine what to put here - there is a Makefile but no
	# target named "install", so you will need to define this yourself
	:
}

