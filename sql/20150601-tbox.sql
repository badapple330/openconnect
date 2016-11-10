set names utf8;
drop database if exists tbox;

create database tbox default character set utf8;

use tbox;

SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS administer;
DROP TABLE IF EXISTS orderInfo;
DROP TABLE IF EXISTS cardCompany;
DROP TABLE IF EXISTS itemInfo;
DROP TABLE IF EXISTS color;
DROP TABLE IF EXISTS logo;
DROP TABLE IF EXISTS magazine;
DROP TABLE IF EXISTS paymentMethod;
DROP TABLE IF EXISTS shopInfo;
DROP TABLE IF EXISTS size;
DROP TABLE IF EXISTS userInfo;




/* Create Tables */

CREATE TABLE administer
(
	adminId varchar(10) NOT NULL,
	adminPassword varchar(10) NOT NULL
);


CREATE TABLE cardCompany
(
	cardCompanyId int(2) NOT NULL,
	cardCompany varchar(30) NOT NULL,
	PRIMARY KEY (cardCompanyId)
);


CREATE TABLE color
(
	colorId int(2) NOT NULL,
	colorName varchar(30) NOT NULL,
	colorImagePath varchar(30) NOT NULL,
	PRIMARY KEY (colorId)
);


CREATE TABLE itemInfo
(
	itemId int(8) NOT NULL AUTO_INCREMENT,
	size varchar(2) NOT NULL,
	price int(6) NOT NULL,
	stock int(5) NOT NULL,
	imagePath varchar(50) NOT NULL,
	itemName varchar(60) NOT NULL,
	itemDeleteFlag boolean DEFAULT '0' NOT NULL,
	PRIMARY KEY (itemId)
);

CREATE TABLE magazine
(
	title varchar(30) NOT NULL,
	contents text NOT NULL
);


CREATE TABLE orderInfo
(
	userID int(10) NOT NULL,
	itemId int(8) NOT NULL,
	quantity int(1) NOT NULL,
	total int(7) NOT NULL,
	paymentMethodId int(2) NOT NULL,
	cardCompanyId int(2) DEFAULT 0,
	cardOwner varchar(30),
	expireDate varchar(8),
	cardNumber varchar(16),
	securityCode varchar(4),
	purchaseDate timestamp DEFAULT current_timestamp NOT NULL
);


CREATE TABLE paymentMethod
(
	paymentMethodId int(2) NOT NULL,
	paymentMethod varchar(30) NOT NULL,
	PRIMARY KEY (paymentMethodId)
);


CREATE TABLE shopInfo
(
	shopName varchar(30) NOT NULL,
	shopAddress varchar(50) NOT NULL,
	shopPostal varchar(7) NOT NULL
);


CREATE TABLE userInfo
(
	userName varchar(20) NOT NULL,
	userID int(10) NOT NULL AUTO_INCREMENT,
	loginID varchar(16) NOT NULL,
	password varchar(16) NOT NULL,
	email varchar(100) NOT NULL,
	telNumber varchar(12) NOT NULL,
	postal varchar(7) NOT NULL,
	address varchar(50) NOT NULL,
	uniqueID varchar(30),
	userDeleteFlag boolean DEFAULT '0' NOT NULL,
	PRIMARY KEY (userID),
	UNIQUE (loginID),
	UNIQUE (email)
);


/* Q&Aのテーブル*/
CREATE TABLE QandA
(
	id int NOT NULL AUTO_INCREMENT,
	lang varchar(3) NOT NULL,
	Q text NOT NULL,
	A text NOT NULL,
	PRIMARY KEY (id)
);


/* Create Foreign Keys */
ALTER TABLE orderInfo
	ADD FOREIGN KEY (cardCompanyId)
	REFERENCES cardCompany (cardCompanyId)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE orderInfo
	ADD FOREIGN KEY (itemId)
	REFERENCES itemInfo (itemId)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE orderInfo
	ADD FOREIGN KEY (paymentMethodId)
	REFERENCES paymentMethod (paymentMethodId)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE orderInfo
	ADD FOREIGN KEY (userID)
	REFERENCES userInfo (userID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


/* 顧客情報 */
insert into userInfo(userName, loginID, password, email, telNumber, postal, address, userDeleteFlag)values
("taro", "yamadataro", "123123123", "yamada@gmail.com", "00011112222", "0001111", "東京都文京区/0-111", 0);

/* 管理者アカウント */
insert into administer(adminId, adminPassword)values
("admin", "123");


/* 商品情報 */
insert into itemInfo(size, price, stock, imagePath, itemName)values
("S", 980, 1000, "1_1.jpg", "よくわからない"),
("S", 980, 1000, "2_1.jpg", "おはよ"),
("S", 980, 1000, "3_1.jpg", "シンプル"),
("S", 980, 1000, "4_1.jpg", "ティー"),
("S", 980, 1000, "5_1.jpg", "セクシー"),
("S", 980, 1000, "6_1.jpg", "マッチョ"),
("S", 980, 1000, "7_1.jpg", "ゆでたまご"),
("S", 980, 1000, "8_1.jpg", "喫煙者"),
("S", 980, 1000, "9_1.jpg", "ハート"),
("S", 980, 1000, "10_1.jpg", "ビリヤード"),
("S", 980, 1000, "11_1.jpg", "カンガルー"),
("S", 980, 1000, "12_1.jpg", "鹿"),
("S", 980, 1000, "13_1.jpg", "ユニコーン"),
("S", 980, 1000, "14_1.jpg", "神様"),
("S", 980, 1000, "15_1.jpg", "かわいい"),
("S", 980, 1000, "16_1.jpg", "葉"),
("S", 980, 1000, "17_1.jpg", "妖怪"),
("S", 980, 1000, "18_1.jpg", "蜂"),
("S", 980, 1000, "19_1.jpg", "金魚"),
("S", 99980, 10, "20_1.jpg", "トムキャット"),
("M", 99980, 10, "20_1.jpg", "トムキャット"),
("L", 99980, 10, "20_1.jpg", "トムキャット"),
("S", 980, 1000, "21_1.jpg", "レッド"),
("S", 980, 1000, "22_1.jpg", "猫");
