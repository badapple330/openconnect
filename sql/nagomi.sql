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
meeting_place varchar(30) not null,
meeting_time varchar(10) not null,
break_time varchar(10) not null,
resting_place varchar(30) not null,
stroll_time varchar(10) not null,
stroll_location varchar(30) not null,
end_time varchar(10) not null,
end_location varchar(30) not null,
start_day date,
end_day date,
stay_day varchar(50),
delete_flg boolean default false not null,
registration_date datetime not null,
updated_date datetime not null
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
id int primary key not null primary key,
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
payment_method enum('wiretransfer','credit') not null,
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
credit_number int,
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
credit_number int,
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

insert into plan(
plan_category,
plan_name,
overview,
content,
place,
departure_location,
img_address,
child_price,
adult_price,
meeting_time,
meeting_place,
break_time,
resting_place,
stroll_time,
stroll_location,
end_time,
end_location,
delete_flg,
registration_date,
updated_date,
place_time
)values
('日帰り',"どこか遠くへ片道切符","往路のみです。","誰にも探されずひっそりと","新宿駅新南改札直結2分","バスタ新宿","image",0,10000,"09:00","バスタ新宿","12:30","食事処","13:30","お土産屋","19:00","バスタ新宿前",false,"2016/10/07 00:00:00","2016/10/07 00:00:00","1111"),
('宿泊',"どこか遠くへ片道切符","往路のみです。","誰にも探されずひっそりと","新宿駅新南改札直結2分","バスタ新宿","image",0,10000,"09:00","バスタ新宿","12:30","食事処","13:30","お土産屋","19:00","バスタ新宿前",false,"2016/10/07 00:00:00","2016/10/07 00:00:00","1111"
);

insert into plan(
plan_category,
plan_name,
overview,
content,
place,
departure_location,
img_address,
child_price,
adult_price,
day_off,
start_day,
end_day,
stay_day,
registration_date,
updated_date
)values(
);



insert into reserve(
plan_category,
id,
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
)values
('日帰り',1,9,1,"どこか遠くへ片道切符","往路のみです。",1,0,0,1,0,0,0,0,10000,"探さないでください",'wiretransfer',false,"","2016/10/07",false,"2016/10/07 00:00", "2016/10/07 00:00"),
('宿泊',2,9,2,"どこか遠くへ片道切符","往路のみです。",1,0,0,1,0,0,0,0,10000,"探さないでください",'wiretransfer',false,"","2016/10/07",false,"2016/10/07 00:00", "2016/10/07 00:00"
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

