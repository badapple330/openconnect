/*データベースの削除*/
drop database if exists baseballticket;
#データベース作成
create database if not exists baseballticket;

#データベース指定
use baseballticket;

/* テーブル作成 */
/* ユーザー */
create table user (  /* ユーザーのテーブルを作る */
user_id int not null auto_increment,  /* ユーザーに番号を割り振る、自動連番 */
password varchar(255) not null,   /* ユーザーのログイン用パスワード */
name varchar(255),  /* ユーザー名 */
name_f varchar(255),  /* ユーザー名(ふりがな) */
postal varchar(255) not null,/*郵便番号*/
address varchar(255) not null,/*住所*/
tel_number varchar(255) not null,/*電話番号*/
email varchar(255) not null unique,/*メールアドレス*/
sex varchar(10) not null,/*性別*/
birthday date not null,/*生年月日*/
handle_name varchar(16),
register_day datetime not null,/*登録日*/
update_day datetime not null,/*更新日*/
userdel_flg boolean not null default FALSE,/*退会フラグ*/
login_flg boolean not null default FALSE,/*ログインフラグ*/
user_flg int not null,/*ユーザーを判別するフラグ 1.一般ユーザー 2.管理者 3.テストユーザー 4.出品者*/
PRIMARY KEY (user_id)  /* idの重複、null禁止 */
);

/* データ登録 */
/* ユーザー 一覧 / ユーザーID/パスワード/ユーザー名/ユーザー名(ふりがな)/郵便番号/住所/電話番号/メールアドレス/性別/生年月日/登録日/更新日/退会フラグ/ログインフラグ/ユーザーフラグ*/
insert into user(user_id,password,name,name_f,postal,address,tel_number,email,sex,birthday,handle_name,register_day,update_day,userdel_flg,login_flg,user_flg)values
(1,"12345678","テスト管理者","てすとかんりしゃ","1130034","東京都文京区湯島3-2-12　御茶ノ水天神ビル","0312345678","testadmin@gmail.com","男","1993-12-24","test","2016-07-01 13:00:00","2016-07-11 12:11:25",FALSE,FALSE,"2"),
(2,"internous01","井上琢磨","いのうえたくま","1130034","東京都文京区湯島3-2-12　御茶ノ水天神ビル","09012341234","takuma.inoue@gmail.com","男","1990-09-25","taku","2016-07-01 13:00:00","2016-07-11 13:54:20",FALSE,FALSE,"2"),
(3,"internous01","原田美由貴","はらだみゆき","1130034","東京都文京区湯島3-2-12　御茶ノ水天神ビル","09045674567","miyuki.harada@gmail.com","女","1992-05-03","miyu","2016-07-01 13:00:00","2016-07-11 13:00:00",FALSE,FALSE,"2");

#購入履歴
create table history(
user_id tinyint not null comment'ユーザーID',
purchaseDate varchar(16) not null comment'購入日',
ticket_number varchar(5) comment'チケット番号'
);

#チームテーブル作成
create table team(
team_id tinyint primary key not null auto_increment comment'チームID',
team_name varchar(50) not null comment'チーム名'
);

#カートテーブル作成
create table cart(
user_id tinyint not null comment'ユーザー番号',
game_id varchar(5) not null comment'ゲームID',
item_name varchar(100) comment'アイテム名',
item_count int(4) comment'アイテム数'
);

#座席情報テーブル作成
create table seating(
stadium_id tinyint not null comment'試合会場ID',
stadium_name varchar(50) comment'会場名',
area_id tinyint comment'座席エリア',
area varchar(1) comment'エリア箇所',
max_seats int(5) comment'エリア席上限数',
remaining_seats int(5) comment'エリア残り席数',
price int(5) not null comment'値段'
);

#コンビニ決済テーブル作成
create table conv_store(
user_id int not null comment'ユーザーID',
user_name varchar(100) not null comment'名前',
user_home varchar(50) not null comment'住所',
user_email varchar(50) not null comment'メールアドレス',
user_telephone varchar(100)  not null comment'電話番号',
user_age int(4) not null comment'年齢'
);

#試合内容テーブル作成
create table game(
game_id varchar(5) primary key not null comment'ゲームID',
team_id tinyint not null comment'出場チーム1ID',
team2_id tinyint not null comment'出場チーム2ID',
stadium_id tinyint not null comment'スタジアムID'
);

#管理テーブル作成
create table administrator(
admin_id varchar(30) primary key not null comment'管理者ID',
admin_name varchar(30) not null comment'管理者名',
admin_password varchar(16) not null comment'パスワード',
login boolean comment'ログイン確認'
);

#チーム名とチームIDを入力
insert into team values
(1, '読売ジャイアンツ/Yomiuri Giants'),
(2, '東京ヤクルトスワローズ/Tokyo Yakuruto Swallows'),
(3, '横浜DeNAベイスターズ/Yokohama DeNA Baystars'),
(4, '中日ドラゴンズ/Chunichi Dragons'),
(5, '阪神タイガース/Hanshin Tigers'),
(6, '広島東洋カープ/Hiroshima Toyo Carp');

#値段を入力
insert into seating values
(1, '横浜スタジアム/Yokohama Stadium', 1, 'A', 5250, 5250, 3700),
(1, '横浜スタジアム/Yokohama Stadium', 1, 'B', 5250, 5250, 2500),
(1, '横浜スタジアム/Yokohama Stadium', 1, 'C', 5250, 5250, 2200),
(1, '横浜スタジアム/Yokohama Stadium', 1, 'D', 5250, 5250, 2000),
(1, '横浜スタジアム/Yokohama Stadium', 2, 'A', 3000, 3000, 4800),
(1, '横浜スタジアム/Yokohama Stadium', 2, 'B', 3000, 3000, 4500),
(1, '横浜スタジアム/Yokohama Stadium', 2, 'C', 3000, 3000, 4100),
(2, 'ナゴヤドーム/Nagoya Dome', 1, 'A', 8000, 8000, 3200),
(2, 'ナゴヤドーム/Nagoya Dome', 1, 'B', 8000, 8000, 2700),
(2, 'ナゴヤドーム/Nagoya Dome', 1, 'C', 8000, 8000, 2500),
(2, 'ナゴヤドーム/Nagoya Dome', 2, 'A', 3000, 3000, 5000),
(2, 'ナゴヤドーム/Nagoya Dome', 2, 'B', 3000, 3000, 4800),
(2, 'ナゴヤドーム/Nagoya Dome', 2, 'C', 3000, 3000, 4600),
(2, 'ナゴヤドーム/Nagoya Dome', 2, 'D', 3000, 3000, 4200),
(3, '阪神甲子園球場/Hanshin Koshien Kyujo', 1, 'A', 5000, 5000, 3000),
(3, '阪神甲子園球場/Hanshin Koshien Kyujo', 1, 'B', 5000, 5000, 1800),
(3, '阪神甲子園球場/Hanshin Koshien Kyujo', 1, 'C', 5000, 5000, 900),
(3, '阪神甲子園球場/Hanshin Koshien Kyujo', 2, 'A', 3600, 3600, 23000),
(3, '阪神甲子園球場/Hanshin Koshien Kyujo', 2, 'B', 3600, 3600, 17500),
(3, '阪神甲子園球場/Hanshin Koshien Kyujo', 2, 'C', 3600, 3600, 12000),
(3, '阪神甲子園球場/Hanshin Koshien Kyujo', 2, 'D', 3600, 3600, 10500),
(3, '阪神甲子園球場/Hanshin Koshien Kyujo', 2, 'E', 3600, 3600, 8700);

#管理者情報入力
insert into administrator values
('abcdef', '山田太郎', '2015', false);

#仮のコンビニ決済情報入力
insert into conv_store values
(1, '山田太郎', '東京都','ssskjkj@gmail.com','03458963561','22');