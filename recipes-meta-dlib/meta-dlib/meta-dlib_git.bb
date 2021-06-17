# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A toolkit for making real world machine learning and data analysis applications"
HOMEPAGE = "https://github.com/davisking/dlib"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.txt
#   python_examples/LICENSE_FOR_EXAMPLE_PROGRAMS.txt
#   dlib/LICENSE.txt
#   dlib/external/libpng/LICENSE
#   dlib/external/pybind11/LICENSE
#   examples/LICENSE_FOR_EXAMPLE_PROGRAMS.txt
#   examples/video_frames/license.txt
#   docs/docs/license.xml
LICENSE = "Boost-Software"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2c7a3fa82e66676005cd4ee2608fd7d2 \
                    file://python_examples/LICENSE_FOR_EXAMPLE_PROGRAMS.txt;md5=064f53ab40ea2b6a4bba1324149e4fde \
                    file://dlib/LICENSE.txt;md5=2c7a3fa82e66676005cd4ee2608fd7d2 \
                    file://dlib/external/libpng/LICENSE;md5=243135ddedf702158f9170807cbcfb66 \
                    file://dlib/external/pybind11/LICENSE;md5=beb87117af69fd10fbf9fb14c22a2e62 \
                    file://examples/LICENSE_FOR_EXAMPLE_PROGRAMS.txt;md5=57eee82829ed297e23d84de5f905afee \
                    file://examples/video_frames/license.txt;md5=127ee508b60a6be9dea8af3b441993dc \
                    file://docs/docs/license.xml;md5=2e6ff4080dcb217d4d300b90e9aabb5b"

SRC_URI = "git://github.com/davisking/dlib;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "973de8ac734a2f2cb07edcd97f657581d82a9236"

S = "${WORKDIR}/git"

inherit setuptools3

inherit cmake

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-core"
