SUMMARY = "My Packagegroup"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    my-app \
    \
    hostapd \
    dnsmasq \
    lighttpd \
"
