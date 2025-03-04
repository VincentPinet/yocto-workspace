# yocto-workspace

Basic minimal workspace template to build your own Raspberry Pi 4 firmware with Yocto

## Getting started

```sh
git clone https://github.com/VincentPinet/yocto-workspace.git
cd yocto-workspace
kas build
dd if=build/tmp-glibc/deploy/images/my-machine/my-image-my-machine.rootfs.wic of=<your_sd_card_here>
```

## Structure

```sh
.
└── yocto-workspace
    ├── README.md
    └── layers
        ├── meta-my-layer
        │   ├── conf
        │   │   ├── distro
        │   │   └── machine
        │   ├── recipes
        │   │   └── my-app
        │   ├── recipes-append
        │   └── recipes-core
        │       ├── images
        │       └── packagegroups
        ├── meta-openembedded
        ├── meta-raspberrypi
        └── poky
```
