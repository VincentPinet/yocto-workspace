DESCRIPTION = "lf (as in list files) is a terminal file manager written in Go with a heavy inspiration from ranger file manager"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=b4f532f2a7e6eca0ab03ea2b4b8900fa"

GO_IMPORT = "github.com/gokcehan/lf"
SRC_URI = " \
    git://${GO_IMPORT};branch=master;protocol=https \
    file://lfrc \
    file://icons \
"

SRCREV = "88b3c999afb7cab8e8ca61da3c9063f0cc348c10"

inherit go-mod

do_compile[network] = "1"

do_install:append() {
    install -d ${D}/${sysconfdir}/lf
	install -m 0755 ${WORKDIR}/lfrc ${D}/${sysconfdir}/lf
	install -m 0755 ${WORKDIR}/icons ${D}/${sysconfdir}/lf
}

FILES:${PN}:append = " \
    ${sysconfdir}/lf/lfrc \
    ${sysconfdir}/lf/icons \
"
