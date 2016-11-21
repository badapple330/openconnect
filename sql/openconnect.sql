set names utf8;
set foreign_key_checks=0;

drop table if exists attendance;
drop table if exists books;
drop table if exists books_borrow;
drop table if exists decision;
drop table if exists decision_detail;
drop table if exists kesseki;
drop table if exists mendan;
drop table if exists projects;
drop table if exists project_progress;
drop table if exists  project_status;
drop table if exists schedule;
drop table if exists students;
drop table if exists syusseki;
drop table if exists tikoku;
drop table if exists user;
drop table if exists users;

drop table if exists site;
drop table if exists master;

drop database if exists openconnect;
create database openconnect;
use openconnect;

/* 過去のユーザーテーブル 2016/08/31まで */

/* ユーザー情報登録 *
 * ユーザーID = user_id
 * パスワード = password
 * 名前 = name
 * 名前(ふりがな) = name_f
 * 郵便番号 = postal
 * 住所 = address
 * 電話番号 = tel_number
 * メールアドレス = email
 * 性別 = sex
 * 生年月日 = birthday
 * ハンドルネーム = handle_name
 * 登録日 = register_day
 * 更新日 = update_day
 * 退会フラグ = userdel_flg
 * ログインフラグ = login_flg
 * ユーザーフラグ = user_flg
 */
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ユーザーID',
  `password` varchar(255) NOT NULL COMMENT 'パスワード',
  `name` varchar(255) DEFAULT NULL COMMENT '名前',
  `name_f` varchar(255) DEFAULT NULL COMMENT '名前(ふりがな)',
  `postal` varchar(255) NOT NULL COMMENT '郵便番号',
  `address` varchar(255) NOT NULL COMMENT '住所',
  `tel_number` varchar(255) NOT NULL COMMENT '電話番号',
  `email` varchar(255) NOT NULL COMMENT 'メールアドレス',
  `sex` varchar(10) NOT NULL COMMENT '性別',
  `birthday` date NOT NULL DEFAULT '0000-00-00' COMMENT '誕生日',
  `handle_name` varchar(16) DEFAULT NULL COMMENT 'ハンドルネーム',
  `register_day` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '登録日',
  `update_day` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新日',
  `userdel_flg` tinyint(1) NOT NULL DEFAULT '0' COMMENT '退会フラグ',
  `login_flg` tinyint(1) NOT NULL DEFAULT '1' COMMENT 'ログインフラグ',
  `user_flg` int(11) NOT NULL DEFAULT '1' COMMENT 'ユーザーフラグ',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='ユーザー情報格納テーブル'

insert into user(user_id,password,name,name_f,postal,address,tel_number,email,sex,birthday,handle_name,register_day,update_day,userdel_flg,login_flg,user_flg) values
(1,'testuser','インターノウス株式会社プログラマカレッジ テストユーザー','いんたーのうすかぶしきがいしゃぷろぐらまかれっじ てすとゆーざー','1130034','東京都文京区湯島3-2-12 御茶ノ水天神ビル','0312345678','internousdev.testuser@gmail.com','男','1993/12/24','testuser','2016/07/01 13:00:00','2016/07/11 12:11:25',FALSE,FALSE,'2'),
(2,'internous01','井上琢磨','いのうえたくま','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','09012341234','t.inoue@internous.co.jp','男','1990-09-25','takuma.inoe','2016/07/01 13:00:00','2016/07/11 13:54:20',FALSE,FALSE,'2'),
(3,'internous01','原田美由貴','はらだみゆき','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','09045674567','m.harada@internous.co.jp','女','1992-05-03','miyuki.harada','2016/07/01 13:00:00','2016/07/11 13:00:00',FALSE,FALSE,'2');


/* 新しいユーザーテーブル 2016/09/01から */

/* ユーザー情報登録 *
 * ユーザーID = user_id
 * パスワード = password
 * 姓 = last_name
 * 姓(ふりがな) = last_name_f
 * 名 = first_name
 * 名(ふりがな) = first_name_f
 * 郵便番号 = postal
 * 住所 = address
 * 電話番号 = tel_number
 * メールアドレス = email
 * 性別 = sex
 * 生年月日 = birthday
 * ハンドルネーム = handle_name
 * 登録日 = register_day
 * 更新日 = update_day
 * 退会フラグ = userdel_flg
 * ログインフラグ = login_flg
 * ユーザーフラグ = user_flg
 * 受講年 = year
 * 受講開始月 = month
 */
create table users (
user_id int primary key not null auto_increment comment 'ユーザーID',
password varchar(255)  comment 'パスワード',
family_name varchar(50) not null default '' comment '姓(英語)',
given_name varchar(50) not null default '' comment '名(英語)',
family_name_kanji varchar(50) not null default '' comment '姓(漢字)',
family_name_kana varchar(50) not null default '' comment '姓(ふりがな)',
given_name_kanji varchar(50) not null default '' comment '名(漢字)',
given_name_kana varchar(50) not null default '' comment '名(ふりがな)',
postal varchar(255) default '' comment '郵便番号',
address varchar(255) default '' comment '住所',
phone_number varchar(255) default '' comment '電話番号',
phone_email varchar(255)  unique comment 'メールアドレス',
mobile_number varchar(255) default '' comment '携帯電話番号',
mobile_email varchar(255) unique comment '携帯メールアドレス',
sex varchar(10) not null default '' comment '性別',
birthday date default 00000000 comment '誕生日',
register_day datetime default 00000000000000 comment '登録日',
update_day datetime default 00000000000000 comment '更新日',
userdel_flg boolean default FALSE comment '退会フラグ',
login_flg boolean default TRUE comment 'ログインフラグ',
user_flg int not null default 1 comment 'ユーザーフラグ',
year varchar(4) comment '受講年',
month varchar(2) comment '受講開始月',
oauth_id varchar(255) comment 'OAuthID',
oauth_name int default 0 comment 'OAuth名',
oauth_account varchar(100) comment 'OAuthアカウント'
)comment = 'ユーザー情報格納テーブル';

insert into users values
('1',	'testuser',		'test',		'user',	'テスト',	'てすと',	'ユーザー',	'ゆーざー',	'1130034',	'東京都文京区湯島3-2-12　御茶ノ水天神ビル',	'0123456789',	'user.test@gmail.com',	'09012345678',	'user.test@ne.jp',	'男',	'1993-12-24',	'2016-07-01 13:00:00',	'2016-07-01 13:00:00',	FALSE,	FALSE,	'1',	'2016',	'04',	'',	'0',	''),
('2',	'internous01',	'inoue',	'takuma','井上','いのうえ','琢磨','たくま','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','takuma.inoue@gmail.com','09012345678','takuma.inoue@ne.jp','男','1990-09-25','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'3','2010','04','','0',''),
('3','internous01','harada','miyuki','原田','はらだ','美友貴','みゆき','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','miyuki.harada@gmail.com','09012345678','miyuki.harada@ne.jp','女','1992-05-03','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'3','2010','04','','0',''),
('4','leader11','test','leader1','テスト','てすと','リーダー1','りーだー1','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','leader1.test@gmail.com','09012345678','leader1.test@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'2','2016','04','','0',''),
('5','leader22','test','leader2','テスト','てすと','リーダー2','りーだー2','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','leader2.test@gmail.com','09012345678','leader2.test@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'2','2016','04','','0',''),
('6','student1','nitabaru','kouhei','仁田原','にたばる','耕平','こうへい','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','kouhei.nitabaru@gmail.com','09012345678','kouhei.nitabaru@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','07','','0',''),
('7','student2','itou','tatsuhumi','伊藤','いとう','竜文','たつふみ','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','tatsuhumi.itou@gmail.com','09012345678','tatsuhumi.itou@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','07','','0',''),
('8','student3','sunakawa','minori','砂川','すなかわ','みのり','みのり','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','minori.sunakawa@gmail.com','09012345678','minori.sunakawa@ne.jp','女','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','07','','0',''),
('9','student4','keduka','masahiro','毛塚','けづか','正広','まさひろ','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','masahiro.keduka@gmail.com','09012345678','masahiro.keduka@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08','','0',''),
('10','student5','horiguchi','kennichi','堀口','ほりぐち','謙一','けんいち','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','kennichi.horiguchi@gmail.com','09012345678','kennichi.horiguchi@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08','','0',''),
('11','student6','kiryuu','youichi','霧生','きりゅう','雄一','ゆういち','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','yuuichi.kiryuu@gmail.com','09012345678','yuuichi.kiryuu@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08','','0',''),
('12','student7','hoshi','tatsuya','星','ほし','達也','たつや','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','tatsuya.hoshi@gmail.com','09012345678','tatsuya.hoshi@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08','','0',''),
('13','student8','iwamoto','koumei','岩本','いわもと','興明','こうめい','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','koumei.iwamoto@gmail.com','09012345678','koumei.iwamoto@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08','','0','');


/* サイト一覧情報 */
create table site(
site_id int primary key not null auto_increment comment 'サイトID',
site_name varchar(100) not null comment 'サイト名',
site_url varchar(255) not null unique comment 'サイトURL',
site_article text comment 'サイト記事',
genre varchar(50) comment 'ジャンル',
picture varchar(255) comment '画像',
banner varchar(80) comment 'バナー'
) comment='サイト情報格納テーブル';

/* サイト一覧 / サイト名/URL */
insert into site values (1,'BaseBallTicket','http://www.internousdev.com/baseballTicket/','野球観戦チケットサイト','チケット',null,null);
 insert into site values (1,'BaseBallTicket','http://www.internousdev.com/baseballTicket/','野球観戦チケットサイト','チケット',null,null);
 (2,'gekidanroadshow','http://www.internousdev.com/gekidanroadshow/','舞台チケット予約サイト','チケット',null,null),
 (3,'ichigoichie','http://www.internousdev.com/ichigoichie/',"着物レンタルサイト","レンタル",null,null),
 (4,'chocotime','http://www.internousdev.com/chocotime/',"チョコレート販売サイト","グルメ",null,null),
 (5,'kinnosawa','http://www.internousdev.com/kinnosawa/',"和菓子販売サイト","グルメ",null,null),
 (6,'kuruyama','http://www.internousdev.com/kuruyama/',"ラーメン販売サイト","グルメ",null,null);
