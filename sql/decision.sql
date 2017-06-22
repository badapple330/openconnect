set names utf8;
set foreign_key_checks=0;
drop database if exists openconnect;
create database if not exists openconnect;
use openconnect;

drop table if exists books;
drop table if exists decision;
drop table if exists projects;
drop table if exists users;




/* 決済 */
create table decision(
decision_id int primary key auto_increment comment '決裁ID',
project_id int not null comment 'プロジェクトID',
decision_name varchar(100) comment '案件名',
user_id int comment 'ユーザーID',
decision_type varchar(30) default '実施' comment '決裁種類(実施, 契約, 実施兼契約)',
decision_status1 tinyint(1) default 0 comment '実施決裁状況(0:作成中, 1:申請中/承認待ち, 2:承認済み, 3:変更中)',
decision_status2 tinyint(1) default 0 comment '契約/実施兼契約決裁状況(0:作成中, 1:申請中/承認待ち, 2:承認済み, 3:変更中)',
summary varchar(255) comment '概要',
cause varchar(255) comment '内容',
bild_cost float comment '建設費用',
benefit float comment '損益利益',
amount_all float comment '合計金額',
registration date comment '登録日',
start_day date comment '開始日',
end_day date comment '終了日',
prove int comment '開発端末',
persons int comment'人数',
total_prove int comment '合計開発端末',
re float comment 'リリース環境使用料',
total_re float comment '合計リリース環境使用料',
line int comment '回線使用料',
total_line int comment '合計回線使用料',
room float comment '施設使用料',
total_room float comment '合計施設使用料',
human int comment '開発要員',
total_human int comment '合計開発要員',
etc float comment '雑費' ,
total_etc float comment '合計雑費' ,
plan varchar(255) comment '実施計画の資料',
i_drafting_id varchar(100) comment '実施起案番号',
i_approval_id varchar(100) comment '実施決裁番号',
a_drafting_id varchar(100) comment '契約起案番号',
cd_id varchar(100) comment '契約決裁番号',
i_a_d_id varchar(100) comment '実施兼契約起案番号',
i_a_id varchar(100) comment '実施兼契約番号',

day date comment '日付',
password varchar(100) comment 'パスワード',
foreign key(user_id) references users(user_id) on update cascade on delete cascade,
foreign key(project_id) references projects(project_id) on update cascade on delete cascade
);

use openconnect;
insert into decision(decision_id,project_id,decision_name,summary,prove,re,line,room,human,etc,cause,start_day,end_day) values
(2, 2,'案件名２(キャッツ)' ,'あずまっくす' ,7 ,0.6 ,1 ,55.5 ,100 ,0.5 ,'飲みサーに入ってた' ,'2017-09-09' ,'2017-09-29');




create table projects(
project_id int primary key not null auto_increment comment 'プロジェクトID',
project_name varchar(100) not null comment 'プロジェクト名',
manager_id int not null comment 'リーダーID',
sub_manager_id int not null comment 'サブリーダーID',
start_date date comment '開始日',
end_date date comment '終了日',
note varchar(255) comment 'メモ',
foreign key(manager_id) references users(user_id) on update cascade on delete cascade,
foreign key(sub_manager_id) references users(user_id) on update cascade on delete cascade
) comment='プロジェクト一覧テーブル';

use openconnect;
insert into projects(project_id, project_name, manager_id, sub_manager_id) values
(2, 'catsndogs', 4, 1);




create table users (
user_id int primary key not null auto_increment comment 'ユーザーID',
password varchar(255)  comment 'パスワード',
family_name varchar(50) not null comment '姓(英語)',
given_name varchar(50) not null comment '名(英語)',
family_name_kanji varchar(50) not null comment '姓(漢字)',
family_name_kana varchar(50) not null comment '姓(ふりがな)',
given_name_kanji varchar(50) not null comment '名(漢字)',
given_name_kana varchar(50) not null comment '名(ふりがな)',
postal varchar(255) comment '郵便番号',
address varchar(255) comment '住所',
phone_number varchar(255) comment '電話番号',
phone_email varchar(255) unique comment 'メールアドレス',
mobile_number varchar(255) comment '携帯電話番号',
mobile_email varchar(255) unique comment '携帯メールアドレス',
sex varchar(10) not null comment '性別',
birthday date comment '誕生日',
userdel_flg boolean default FALSE comment '退会フラグ',
login_flg boolean default FALSE comment 'ログインフラグ',
user_flg int not null default 1 comment 'ユーザーフラグ',
year varchar(4) comment '受講年',
month varchar(2) comment '受講開始月',
oauth_id varchar(255) comment 'OAuthID',
oauth_name int default 0 comment 'OAuth名',
oauth_account varchar(100) comment 'OAuthアカウント',
register_day datetime comment '登録日',
update_day datetime comment '更新日'
)comment = 'ユーザー情報格納テーブル';

use openconnect;
insert into users values
(1,'t','test','user','テスト','てすと','ユーザー','ゆーざー','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','t@g','09012345678','user.test@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00');




