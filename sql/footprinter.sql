DROP DATABASE IF EXISTS footprinter;
CREATE DATABASE footprinter;

use footprinter

DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS order_info;
DROP TABLE IF EXISTS admin;
DROP TABLE IF EXISTS category;

CREATE TABLE IF NOT EXISTS user(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
email varchar(100),
password varchar(255),
name varchar(100),
name_kana varchar(100),
tel varchar(11),
postal_code varchar(8),
address varchar(255),
credit_token varchar(255),
credit_num varchar(4),
unique_id varchar(255),
oauth_name varchar(50),
delete_flag int NOT NULL DEFAULT 0,
created_at datetime NOT NULL,
updated_at datetime NOT NULL,
UNIQUE(email,password),
INDEX (credit_token)
);

CREATE TABLE if not exists category(
category_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
category_name varchar(10) UNIQUE not null,
created_at datetime NOT NULL,
updated_at datetime NOT NULL
);

CREATE TABLE if not exists event(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
name varchar(100) NOT NULL,
event_date date NOT NULL,
price float NOT NULL,
num_of_tickets int NOT NULL,
remaining int NOT NULL,
detail text NOT NULL,
img_path varchar(100) NOT NULL,
category_id int NOT NULL,
delete_flag int NOT NULL DEFAULT 0,
created_at datetime NOT NULL,
updated_at datetime NOT NULL,
FOREIGN KEY (category_id) REFERENCES category(category_id)
);

CREATE TABLE if not exists order_info(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
user_id int NOT NULL,
event_id int NOT NULL,
purchase_date datetime NOT NULL,
num_of_tickets int NOT NULL,
amount float NOT NULL,
created_at datetime NOT NULL,
updated_at datetime NOT NULL,
FOREIGN KEY (user_id) REFERENCES user (id),
FOREIGN KEY (event_id) REFERENCES event (id)
);

CREATE TABLE if not exists admin(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
admin_id varchar(25) UNIQUE NOT NULL,
password varchar(255) NOT NULL,
created_at datetime NOT NULL,
updated_at datetime NOT NULL
);

INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    postal_code,
    address,
    credit_token,
    credit_num,
    created_at,
    updated_at
) VALUES (
     "test@test.com",
     "test1234",
     "テストユーザー1号",
     "いちごう",
     "00011112222",
     "1234567",
     "東京都てすと区テスト123",
     "12345678",
     "1234",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    postal_code,
    credit_token,
    credit_num,
    created_at,
    updated_at
) VALUES (
     "test2@test.com",
     "test1234",
     "テストユーザー2号",
     "にごう",
     "00011112222",
     "1234567",
     "12345678",
     "1234",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test3@test.com",
     "test1234",
     "テストユーザー3号",
     "てすとゆーざーさんごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test4@test.com",
     "test1234",
     "テストユーザー4号",
     "てすとゆーざーよんごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test5@test.com",
     "test1234",
     "テストユーザー5号",
     "てすとゆーざーごごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test6@test.com",
     "test1234",
     "テストユーザー6号",
     "てすとゆーざーろくごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test7@test.com",
     "test1234",
     "テストユーザー7号",
     "てすとゆーざーななごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test8@test.com",
     "test1234",
     "テストユーザー8号",
     "はちごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test9@test.com",
     "test1234",
     "テストユーザー9号",
     "きゅうごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test10@test.com",
     "test1234",
     "テストユーザー10号",
     "じゅうごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test11@test.com",
     "test1234",
     "テストユーザー11号",
     "じゅういちごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test12@test.com",
     "test1234",
     "テストユーザー12号",
     "じゅうにごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test13@test.com",
     "test1234",
     "テストユーザー13号",
     "じゅうさんごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test14@test.com",
     "test1234",
     "テストユーザー14号",
     "じゅうよんごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test15@test.com",
     "test1234",
     "テストユーザー15号",
     "じゅうごごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test16@test.com",
     "test1234",
     "テストユーザー16号",
     "じゅうろくごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test17@test.com",
     "test1234",
     "テストユーザー17号",
     "じゅうななごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test18@test.com",
     "test1234",
     "テストユーザー18号",
     "じゅうはちごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test19@test.com",
     "test1234",
     "テストユーザー19号",
     "じゅうきゅうごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO user(
    email,
    password,
    name,
    name_kana,
    tel,
    created_at,
    updated_at
) VALUES (
     "test20@test.com",
     "test1234",
     "テストユーザー20号",
     "にじゅうごう",
     "00011112222",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO category(
    category_name,
    created_at,
    updated_at
) VALUES (
     "アフリカ",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO category(
    category_name,
    created_at,
    updated_at
) VALUES (
     "アジア",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO category(
    category_name,
    created_at,
    updated_at
) VALUES (
     "オーストラリア",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO category(
    category_name,
    created_at,
    updated_at
) VALUES (
     "ヨーロッパ",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO category(
    category_name,
    created_at,
    updated_at
) VALUES (
     "北アメリカ",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO category(
    category_name,
    created_at,
    updated_at
) VALUES (
     "南アメリカ",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);



INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "イベント名",
     "2015/12/20",
     20000,
     30,
     30,
     "イベント詳細",
     "tabigazou1.jpg",
     1,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "コンゴ",
     "2015/7/20",
     30000,
     30,
     30,
     "イベント詳細",
     "tabigazou1.jpg",
     1,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "エジプト",
     "2015/4/10",
     50000,
     10,
     30,
     "ピラミッドみよう！",
     "tabigazou2.jpg",
     1,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "チャド",
     "2015/6/13",
     40000,
     15,
     30,
     "チャド行こう！",
     "tabigazou3.jpg",
     1,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "カメルーン",
     "2015/5/25",
     30000,
     30,
     30,
     "カメルーン行こう",
     "tabigazou4.jpg",
     1,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "ガーナ",
     "2015/2/24",
     30000,
     30,
     30,
     "カカオを探しに",
     "tabigazou5.jpg",
     1,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "ケニア",
     "2016/1/20",
     50000,
     30,
     30,
     "三大公園行こう！",
     "tabigazou6.jpg",
     1,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "マダガスカル",
     "2016/2/20",
     40000,
     30,
     30,
     "バオバブの木を見に行こう！",
     "tabigazou7.jpg",
     1,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "エチオピア",
     "2015/12/20",
     60000,
     30,
     30,
     "エチオピア行こう",
     "tabigazou8.jpg",
     1,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "チュニジア",
     "2015/3/20",
     40000,
     20,
     20,
     "チュニジア行こう",
     "tabigazou9.jpg",
     1,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "南アフリカ共和国",
     "2015/12/20",
     40000,
     15,
     15,
     "ナイトサファリ！",
     "tabigazou10.jpg",
     1,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);



INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "日本",
     "2015/9/13",
     20000,
     30,
     30,
     "名所めぐり！",
     "tabigazou1.jpg",
     2,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "中国",
     "2015/7/9",
     15000,
     15,
     30,
     "中華食べまくり！",
     "tabigazou2.jpg",
     2,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "韓国",
     "2015/6/13",
     13000,
     5,
     30,
     "韓国スターに会う！",
     "tabigazou3.jpg",
     2,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "ブータン",
     "2015/2/24",
     25000,
     3,
     30,
     "パロ・ツェチュ祭に参加！",
     "tabigazou4.jpg",
     2,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "タイ",
     "2015/2/24",
     68000,
     1,
     30,
     "屋台を楽しむ！",
     "tabigazou5.jpg",
     2,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "ベトナム",
     "2015/2/24",
     120000,
     28,
     30,
     "アオザイ着よう！",
     "tabigazou6.jpg",
     2,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "ネパール",
     "2015/9/13",
     100000,
     15,
     20,
     "エベレスト登山！",
     "tabigazou7.jpg",
     2,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "ネパール",
     "2015/9/13",
     100000,
     15,
     20,
     "エベレスト登山！",
     "tabigazou8.jpg",
     2,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "シンガポール",
     "2015/9/13",
     100000,
     15,
     20,
     "あの有名ホテルに泊まろう！",
     "tabigazou9.jpg",
     2,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "スリランカ",
     "2015/9/13",
     50000,
     10,
     20,
     "アーユルヴェーダしよう！",
     "tabigazou10.jpg",
     2,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);



INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "オーストラリア",
     "2016/3/13",
     60000,
     20,
     20,
     "いろいろめぐろう！",
     "tabigazou1.jpg",
     3,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
  "タスマニア島",
  "2016/1/13",
  40000,
  20,
  20,
  "タスマニア島行こう",
  "tabigazou2.jpg",
  3,
  "2015/11/11 00:00:00",
  "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
  "タスマニア島２",
  "2016/2/13",
  40000,
  20,
  20,
  "タスマニア島行こう",
  "tabigazou3.jpg",
  3,
  "2015/11/11 00:00:00",
  "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "タスマニア島３",
     "2016/3/13",
     40000,
     20,
     20,
     "タスマニア島行こう",
     "tabigazou4.jpg",
     3,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
  "ニュージーランド",
  "2016/1/13",
  50000,
  20,
  20,
  "ニュージーランド行こう！",
  "tabigazou5.jpg",
  3,
  "2015/11/11 00:00:00",
  "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
  "ニュージーランド２",
  "2016/2/13",
  50000,
  20,
  20,
  "ニュージーランド行こう！",
  "tabigazou6.jpg",
  3,
  "2015/11/11 00:00:00",
  "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "ニュージーランド３",
     "2016/3/13",
     50000,
     20,
     20,
     "ニュージーランド行こう！",
     "tabigazou7.jpg",
     3,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
  "パプアニューギニア",
  "2016/1/13",
  40000,
  20,
  20,
  "パプアニューギニア行こう",
  "tabigazou8.jpg",
  3,
  "2015/11/11 00:00:00",
  "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
  "パプアニューギニア２",
  "2016/2/13",
  40000,
  20,
  20,
  "パプアニューギニア行こう",
  "tabigazou9.jpg",
  3,
  "2015/11/11 00:00:00",
  "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "パプアニューギニア３",
     "2016/3/13",
     40000,
     20,
     20,
     "パプアニューギニア行こう",
     "tabigazou10.jpg",
     3,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);



INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "イギリス",
     "2015/12/20",
     70000,
     30,
     30,
     "アフタヌーンティー！",
     "tabigazou1.jpg",
     4,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "イギリス２",
     "2016/1/20",
     60000,
     30,
     30,
     "バッキンガム宮殿！",
     "tabigazou2.jpg",
     4,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "イギリス３",
     "2015/2/20",
     70000,
     30,
     30,
     "ロンドン観光！",
     "tabigazou3.jpg",
     4,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "ドイツ",
     "2015/10/20",
     50000,
     30,
     30,
     "ビールとウインナー！",
     "tabigazou4.jpg",
     4,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "ドイツ２",
     "2016/10/20",
     50000,
     30,
     30,
     "オクトーバーフェス！",
     "tabigazou5.jpg",
     4,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "フランス",
     "2016/12/20",
     60000,
     30,
     30,
     "パリ街歩き",
     "tabigazou6.jpg",
     4,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "フランス",
     "2016/1/20",
     50000,
     30,
     30,
     "ベルサイユ宮殿！",
     "tabigazou7.jpg",
     4,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
    "フランス２",
    "2016/2/20",
    50000,
    30,
    30,
    "ベルサイユ宮殿！",
    "tabigazou8.jpg",
     4,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "スペイン",
     "2015/8/20",
     50000,
     30,
     30,
     "トマト祭り！",
     "tabigazou9.jpg",
     4,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "スペイン２",
     "2016/8/20",
     50000,
     30,
     30,
     "トマト祭り！",
     "tabigazou10.jpg",
     4,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);




INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "アメリカ",
     "2015/12/20",
     100000,
     30,
     30,
     "ディズニーワールド行こう！",
     "tabigazou1.jpg",
     5,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "アメリカ２",
     "2016/1/20",
     100000,
     30,
     30,
     "ディズニーワールド行こう！",
     "tabigazou2.jpg",
     5,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "アメリカ",
     "2016/1/20",
     50000,
     30,
     30,
     "ニューヨーク行こう！",
     "tabigazou3.jpg",
     5,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "アメリカ",
     "2016/2/20",
     40000,
     30,
     30,
     "ロサンゼルス行こう！",
     "tabigazou4.jpg",
     5,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "カナダ",
     "2015/12/20",
     40000,
     30,
     30,
     "ナイアガラの滝見よう！",
     "tabigazou5.jpg",
     5,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "カナダ２",
     "2016/1/20",
     40000,
     30,
     30,
     "ナイアガラの滝見よう！",
     "tabigazou6.jpg",
     5,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "キューバ",
     "2015/12/20",
     30000,
     30,
     30,
     "社会主義国見よう！",
     "tabigazou7.jpg",
     5,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "キューバ",
     "2016/1/20",
     30000,
     30,
     30,
     "社会主義国見よう！",
     "tabigazou8.jpg",
     5,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "メキシコ",
     "2015/12/20",
     40000,
     20,
     30,
     "テキーラツアー行こう！",
     "tabigazou9.jpg",
     5,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "メキシコ２",
     "2016/1/20",
     40000,
     30,
     30,
     "テキーラツアー行こう！",
     "tabigazou10.jpg",
     5,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);



INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "ボリビア",
     "2016/1/20",
     50000,
     30,
     30,
     "ウユニ塩湖見よう！",
     "tabigazou1.jpg",
     6,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "ボリビア２",
     "2016/5/20",
     40000,
     30,
     30,
     "ウユニ塩湖見よう！",
     "tabigazou2.jpg",
     6,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "ボリビア３",
     "2016/10/20",
     40000,
     30,
     30,
     "ウユニ塩湖見よう！",
     "tabigazou3.jpg",
     6,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "チリ",
     "2016/1/20",
     50000,
     30,
     30,
     "イースター島でモアイ像見よう",
     "tabigazou4.jpg",
     6,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "チリ２",
     "2016/2/20",
     50000,
     30,
     30,
     "イースター島でモアイ像見よう！",
     "tabigazou5.jpg",
     6,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "チリ３",
     "2016/3/20",
     50000,
     30,
     30,
     "イースター島でモアイ像見よう！",
     "tabigazou6.jpg",
     6,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "コロンビア",
     "2015/12/20",
     40000,
     30,
     30,
     "闘牛見よう！",
     "tabigazou7.jpg",
     6,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "コロンビア",
     "2016/1/20",
     40000,
     30,
     30,
     "闘牛見よう！",
     "tabigazou8.jpg",
     6,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "アルゼンチン",
     "2016/1/20",
     50000,
     30,
     30,
     "タンゴ見よう！",
     "tabigazou9.jpg",
     6,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO event(
    name,
    event_date,
    price,
    num_of_tickets,
    remaining,
    detail,
    img_path,
    category_id,
    created_at,
    updated_at
) VALUES (
     "アルゼンチン２",
     "2016/3/20",
     50000,
     30,
     30,
     "タンゴ見よう！",
     "tabigazou10.jpg",
     6,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);







INSERT INTO order_info(
    user_id,
    event_id,
    purchase_date,
    num_of_tickets,
    amount,
    created_at,
    updated_at
) VALUES (
     1,
     1,
     "2015/12/20",
     1,
     20000,
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);

INSERT INTO admin(
    admin_id,
    password,
    created_at,
    updated_at
) VALUES (
     "admin",
     "admin1234",
     "2015/11/11 00:00:00",
     "2015/11/11 00:00:00"
);
