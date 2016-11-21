CREATE DATABASE IF NOT EXISTS BOOKMANAGER;
USE BOOKMANAGER

CREATE TABLE IF NOT EXISTS USER_TABLE(
-- 利用者ID
user_id int not null primary key auto_increment,
-- 利用者名
user_name varchar(20) not null,
-- 利用者名（カナ）
user_name_kana varchar(20) not null,
-- 生年月日
birth date not null,
-- 電話番号
tel varchar(20) not null,
-- 在籍フラグ(0:在籍, 1:退職)
enrollment_flg enum("0","1") default "0",
-- 登録日（初日）
user_register_date datetime not null,
-- 変更日
user_change_date datetime
);

CREATE TABLE IF NOT EXISTS ADMIN_TABLE(
-- 管理者ID
admin_id int not null primary key auto_increment,
-- 管理者パスワード
admin_pass char(4) not null,
-- 管理者名
admin_name varchar(20) not null,
-- 管理者名（カナ）
admin_name_kana varchar(20) not null,
-- 在籍フラグ 0:在籍 1:退職
enrollment_flg enum("0","1") default "0",
-- 登録日（初回）
admin_register_date datetime not null,
-- 変更日
admin_change_date datetime
);
-- 管理者データの登録（10月生）
insert into ADMIN_TABLE(admin_pass,admin_name,admin_name_kana,admin_register_date) values ("0123","満田健介","ミツダケンスケ","2014/11/06 15:00:00");
insert into ADMIN_TABLE(admin_pass,admin_name,admin_name_kana,admin_register_date) values ("0123","山野邉貴也","ヤマノベタカヤ","2014/11/06 15:00:00");
insert into ADMIN_TABLE(admin_pass,admin_name,admin_name_kana,admin_register_date) values ("0123","北原太志","キタハラタイシ","2014/11/06 15:00:00");
insert into ADMIN_TABLE(admin_pass,admin_name,admin_name_kana,admin_register_date) values ("0123","渡邊勇樹","ワタナベユウキ","2014/11/06 15:00:00");
insert into ADMIN_TABLE(admin_pass,admin_name,admin_name_kana,admin_register_date) values ("0123","竹内郷平","タケウチキョウヘイ","2014/11/06 15:00:00");

CREATE TABLE IF NOT EXISTS BOOK_TABLE(
-- 図書ID
book_id int not null primary key auto_increment,
-- タイトル
title varchar(20) not null,
-- 作者
writer varchar(20) not null,
-- 残在庫
stock int not null,
-- 総在庫
total_stock int not null,
-- 出版社
company varchar(20) not null,
-- 出版年月
year date not null,
-- 価格
price int not null,
-- ページ数
page int not null,
-- 登録日（初日）
book_register_date date not null,
-- 変更日
book_change_date date,
-- 廃棄フラグ（0:保管中,1:廃棄済み）
discard_flg enum("0","1") default "0"
);

CREATE TABLE IF NOT EXISTS LEND_BACK_TABLE(
-- 貸し返しID
lend_back_id int not null primary key auto_increment,
-- 利用者ID
user_id int not null,
-- 図書ID
book_id int not null,
-- 貸出日
lend_day date not null,
-- 返却予定日
scheduled_back_day date not null,
-- 貸返フラグ（0:貸し出し中,1:返却済み）
lend_back_flg enum("0","1") default "0",
-- 実返却日
actual_back_day date
);

CREATE TABLE LEND_DATA_TABLE (

-- 利用者ID
user_id int not null,

-- 図書ID
book_id int not null,

-- タイトル
title varchar(20) not null,

-- 作者
writer varchar(20) not null,

-- 出版社
company varchar(20) not null,

-- 残在庫
stock int not null

);
