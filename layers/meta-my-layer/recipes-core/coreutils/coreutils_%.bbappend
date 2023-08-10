# I want to keep busybox's version of everything but ***sort***
# update-alternatives is not enough to do the selection because 
# it's not a clear overlap, coreutils has some that busybox doesn't
# and I don't want to have to ship them.

ALTERNATIVE:${PN} = "sort"
ALTERNATIVE:${PN}-doc = "sort"

do_install:append:class-target() {
    rm -rf ${D}/${base_bindir}
    rm -rf ${D}/${sbindir}
    rm -rf ${D}/${bindir}/*
    install ${B}/src/sort ${D}/${bindir}
}
