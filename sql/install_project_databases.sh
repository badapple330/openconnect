#!/bin/sh
mysql -u root -pmysql << EOF
# ---
# ---
# [201407]
# ---
# ---
# [201408]
# ---
# ---
# [201409] 
# ---
# ---
# [201410] 
# ---
source ./attendance.sql
# ---
# [201411] 
# ---
# ---
# [201412] 
# ---
# source ./chikezon.sql
# ---
# [201501]
# ---
source ./oden.sql
source ./sakatike.sql
# source ./uesto.sql
# ---
# [201502]
# ---
source ./tourtike.sql
# source ./solare.sql
# ---
# [201503]
# ---
source ./worldtravel.sql
source ./youjustjewelry.sql
source ./gpscoffee.sql

# ---
# [201504]
# ---
# source ./lapoupee.sql
source ./ucycle.sql
# ---
# [201505]
# ---
# source ./livetickets.sql
# source ./baseballticket.sql
# source ./ichigoichie.sql
# ---
# [201506]
# ---
source ./releaseproject.sql
# source ./gtickets.sql
source ./movietickets.sql
# source ./tbox.sql
# ---
# [201507]
# ---
# source ./biggalaxy.sql
source ./khome.sql
# ---
# [201508]
# ---
source ./aquarium.sql
# ---
# [201509] 
# ---
source ./lereve.sql
source ./shizuku.sql
# ---
# [201510] 
# ---
source ./footprinter.sql
source ./pizzaseijin.sql
# ---
# [201511] 
# ---
# source ./cinemajapan.sql
source ./chocotime.sql
# ---
# [201512] 
# ---
source ./rakuraku.sql
source ./kinnosawa.sql
# ---
# [201601]
# ---
source ./mackeypark.sql
source ./kuruyama.sql
# ---
# [201603] 201602
# ---
source ./gekidanroadshow.sql
# source ./ichigoichie.sql
# ---
# [201604] 201603 
# ---
source ./uesto.sql
source ./solare.sql
# ---
# [201605] 201603 & 201604
# ---
source ./lapoupee.sql
source ./gtickets.sql
source ./chikezon.sql
# ---
# [201606] 201604 & 201605
# ---
source ./live.sql
source ./baseballticket.sql
source ./ichigoichie.sql
source ./tbox.sql
source ./biggalaxy.sql
source ./cinemajapan.sql

# ---
# [201607] 201605 & 201606
# ---
# source ./internousdev.sql
# source ./openconnect.sql
source ./visa.sql
# ---
# [201608] 201606 & 201607
# ---
# source ./internousdev.sql
source ./rewrite.sql
source ./miramode.sql
# ---
# [201609] 201607 & 201608
# ---
source ./internousdev.sql
source ./openconnect.sql
source ./mastercard.sql
source ./americanexpress.sql
source ./samurai.sql
# ---
EOF
