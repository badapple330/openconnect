set names utf8;
set foreign_key_checks=0;
drop database if exists openconnect;
create database if not exists openconnect;
use openconnect;

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
drop table if exists users;

drop table if exists user;
drop table if exists site;
drop table if exists master;

drop database if exists openconnect;
create database openconnect;
use openconnect;

/* 年月日をnot nullに戻す */
create table attendance(
at_year int  comment '手入力の報告年',
at_month int comment '手入力の報告月',
at_day int  comment '手入力の報告日',
at_date timestamp not null default current_timestamp comment '日付',
user_id int not null comment '生徒ID',
attendance varchar(50) comment '出欠状況',
reason text comment'備考',
foreign key(user_id) references users(user_id) on update cascade on delete cascade
);

/*サブプロジェクト / 書籍一覧 */
create table books(
book_id int primary key not null auto_increment comment 'ブックID',
title varchar(100) not null unique comment 'タイトル'
);

create table decision(
registration date comment '登録日',
user_id int comment 'ユーザーID',
project_id int comment 'プロジェクト名',
decision_id int primary key auto_increment comment '決裁ID',
decision_name varchar(100) comment '案件名',
detail varchar(255) comment '詳細',
i_drafting_id varchar(100) comment '実施起案番号',
i_approval_id varchar(100) comment '実施決裁番号',
a_drafting_id varchar(100) comment '契約起案番号',
cd_id varchar(100) comment '契約決裁番号',
i_a_d_id varchar(100) comment '実施兼契約起案番号',
i_a_id varchar(100) comment '実施兼契約番号',
foreign key(user_id) references users(user_id) on update cascade on delete cascade,
foreign key(project_id) references projects(project_id) on update cascade on delete cascade
);

create table decision_detail(
project_id int not null comment 'プロジェクトID',
day date comment '日付',
decision_type varchar(100)  comment '決裁種類',
decision_status varchar(100) comment '決裁状況',
user_id int comment 'ユーザーID',
item_name varchar(100) comment '案件名',
summary varchar(255) comment '概要',
cause varchar(255) comment '理由',
start_day date comment '開始日',
end_day date comment '終了日',
plan varchar(255) comment '実施計画の資料',
persons int comment '人数',
password varchar(100) comment 'パスワード',
decision_id int comment '決裁ID',
decision_detail_id int primary key auto_increment comment '決裁手続きID',
foreign key(decision_id) references decision(decision_id) on update cascade on delete cascade,
foreign key(user_id) references users(user_id) on update cascade on delete cascade,
foreign key(project_id) references projects(project_id) on update cascade on delete cascade
);

/* 欠席登録 *
 * 管理番号 = number
 * 名前 = name
 * 欠席理由 = reason
 */
create table kesseki(
number varchar(5) comment '管理番号',
name varchar(50) comment '名前',
reason varchar(50) comment '欠席理由'
) comment = '欠席登録テーブル';

create table master(
level_id int not null comment '権限レベルID',
level_name varchar(10) not null comment '権限レベル名'
) comment='権限マスターテーブル';

/* 面談登録 *
 * 管理番号 = number
 * 名前 = name
 * 面談開始時間 = time
 */
create table mendan(
number varchar(5) comment '管理番号',
name varchar(50) comment '名前',
time varchar(6) comment '面談開始時間'
) comment = '面談登録テーブル';

/*サブプロジェクト */


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

create table project_status(
project_id int not null comment 'プロジェクトID',
a_envstart date comment 'A環境開始日',
a_envend date comment 'A環境終了日',
b_envstart date comment 'B環境開始日',
b_envend date comment 'B環境終了日',
r_envstart date comment 'リリース環境開始日',
r_envend date comment 'リリース環境終了日',
aws_status varchar(50) default '' comment 'AWSリリース状況',
note varchar(255) default '' comment 'メモ',
status_id int primary key auto_increment comment 'リリース状況ID',
foreign key(project_id) references projects(project_id) on update cascade on delete cascade
) comment='プロジェクトリリース状況一覧';

create table project_progress(
progress_id int auto_increment key comment '進捗状況ID',
project_id int comment 'プロジェクトID',
project_day date not null comment 'プロジェクト進捗日付',
project_plan varchar(255) comment '進捗予定',
project_result varchar(255) comment '進捗結果',
other varchar(255) comment 'その他報告',
foreign key(project_id) references projects(project_id) on update cascade on delete cascade
);

create table schedule(
id int primary key auto_increment comment 'スケジュールID',
start_day date not null comment '開始日',
end_day date comment '終了日',
title varchar(100) not null comment '件名',
content varchar(100) comment '内容',
team_name varchar(255) not null default '1stmonth' comment 'チーム名'
);

insert into schedule(id,start_day,end_day,title,content,team_name) values
(1,"2017-06-15","2017-06-20","実装","実装","TestTeam"),
(2,"2017-06-18","2017-06-25","実装2","実装2","AdminTeam");


/* サイト一覧情報 */
create table site(
site_id int primary key not null auto_increment comment 'サイトID',
site_name varchar(100) not null comment 'サイト名',
site_url varchar(255) not null unique comment 'サイトURL',
site_article text comment 'サイト記事',
genre varchar(50) comment 'ジャンル',
picture varchar(255) comment '画像',
banner varchar(80) comment 'バナー',
year int comment '作成年度'
) comment='サイト情報格納テーブル';

/* カレッジ生名簿 *
 * 管理番号 = number
 * 名前 = name
 * ふりがな = symbol
 * 入校年月 = entrance
 */
create table students(
number varchar(5) comment '管理番号',
name varchar(50) comment '名前',
symbol varchar(50) comment 'ふりがな',
entrance varchar(10) comment '入校年月',
PRIMARY KEY (number)
) comment = 'カレッジ生テーブル';



/* 出席登録 *
 * 管理番号 = number
 * 名前 = name
 */
create table syusseki(
number varchar(5) comment '管理番号',
name varchar(50) comment '名前'
) comment = '出席登録テーブル';


/* 遅刻登録 *
 * 管理番号 = number
 * 名前 = name
 * 遅刻理由 = reason
 */
create table tikoku(
number varchar(5) comment '管理番号',
name varchar(50) comment '名前',
reason varchar(50) comment '遅刻理由'
) comment = '遅刻登録テーブル';

CREATE TABLE user (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ユーザーID',
  `password` varchar(255) NOT NULL COMMENT 'パスワード',
  `name` varchar(255) COMMENT '名前',
  `name_f` varchar(255) COMMENT '名前(ふりがな)',
  `postal` varchar(255) NOT NULL COMMENT '郵便番号',
  `address` varchar(255) NOT NULL COMMENT '住所',
  `tel_number` varchar(255) NOT NULL COMMENT '電話番号',
  `email` varchar(255) NOT NULL COMMENT 'メールアドレス',
  `sex` varchar(10) NOT NULL COMMENT '性別',
  `birthday` date NOT NULL COMMENT '誕生日',
  `handle_name` varchar(16) COMMENT 'ハンドルネーム',
  `register_day` datetime NOT NULL COMMENT '登録日',
  `update_day` datetime NOT NULL COMMENT '更新日',
  `userdel_flg` tinyint(1) NOT NULL DEFAULT '0' COMMENT '退会フラグ',
  `login_flg` tinyint(1) NOT NULL DEFAULT '1' COMMENT 'ログインフラグ',
  `user_flg` int(11) NOT NULL DEFAULT '1' COMMENT 'ユーザーフラグ',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email` (`email`)
) COMMENT='ユーザー情報格納テーブル';

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
team_name varchar(255) not null default '1stmonth' comment 'チーム名',
user_img varchar(50) default "pic/user_img/syoki.png" comment '写真',
user_name varchar(50) not null comment '名前',
point int not null default 0 comment 'ポイント',
lv int not null default 1 comment 'レベル',
profile varchar(150) comment 'プロフィール',
delete_flg boolean not null default false comment '削除フラグ')
comment = 'ユーザー情報格納テーブル';

/* グループマスター情報
 **************************/
create table group_master(
group_id int not null primary key auto_increment comment 'グループID',
group_name varchar(50) not null comment 'グループ名',
group_img varchar(50) default "papurika01.jpg" comment 'グループイメージ',
created_at datetime not null  default current_timestamp comment '作成日'
);

/* 投稿情報
 **************************/
create table post(
post_id int not null primary key auto_increment comment '投稿ID',
receiver_id int comment  '受取人ID',
sender_id int not null comment '送信者ID',
group_id int comment 'グループID',
post_contents varchar(255) not null comment '送信内容',
img varchar(50) comment '添付画像',
post_at timestamp not null default current_timestamp comment '投稿日時',
foreign key(receiver_id) references users(user_id),
foreign key(sender_id) references users(user_id),
foreign key(group_id) references group_master(group_id)
);

/* タイムライン投稿情報
 **************************/
create table send_timeline(
timeline_id int not null primary key auto_increment comment 'タイムラインID',
sender_id varchar(50) not null comment '送信者ID',
send_contents varchar(255) not null comment '送信内容',
img varchar(50) comment '添付画像',
send_at timestamp not null default current_timestamp comment '送信日時',
re_timeline_id int comment '返信する場合の、返信先のタイムラインID',
good int not null default 0 comment 'いいね'
);

/* タイムライン情報
 **************************/
create table timeline(
timeline_id int not null comment 'タイムラインID',
sender_id int not null comment '送信者ID',
follower_id int comment 'フォロワーID',
foreign key(sender_id) references users(user_id),
foreign key(follower_id) references users(user_id),
foreign key(timeline_id) references send_timeline(timeline_id)

);

/* グループ情報
 **************************/
create table groups(
user_id int not null comment 'ユーザーID',
group_id int not null comment 'グループID',
foreign key(user_id) references users(user_id),
foreign key(group_id) references group_master(group_id)
);

/* フォロー情報
 **************************/
create table follow(
follow_num int not null primary key auto_increment comment'フォロー番号',
do int not null comment 'する側ID',
done int not null comment 'される側ID',
foreign key(do) references users(user_id),
foreign key(done) references users(user_id)
);

/* いいね情報
 **************************/
create table good(
good_num int not null primary key auto_increment comment'フォロー番号',
user_id int not null comment 'ユーザーID',
timeline_id int not null comment 'タイムラインID',
foreign key(user_id) references users(user_id),
foreign key(timeline_id) references send_timeline(timeline_id)
);

/* チャット既読情報
 **************************/
create table read_flg(
post_id int not null comment'投稿ID',
user_id int not null comment 'ユーザーID',
foreign key(user_id) references users(user_id),
foreign key(post_id) references post(post_id)
);


/* 通知情報
 **************************/
create table message(
user_id int not null comment 'ユーザーID',
msg varchar(255) not null comment'通知文',
url varchar(50) comment '通知文にリンクを貼る際のURL',
send_at timestamp not null default current_timestamp comment '送信日時',
foreign key(user_id) references users(user_id)
);


/* スタンプ情報
 **************************/
create table stamp(
stamp_id int not null primary key auto_increment comment 'スタンプID',
type_id int not null comment '種別ID',
lv int not null default 1 comment '使用可能レベル',
url varchar(255) not null
);



/*トリガー(出来ません涙)*/

/*タイムライン登校時（タイムライン投稿情報insert時）タイムラインテーブルにデータ入力
 *  */
/**create trigger ins_timeline after insert on send_timeline for each row
begin
	insert into timeline values(new.timeline_id,new.sender_id,0)
end
**/



/**test用insert
 */
insert into users(user_name,user_img) values("kikuchi","pic/user_img/music.jpg"),("kishimoto","pic/user_img/tablet.jpg"),("おれ","pic/user_img/umi.png"),("maeda","pic/user_img/knight.gif"),
("fukuda","pic/user_img/sakura.jpg"),("narita","pic/user_img/mukky.jpg"),("adachi","pic/user_img/manami.jpg"),("ide","pic/user_img/ao.jpg"),
("testuser1","pic/user_img/ice.jpg"),("testuser2","pic/user_img/study.jpg"),("testuser3","pic/user_img/study.jpg"),("testuser4","pic/user_img/study.jpg");

insert into follow(do,done) values(1,2),(2,1),(1,3),(3,1),(2,3),(3,2),(1,4),(4,1),(2,4),(4,2),(3,4),(4,3),(4,5),(5,4),(1,5),(5,1),(2,5),(5,2),(3,5),(5,3),(6,1),(1,6),(2,6),(6,2),(6,3),(3,6),(4,6),(6,4),(6,5),(5,6),(7,1),(1,7),(2,7),(7,2),(7,3),(3,7),(4,7),(7,4),(7,5),(5,7),(6,7),(7,6),
(8,1),(1,8),(2,8),(8,2),(8,3),(3,8),(4,8),(8,4),(8,5),(5,8),(6,8),(8,6),(8,7),(7,8),
(9,1),(1,9),(2,9),(9,2),(9,3),(3,9),(4,9),(9,4),(9,5),(5,9),(6,9),(9,6),(9,7),(7,9),(8,9),(9,8);

insert into group_master(group_name,group_img) values("legmina","tomato01.jpg"),("openconnect","tomato01.jpg"),("cetus","tomato01.jpg"),("bananalate","tomato01.jpg");

insert into groups(user_id,group_id) values(1,1),(2,1),(3,1),(4,1),(5,4),(3,4),(6,4);

insert into post(sender_id,group_id,post_contents) values(1,1,"グループを新設しました"),(6,4,"グループを新設しました");

insert into post(sender_id,receiver_id,post_contents) values(1,2,"（・ｘ・）"),(1,3,"｜ω：）"),(1,4,"（・ω｜"),(2,3,"（・ω・）"),(2,4,"（：：）"),(3,4,"v（・ω｜"),
(5,1,"v（・ω｜"),(5,2,"v（・ω｜"),(5,3,"v（・ω｜"),(5,4,"v（・ω｜"),
(6,1,"v（・ω｜"),(6,2,"v（・ω｜"),(6,3,"v（・ω｜"),(6,4,"v（・ω｜"),(6,5,"v（・ω｜"),
(7,1,"v（・ω｜"),(7,2,"v（・ω｜"),(7,3,"v（・ω｜"),(7,4,"v（・ω｜"),(7,5,"v（・ω｜"),(7,6,"v（・ω｜"),
(8,1,"v（・ω｜"),(8,2,"v（・ω｜"),(8,3,"v（・ω｜"),(8,4,"v（・ω｜"),(8,5,"v（・ω｜"),(8,6,"v（・ω｜"),(8,7,"v（・ω｜"),
(9,1,"v（・ω｜"),(9,2,"v（・ω｜"),(9,3,"v（・ω｜"),(9,4,"v（・ω｜"),(9,5,"v（・ω｜"),(9,6,"v（・ω｜"),(9,7,"v（・ω｜"),(9,8,"V");




set names utf8;
set foreign_key_checks=0;
use openconnect;
delete from users;
insert into users values
(1,'testuser','test','user','テスト','てすと','ユーザー','ゆーざー','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test@gmail.com','09012345678','user.test@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(2,'internous01','inoue','takuma','井上','いのうえ','琢磨','たくま','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','takuma.inoue@gmail.com','09012345678','takuma.inoue@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','TestTeam','','井上琢磨','','','',''),
(3,'internous01','harada','miyuki','原田','はらだ','美友貴','みゆき','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','miyuki.harada@gmail.com','09012345678','miyuki.harada@ne.jp','女','1992-05-03',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','TestTeam','','原田美友貴','','','',''),
(4,'internous01','test','admin1','テスト','てすと','管理者1','かんりしゃ1','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test1@gmail.com','09012345678','admin.test1@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','','test','','','',''),
(5,'internous01','test','admin2','テスト','てすと','管理者2','かんりしゃ2','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test2@gmail.com','09012345678','admin.test2@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','','test','','','',''),
(6,'internous01','test','admin3','テスト','てすと','管理者3','かんりしゃ3','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test3@gmail.com','09012345678','admin.test3@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','','test','','','',''),
(7,'internous01','test','admin4','テスト','てすと','管理者4','かんりしゃ4','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test4@gmail.com','09012345678','admin.test4@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','','test','','','',''),
(8,'internous01','test','admin5','テスト','てすと','管理者5','かんりしゃ5','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test5@gmail.com','09012345678','admin.test5@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','','test','','','',''),
(9,'internous01','test','admin6','テスト','てすと','管理者6','かんりしゃ6','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test6@gmail.com','09012345678','admin.test6@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','','test','','','',''),
(10,'internous01','test','admin7','テスト','てすと','管理者7','かんりしゃ7','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test7@gmail.com','09012345678','admin.test7@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','','test','','','',''),
(11,'internous01','test','admin8','テスト','てすと','管理者8','かんりしゃ8','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test8@gmail.com','09012345678','admin.test8@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','','test','','','',''),
(12,'internous01','test','admin9','テスト','てすと','管理者9','かんりしゃ9','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test9@gmail.com','09012345678','admin.test9@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','','test','','','',''),
(13,'internous01','test','admin10','テスト','てすと','管理者10','かんりしゃ10','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test10@gmail.com','09012345678','admin.test10@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','','test','','','',''),
(14,'leader11','test','leader1','テスト','てすと','リーダー1','りーだー1','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','leader1.test@gmail.com','09012345678','leader1.test@ne.jp','男','1990-04-01',FALSE,FALSE,'2','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(15,'leader22','test','leader2','テスト','てすと','リーダー2','りーだー2','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','leader2.test@gmail.com','09012345678','leader2.test@ne.jp','男','1990-04-01',FALSE,FALSE,'2','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(16,'student1','nitabaru','kouhei','仁田原','にたばる','耕平','こうへい','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','kouhei.nitabaru@gmail.com','09012345678','kouhei.nitabaru@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','07','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(17,'student2','itou','tatsuhumi','伊藤','いとう','竜文','たつふみ','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','tatsuhumi.itou@gmail.com','09012345678','tatsuhumi.itou@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','07','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(18,'student3','sunakawa','minori','砂川','すなかわ','みのり','みのり','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','minori.sunakawa@gmail.com','09012345678','minori.sunakawa@ne.jp','女','1990-04-01',FALSE,FALSE,'1','2016','07','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(19,'student4','keduka','masahiro','毛塚','けづか','正広','まさひろ','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','masahiro.keduka@gmail.com','09012345678','masahiro.keduka@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','08','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(20,'student5','horiguchi','kennichi','堀口','ほりぐち','謙一','けんいち','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','kennichi.horiguchi@gmail.com','09012345678','kennichi.horiguchi@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','08','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(21,'student6','kiryuu','youichi','霧生','きりゅう','雄一','ゆういち','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','yuuichi.kiryuu@gmail.com','09012345678','yuuichi.kiryuu@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','08','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(22,'student7','hoshi','tatsuya','星','ほし','達也','たつや','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','tatsuya.hoshi@gmail.com','09012345678','tatsuya.hoshi@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','08','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(23,'student8','iwamoto','koumei','岩本','いわもと','興明','こうめい','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','koumei.iwamoto@gmail.com','09012345678','koumei.iwamoto@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','08','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(24,'testuser','test','user','テスト','てすと','ユーザー1','ゆーざー1','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test1@gmail.com','09012345678','user.test1@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(25,'testuser','test','user','テスト','てすと','ユーザー2','ゆーざー2','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test2@gmail.com','09012345678','user.test2@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(26,'testuser','test','user','テスト','てすと','ユーザー3','ゆーざー3','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test3@gmail.com','09012345678','user.test3@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(27,'testuser','test','user','テスト','てすと','ユーザー4','ゆーざー4','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test4@gmail.com','09012345678','user.test4@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(28,'testuser','test','user','テスト','てすと','ユーザー5','ゆーざー5','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test5@gmail.com','09012345678','user.test5@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(29,'testuser','test','user','テスト','てすと','ユーザー6','ゆーざー6','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test6@gmail.com','09012345678','user.test6@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(30,'testuser','test','user','テスト','てすと','ユーザー7','ゆーざー7','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test7@gmail.com','09012345678','user.test7@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(31,'testuser','test','user','テスト','てすと','ユーザー8','ゆーざー8','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test8@gmail.com','09012345678','user.test8@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(32,'testuser','test','user','テスト','てすと','ユーザー9','ゆーざー9','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test9@gmail.com','09012345678','user.test9@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(33,'testuser','test','user','テスト','てすと','ユーザー10','ゆーざー10','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test10@gmail.com','09012345678','user.test10@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(34,'testuser','test','user','テスト','てすと','ユーザー11','ゆーざー11','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test11@gmail.com','09012345678','user.test11@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(35,'testuser','test','user','テスト','てすと','ユーザー12','ゆーざー12','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test12@gmail.com','09012345678','user.test12@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(36,'testuser','test','user','テスト','てすと','ユーザー13','ゆーざー13','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test13@gmail.com','09012345678','user.test13@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(37,'testuser','test','user','テスト','てすと','ユーザー14','ゆーざー14','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test14@gmail.com','09012345678','user.test14@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(38,'testuser','test','user','テスト','てすと','ユーザー15','ゆーざー15','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test15@gmail.com','09012345678','user.test15@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(39,'testuser','test','user','テスト','てすと','ユーザー16','ゆーざー16','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test16@gmail.com','09012345678','user.test16@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(40,'testuser','test','user','テスト','てすと','ユーザー17','ゆーざー17','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test17@gmail.com','09012345678','user.test17@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','','test','','','',''),
(41,'internous01','kazami','akira','風見','かざみ','顕','あきら','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','kazami@internous.co.jp','09012345678','kazami@internous.co.jp','男','2001-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','','風見顕','','','','');





insert into stamp(type_id,url) values
(1,"pic/stamp/01_hipota/hipota_01.jpg"),
(1,"pic/stamp/01_hipota/hipota_02.jpg"),
(1,"pic/stamp/01_hipota/hipota_03.jpg"),
(1,"pic/stamp/01_hipota/hipota_04.jpg"),
(1,"pic/stamp/01_hipota/hipota_05.jpg"),
(1,"pic/stamp/01_hipota/hipota_06.jpg"),
(1,"pic/stamp/01_hipota/hipota_07.jpg"),
(1,"pic/stamp/01_hipota/hipota_08.jpg"),
(1,"pic/stamp/01_hipota/hipota_09.jpg"),
(1,"pic/stamp/01_hipota/hipota_10.jpg"),
(1,"pic/stamp/01_hipota/hipota_11.jpg"),
(1,"pic/stamp/01_hipota/hipota_12.jpg"),
(1,"pic/stamp/01_hipota/hipota_13.jpg"),
(1,"pic/stamp/01_hipota/hipota_14.jpg"),
(1,"pic/stamp/01_hipota/hipota_15.jpg"),
(1,"pic/stamp/01_hipota/hipota_16.jpg"),
(1,"pic/stamp/01_hipota/hipota_17.jpg"),
(1,"pic/stamp/01_hipota/hipota_18.jpg"),
(1,"pic/stamp/01_hipota/hipota_19.jpg"),
(1,"pic/stamp/01_hipota/hipota_20.jpg"),
(1,"pic/stamp/01_hipota/hipota_21.jpg"),
(1,"pic/stamp/01_hipota/hipota_22.jpg"),
(1,"pic/stamp/01_hipota/hipota_23.jpg"),
(1,"pic/stamp/01_hipota/hipota_24.jpg"),
(1,"pic/stamp/01_hipota/hipota_25.jpg"),
(2,"pic/stamp/02_lion/lion_01.jpg"),
(2,"pic/stamp/02_lion/lion_02.jpg"),
(2,"pic/stamp/02_lion/lion_03.jpg"),
(2,"pic/stamp/02_lion/lion_04.jpg"),
(2,"pic/stamp/02_lion/lion_05.jpg"),
(2,"pic/stamp/02_lion/lion_06.jpg"),
(2,"pic/stamp/02_lion/lion_07.jpg"),
(2,"pic/stamp/02_lion/lion_08.jpg"),
(2,"pic/stamp/02_lion/lion_09.jpg"),
(2,"pic/stamp/02_lion/lion_10.jpg"),
(2,"pic/stamp/02_lion/lion_11.jpg"),
(2,"pic/stamp/02_lion/lion_12.jpg"),
(2,"pic/stamp/02_lion/lion_13.jpg"),
(2,"pic/stamp/02_lion/lion_14.jpg"),
(2,"pic/stamp/02_lion/lion_15.jpg"),
(2,"pic/stamp/02_lion/lion_16.jpg");

insert into stamp(type_id,lv,url) values
(3,2,"pic/stamp/03_ham/ham_01.jpg"),
(3,2,"pic/stamp/03_ham/ham_02.jpg"),
(3,2,"pic/stamp/03_ham/ham_03.jpg"),
(3,2,"pic/stamp/03_ham/ham_04.jpg"),
(3,2,"pic/stamp/03_ham/ham_05.jpg"),
(3,2,"pic/stamp/03_ham/ham_06.jpg"),
(3,2,"pic/stamp/03_ham/ham_07.jpg"),
(3,2,"pic/stamp/03_ham/ham_08.jpg"),
(3,2,"pic/stamp/03_ham/ham_09.jpg"),
(3,2,"pic/stamp/03_ham/ham_10.jpg"),
(3,2,"pic/stamp/03_ham/ham_11.jpg"),
(3,2,"pic/stamp/03_ham/ham_12.jpg"),
(3,2,"pic/stamp/03_ham/ham_13.jpg"),
(3,2,"pic/stamp/03_ham/ham_14.jpg"),
(3,2,"pic/stamp/03_ham/ham_15.jpg"),
(3,2,"pic/stamp/03_ham/ham_16.jpg"),
(3,2,"pic/stamp/03_ham/ham_17.jpg"),
(3,2,"pic/stamp/03_ham/ham_18.jpg"),
(3,2,"pic/stamp/03_ham/ham_19.jpg"),
(3,2,"pic/stamp/03_ham/ham_20.jpg"),
(3,2,"pic/stamp/03_ham/ham_21.jpg"),
(3,2,"pic/stamp/03_ham/ham_22.jpg"),
(3,2,"pic/stamp/03_ham/ham_23.jpg"),
(3,2,"pic/stamp/03_ham/ham_24.jpg"),
(3,2,"pic/stamp/03_ham/ham_25.jpg"),
(3,2,"pic/stamp/03_ham/ham_26.jpg"),
(3,2,"pic/stamp/03_ham/ham_27.jpg");









set foreign_key_checks=1;