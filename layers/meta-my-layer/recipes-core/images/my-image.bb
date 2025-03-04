SUMMARY = "My Image Summary"
LICENSE = "MIT"

inherit image

IMAGE_FSTYPES = "wic"

IMAGE_INSTALL = " \
  packagegroup-base-extended \
  packagegroup-core-boot \
  packagegroup-core-ssh-openssh \
  my-packagegroup \
"

inherit extrausers
EXTRA_USERS_PARAMS = "usermod -p '$(openssl passwd -5 root)' root;"
