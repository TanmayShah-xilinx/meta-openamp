SRCBRANCH ?= "main"
SRCREV = "${AUTOREV}"
BRANCH = "main"
PV = "${SRCBRANCH}+git${SRCPV}"
DEFAULT_PREFERENCE = "-1"

include libmetal.inc
