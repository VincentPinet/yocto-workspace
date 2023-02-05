# yocto-workspace

Basic minimal workspace template to build your own Raspberry Pi 4 firmware with Yocto

## Getting started

```sh
git clone --recurse-submodules https://github.com/VincentPinet/yocto-workspace.git
cd yocto-workspace
source oe-init-build-env
bitbake my-image
```

Flash image at ***build/tmp-glibc/deploy/images/my-machine/my-image-my-machine.rootfs.wic.bz2*** on SD card and boot.

## Structure

Unfortunately openembedded-core doesn't have meta '***meta***' available as a standalone. Using *repo* utility is out of the question, forking to delete most things is a nightmare for upstream maintenance and *git sparse submodule* isn't a thing..  
So might aswell submodule the whole poky for bitbake and oe scripts shenanigans.

Therefore, here is what I landed on:

```sh
└── yocto-workspace  
    ├── build  
    │   ├── cache  
    │   ├── conf  
    │   ├── downloads  
    │   ├── sstate-cache  
    │   └── tmp-glibc  
    ├── layers  
    │   ├── meta-my-layer  
    │   ├── meta-openembedded  
    │   ├── meta-raspberrypi  
    │   └── poky  
    │       ├── bitbake  
    │       ├── meta  
    │       ├── oe-init-build-env  
    │       ├── scripts  
    │       └── ... (bloatwares)
    ├── oe-init-build-env  
    └── README.md (you are here)  
```
