set names utf8;
set foreign_key_checks=0;
drop database if exists openconnect;
create database if not exists openconnect;
use openconnect;


drop table if exists users;


drop database if exists openconnect;
create database openconnect;
use openconnect;



create table users (
user_id int primary key not null auto_increment comment 'ユーザーID',
password varchar(255) not null comment 'パスワード',
family_name varchar(50)  comment '姓(英語)',
given_name varchar(50)  comment '名(英語)',
family_name_kanji varchar(50) not null comment '姓(漢字)',
family_name_kana varchar(50) not null comment '姓(ふりがな)',
given_name_kanji varchar(50) not null comment '名(漢字)',
given_name_kana varchar(50)  not null comment '名(ふりがな)',
postal varchar(255) comment '郵便番号',
address varchar(255) comment '住所',
phone_number varchar(255) comment '電話番号',
phone_email varchar(255) not null comment 'メールアドレス',
mobile_number varchar(255) comment '携帯電話番号',
mobile_email varchar(255) unique comment '携帯メールアドレス',
sex varchar(10)  comment '性別',
birthday date comment '誕生日',
userdel_flg boolean default FALSE comment '退会フラグ',
login_flg boolean default FALSE comment 'ログインフラグ',
user_flg int not null default 1 comment 'ユーザーフラグ',
year varchar(4) not null comment '受講年',
month varchar(2) not null comment '受講開始月',
oauth_id varchar(255) comment 'OAuthID',
oauth_name int default 0 comment 'OAuth名',
oauth_account varchar(100) comment 'OAuthアカウント',
register_day datetime comment '登録日',
update_day datetime comment '更新日',
team_name varchar(255) default '1stMonth' comment 'チーム名'
)comment = 'ユーザー情報格納テーブル';

set names utf8;
set foreign_key_checks=0;
use openconnect;
delete from users;
insert into users values
(41,'internous01','kazami','akira','風見','かざみ','顕','あきら','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','kazami@internous.co.jp','09012345678','kazami@internous.co.jp','男','2001-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','');

