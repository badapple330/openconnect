set names utf8;
set foreign_key_checks=0;


drop database if exists openconnect;
create database openconnect;
use openconnect;

create table user (
  user_id int(11) not null primary key auto_increment comment 'ユーザーID',
  password varchar(255) not null comment 'パスワード',
  name varchar(255) default null comment '名前',
  name_f varchar(255) default null comment '名前(ふりがな)',
  postal varchar(255) not null comment '郵便番号',
  ddress varchar(255) not null comment '住所',
  tel_number varchar(255) not null comment '電話番号',
  email varchar(255) not null unique comment 'メールアドレス',
  sex varchar(10) not null comment '性別',
  birthday date not null default '0000-00-00' comment '誕生日',
  handle_name varchar(16) default null comment 'ハンドルネーム',
  register_day datetime not null default '0000-00-00 00:00:00' comment '登録日',
  update_day datetime not null default '0000-00-00 00:00:00' comment '更新日',
  userdel_flg tinyint(1) not null default '0' comment '退会フラグ',
  login_flg tinyint(1) not null default '1' comment 'ログインフラグ',
  user_flg int(11) not null default '1' comment 'ユーザーフラグ'
)comment='ユーザー情報格納テーブル';


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
login_flg boolean default FALSE comment 'ログインフラグ',
user_flg int not null default 1 comment 'ユーザーフラグ',
year varchar(4) comment '受講年',
month varchar(2) comment '受講開始月',
oauth_id varchar(255) comment 'OAuthID',
oauth_name int default 0 comment 'OAuth名',
oauth_account varchar(100) comment 'OAuthアカウント'
)comment = 'ユーザー情報格納テーブル';

insert into users values
('1','testuser','test','user','テスト','てすと','ユーザー','ゆーざー','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test@gmail.com','09012345678','user.test@ne.jp','男','1993-12-24','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','04','','0',''),
('2','internous01',	'inoue','takuma','井上','いのうえ','琢磨','たくま','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','takuma.inoue@gmail.com','09012345678','takuma.inoue@ne.jp','男','1990-09-25','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'3','2010','04','','0',''),
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


create table attendance(
date DATE not null comment '日付',
user_id int not null comment '生徒ID',
attendance int default 0  comment '出欠状況',
interview int default 2 comment '面談状況',
foreign key(user_id) references users(user_id) on update cascade on delete cascade
);


create table site(
site_id int primary key not null auto_increment comment 'サイトID',
site_name varchar(255) not null comment 'サイト名',
site_url varchar(255) not null unique comment 'サイトURL',
site_article text comment 'サイト記事',
genre varchar(50) comment 'ジャンル',
picture varchar(255) comment '画像',
banner varchar(80) comment 'バナー'
) comment='サイト情報格納テーブル';


/*サブプロジェクト / 書籍一覧 */
create table books(
book_id int primary key not null auto_increment comment 'ブックID',
title varchar(100) not null unique comment 'タイトル'
);


create table books_borrow(
book_id int not null comment 'ブックID',
borrow_status varchar(10) comment '貸出状況',
borrow_day date comment '貸出日',
borrow_id int comment '貸し出しID',
foreign key(book_id) references books(book_id) on update cascade on delete cascade,
foreign key(borrow_id) references users(user_id) on update cascade on delete cascade
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
end_date date default 00000000 comment '終了日',
note varchar(255) comment 'メモ',
foreign key(manager_id) references users(user_id) on update cascade on delete cascade,
foreign key(sub_manager_id) references users(user_id) on update cascade on delete cascade
) comment='プロジェクト一覧テーブル';

create table project_status(
project_id int not null comment 'プロジェクトID',
a_envstart date default 00000000 comment 'A環境開始日',
a_envend date default 00000000 comment 'A環境終了日',
b_envstart date default 00000000 comment 'B環境開始日',
b_envend date default 00000000 comment 'B環境終了日',
r_envstart date default 00000000 comment 'リリース環境開始日',
r_envend date default 00000000 comment 'リリース環境終了日',
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
content varchar(100) comment '内容'
);


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