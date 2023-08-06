DESCRIPTION = "micro is a terminal-based text editor that aims to be easy to use and intuitive"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=5d3b6c44af6e9177296f05709aab74a4"

GO_IMPORT = "github.com/zyedidia/micro"
SRC_URI = " \
    git://${GO_IMPORT};branch=master;protocol=https \
    file://bindings.json \
    file://settings.json \
"

SRCREV = "225927b9a25f0d50ea63ea18bc7bb68e404c0cfd"

inherit go-mod

do_compile[network] = "1"

microconfigdir="/home/root/.config/micro"

do_install:append() {
    install -d ${D}/${microconfigdir}/
	install -m 0755 ${WORKDIR}/bindings.json ${D}/${microconfigdir}/
	install -m 0755 ${WORKDIR}/settings.json ${D}/${microconfigdir}/
}

FILES:${PN}:append = " \
    ${microconfigdir}/settings.json \
    ${microconfigdir}/bindings.json \
"
