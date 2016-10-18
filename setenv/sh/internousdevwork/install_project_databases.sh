#!/bin/sh
mysql -u root -p << EOF
# ---
# ---
# [201407]
# --- 某中小企業向け　書籍管理サイト[bookmanager07]
# --- 某ショッピングサイト[shop]
# [201408]
# --- ＜成果物なし＞
# --- ＜成果物なし＞
# -----------------------------------------------------------------------------
# [201409] 
# -----------------------------------------------------------------------------
# --- 某大手書店向け 書籍管理サイト[bookmanager09]
source ./../../../sql/20140901-bookmanager.sql

# --- 某通販企業向けショッピングモールサイト[-凍結-]
# source ./../../../sql/

# -----------------------------------------------------------------------------
# [201410] 
# -----------------------------------------------------------------------------
# --- 某大手書店向けショッピングモールサイト[bookmanager]
# source ./../../../sql/20141001-

# --- 日本酒・地酒販売サイト[ec_10,ec_b_10]
source ./../../../sql/ec10.sql

# -----------------------------------------------------------------------------
# [201411] 
# -----------------------------------------------------------------------------
# --- 某企業向け勤怠管理サイト[-凍結-]
source ./../../../sql/attendance.sql
# --- 某フィギュア・ホビー販売サイト[ec_11,ec_11a]

# -----------------------------------------------------------------------------
# [201412] 
# -----------------------------------------------------------------------------
# --- 某大手企業向け 勤怠管理サイト（改修版） [attendance_12]

# --- 某総合チケット販売サイト[chikezon]
# source ./../../../sql/chikezon.sql

# -----------------------------------------------------------------------------
# [201501]
# -----------------------------------------------------------------------------
# --- 某通信販売会社　おでん通販サイト[oden]
source ./../../../sql/oden.sql
# --- サッカーチケット販売サイト[sakatike]
source ./../../../sql/sakatike.sql
# ---
# source ./../../../sql/uesto.sql
# ---
# [201502]
# ---
source ./../../../sql/tourtike.sql
# source ./../../../sql/solare.sql
# ---
# [201503]
# ---
source ./../../../sql/worldtravel.sql
source ./../../../sql/youjustjewelry.sql
source ./../../../sql/gpscoffee.sql

# ---
# [201504]
# ---
# source ./../../../sql/lapoupee.sql
source ./../../../sql/ucycle.sql
# ---
# [201505]
# ---
# source ./../../../sql/livetickets.sql
# source ./../../../sql/baseballticket.sql
# source ./../../../sql/ichigoichie.sql
# ---
# [201506]
# ---
source ./../../../sql/releaseproject.sql
# source ./../../../sql/gtickets.sql
source ./../../../sql/movietickets.sql
# source ./../../../sql/tbox.sql
# ---
# [201507]
# ---
# source ./../../../sql/biggalaxy.sql
source ./../../../sql/khome.sql
# ---
# [201508]
# ---
source ./../../../sql/aquarium.sql
# ---
# [201509] 
# ---
source ./../../../sql/lereve.sql
source ./../../../sql/shizuku.sql
# ---
# [201510] 
# ---
source ./../../../sql/footprinter.sql
source ./../../../sql/pizzaseijin.sql
# ---
# [201511] 
# ---
# source ./../../../sql/cinemajapan.sql
source ./../../../sql/chocotime.sql
# ---
# [201512] 
# ---
source ./../../../sql/rakuraku.sql
source ./../../../sql/kinnosawa.sql
# ---
# [201601]
# ---
source ./../../../sql/mackeypark.sql
source ./../../../sql/kuruyama.sql
# ---
# [201603] 201602
# ---
source ./../../../sql/gekidanroadshow.sql
# source ./../../../sql/ichigoichie.sql
# ---
# [201604] 201603 
# ---
source ./../../../sql/uesto.sql
source ./../../../sql/solare.sql
# ---
# [201605] 201603 & 201604
# ---
source ./../../../sql/lapoupee.sql
source ./../../../sql/gtickets.sql
source ./../../../sql/chikezon.sql
# ---
# [201606] 201604 & 201605
# ---
source ./../../../sql/live.sql
source ./../../../sql/baseballticket.sql
source ./../../../sql/ichigoichie.sql
source ./../../../sql/tbox.sql
source ./../../../sql/biggalaxy.sql
source ./../../../sql/cinemajapan.sql

# ---
# [201607] 201605 & 201606
# ---
# source ./../../../sql/internousdev.sql
# source ./../../../sql/openconnect.sql
source ./../../../sql/visa.sql
# ---
# [201608] 201606 & 201607
# ---
# source ./../../../sql/internousdev.sql
source ./../../../sql/rewrite.sql
source ./../../../sql/miramode.sql
# ---
# [201609] 201607 & 201608
# ---
source ./../../../sql/internousdev.sql
source ./../../../sql/openconnect.sql
source ./../../../sql/mastercard.sql
source ./../../../sql/americanexpress.sql
source ./../../../sql/samurai.sql
# ---
# [201610] 201608 & 201609
source ./../../../sql/nagomi.sql
# ---
EOF
