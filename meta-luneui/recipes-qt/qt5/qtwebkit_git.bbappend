DEPENDS += "luna-service2 pmloglib"

# Don't use qtmultimedia which is set by default PACKAGECONFIG
PACKAGECONFIG = "gstreamer qtlocation qtsensors"

inherit webos_ports_fork_repo
SRC_URI = "${WEBOS_PORTS_GIT_REPO_COMPLETE}"
SRCREV = "3a2cb4770cdee45cbc58a2b28ecaf7706a5cd32d"

THUMB_SUPPORT = " QMAKE_CXXFLAGS+=-mthumb"
# Build breaks for qemuarm with errors while building JavaScriptCore:
# | {standard input}: Assembler messages:
# | {standard input}:90: Error: invalid immediate: 983040 is out of range
# | {standard input}:90: Error: value of 983040 too large for field of 2 bytes at 44
# [...]
THUMB_SUPPORT_qemuarm = ""

EXTRA_QMAKEVARS_PRE_arm_append = " ${THUMB_SUPPORT}"