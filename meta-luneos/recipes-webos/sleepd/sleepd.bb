# Copyright (c) 2012-2018 LG Electronics, Inc.

SUMMARY = "Sleep scheduling policy daemon"
AUTHOR = "Sapna Todwal <sapna.todwal@lge.com>"
SECTION = "webos/base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "nyx-lib luna-service2 json-c libxml2 sqlite3 glib-2.0"

RDEPENDS_${PN} += "powerd"

inherit webos_ports_fork_repo
inherit webos_cmake
inherit pkgconfig
inherit webos_system_bus
inherit webos_systemd

PV = "2.0.0-1+git${SRCPV}"

WEBOS_GIT_PARAM_BRANCH = "webOS-ports/webOS-OSE"
SRC_URI = "${WEBOS_PORTS_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

SRCREV = "805f724dd3d499e5d269be4cd15cae65d0f11116"
