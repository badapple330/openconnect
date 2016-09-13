drop database if exists world_travel;
create database world_travel DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

use world_travel;

drop table if exists user_info;
create table user_info(
id int(10) primary key auto_increment,
user_id varchar(20) unique not null,
user_pass varchar(20) not null,
last_name varchar(30) not null,
first_name varchar(30) not null,
sex enum('1','2'),
postal_code varchar(8) not null,
prefecture varchar(10) not null,
citytown varchar(30) not null,
email varchar(100) not null,
birthday varchar(11),
user_ip varchar(15) not null,
register_date timestamp not null default current_timestamp
);

drop table if exists item_list;
create table item_list(
item_id int(4) primary key not null auto_increment,
item_name varchar(100) unique not null,
item_price int(6) not null,
stock int(6)
);

drop table if exists history;
create table history(
user_id varchar(20) not null,
item_id int(10) not null,
item_count int(4) not null,
total_amount int(10),
user_ip varchar(15),
inquiry int(14) not null,
order_day timestamp not null default current_timestamp
);

drop table if exists cart_list;
create table cart_list(
user_ip varchar(15) not null,
mac_address varchar(17) not null,
user_id varchar(20) not null,
item_id int(10) not null,
item_count int(4),
total_amount int(10)
);

insert into user_info(
user_id,user_pass,last_name,first_name,sex,postal_code,prefecture,citytown,email,birthday,user_ip)
values(
'test','test','山田','太郎',1,'113-0033','東京都','文京区本郷2-4-6','internous@gmail.com','1991-12-20','192.168.001.140'
);

insert into user_info(
user_id,user_pass,last_name,first_name,sex,postal_code,prefecture,citytown,email,birthday,user_ip)
values(
'yamada','test','山田','太郎',1,'113-0033','東京都','文京区本郷2-4-6','internous@gmail.com','1991-12-20','192.168.001.140'
);

insert into history(
user_id,item_id,item_count,total_amount,user_ip,inquiry)
values(
'test',1,10,1000000,'192.168.001.140',1111
);

insert into cart_list values(
'192.168.001.140','44-8A-5B-A2-E4-FC','test',1,10,1000000);

insert into item_list values(
1,'ピラミッドを見に行く・エジプト旅行',90000,999999);

insert into item_list values(
2,'ギャンブルの聖地ラスベガスへ・アメリカ旅行',50000,999999);

insert into item_list values(
3,'ショッピング＆グルメの祭典ソウルへ・韓国旅行',60000,999999);

insert into item_list values(
4,'イースター島でモアイ像を見る・チリ旅行',100000,999999);

insert into item_list values(
5,'台北（タイペイ）の活気ある屋台で食べ歩き!!・台湾旅行',70000,999999);

insert into item_list values(
6,'ホノルルの綺麗なビーチでまったりバカンス・ハワイ旅行',80000,999999);

insert into item_list values(
7,'冬の季節でもグアムで海へ!!アメリカ旅行',80000,999999);

insert into item_list values(
8,'香港で夜景、多彩なエンタテインメントを楽しむ・中国旅行',40000,999999);

insert into item_list values(
9,'パリで大人の落ち着いた雰囲気を・フランス旅行',90000,999999);

insert into item_list values(
10,'神々の島、バリ島へ・インドネシア旅行',60000,999999);

insert into item_list values(
11,'シンガポールでマーライオンを是非!!・シンガポール旅行',10000,999999);

insert into item_list values(
12,'バンコクにて、美しい極彩色の寺院や王宮の参拝・タイ旅行',30000,999999);

insert into item_list values(
13,'「永遠の都」ローマをご堪能あれ・イタリア旅行',70000,999999);

insert into item_list values(
14,'「芸術の都」バルセロナをご堪能あれ・スペイン旅行',60000,999999);

insert into item_list values(
15,'プーケットで多彩なビーチで飽きさせない・タイ旅行',60000,999999);

insert into item_list values(
16,'イスタンブールで歴史的な文化遺産に触れる・トルコ旅行',90000,999999);

insert into item_list values(
17,'サイパンでマリンスポーツ、ゴルフ、ダイビングなど!!・サイパン旅行',80000,999999);

insert into item_list values(
18,'ロンドンで荘重感ある建物と緑豊かな公園を堪能・イギリス旅行',90000,999999);

insert into item_list values(
19,'ニューヨークにて自由の女神を生で見よう!!・アメリカ旅行',70000,999999);

insert into item_list values(
20,'秋葉原にて、アニメ文化堪能・日本旅行',100000,999999);


