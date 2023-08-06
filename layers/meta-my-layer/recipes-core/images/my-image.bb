SUMMARY = "My Image summary"
LICENSE = "MIT"

inherit image

IMAGE_INSTALL = " \
  packagegroup-core-boot \
  packagegroup-base-extended \
  packagegroup-core-ssh-openssh \
  my-packagegroup \
  micro \
  lf \
"

# Let's not build 4 versions of the same thing
IMAGE_FSTYPES = "wic.bz2"

# Good old root:root to have fun on target
inherit extrausers
EXTRA_USERS_PARAMS = "usermod -p '$(openssl passwd -5 root)' root;"
