DROP DATABASE IF EXISTS openconnect;
CREATE DATABASE openconnect;

/* 一旦消して再度作ることでデータの重複を防ぐ */

use openconnect;

/* 過去のユーザーテーブル 2016/08/31まで */


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
password varchar(255) not null comment 'パスワード',
family_name varchar(50) not null comment '姓(英語)',
given_name varchar(50) not null comment '名(英語)',
family_name_kanji varchar(50) comment '姓(漢字)',
family_name_kana varchar(50) comment '姓(ふりがな)',
given_name_kanji varchar(50) comment '名(漢字)',
given_name_kana varchar(50) comment '名(ふりがな)',
postal varchar(255) default "" comment '郵便番号',
address varchar(255) default "" comment '住所',
phone_number varchar(255) default "" comment '電話番号',
phone_email varchar(255) not null unique comment 'メールアドレス',
mobile_number varchar(255) default "" comment '携帯電話番号',
mobile_email varchar(255) unique comment '携帯メールアドレス',
sex varchar(10) not null default "" comment '性別',
birthday date default 00000000 comment '誕生日',
register_day datetime default 00000000000000 comment '登録日',
update_day datetime default 00000000000000 comment '更新日',
userdel_flg boolean default FALSE comment '退会フラグ',
login_flg boolean default TRUE comment 'ログインフラグ',
user_flg int not null default 1 comment 'ユーザーフラグ',
year varchar(4) not null comment '受講年',
month varchar(2) not null comment '受講開始月'
)comment = 'ユーザー情報格納テーブル';

create table users (
user_id int primary key not null auto_increment comment 'ユーザーID',
password varchar(255) not null comment 'パスワード',
family_name varchar(50) not null comment '姓(英語)',
given_name varchar(50) not null comment '名(英語)',
family_name_kanji varchar(50) comment '姓(漢字)',
family_name_kana varchar(50) comment '姓(ふりがな)',
given_name_kanji varchar(50) comment '名(漢字)',
given_name_kana varchar(50) comment '名(ふりがな)',
postal varchar(255) comment '郵便番号',
address varchar(255) comment '住所',
phone_number varchar(255)  comment '電話番号',
phone_email varchar(255) not null unique comment 'メールアドレス',
mobile_number varchar(255)  comment '携帯電話番号',
mobile_email varchar(255) unique comment '携帯メールアドレス',
sex varchar(10) not null  comment '性別',
birthday date comment '誕生日',
register_day datetime comment '登録日',
update_day datetime  comment '更新日',
userdel_flg boolean default FALSE comment '退会フラグ',
login_flg boolean default TRUE comment 'ログインフラグ',
user_flg int not null default 1 comment 'ユーザーフラグ',
year varchar(4) not null comment '受講年',
month varchar(2) not null comment '受講開始月'
)comment = 'ユーザー情報格納テーブル';

/* ユーザー 一覧 / ユーザーID/パスワード/ユーザー名/ユーザー名(ふりがな)/郵便番号/住所/電話番号/メールアドレス/性別/生年月日/登録日/更新日/退会フラグ/ログインフラグ/ユーザーフラグ*/
insert into users()values
('1','testuser','test','user','テスト','てすと','ユーザー','ゆーざー','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test@gmail.com','09012345678','user.test@ne.jp','男','1993-12-24','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','04'),
('2','internous01','inoue','takuma','井上','いのうえ','琢磨','たくま','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','takuma.inoue@gmail.com','09012345678','takuma.inoue@ne.jp','男','1990-09-25','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'3','2010','04'),
('3','internous01','harada','miyuki','原田','はらだ','美由貴','みゆき','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','miyuki.harada@gmail.com','09012345678','miyuki.harada@ne.jp','女','1992-05-03','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'3','2010','04'),
('4','leader11','test','leader1','テスト','てすと','リーダー1','りーだー1','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','leader1.test@gmail.com','09012345678','leader1.test@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'2','2016','04'),
('5','leader22','test','leader2','テスト','てすと','リーダー2','りーだー2','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','leader2.test@gmail.com','09012345678','leader2.test@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'2','2016','04'),
('6','student1','nitabaru','kouhei','仁田原','にたばる','耕平','こうへい','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','kouhei.nitabaru@gmail.com','09012345678','kouhei.nitabaru@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','07'),
('7','student2','itou','tatsuhumi','伊藤','いとう','竜文','たつふみ','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','tatsuhumi.itou@gmail.com','09012345678','tatsuhumi.itou@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','07'),
('8','student3','sunakawa','minori','砂川','すなかわ','みのり','みのり','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','minori.sunakawa@gmail.com','09012345678','minori.sunakawa@ne.jp','女','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','07'),
('9','student4','keduka','masahiro','毛塚','けづか','正広','まさひろ','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','masahiro.keduka@gmail.com','09012345678','masahiro.keduka@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08'),
('10','student5','horiguchi','kennichi','堀口','ほりぐち','謙一','けんいち','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','kennichi.horiguchi@gmail.com','09012345678','kennichi.horiguchi@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08'),
('11','student6','kiryuu','youichi','霧生','きりゅう','雄一','ゆういち','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','yuuichi.kiryuu@gmail.com','09012345678','yuuichi.kiryuu@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08'),
('12','student7','hoshi','tatsuya','星','ほし','達也','たつや','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','tatsuya.hoshi@gmail.com','09012345678','tatsuya.hoshi@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08'),
('13','student8','iwamoto','koumei','岩本','いわもと','興明','こうめい','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','koumei.iwamoto@gmail.com','09012345678','koumei.iwamoto@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08');

