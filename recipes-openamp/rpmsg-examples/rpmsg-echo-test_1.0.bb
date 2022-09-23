SUMMARY = "RPMsg examples: echo test demo"

HOMEPAGE = "https://github.com/OpenAMP/openamp-system-reference"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://examples/linux/rpmsg-echo-test/LICENSE;md5=b30cbe0b980e98bfd9759b1e6ba3d107"

#REPO ?= "git://github.com/OpenAMP/openamp-system-reference;protocol=https"
REPO ?= "git://github.com/TanmayShah-xilinx/openamp-system-reference;protocol=https"

#BRANCH = "main"
BRANCH = "rpmsg_echo_test_kernelspace"
SRC_URI = "${REPO};branch=${BRANCH};"
SRCREV = "${AUTOREV}"
SRC_URI[sha256sum] = "96169ab95166de8b8a8c18e4084948af66b03c5e22305fa736cfbd2620b5fd7e"

S = "${WORKDIR}/git"

RRECOMMENDS_${PN} = "kernel-module-rpmsg-char"

EXTRA_OEMAKE += " \
	-C ${S}/examples/linux/rpmsg-echo-test \
	"

FILES_${PN} = "\
	/usr/bin/echo_test \
"

do_install () {
	install -d ${D}/usr/bin
	install -m 0755 examples/linux/rpmsg-echo-test/echo_test ${D}/usr/bin/echo_test
}
