/*-------------------チョコタイム---------------------------*/
drop database if exists chocotime;
create database chocotime;
use chocotime;

-- user table

create table user(
password varchar(255),
name varchar(100) not null,
kana varchar(50),
post_number varchar(7),
address  varchar(100),
address_2 varchar(50),
address_3 varchar(100),
phone_number varchar(13),
email_address varchar(100),
creditcard varchar(4),
credit_token varchar(255),
unique_id varchar(50),
oauth_name varchar(50),
registration_date datetime not null,
updated_date datetime not null,
unique(name,email_address),
index(name)
);

-- insert date user
insert into user values(
"test","テストユーザー1","てすとゆーざーいち","1234567",
"東京都","千代田区","1234","00000000000","test@gmail.com",
"1234","token","unique_id","testuser","2015/01/01","2015/01/01"
);

insert into user values(
"test","テストユーザー2","てすとゆーざーに","1234567",
"東京都","千代田区","1234","00000000000","test2@gmail.com",
null,null,null,null,"2015/01/01","2015/01/01"
);

-- item table

create table item(
id int not null primary key auto_increment,
item_name varchar(100) not null,
price float not null,
stock_amount int not null default'0',
sales_amount int default'0',
item_detail text not null,
img_path varchar(255) not null,
registration_date datetime not null,
flg int not null default'0',
index(id)
);


-- insert date item table
insert into item values(
1, "キャメロン",1000,50,50,
"女子に一番人気！女の子友達と食べるならこれがいい！",
"choko6.jpg","2016/01/01","0"
);

insert into item values(
2, "ボンボンショコラ",
1000,50,49,
"老若男女で食べれるのでプレゼントの定番！",
"choko7.jpg","2016/01/02","0"
);

insert into item values(
3, "バレンシアの月",
1000,50,48,
"バレンシアで作ったチョコの味を完全再現！",
"choko8.jpg","2016/01/03","0"
);

insert into item values(
4, "maQザッハ",1000,50,47,
"ダイヤ型の珍しいチョコレート！人気ランキング1位のキャメロンが出した新作2つ目！",
"choko9.jpg","2016/01/04","0"
);

insert into item values(
5, "コローデル・ブルネッロ",1000,50,46,
"いろいろな形があるので形で楽しみたいならこれが人気！",
"choko10.jpg","2016/01/05","0"
);

insert into item values(
6, "デルレイ",1000,50,45,
"デルレイが作ったまろやかなハーモ二ーが奏でるしなになっています！",
"choko11.jpg","2016/01/06","0"
);

insert into item values(
7, "ハートコック",1000,50,44,
"パートナーにあげるなら喜んでもらうならこれがいい！",
"choko12.jpg","2016/01/07","0"
);

insert into item values(
8, "ペペラッチャ",1000,50,43,
"心が落ち着いきたいのならこれがいいです！",
"choko13.jpg","2016/01/08","0"
);

insert into item values(
9, "ダリォウ",1000,50,42,
"カカオ成分が十分に含まれているので美容や健康などにはとても効き目があります。少し苦いですが！",
"choko14.jpg","2016/01/09","0"
);

insert into item values(
10, "ピエーナマコロニー",1000,50,41,
"2つの箱にチョコレートが入った！",
"choko15.jpg","2016/01/10","0"
);

insert into item values(
11, "ピエール・ランテ",1000,50,40,
"あのキャメロン・ピィエーロが作ったチョコレートが早くも登場！",
"choko1.jpg","2016/01/11","0"
);

insert into item values(
12, "キャスカ",1000,50,39,
"9種類のチョコレートがそれぞれの味をかもし出し手いるので一つ一つが絶品！",
"choko2.jpg","2016/01/12","0"
);

insert into item values(
13, "マイルドカカオ",1000,50,38,
"有名店のVAIORAが作った本格派でビターな味です！",
"choko3.jpg","2016/01/13","0"
);

insert into item values(
14, "ココアマロン",1000,50,37,
"ココアとマロンの味が融合し相乗効果が舞い上がる！",
"choko4.jpg","2016/01/14","0"
);

insert into item values(
15, "ヒストリー",1000,50,36,
"自分のご褒美にはこれを！",
"choko5.jpg","2016/01/15","0"
);


-- admim table
create table admin(
id varchar(25)  not null unique,
password varchar(255) not null
);

-- insert date admin table

insert into admin values(
"1","1234"
);

-- history table

create table history(
history_id int not null primary key  auto_increment,
user_name varchar(100) not null,
item_id int not null,
item_name varchar(100),
price float default'0',
quantity int default'0',
method_of_payment int not null default'0',
purchase_date datetime,
FOREIGN KEY(user_name) REFERENCES user(name) on update cascade on delete cascade,
FOREIGN KEY(item_id)   REFERENCES item(id) on update cascade on delete cascade
);

-- cart table

create table cart(
name varchar(100) not null,
item_id int not null,
item_name varchar(100),
price float default'0',
quantity int default'0',
FOREIGN KEY(name) REFERENCES user(name) on update cascade on delete cascade,
FOREIGN KEY(item_id)   REFERENCES item(id) on update cascade on delete cascade
);
