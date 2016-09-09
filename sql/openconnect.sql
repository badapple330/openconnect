DROP DATABASE IF EXISTS openconnect;
CREATE DATABASE openconnect;

/* 一旦消して再度作ることでデータの重複を防ぐ */

use openconnect;

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
 */
create table users (
user_id int primary key not null auto_increment comment 'ユーザーID',
password varchar(255) not null comment 'パスワード',
family_name varchar(50) not null comment '姓(英語)',
given_name varchar(50) not null comment '名(英語)',

year varchar(4) not null comment '受講年',
month varchar(2) not null comment '受講開始月'
)comment = 'ユーザー情報格納テーブル';

/* ユーザー 一覧 / ユーザーID/パスワード/ユーザー名/ユーザー名(ふりがな)/郵便番号/住所/電話番号/メールアドレス/性別/生年月日/登録日/更新日/退会フラグ/ログインフラグ/ユーザーフラグ*/
insert into users()values
('1','testuser','test','user','テスト','てすと','ユーザー','ゆーざー','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test@gmail.com','09012345678','user.test@ne.jp','男','1993-12-24','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','04'),
('2','internous01','inoue','takuma','井上','いのうえ','琢磨','たくま','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','takuma.inoue@gmail.com','09012345678','takuma.inoue@ne.jp','男','1990-09-25','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'3','2010','04'),
('3','internous01','harada','miyuki','原田','はらだ','美由貴','みゆき','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','miyuki.harada@gmail.com','09012345678','miyuki.harada@ne.jp','女','1992-05-03','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'3','2010','04'),
('4','leader1','test','leader1','テスト','てすと','リーダー1','りーだー1','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','leader1.test@gmail.com','09012345678','leader1.test@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'2','2016','04'),
('5','leader2','test','leader2','テスト','てすと','リーダー2','りーだー2','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','leader2.test@gmail.com','09012345678','leader2.test@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'2','2016','04')
;


/* サイト一覧情報 *
 * サイトID = site_id
 * サイト名 = site_name
 * サイトURL = site_url
 * サイト記事 = site_article
 * グループ = genre
 * 画像 = picture
 * バナー = banner
 */
create table site(
site_id int primary key not null auto_increment comment 'サイトID',
site_name varchar(30) not null comment 'サイト名',
site_url varchar(255) not null unique comment 'サイトURL',
site_article text comment 'サイト記事',
genre varchar(30) comment 'genre',
picture varchar(255) comment 'picture',
banner varchar(80) comment 'banner'
)comment = 'サイト情報格納テーブル';

/* サイト一覧 / サイト名/URL */
insert into site(site_id, site_name, site_url,site_article,genre,picture,banner)values
(1,"BaseBallTicket","http://www.internousdev.com/baseballTicket/","野球観戦チケットサイト","チケット",null,null),/* BaseBallTicketサイト情報 */
(2,"gekidanroadshow","http://www.internousdev.com/gekidanroadshow/","舞台チケット予約サイト","チケット",null,null),/* gekidanroadshowサイト情報 */
(3,"ichigoichie","http://www.internousdev.com/ichigoichie/","着物レンタルサイト","レンタル",null,null),/* ichigoichieサイト情報 */
(4,"chocotime","http://www.internousdev.com/chocotime/","チョコレート販売サイト","グルメ",null,null),/* chocotimeサイト情報 */
(5,"kinnosawa","http://www.internousdev.com/kinnosawa/","和菓子販売サイト","グルメ",null,null),/* kinnosawaサイト情報 */
(6,"kuruyama","http://www.internousdev.com/kuruyama/","ラーメン販売サイト","グルメ",null,null);/* kuruyamaサイト情報 */


/*権限マスター*
 * 権限レベルID = level_id
 * 権限レベル名 = level_name
 */
create table master(
level_id int not null comment '権限レベルID',
level_name varchar(10) not null  comment '権限レベル名'
)comment = '権限マスター情報格納テーブル';

/*権限マスター / 権限レベルID/権限レベル名*/
insert into master(level_id,level_name)value
(1,"ユーザー"),
(2,"管理者"),
(3,"テストユーザー"),
(4,"出品者");

/*サブプロジェクト */

/*サブプロジェクト / プロジェクト一覧*/
create table projects(
project_id int primary key not null auto_increment,
project_name varchar(100) not null,
manager_id int not null,
sub_manager_id int not null,
start_date date,
end_date date,
note varchar(255),
foreign key(manager_id) references users(user_id),
foreign key(sub_manager_id) references users(user_id)
);

insert into projects()values
(1,"cosmos",1,2,"20160801","20160831","undecided"),
(2,"credit",3,4,"20160801","20160831","undecided");

/*サブプロジェクト / プロジェクト一覧*/
create table project_status(
project_id int not null,
a_envstart date not null,
a_envend date,
b_envstart date,
b_envend date,
r_envstart date,
r_envend date,
aws_status varchar(50),
note varchar(255),
foreign key(project_id) references projects(project_id)
);

insert project_status(project_id, a_envstart)values
(1,"20160801"),(2,"20160801");


/*サブプロジェクト / 勤怠更新*/
create table attendance(
date DATE not null comment '日付',
user_id int not null comment '生徒ID',
attendance enum('1','2','3','4','5') default '1'  comment '出欠状況',
interview enum('1','2') default '2' comment '面談状況',
foreign key(user_id) references users(user_id)
);

insert into attendance(
date,user_id,attendance,interview
)values
(160802,1,1,1),
(160821,2,2,1),
(160822,3,1,2);

/*サブプロジェクト / 決裁状況一覧*/
create table decision(
registration datetime,
user_id int,
project_id int,
decision_id int primary key auto_increment,
decision_name varchar(100),
detail varchar(255),
i_drafting_id varchar(100),
i_approval_id varchar(100),
a_drafting_id varchar(100),
cd_id varchar(100),
i_a_d_id varchar(100),
i_a_id varchar(100),
foreign key(user_id) references users(user_id),
foreign key(project_id) references projects(project_id)
);

insert into decision()value
("2016-08-21 13:00:00",1,1,1,"cinemajapanサイトにおけるチーム開発の実施について","-","KN-2016-05-30-005","J-2016-05-30-005","K-KN-2016-05-30-005","K-2016-05-30-005","-","-"),
("2016-08-22 12:00:00",2,2,2,"Lapoupeeサイトにおける改修（遡及）の実施について","0007-データベースの接続不備改修","-","-","-","-","KN-2016-05-30-007","JK-2016-05-30-001");

/*サブプロジェクト / 決裁手続き内容*/
create table decision_detail(
project_id int not null,
day date,
decision_type varchar(100) default "実施決裁",
decision_status varchar(100) default "未申請",
user_id int,
item_name varchar(100),
summary varchar(255),
cause varchar(255),
start_day date ,
end_day date,
plan varchar(255),
persons int,
password varchar(100),
decision_id int,
decision_detail_id int auto_increment key,
foreign key(decision_id) references decision(decision_id),
foreign key(user_id) references users(user_id),
foreign key(project_id) references projects(project_id)
);

insert decision_detail(decision_detail_id,project_id, user_id,decision_id )
values(1,1,1,1),(2,2,2,2);

/*サブプロジェクト / 書籍一覧*/
create table books(
book_id int primary key not null auto_increment,
title varchar(100) not null
);

insert into books(title)values("やさしいJAVA");

/*サブプロジェクト / 書籍貸出状況一覧*/
create table books_borrow(
book_id int not null,
borrow_status varchar(10) not null default "貸し出し可能",
borrow_day date,
borrow_id int,
foreign key(book_id) references books(book_id),
foreign key(borrow_id) references users(user_id)
);

insert books_borrow(book_id, borrow_status)values
(1,"貸出可");

/*サブプロジェクト / プロジェクト進捗状況*/
create table project_progress(
progress_id int auto_increment key,
project_id int,
project_day date not null,
project_plan varchar(255),
project_result varchar(255),
other varchar(255),
foreign key(project_id) references projects(project_id)
);

insert into project_progress()values
(1,1,"2009-09-07","a","b","c"),
(2,2,"2009-09-07","a2","b2","c2");

/*サブプロジェクト / スケジュール*/
create table schedule(
id int primary key auto_increment,
start_day date not null,
end_day date,
title varchar(100) not null,
content varchar(100)
);

insert into schedule(id,start_day,title)values
(1,"20160801","test1"),(2,"20160802","test2"),(3,"20160803","test3");

