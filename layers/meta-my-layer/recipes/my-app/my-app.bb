LICENSE = "CLOSED"

SRC_URI = " \
  file://src \
  file://my-app.init \
"

S = "${UNPACKDIR}/src"

inherit cmake

inherit update-rc.d
INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME:${PN} = "my-app"
INITSCRIPT_PARAMS:${PN} = "defaults 89"

do_install:append() { 
    install -d "${D}${sysconfdir}/init.d/"
    install -m 0755 "${UNPACKDIR}/my-app.init" "${D}${sysconfdir}/init.d/my-app"
}
