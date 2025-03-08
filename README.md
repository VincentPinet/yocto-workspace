# yocto-workspace

Basic minimal workspace template to build your own Raspberry Pi Linux distro with Yocto

## Requirements

[Yocto](https://docs.yoctoproject.org/ref-manual/system-requirements.html#required-packages-for-the-build-host)  
[kas](https://kas.readthedocs.io/en/latest/userguide/getting-started.html) *(actually don't follow that just `sudo apt install kas`)*  

## Getting started

```sh
git clone https://github.com/VincentPinet/yocto-workspace.git
cd yocto-workspace
kas build
dd if="build/tmp/deploy/images/my-machine/my-image-my-machine.rootfs.wic" of="<your_sd_card_here>"
```

## Structure

```sh
└── yocto-workspace
    ├── .config.yaml # https://kas.readthedocs.io/en/latest/userguide/project-configuration.html
    ├── README.md    # (you are here)
    └── layers
        ├── meta-my-layer
        │   ├── conf
        │   │   ├── distro
        │   │   │   └── my-distro.conf
        │   │   ├── machine
        │   │   │   └── my-machine.conf     # modify first 2 lines here to whatever rpi model you have
        │   │   └── layer.conf
        │   ├── recipes             # recipes you write from scratch
        │   │   └── my-app
        │   │       └── my-app.bb
        │   ├── recipes-append      # already existing recipe in other layer that you want to customize
        │   │   ├── busybox
        │   │   │   └── busybox_%.bbappend
        │   └── recipes-core        # exclusively for images and packagegroups
        │       ├── images
        │       │   └── my-image.bb
        │       └── packagegroups
        │           └── my-packagegroup.bb
        ├── meta-openembedded # dependency populated by kas
        │   └── ...
        ├── meta-raspberrypi  # dependency populated by kas
        │   └── ...
        └── poky              # dependency populated by kas
            └── ...             # (bitbake executable is down here somewhere)
```

## VSCode integration

[Yocto Project BitBake](https://marketplace.visualstudio.com/items?itemName=yocto-project.yocto-bitbake ) 
```json
{
    "bitbake.commandWrapper": "kas shell -c",
    "bitbake.pathToBitbakeFolder": "${workspaceFolder}/layers/poky/bitbake",
    "python.analysis.exclude": ["**/build"]
}
```
