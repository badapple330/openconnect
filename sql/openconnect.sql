DROP DATABASE IF EXISTS openconnect;
CREATE DATABASE openconnect;

use openconnect

drop table if exists user;
drop table if exists site;

create table if not exists user(
id int(10) NOT NULL AUTO_INCREMENT,
user_id varchar(30),
user_name varchar(50),
password varchar(50),
PRIMARY KEY (id)
);

create table if not exists site(
id int(10) NOT NULL AUTO_INCREMENT,
name varchar(50),
url varchar(255),
PRIMARY KEY (id)
);

insert into user(user_id, user_name, password) values('testuser','テストユーザー','12345678');

insert into site(name,url)
values('YouJustJewelry','http://www.internousdev.com:8080/YouJustJewelry/'),
('solare','http://www.internousdev.com:8080/solare/'),
('UESTO','http://www.internousdev.com:8080/UESTO/'),
('WorldTravel','http://www.internousdev.com:8080/WorldTravel/'),
('gpscoffee','http://www.internousdev.com:8080/gpscoffee/'),
('la-poupee','http://www.internousdev.com:8080/la-poupee/');

create table if not exists students(
number varchar(5),
name varchar(50),
symbol varchar(50),
entrance varchar(50)
);

insert into students(number,name,symbol,entrance)
values('0001','小西 瞬','こにし しゅん','201604'),
('0002','高野 由佳','たかの ゆか','201604'),
('0003','村上 俊一','むらかみ しゅんいち','201604'),
('0004','山田 晃大','やまだ あきひろ','201604'),
('0005','冨澤 正樹','とみざわ まさき','201604'),
('0006','安孫子 春菜','あびこ はるな','201604'),
('0007','江森 壮汰','えもり そうた','201604'),
('0008','大山 汐莉','おおやま しおり','201604'),
('0009','宮上 京介','みやがみ きょうすけ','201604'),
('0010','中村 匠吾','なかむら しょうご','201604'),
('0011','島 一成','しま かずなり','201604'),
('0012','奥平 拡規','おくだいら ひろき','201604'),
('0013','西脇 隼平','にしわき じゅんぺい','201604'),
('0014','加藤 英樹','かとう ひでき','201604'),
('0015','森田 直美','もりた なおみ','201605'),
('0016','工藤 秀樹','くどう ひでき','201605'),
('0017','水野 雄斗','みずの ゆうと','201605'),
('0018','斎藤 雄星','さいとう ゆうせい','201605'),
('0019','中島 竜太郎','なかじま りゅうたろう','201605'),
('0020','高橋 裕也','たかはし ゆうや','201605'),
('0021','永井 考樹','ながい こうき','201605'),
('0022','古瀬 諒','ふるせ りょう','201605'),
('0023','鈴木 博義','ふるせ りょう','201605'),
('0024','新保 裕一','しんぼ ゆういち','201605'),
('0025','石鉢 翔太郎','いしのはちしょうたろう','201605'),
('0026','岡野 真生','おかの まいき','201605'),
('0027','相澤 弘二','あいざわ こうじ','201605'),
('0028','工藤 祐介','くどう ゆうすけ','201605'),
('0029','渡邉 悟志','わたなべ さとし','201605'),
('0030','渡辺 優也','わたなべ ゆうや','201605'),
('0031','倉地 将吾','くらち しょうご','201605');
