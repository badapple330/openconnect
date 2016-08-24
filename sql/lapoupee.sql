DROP DATABASE IF EXISTS lapoupee;

CREATE DATABASE IF NOT EXISTS lapoupee;
USE lapoupee;

DROP TABLE IF EXISTS GOODS;
DROP TABLE IF EXISTS CUSTOMER_INFO;
DROP TABLE IF EXISTS ORDER_INFO;
DROP TABLE IF EXISTS CART;
DROP TABLE IF EXISTS TEMP;

CREATE TABLE TEMP(
TEMP_ID INT PRIMARY KEY AUTO_INCREMENT,
CUSTOMER_NAME VARCHAR(50),
CUSTOMER_PASS VARCHAR(25),
MAILADDRESS  VARCHAR(50) UNIQUE NOT NULL,
POSTCODE  VARCHAR(7),
ADDRESS  VARCHAR(255),
TELLNUMBER VARCHAR(12),
HOUSENUMBER VARCHAR(100),
REGISTER_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP()
);

CREATE TABLE IF NOT EXISTS GOODS(
GOODS_ID INT(10) AUTO_INCREMENT,
GOODS_NAME VARCHAR(100) UNIQUE NOT NULL,
STOCK INT(4),
UNIT_PRICE INT(10),
PRIMARY KEY(GOODS_ID)
);

CREATE TABLE IF NOT EXISTS CUSTOMER_INFO(
CUSTOMER_ID BIGINT(16) NOT NULL AUTO_INCREMENT,
CUSTOMER_NAME VARCHAR(50) NOT NULL,
CUSTOMER_PASS VARCHAR(25) NOT NULL,
MAILADDRESS  VARCHAR(50) UNIQUE NOT NULL,
POSTCODE  VARCHAR(7) NOT NULL,
ADDRESS  VARCHAR(255) NOT NULL,
TELLNUMBER VARCHAR(12) NOT NULL,
HOUSENUMBER VARCHAR(100),
REGISTER_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP(),
PRIMARY KEY(CUSTOMER_ID)
);

CREATE TABLE IF NOT EXISTS ORDER_INFO(
CUSTOMER_ID BIGINT(16) NOT NULL,
GOODS_ID INT(10) NOT NULL,
ORDER_QUANTITY INT(3) NOT NULL,
TOTAL_AMOUNT INT(10) NOT NULL,
PAY_MATHOD INT(1) NOT NULL,
CREDIT_COMPANY INT(1),
CREDIT_NUMBER BIGINT(16),
CON_SET INT(1),
BANK_SET INT(1),
PURCHASEDAY TIMESTAMP DEFAULT CURRENT_TIMESTAMP(),
FOREIGN KEY(GOODS_ID) REFERENCES GOODS(GOODS_ID)
);

CREATE TABLE IF NOT EXISTS CART(
TEMPORARY_ID VARCHAR(50) NOT NULL,
GOODS_NAME VARCHAR(100) NOT NULL,
SALES_COUNT INT(10) NOT NULL,
UNIT_PRICE INT(10) NOT NULL,
TOTAL_AMOUNT INT(10) NOT NULL
);

ALTER TABLE CART MODIFY COLUMN TOTAL_AMOUNT BIGINT NOT NULL;

INSERT INTO GOODS(GOODS_NAME,STOCK,UNIT_PRICE)VALUES
("少年冒険者",50,6000),
("冒険者",80,5000),
("騎士",80,6000),
("魔法使い",60,3000),
("僧侶",60,7000),
("巫女",30,4000),
("ハーピィ",30,8000),
("妖精",30,6000),
("アラクネ",60,7000),
("デーモン",20,10000),
("デーモンロッド",60,5000),
("悪の魔法少女",30,8000),
("魔界騎士",50,9000),
("サイクロプス",60,8000),
("影",40,20000);

INSERT INTO CUSTOMER_INFO(CUSTOMER_NAME,CUSTOMER_PASS,MAILADDRESS,POSTCODE,ADDRESS,TELLNUMBER,HOUSENUMBER)VALUES
("ikeda","ikeda123","ikeda@ikeda.co.jp","1234567","東京都八王子市xxx","09012345678","1-1-1"),
("kuriya","kuriya","kuriya@kuriya.co.jp","1234567","東京都xxx","09012345678","1-1-1"),
("hosoya","hosoya","hosoya@hosoya.co.jp","1234567","東京都xxx","09012345678","1-1-1"),
("wada","wada","wada@wada.co.jp","1234567","東京都xxx","09012345678","1-1-1"),
("mito","mito","mito@mito.co.jp","1234567","東京都八王子市xxx","09012345678","1-1-1");
