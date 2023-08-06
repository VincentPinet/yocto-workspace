DESCRIPTION = "Crow is a C++ microframework for running web services"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=50b5835246dde78e0929b8b9cdcd2f95"

SRCREV = "edf12f699ec3bf6f751cf73cb97f32919e48ca6e"
SRC_URI = "git://github.com/crowcpp/crow;nobranch=1;protocol=https"

S = "${WORKDIR}/git"

DEPENDS = "asio openssl"

inherit cmake
EXTRA_OECMAKE = "-DCROW_BUILD_EXAMPLES=OFF -DCROW_BUILD_TESTS=OFF -DCROW_FEATURES=ssl"
