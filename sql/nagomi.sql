drop database if exists nagomi;
create database nagomi;
use nagomi;
/*プラン
 * プラン種別 = plan_category
 * プラン番号 = plan_id
 * プラン名 = plan_name
 * 概要 = overview
 * 詳細 = content
 * 集合場所詳細 = place
 * 集合場所 = departure_location
 * 集合時間 = place_time
 * 画像 = img_address
 * 子供料金 = child_price
 * 大人料金 = adult_price
 * 定休日 = day_off
 * 出発場所 = meeting_place
 * 出発時間 = meeting_time
 * 休憩時間 = break_time
 * 休憩場所 = resting_place
 * 散策時間 = stroll_time
 * 散策場所= stroll_location
 * 解散時間 = end_time
 * 解散場所 = end_location
 * 宿泊開始 = start_day
 * 宿泊終了日 = end_day
 * 期間 = stay_day
 * デリートフラグ = delete_flg
 * 登録日 = registration_date
 * 更新日 = updated_date
 */
create table plan(
plan_category enum('日帰り','宿泊') not null,
plan_id int primary key not null auto_increment,
plan_name varchar(100) not null,
overview text not null,
content text not null,
place text not null,
departure_location varchar(100) not null,
place_time varchar(10) not null,
img_address text not null,
child_price int not null,
adult_price int not null,
day_off date,
meeting_place varchar(50) not null,
meeting_time varchar(10) not null,
break_time varchar(10) not null,
resting_place varchar(50) not null,
stroll_time varchar(10) not null,
stroll_location varchar(50) not null,
end_time varchar(10) not null,
end_location varchar(50) not null,
start_day date,
end_day date,
stay_day varchar(50),
delete_flg boolean default false not null,
registration_date datetime not null,
updated_date datetime
);

/*予約
 * 番号 = id
 * プラン種別 = plan_category
 * ユーザーID = user_id
 * プラン番号 = plan_id
 * プラン名 = plan_mane
 * 概要 = overview
 * 人数(大人) = adult_num
 * 人数(子供) = child_num
 * 人数(幼児) = baby_num
 * 人数(合計) = total_num
 * 1室1名 = room_1
 * 1室2名 = room_2
 * 1室3名 = room_3
 * 1室4名 = room_4
 * 合計金額 = amount
 * 備考 = note
 * 支払い方法 = payment_method
 * 支払い受領 = payment_receive
 * 予約番号 = reserve_num
 * 出発日 = departure_day
 * キャンセル = cancel_flg
 * 登録日  = registration_date
 * 更新日 = updated_date
 */
create table reserve(
id int primary key not null auto_increment,
plan_category enum('日帰り','宿泊') not null,
user_id int not null,
plan_id int not null,
plan_name varchar(100) not null,
overview text,
adult_num int not null default 0,
child_num int not null default 0,
baby_num int not null default 0,
total_num int not null,
room_1 int default 0,
room_2 int default 0,
room_3 int default 0,
room_4 int default 0,
amount int not null,
note varchar(100),
payment_method enum('口座振込み','クレジット') not null,
payment_receive boolean default false,
stay_day varchar(50),
departure_day date not null,
cancel_flg boolean default false,
registration_date datetime not null,
updated_date datetime,
foreign key(plan_id)references plan(plan_id),
foreign key(user_id) references openconnect.users(user_id)
);

/* 部屋タイプ
 * プラン番号 = plan_id
 * 1室1名 = room_1
 * 1室2名 = room_2
 * 1室3名 = room_3
 * 1室4名 = room_4
 */
create table room(
plan_id int not null,
foreign key(plan_id)references plan(plan_id),
room_sum int not null default 0,
room_1 int not null default 0,
room_2 int not null default 0,
room_3 int not null default 0,
room_4 int not null default 0
);

/* 一時保存
 * ユーザーID = user_id
 * 姓（漢字）= family_name_kanji
 * 名（漢字）= given_name_kanji
 * 住所 = address
 * メールアドレス = email
 * 電話番号 = phone_number
 * プラン種別 = plan_category
 * プラン番号 = plan_id
 * プラン名 = plan_name
 *
 * 人数（大人）= adult_num
 * 人数（子供）= child_num
 * 人数（幼児）= baby_num
 * 合計人数 = total_num
 * 合計部屋数 = room_sum
 * 1室1名 = room_1
 * 1室2名 = room_2
 * 1室3名 = room_3
 * 1室4名 = room_4
 * 合計金額 = amount
 * 出発日 = departure_day
 * 出発場所 = departure_location
 * 備考 = note
 * 支払い方法 = payment_method
 *
 * クレジットの種類 = credit_name
 * クレジット番号 = credit_number
 * 姓名（ローマ字） = name_e
 * セキュリティーコード = security_code
 * 有効期限 = expiration_day
 * 支払い区分 = division
 * 分割回数 = split
 * 大人小計 = adult_amount
 * 子供小計 = child_amount
 */
create table work(
user_id int,
family_name_kanji varchar(50),
given_name_kanji varchar(50),
address varchar(255),
email varchar(255),
phone_number varchar(255),
plan_category enum('日帰り','宿泊') not null,
plan_id int,
plan_name varchar(100),
overview text,
adult_num int,
child_num int,
baby_num int,
total_num int,
room_sum int,
room_1 int,
room_2 int,
room_3 int,
room_4 int,
amount int,
departure_day date,
departure_location varchar(100),
note varchar(100),
payment_method varchar(50),
stay_day varchar(50),
family_name varchar(50),
given_name varchar(50),
credit_name varchar(50),
credit_number varchar(16),
name_e varchar(50),
security_code int,
expiration_day varchar(25),
division varchar(10),
split int,
adult_amount int,
child_amount int,
foreign key(user_id) references openconnect.users(user_id) on delete cascade,
foreign key(plan_id) references plan(plan_id) on delete cascade
);

create table credit(
credit_name enum('visa','mastercard','americanexpress'),
credit_number varchar(16),
name_e varchar(50),
security_code int,
expiration_day varchar(50),
corporation_name varchar(50),
use_day date,
division varchar(10),
split int,
spend int
);

/* 管理者
 * 管理者番号 = admin_id
 * パスワード = password
 * 管理者名 = admin_name
 */
create table admin(
admin_id varchar(10) not null,
password varchar(10) not null,
admin_name varchar(50) not null
);

/* 日帰りプラン5件
 */

insert into plan(
plan_category,
plan_name,
overview,
content,
place,
departure_location,
place_time,
img_address,
child_price,
adult_price,
day_off,
meeting_place,
meeting_time,
break_time,
resting_place,
stroll_time,
stroll_location,
end_time,
end_location,
delete_flg,
registration_date,
updated_date
)values(
'日帰り',"薬師日帰り温泉ツアー/Yakusi Day Onsen Tour",
"薬師温泉旅籠で山里の幸と名湯を味わえます。/You can taste the famous spa and food of the mountain village in the Yakushi Onsen Hatago.",
"山懐に佇む茅葺木の一軒宿。流れ落ちる滝を眼前に望む露天風呂は、開放感に満ちています。
/Hotel thatched nestled in mountain recesses. Open-air bath overlooking the waterfall in front of the eyes are full of sense of openness.",
"新宿駅徒歩2分/Shinjuku Station 2-minute walk","バスタ新宿/Shinjuku Bus Terminal","9:00","TopBackGround3.jpg",
2300,4600,
"2016/11/02",
"バスタ新宿/Shinjuku Bus Terminal","9:30","11:30","休憩/Break time","13:30","薬師温泉/Yakusi Onsen","19:00","バスタ新宿/Shinjuku Bus Terminal",
false,"2016/10/07 00:00:00","2016/10/07 00:00:00"
),(
'日帰り',"草津日帰り温泉ツアー/Kusatu Day Onsen Tour",
"日本三名泉に数えられる名湯です。/It is a famous onsen, which is counted in Japan's three famous onsen.",
"日本有数の湧出量を誇り、温泉街中心にある湯畑や、熱の湯の湯もみは、草津ならではの風情ある景観です。
/Proud of Japan's leading amount of discharge, water field and in the spa town center, hot water fir of the heat of the hot water is taste a landscape of Kusatsu unique.",
"新宿駅徒歩2分/Shinjuku Station 2-minute walk","バスタ新宿/Shinjuku Bus Terminal","8:30","TopBackGround4.jpg",
2800,5600,
"2016/11/13",
"バスタ新宿/Shinjuku Bus Terminal","9:00","11:00","休憩/Break time","12:00","草津温泉/Kusatu Onsen","20:00","バスタ新宿/Shinjuku Bus Terminal",
false,"2016/10/12 00:00:00","2016/10/12 00:00:00"
),(
'日帰り',"湯河原日帰り温泉ツアー/Yugawara Day Onsen Tour",
"万葉集にも詠まれ、古くから知られた肌に優しい美肌の湯。/Also poems in Manyoshu, friendly beautiful skin Onsen of the skin to have been known for a long time.",
"にっぽんの温泉100選から、誰もが知る有名な温泉ですが、風情が残る温泉街をじっくりと歩きながら歴史・文化に深く触れることで、今まで知らなかった温泉の魅力を再発見していきましょう！
/ From best 100 Onsen of Japan, it is a famous hot spring that everyone knows. Taste is deeply touching thing in history and culture while walking carefully the remains spa town, let's re-discovered the Onsen of the charm did not know until now.",
"新宿駅徒歩2分/Shinjuku Station 2-minute walk","バスタ新宿/Shinjuku Bus Terminal","8:00","TopBackGround2.jpg",
2600,5200,
"2016/11/13",
"バスタ新宿/Shinjuku Bus Terminal","8:30","10:30","湯河原温泉/Yugawara Onsen","12:30","昼食/Lunch time","19:00","バスタ新宿/Shinjuku Bus Terminal",
false,"2016/10/08 00:00:00","2016/10/08 00:00:00"
),(
'日帰り',"鬼怒川日帰り温泉ツアー/Kinugawa Day Onsen Tour",
"鬼怒川のせせらぎを望む温泉でくつろぎタイム/Time of relaxation at the Onsen overlooking the babbling Kinugawa.",
"「傷は川治、火傷は滝（現鬼怒川温泉）」と称された、火傷への効能がある名湯です。日光もすぐ近くで観光も楽しめます。
/Wounds Kawaji, burns Falls (Kinugawa Onsen) was called, it is the name hot water there is a potency to burn. Nikko also enjoy sightseeing in the immediate vicinity.",
"新宿駅徒歩2分/Shinjuku Station 2-minute walk","バスタ新宿/Shinjuku Bus Terminal","8:00","TopBackGround1.jpg",
2700,5400,
"2016/11/13",
"バスタ新宿/Shinjuku Bus Terminal","9:00","12:00","休憩/Break time","12:30","鬼怒川温泉/Kinugawa Onsen","19:30","バスタ新宿/Shinjuku Bus Terminal",
false,"2016/10/08 00:00:00","2016/10/08 00:00:00"
),(
'日帰り',"四万ダム日帰り温泉ツアー/Yonman Dam Day Onsen Tour",
"古くより湯治場として栄えてきた温泉です。/It is a hot spring that has prospered as a watering place than old.",
"古くより湯治場として栄えてきた温泉。四万（よんまん）の病に効く温泉ということから、四万温泉と名付けられたとも言われます。 当ツアーで訪れる「四万やまぐち館」は、300年あまりの歴史を誇り、露天風呂からは四万川が眺められます。豊かな自然の中で秋のひとときをお過ごしください。
/It is a hot spring that has prospered as a watering place than old. From the fact that hot springs work to forty thousand of the disease, it is said to be named Yonman Onsen.
 Visit in this tour, Yonman-Yamaguchi-kan is proud of the 300 plus years of history, from the open-air bath and overlooking the Shimagawa. Please spend the autumn of moments in the rich nature.",
"新宿駅徒歩2分/Shinjuku Station 2-minute walk","バスタ新宿/Busta Shinjuku","8:30","img_intro.jpg",
4000,2000,
"2016/11/13",
"バスタ新宿/Shinjuku Bus Terminal","9:00","11:00","四万温泉/Yonman Onsen","12:30","昼食","19:30","バスタ新宿/Shinjuku Bus Terminal",
false,"2016/10/08 00:00:00","2016/10/08 00:00:00"
);



/* 宿泊プラン5件
 */

insert into plan(
plan_category,
plan_name,
overview,
content,
place,
departure_location,
place_time,
img_address,
child_price,
adult_price,
meeting_place,
meeting_time,
break_time,
resting_place,
stroll_time,
stroll_location,
end_time,
end_location,
start_day,
end_day,
stay_day,
registration_date,
updated_date
)values(
'宿泊',"箱根湯本宿泊温泉ツアー/Hakoneyumoto Accommodation Onsen Tour",
"箱根の玄関口であり、箱根旅行の拠点でもある箱根湯本温泉郷。/Is a gateway of Hakone, is a hub of Hakone travel Hakoneyumoto Onsen.",
"箱根の玄関口であり、箱根旅行の拠点でもある箱根湯本温泉郷。約50件ものお土産店とお食事どころが軒を連ねる駅前商店街や、近年駅舎をリニューアルした箱根湯本駅は年間を通して多くの観光客でにぎわいます。11月3日に行われる箱根大名行列なども見どころです。
/Is a gateway of Hakone, is a hub of Hakone travel Hakoneyumoto Onsen.
 Station shopping district and the souvenir shops and dining far from also reviews about 50 enter one's eaves, in recent years Hakoneyumoto was renewed station building is crowded with many tourists throughout the year.
 This interest is also such place is Hakone daimyo on November 3.",
"新宿駅徒歩2分/Shinjuku Station 2-minute walk","新宿駅西口/Shinjuku Station West Exit","8:30","onsen1.jpg",
4000,10000,
"新宿駅西口/Shinjuku Station West Exit","9:00","12:00","箱根/Hakone","13:00","箱根湯本/Hakoneyumoto","21:00","新宿駅西口/Shinjuku Station West Exit","2016/11/3","2016/12/4",
"1泊2日/2 days 1 night","2016/10/20 13:30","2016/10/20 13:30"
),(
'宿泊',"湯河原宿泊温泉ツアー/Yugawara Accommodation Onsen Tour",
"往復のセットでこの価格！神奈川県・湯河原温泉ツアー/This price round-trip of the set! Kanagawa Yugawara Onsen tour.",
"お好きな時間の食事＆温泉入浴込でこのお値段！！お好きなお店でご当地グルメを味わえます！湯河原名物担々やきそばがおすすめ！！！
/Your favorite time of the meal and Onsen bathing only at this price !!You can enjoy your local gourmet in your favorite shop!
 Recommend Yugawara specialty Tantan noodles !!!",
"新宿駅徒歩2分/Shinjuku Station 2-minute walk","新宿駅西口/Shinjuku Station West Exit","8:30","onsen1.jpg",
2000,7000,
"新宿駅西口/Shinjuku Station West Exit","9:00","12:00","湯河原/Yugawara","13:00","湯河原/Yugawara","21:00","新宿駅西口/Shinjuku Station West Exit","2016/11/3","2016/12/4",
"1泊2日/2 days 1 night","2016/10/20 13:30","2016/10/20 13:30"
),(
'宿泊',"北海道、登別宿泊温泉ツアー/Hokkaido Noboribetu Accommodation Onsen Tour",
"9種類ものバラエティ豊かな泉質が魅力。世界的にも珍しく「温泉のデパート」と呼ばれるほど。/9 kinds of variety of spring quality is attractive. Enough to be unusually referred to as a Onsen of department store in the world.",
"古くは湯治場として病気、怪我の療養に利用され重宝された。湧き出る湯量は豊富で1日1万トン。9種類ものバラエティ豊かな泉質が魅力。世界的にも珍しく「温泉のデパート」と呼ばれるほど。美味しい海鮮丼も魅力。
/Old disease as a watering place, has been found useful is used for the medical treatment of the injured. Spring hot water is rich in one day 1 million tons.
 Enough to be unusually referred to as a Onsen of department store in the world. Delicious seafood bowl attractive.",
"羽田駅徒歩1分/Haneda Station 1-minute walk","羽田空港第一ターミナル/Haneda Airport Terminal 1","8:30","onsen1.jpg",
8000,20000,
"羽田空港第一ターミナル/Haneda Airport Terminal 1","9:00","13:00","千歳空港/Chitose Airport","15:00","登別/Noboribetu","21:00","新宿駅西口/Shinjuku Station West Exit","2016/11/3","2016/12/4",
"2泊3日/3 days 2 night","2016/10/20 13:30","2016/10/20 13:30"
),(
'宿泊',"鬼怒川宿泊温泉ツアー/Kinugawa Accommodation Onsen Tour",
"鬼怒川の絶景に佇む！鬼怒川の絶景を眺めながらご入浴は最高！/Nestled in the superb view of the Kinugawa! Your bathing while admiring the views of Kinugawa is the best!",
"鬼怒川の絶景に佇む！鬼怒川の絶景を眺めながらご入浴は最高！夕食は個室料亭にて和食膳をお・も・て・な・し！
/Nestled in the superb view of the Kinugawa! Your bathing while admiring the views of Kinugawa is the best! Dinner is a Japanese Zen  O・MO・TE・NA・SI at the private restaurant!",
"新宿駅徒歩2分/Shinjuku Station 2-minute walk","新宿駅西口/Shinjuku Station West Exit","8:30","onsen1.jpg",
5000,13000,"新宿駅西口/Shinjuku Station West Exit","9:00","12:00","鬼怒川/Kinugawa","13:00","鬼怒川/Kinugawa","21:00","新宿駅西口/Shinjuku Station West Exit","2016/11/3","2016/12/4",
"1泊2日/2 days 1 night","2016/10/20 13:30","2016/10/20 13:30"
),(
'宿泊',"草津源泉かけ流し宿泊ツアー/Kusatsu Source Over Sink Accommodation Tour",
"隣接の温泉館も含めて湯めぐりが楽しめます。/Hot water tour you can enjoy, including the adjacent hot springs museum.",
" こだわりの源泉かけ流し！！源泉から引いた温泉水を湯船に供給し、あふれ出るお湯を循環させず排出している仕組みが「かけ流し」。温泉分析書に基づいて、加水・加温は温度調節以外は行わないという条件を満たす湯船を持っている宿を厳選しました。お湯自慢の宿ならではの贅沢なひとときをどうぞ。
/Good sources over sink! ! Is supplied to the bathtub with hot spring water drawn from the source, a mechanism that has been discharged without circulating the hot water overflow is over flow.
 Based on the Onsen analysis report, hydrolysis-warming has carefully selected the inn to have a meet bathtub that is not performed other than the temperature adjustment. Leave a luxurious moments of hot water unique pride of the inn.",
"新宿駅徒歩2分/Shinjuku Station 2-minute walk","新宿駅西口/Shinjuku Station West Exit","8:30","onsen1.jpg",
7000,18000,
"新宿駅西口/Shinjuku Station West Exit","9:00","13:00","草津/Kusatsu","14:00","草津/Kusatsu","21:00","新宿駅西口/Shinjuku Station West Exit","2016/11/3","2016/12/4",
"2泊3日/3 days 2 night","2016/10/20 13:30","2016/10/20 13:30"
),(
'宿泊',
"玉造温泉　湯之助の宿/Inn tamatsukuri onsen YunoSuke",
"玉造温泉の開祖であり代々その発展に力を注いできた長谷川家が、明治元年に開業した旅館。
/Founder and is Hasegawa house that has for generations focused on the development of tamatsukuri onsen, was opened in Meiji Ryokan.",
"日本随一と言われる約120坪の混浴大露天風呂は、源泉かけ流しで美肌効果が高いと評判です。
/Mixed bathing large open-air bath of about 120 square meters, which is said to be Japan's premier is the reputation that there is a high beautiful skin effect at the source over sink.",
"新宿駅徒歩2分/Shinjuku Station 2-minute walk",
"バスタ新宿/Shinjuku Bus Terminal",
"9:00",
"onsen2.jpg",
3300,
6600,
"2016/11/04",
"バスタ新宿/Shinjuku Bus Terminal",
"9:30",
"10:30",
"休憩/Break time",
"12:30",
"玉造温泉/Tamatsukuri onsen",
"18:00",
"バスタ新宿/Shinjuku Bus Terminal",
false,
"2016/10/26 00:00:00",
"2016/10/26 00:00:00"
),(
'宿泊',
"熱海倶楽部　迎賓館/Atami Club Guest House",
"全室が源泉かけ流しの半露天風呂付の宿。
/Inn with a semi-open-air bath of all rooms is poured over source.",
"標高300メートルからの相模湾の絶景は一見の価値あり。お客さまの声2,000件以上を有する信頼の宿です。
/Superb view of Sagami Bay from an altitude of 300 meters is worth a look. Is the inn of trust having the above review voice 2,000 customers.",
"新宿駅徒歩3分/Shinjuku Station 3-minute walk",
"バスタ新宿/Shinjuku Bus Terminal",
"9:00",
"TopBackGround4.jpg",
3100,
7200,
"2016/11/06",
"バスタ新宿/Shinjuku Bus Terminal",
"9:30",
"11:30",
"休憩/Break time",
"13:30",
"熱海倶楽部/Atami Club",
"19:00",
"バスタ新宿/Shinjuku Bus Terminal",
false,
"2016/10/26 00:00:00",
"2016/10/26 00:00:00"
),(
'宿泊',
"鳴子温泉　名湯の宿　鳴子ホテル/Inn Naruko Hotel Naruko Onsen name hot water",
"3本の源泉により時間とともに七色に変わるという温泉を持つ「鳴子温泉　名湯の宿　鳴子ホテル」。
/By three sources with a hot spring that change in seven colors with time inn Naruko Hotel Naruko Onsen name hot water",
"とろりと肌にまとわりつくような湯の感覚はまるで美容液のよう。郷土色を生かしたみちのくバイキングも好評です。
/Sensation of hot water, such as clinging to the skin To trolley like a cosmetic solution. Michinoku Viking by taking advantage of Kyodoshoku is also popular.",
"新宿駅徒歩2分/Shinjuku Station 2-minute walk",
"バスタ新宿/Shinjuku Bus Terminal",
"9:00",
"TopBackGround1.jpg",
4200,
8500,
"2016/11/11",
"バスタ新宿/Shinjuku Bus Terminal",
"9:20",
"11:45",
"休憩/Break time",
"14:45",
"鳴子温泉/Naruko Onsen",
"20:30",
"バスタ新宿/Shinjuku Bus Terminal",
false,
"2016/10/26 00:00:00",
"2016/10/26 00:00:00"
),(
'宿泊',
"美ヶ原温泉　ホテル翔峰/Utsukushigahara Onsen Hotel Shoho",
"国民保健温泉地にも指定されている美ヶ原温泉の宿「美ヶ原温泉　ホテル翔峰」。
/National Health spa Utsukushigahara hot spring that has been designated as a destination inn Utsukushigahara Onsen Hotel Shoho.",
"敷地内から湧き出る豊富な自家源泉を、5種類のお風呂で楽しめます。すべての客室から雄大な北アルプスや、城下町松本の風景が見渡せることも大きな魅力。
/A rich self-source gushing from within the site, you can enjoy in the five types of the bath. All of the majestic and North Alps from the room, also a big attraction that the castle town of Matsumoto of landscape overlooking.",
"新宿駅徒歩2分/Shinjuku Station 2-minute walk",
"バスタ新宿/Shinjuku Bus Terminal",
"8:00",
"TopBackGround2.jpg",
2500,
6000,
"2016/11/11",
"バスタ新宿/Shinjuku Bus Terminal",
"9:30",
"11:15",
"休憩/Break time",
"14:20",
"鳴子温泉/Naruko Onsen",
"20:00",
"バスタ新宿/Shinjuku Bus Terminal",
false,
"2016/10/26 00:00:00",
"2016/10/26 00:00:00"
),(
'宿泊',
"源泉の一軒宿　ふくみつ華山温泉/One inn Fukumitsu Huashan hot spring sources",
"2015年に大リニューアルを終えた「源泉の一軒宿　ふくみつ華山温泉」。
/In 2015 it finished the large renewal one inn Fukumitsu Huashan hot spring source.",
"和モダンの落ち着いた佇まい、食事の創作懐石は全室個室など、大人がゆったり楽しめることが人気です。源泉かけ流しの「あたたまりの湯」は、肌触りもなめらか。
/Appearance calm of modern sum, creative multi-course meal, such as all rooms private, is a popular that adults comfortably enjoy. Source warm up of hot water in the sink over is, it feels also smooth.",
"新宿駅徒歩2分/Shinjuku Station 2-minute walk",
"バスタ新宿/Shinjuku Bus Terminal",
"9:30",
"onsen2.jpg",
3500,
7400,
"2016/11/12",
"バスタ新宿/Shinjuku Bus Terminal",
"10:30",
"12:15",
"休憩/Break time",
"15:30",
"鳴子温泉/Naruko Onsen",
"20:30",
"バスタ新宿/Shinjuku Bus Terminal",
false,
"2016/10/26 00:00:00",
"2016/10/26 00:00:00"
);


/* 日帰り予約6件(3件キャンセル)
 */

insert into reserve(
plan_category,
user_id,
plan_id,
plan_name,
overview,
adult_num,
child_num,
baby_num,
total_num,
room_1,
room_2,
room_3,
room_4,
amount,
note,
payment_method,
payment_receive,
stay_day,
departure_day,
cancel_flg,
registration_date,
updated_date
)values(
"日帰り",2,1,"薬師日帰り温泉ツアー/Yakusi Day Onsen Tour",
"薬師温泉旅籠で山里の幸と名湯を味わえます。/You can taste the famous spa and food of the mountain village in the Yakushi Onsen Hatago.",
1,1,1,3,0,0,0,0,6900,
"",
'クレジット',false,"","2016/11/3",false,
"2016/10/20 13:00","2016/10/20 13:30"
),(
"日帰り",3,2,"草津日帰り温泉ツアー/Kusatu Day Onsen Tour",
"日本三名泉に数えられる名湯です。/It is a famous onsen, which is counted in Japan's three famous onsen.",
1,1,1,3,0,0,0,0,8400,
"バス酔いしやすい。/Easy to bus sickness.",
'クレジット',false,"","2016/11/4",false,
"2016/10/20 13:30","2016/10/20 13:30"
),(
"日帰り",5,3,"湯河原日帰り温泉ツアー/Yugawara Day Onsen Tour",
"万葉集にも詠まれ、古くから知られた肌に優しい美肌の湯。/Also poems in Manyoshu, friendly beautiful skin Onsen of the skin to have been known for a long time.",
1,1,1,3,0,0,0,0,7800,
"",
'口座振込み',false,"","2016/11/1",false,
"2016/10/20 13:00","2016/10/20 13:30"
),(
"日帰り",1,5,"四万ダム日帰り温泉ツアー/Yonman Dam Day Onsen Tour",
"古くより湯治場として栄えてきた温泉です。/It is a hot spring that has prospered as a watering place than old.",
2,0,0,2,0,0,0,0,8000,
"",
'クレジット',false,"","2016/11/5",true,
"2016/10/20 13:00","2016/10/20 13:30"
),(
"日帰り",3,2,"草津日帰り温泉ツアー/Kusatu Day Onsen Tour",
"日本三名泉に数えられる名湯です。/It is a famous onsen, which is counted in Japan's three famous onsen.",
1,1,1,3,0,0,0,0,8400,
"バス酔いしやすい。/Easy to bus sickness.",
'クレジット',false,"","2016/11/8",true,
"2016/10/20 13:30","2016/10/20 13:30"
),(
"日帰り",4,4,"鬼怒川日帰り温泉ツアー/Kinugawa Day Onsen Tour",
"鬼怒川の絶景に佇む！鬼怒川の絶景を眺めながらご入浴は最高！/Nestled in the superb view of the Kinugawa! Your bathing while admiring the views of Kinugawa is the best!",
1,1,0,2,0,0,0,0,8100,
"",
'口座振込み',false,"","2016/11/10",true,
"2016/10/20 13:00","2016/10/20 13:30"
);



/* 宿泊予約6件(3件キャンセル)
 */

insert into reserve(
plan_category,
user_id,
plan_id,
plan_name,
overview,
adult_num,
child_num,
baby_num,
total_num,
room_1,
room_2,
room_3,
room_4,
amount,
note,
payment_method,
payment_receive,
stay_day,
departure_day,
cancel_flg,
registration_date,
updated_date
)values(
"宿泊",1,1,"箱根湯本宿泊温泉ツアー/Hakoneyumoto Accommodation Onsen Tour",
"箱根の玄関口であり、箱根旅行の拠点でもある箱根湯本温泉郷。/Is a gateway of Hakone, is a hub of Hakone travel Hakoneyumoto Onsen.",
1,1,1,3,0,0,1,0,14000,
"",
'クレジット',false,"1泊2日/2 days 1 night","2016/11/3",false,
"2016/10/20 13:00","2016/10/20 13:30"
),(
"宿泊",5,2,"湯河原宿泊温泉ツアー/Yugawara Accommodation Onsen Tour",
"往復のセットでこの価格！神奈川県・湯河原温泉ツアー/This price round-trip of the set! Kanagawa Yugawara Onsen tour.",
1,1,0,2,0,1,0,0,9000,
"バス酔いしやすい。/Easy to bus sickness.",
'クレジット',false,"1泊2日/2 days 1 night","2016/11/5",false,
"2016/10/20 13:30","2016/10/20 13:30"
),(
"宿泊",3,3,"北海道、登別宿泊温泉ツアー/Hokkaido Noboribetu Accommodation Onsen Tour",
"9種類ものバラエティ豊かな泉質が魅力。世界的にも珍しく「温泉のデパート」と呼ばれるほど。/9 kinds of variety of spring quality is attractive. Enough to be unusually referred to as a Onsen of department store in the world.",
3,0,0,3,3,0,0,0,60000,
"",
'口座振込み',false,"2泊3日/3 days 2 night","2016/11/6",false,
"2016/10/20 13:00","2016/10/20 13:30"
),(
"宿泊",4,5,"草津源泉かけ流し宿泊ツアー/Kusatsu Source Over Sink Accommodation Tour",
"隣接の温泉館も含めて湯めぐりが楽しめます。/Hot water tour you can enjoy, including the adjacent hot springs museum.",
1,0,0,1,1,0,0,0,18000,
"",
'クレジット',false,"2泊3日/3 days 2 night","2016/11/3",true,
"2016/10/20 13:00","2016/10/20 13:30"
),(
"宿泊",2,2,"湯河原宿泊温泉ツアー/Yugawara Accommodation Onsen Tour",
"往復のセットでこの価格！神奈川県・湯河原温泉ツアー/This price round-trip of the set! Kanagawa Yugawara Onsen tour.",
1,2,0,3,0,0,1,0,11000,
"バス酔いしやすい。/Easy to bus sickness.",
'クレジット',false,"1泊2日/2 days 1 night","2016/11/5",true,
"2016/10/20 13:30","2016/10/20 13:30"
),(
"宿泊",1,3,"鬼怒川宿泊温泉ツアー/Kinugawa Accommodation Onsen Tour",
"鬼怒川の絶景に佇む！鬼怒川の絶景を眺めながらご入浴は最高！/Nestled in the superb view of the Kinugawa! Your bathing while admiring the views of Kinugawa is the best!",
1,1,0,2,0,1,0,0,18000,
"",
'口座振込み',false,"1泊2日/2 days 1 night","2016/11/6",true,
"2016/10/20 13:00","2016/10/20 13:30"
);



insert into room(
plan_id,
room_1,
room_2,
room_3,
room_4
)values(2,0,0,0,0
);


insert into admin(
admin_id,
password,
admin_name
)values
("admin","123","taro"
);

