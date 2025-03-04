do_install:append() {
    mkdir -p ${D}/${sysconfdir}/ssh/sshd_config.d/
    echo "PermitRootLogin yes" >> ${D}/${sysconfdir}/ssh/sshd_config.d/allowroot.conf
}

FILES:${PN}-sshd += "${sysconfdir}/ssh/sshd_config.d"
