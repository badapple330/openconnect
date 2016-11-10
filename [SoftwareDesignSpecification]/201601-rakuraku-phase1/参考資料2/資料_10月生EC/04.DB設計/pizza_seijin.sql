DROP DATABASE IF EXISTS pizza_seijin;
CREATE DATABASE pizza_seijin;

use pizza_seijin

CREATE TABLE IF NOT EXISTS user(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
email varchar(100) NOT NULL,
password varchar(255),
name varchar(50) NOT NULL,
name_kana varchar(50) NOT NULL,
tel varchar(11) NOT NULL,
postal_code varchar(7) NOT NULL,
address varchar(255) NOT NULL,
oauth_id varchar(50),
oauth_name varchar(15),
credit_token varchar(255),
credit_num varchar(4),
created_at datetime NOT NULL,
updated_at datetime NOT NULL,
UNIQUE(email)
);

CREATE TABLE IF NOT EXISTS item_category(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
name varchar(15) UNIQUE NOT NULL,
created_at datetime NOT NULL,
updated_at datetime NOT NULL
);

CREATE TABLE IF NOT EXISTS m_item(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
name varchar(100) NOT NULL,
price int NOT NULL,
detail varchar(255) NOT NULL,
img_path varchar(100) NOT NULL,
category_id_1 int NOT NULL,
category_id_2 int,
available_flag boolean NOT NULL DEFAULT 0,
created_at datetime NOT NULL,
updated_at datetime NOT NULL,
FOREIGN KEY (category_id_1) REFERENCES item_category (id),
FOREIGN KEY (category_id_2) REFERENCES item_category (id)
);

CREATE TABLE IF NOT EXISTS m_coupon(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
name varchar(20) NOT NULL,
discount float NOT NULL,
period int NOT NULL,
start_date date NOT NULL,
end_date date NOT NULL,
giving_min_price int NOT NULL,
created_at datetime NOT NULL,
updated_at datetime NOT NULL
);

CREATE TABLE IF NOT EXISTS m_store(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
name varchar(100) NOT NULL,
postal_code varchar(8) NOT NULL,
address varchar(255) NOT NULL,
tel varchar(13) NOT NULL,
business_hours varchar(50) NOT NULL,
created_at datetime NOT NULL,
updated_at datetime NOT NULL
);

CREATE TABLE IF NOT EXISTS order_history(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
user_id int NOT NULL,
item_id int NOT NULL,
coupon_id int,
number int NOT NULL,
created_at datetime NOT NULL,
FOREIGN KEY (user_id) REFERENCES user (id),
FOREIGN KEY (item_id) REFERENCES m_item (id),
FOREIGN KEY (coupon_id) REFERENCES m_coupon (id)
);

CREATE TABLE IF NOT EXISTS user_coupon(
user_id int,
coupon_id int,
time_limit date,
created_at datetime NOT NULL,
FOREIGN KEY (user_id) REFERENCES user (id),
FOREIGN KEY (coupon_id) REFERENCES m_coupon (id)
);

CREATE TABLE IF NOT EXISTS m_material(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
item_id int NOT NULL,
wheat boolean NOT NULL DEFAULT 0,
egg boolean NOT NULL DEFAULT 0,
milk boolean NOT NULL DEFAULT 0,
soy boolean NOT NULL DEFAULT 0,
beef boolean NOT NULL DEFAULT 0,
pork boolean NOT NULL DEFAULT 0,
chicken boolean NOT NULL DEFAULT 0,
squid boolean NOT NULL DEFAULT 0,
shrimp boolean NOT NULL DEFAULT 0,
crab boolean NOT NULL DEFAULT 0,
salmon_roe boolean NOT NULL DEFAULT 0,
apple boolean NOT NULL DEFAULT 0,
gelatin boolean NOT NULL DEFAULT 0,
created_at datetime NOT NULL,
updated_at datetime NOT NULL,
FOREIGN KEY (item_id) REFERENCES m_item (id)
);

CREATE TABLE IF NOT EXISTS cart(
user_id int NOT NULL,
item_id int NOT NULL,
number int NOT NULL,
created_at datetime NOT NULL,
updated_at datetime NOT NULL,
FOREIGN KEY (user_id) REFERENCES user (id),
FOREIGN KEY (item_id) REFERENCES m_item (id)
);

CREATE TABLE IF NOT EXISTS admin(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
password varchar(255) NOT NULL,
name varchar(32) UNIQUE NOT NULL,
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
  created_at,
  updated_at
) VALUES (
  "test@test.com",
  "12345678",
  "てすと",
  "テスト",
  "00011112222",
  "1000001",
  "東京都",
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO item_category(
  name,
  created_at,
  updated_at
) VALUES (
  "魚",
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO item_category(
  name,
  created_at,
  updated_at
) VALUES (
  "肉",
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO item_category(
  name,
  created_at,
  updated_at
) VALUES (
  "野菜",
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO m_item(
  name,
  price,
  detail,
  img_path,
  category_id_1,
  created_at,
  updated_at
) VALUES (
  "おいしいやつ",
  2000,
  "うますぎる。うまい。。。",
  "oishii.jpg",
  1,
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO m_item(
  name,
  price,
  detail,
  img_path,
  category_id_1,
  created_at,
  updated_at
) VALUES (
  "ピザ？？？",
  1000,
  "なんだかうまい",
  "oishii.jpg",
  3,
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO m_item(
  name,
  price,
  detail,
  img_path,
  category_id_1,
  category_id_2,
  created_at,
  updated_at
) VALUES (
  "サラダ",
  500,
  "こんな野菜見たことない",
  "oishii.jpg",
  3,
  1,
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO m_coupon(
  name,
  discount,
  period,
  start_date,
  end_date,
  giving_min_price,
  created_at,
  updated_at
) VALUES (
  "10%OFFクーポン",
  0.9,
  50,
  "2015/12/07 19:35:50",
  "2015/12/30 19:35:50",
  1000,
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO m_coupon(
  name,
  discount,
  period,
  start_date,
  end_date,
  giving_min_price,
  created_at,
  updated_at
) VALUES (
  "20%OFFクーポン",
  0.8,
  50,
  "2015/12/07 19:35:50",
  "2015/12/30 19:35:50",
  2000,
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO m_coupon(
  name,
  discount,
  period,
  start_date,
  end_date,
  giving_min_price,
  created_at,
  updated_at
) VALUES (
  "30%OFFクーポン",
  0.7,
  50,
  "2015/12/07 19:35:50",
  "2015/12/30 19:35:50",
  3000,
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO order_history(
  user_id,
  item_id,
  coupon_id,
  number,
  created_at
) VALUES (
  1,
  1,
  1,
  3,
  "2015/12/07 19:35:50"
);

INSERT INTO user_coupon(
  user_id,
  coupon_id,
  time_limit,
  created_at
) VALUES (
  1,
  1,
  "2015/12/07",
  "2015/12/07 19:35:50"
);

INSERT INTO m_store(
  name,
  postal_code,
  address,
  tel,
  business_hours,
  created_at,
  updated_at
) VALUES (
  "お茶の水店",
  "123-4567",
  "東京都お茶の水",
  "12-3456-7891",
  "10:00～22:00",
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO m_store(
  name,
  postal_code,
  address,
  tel,
  business_hours,
  created_at,
  updated_at
) VALUES (
  "新宿店",
  "765-4321",
  "東京都新宿",
  "12-3456-7891",
  "11:00～23:00",
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO m_material(
  item_id,
  created_at,
  updated_at
) VALUES (
  1,
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO m_material(
  item_id,
  wheat,
  created_at,
  updated_at
) VALUES (
  2,
  1,
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);

INSERT INTO admin(
  password,
  name,
  created_at,
  updated_at
) VALUES (
  "12345678",
  "admin5678",
  "2015/12/07 19:35:50",
  "2015/12/07 19:35:50"
);
