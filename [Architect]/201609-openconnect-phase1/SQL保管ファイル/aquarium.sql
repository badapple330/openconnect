drop database if exists aquarium;
create database aquarium;
use aquarium;
SET SESSION FOREIGN_KEY_CHECKS=0;
/* Drop Tables */
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS ticket;
DROP TABLE IF EXISTS card;
DROP TABLE IF EXISTS orderinformation;
DROP TABLE IF EXISTS shop;
DROP TABLE IF EXISTS administrator;
DROP TABLE IF EXISTS announcement_list;
DROP TABLE IF EXISTS cart_info;
DROP TABLE IF EXISTS goods_order_info;
DROP TABLE IF EXISTS goods;
DROP TABLE IF EXISTS goods_category;
/* Create Tables */

CREATE TABLE user
(
	user_id int NOT NULL AUTO_INCREMENT,
	login_id varchar(100) NOT NULL UNIQUE,
	password varchar(32) NOT NULL,
	user_name varchar(32) NOT NULL,
	user_name_kana varchar(100) NOT NULL,
	tel_number varchar(13) NOT NULL,
	postal_code varchar(8) NOT NULL,
	address varchar(255) NOT NULL,
	unique_id varchar(30),
	registered_date date,
	renew_date date,
	PRIMARY KEY (user_id)
);
CREATE TABLE ticket
(
	item_id int NOT NULL AUTO_INCREMENT,
	shop_id int NOT NULL,
	item_name varchar(100) NOT NULL,
	unit_price float NOT NULL,
	PRIMARY KEY (item_id)
);
CREATE TABLE card
(
	card_id int NOT NULL AUTO_INCREMENT,
	user_id int NOT NULL,
	card_company varchar(255) NOT NULL,
	card_number int NOT NULL,
	expired_date date NOT NULL,
	security_code varchar(4) NOT NULL,
	PRIMARY KEY (card_id)
);
CREATE TABLE orderinformation
(
	order_id int NOT NULL AUTO_INCREMENT,
	user_id int NOT NULL,
	item_id int NOT NULL,
	quantity int NOT NULL,
	total_amount float NOT NULL,
	payment_method varchar(30) NOT NULL,
	card_id int,
	purchase_date timestamp default current_timestamp(),
	PRIMARY KEY (order_id)
);
CREATE TABLE shop
(
	shop_id int NOT NULL AUTO_INCREMENT,
	shop_name varchar(100) NOT NULL,
	shop_address varchar(255) NOT NULL,
	shop_postal_code varchar(8) NOT NULL,
	PRIMARY KEY (shop_id)
);
CREATE TABLE administrator
(
	admin_id varchar(16) NOT NULL,
	admin_password varchar(32) NOT NULL,
	is_login boolean NOT NULL,
	PRIMARY KEY (admin_id)
);
CREATE TABLE announcement_list
(
	announcement_id int NOT NULL AUTO_INCREMENT,
	announcement_text text NOT NULL,
	announcement_type enum("title","content","proviso") NOT NULL,
	insert_date timestamp NOT NULL default current_timestamp(),
	PRIMARY KEY (announcement_id)
);
CREATE TABLE cart_info
(
	cart_id int NOT NULL AUTO_INCREMENT,
	goods_id int NOT NULL,
	user_id int NOT NULL,
	order_number int ,
	goods_price_amount float ,
	complate_order int NOT NULL default 0,
	PRIMARY KEY (cart_id)
);
CREATE TABLE goods_order_info
(
	goods_order_id int NOT NULL AUTO_INCREMENT,
	card_id int ,
	goods_id int NOT NULL,
	user_id int NOT NULL,
	order_number int ,
	goods_price_amount float NOT NULL,
	payment_method varchar(100) ,
	order_date timestamp default current_timestamp(),
	PRIMARY KEY (goods_order_id)
);
CREATE TABLE goods
(
	goods_id int NOT NULL AUTO_INCREMENT,
	category_id int NOT NULL,
	goods_name varchar(100) NOT NULL,
	goods_price float NOT NULL,
	goods_text varchar(255) NOT NULL,
	goods_stock int NOT NULL,
	insert_date timestamp default current_timestamp(),
	purchase_count int NOT NULL default 0,
	goods_img varchar(50),
	PRIMARY KEY (goods_id)
);
CREATE TABLE goods_category
(
	category_id int NOT NULL AUTO_INCREMENT,
	category_name varchar(100) NOT NULL,
	PRIMARY KEY (category_id)
);
/* Create Foreign Keys */

ALTER TABLE ticket
	ADD FOREIGN KEY (shop_id)
	REFERENCES shop (shop_id)
	ON UPDATE CASCADE
	ON DELETE CASCADE
	;
ALTER TABLE card
	ADD FOREIGN KEY (user_id)
	REFERENCES user (user_id)
	ON UPDATE CASCADE
	ON DELETE CASCADE
	;
ALTER TABLE orderinformation
	ADD FOREIGN KEY (user_id)
	REFERENCES user (user_id)
	ON UPDATE CASCADE
	ON DELETE CASCADE
	;
ALTER TABLE orderinformation
	ADD FOREIGN KEY (item_id)
	REFERENCES ticket (item_id)
	ON UPDATE CASCADE
	ON DELETE CASCADE
	;
ALTER TABLE orderinformation
	ADD FOREIGN KEY (card_id)
	REFERENCES card (card_id)
	ON UPDATE CASCADE
	ON DELETE CASCADE
	;
ALTER TABLE cart_info
	ADD FOREIGN KEY (goods_id)
	REFERENCES goods (goods_id)
	ON UPDATE CASCADE
	ON DELETE CASCADE
	;
ALTER TABLE cart_info
	
	ON UPDATE CASCADE
	ON DELETE CASCADE
	;
ALTER TABLE goods_order_info
	ADD FOREIGN KEY (card_id)
	REFERENCES card (card_id)
	ON UPDATE CASCADE
	ON DELETE CASCADE
	;
ALTER TABLE goods_order_info
	ADD FOREIGN KEY (goods_id)
	REFERENCES goods (goods_id)
	ON UPDATE CASCADE
	ON DELETE CASCADE
	;
ALTER TABLE goods_order_info
	ADD FOREIGN KEY (user_id)
	REFERENCES user (user_id)
	ON UPDATE CASCADE
	ON DELETE CASCADE
	;
ALTER TABLE goods
	ADD FOREIGN KEY (category_id)
	REFERENCES goods_category (category_id)
	ON UPDATE CASCADE
	ON DELETE CASCADE
	;
/* 管理者情報登録 */
INSERT INTO administrator(admin_id, admin_password, is_login)
VALUES("test", "admin", false);

/* 店舗情報　*/
INSERT INTO shop(shop_name, shop_address, shop_postal_code)
VALUES("谷the湾", "東京都文京区11-1-1", "001-0001");

/* チケット情報　*/
INSERT INTO ticket(shop_id, item_name, unit_price)
VALUES
(1, "水族館チケット 大人", 2500),
(2, "水族館チケット 子供", 1500);

/* 会員情報　*/
INSERT INTO user(login_id, password, user_name, user_name_kana, tel_number, postal_code, address)
VALUES
("test01@email.jp", "test", "東京太郎", "とうきょうたろう", "123-456-789", "022-1234", "東京都大田区11-15-1"),
("test02@email.jp", "test", "東京次郎", "とうきょうじろう", "789-654-321", "022-1234", "東京都文京区1-18-1");

/* クレジットカード情報　*/
INSERT INTO card(user_id, card_company, card_number, expired_date,security_code)
VALUES
(1, "VISA", 123456789, "2015-12-31", "9999"),
(2, "VISA", 987654321, "2016-12-31", "9999");

/* 注文情報　*/
INSERT INTO orderinformation(user_id, item_id, quantity, total_amount, payment_method, card_id, purchase_date)
VALUES
(1, 1, 2, "5000", "クレジットカード", 1, "2015-09-18"),
(1, 2, 3, "6000", "クレジットカード", 1, "2015-09-18"),
(2, 1, 2, "5000", "クレジットカード", 2, "2015-09-22");

/* お知らせ一覧 */
INSERT INTO announcement_list(announcement_text,announcement_type,insert_date)
VALUES
("夏休み限定","title","2015-10-09"),
("･大人気イルカショーの開催時間を増加しました!!","content","2015-10-09"),
("･8月限定の特別ショー大好評開催中です!!","content","2015-10-09"),
("※席が満席時には入場制限を設けております。","proviso","2015-10-09"),
("※会場内での飲食は禁止させていただいております。","proviso","2015-10-09");

/* カート情報 */
INSERT INTO cart_info(goods_id,user_id,order_number,goods_price_amount)
VALUES
(3,1,2,1440),
(1,2,1,630);

/* 商品注文情報 */
INSERT INTO goods_order_info(card_id,goods_id,user_id,order_number,goods_price_amount,payment_method,order_date)
VALUES
(1,1,1,3,1890,"クレジットカード","2015-10-08"),
(2,4,2,6,1920,"クレジットカード","2015-10-09"),
(1,2,1,2,1060,"クレジットカード","2015-10-09");

/* 商品情報 */
INSERT INTO goods(category_id,goods_name,goods_price,goods_text,goods_stock,insert_date,goods_img)
VALUES
(1,"イルカのぬいぐるみ",630,"可愛いイルカのぬいぐるみ！",30,"2015-10-01","img/item.jpg"),
(2,"うなぎパイ",530,"サクッと美味しいうなぎパイ♫",40,"2015-10-01","img/item1.jpeg"),
(2,"赤福",720,"至高の逸品！",20,"2015-10-01","img/item2.jpeg"),
(3,"まりもSサイズ",320,"一年後には倍の大きさになります。",30,"2015-10-01","img/Spherical moss.jpg"),
(1,"山椒魚のぬいぐるみ",1600,"みんなの人気者。山椒魚！",10,"2015-10-01","img/n2.jpg"),
(1,"サメのぬいぐるみ",1400,"海の暴れもの！",10,"2015-10-19","img/n4.jpg"),
(1,"皇帝ペンギンのぬいぐるみ",1000,"水族館の人気者",30,"2015-10-19","img/n6.jpg"),
(1,"ちんあなごのぬいぐるみ",900,"あなごの中のアナゴ！",45,"2015-10-19","img/n7.jpg"),
(1,"エイのぬいぐるみ",1200,"ｴｲｯ!(ﾉ`･ω･´)ﾉ",10,"2015-10-19","img/n9.jpg"),
(1,"イルカのキーホルダー",300,"イルカのきらきらキーホルダー",50,"2015-10-19","img/keyRing3.jpg"),
(1,"ペンギンのキーホルダー",250,"ペンギンですよー",35,"2015-10-19","img/keyRing8.jpg"),
(1,"ペンギンペアぬいぐるみ",800,"仲良しペンギンのぬいぐるみ",30,"2015-10-19","img/n10.jpg"),
(1,"カメロンパンキーホルダー",350,"美味しそうな亀です。",30,"2015-10-19","img/n11.jpg"),
(2,"くらげグミ",680,"小さいクラゲがたくさん入ったグミ",40,"2015-10-20","img/JellyfishG.jpg"),
(2,"ジンベイザメのお煎餅",750,"美味しいジンベイザメのお煎餅",40,"2015-10-20","img/RiceCracker.jpg"),
(2,"ウーパールーパーマシュマロ",330,"ジョブズも大好きマシュマロ!",40,"2015-10-20","img/AxolotlCandy.jpeg"),
(4,"入館チケット（大人）",2500,"大人入館チケット",99,"2015-10-20","img/Ticket.png"),
(4,"入館チケット（子供）",1500,"子供入館チケット",99,"2015-10-20","img/Ticket.png");


/* カテゴリー情報 */
INSERT INTO goods_category(category_name)
VALUES
("キャラクター"),
("お菓子"),
("アクアペット");

