DESCRIPTION = "Crow is a C++ microframework for running web services"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=50b5835246dde78e0929b8b9cdcd2f95"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/crowcpp/crow;branch=master;protocol=https"

S = "${WORKDIR}/git"

DEPENDS = "asio openssl"

inherit cmake
EXTRA_OECMAKE = "-DCROW_BUILD_EXAMPLES=OFF -DCROW_BUILD_TESTS=OFF -DCROW_FEATURES=ssl"
