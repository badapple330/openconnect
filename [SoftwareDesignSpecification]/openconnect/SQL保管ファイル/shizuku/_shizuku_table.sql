SET SESSION FOREIGN_KEY_CHECKS=0;

DROP DATABASE IF EXISTS shizuku;
CREATE DATABASE shizuku;
use shizuku;

/* Drop Tables */

DROP TABLE IF EXISTS administrator;
DROP TABLE IF EXISTS cart;
DROP TABLE IF EXISTS orders_item_relation;
DROP TABLE IF EXISTS item;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS ebookdata;
DROP TABLE IF EXISTS image;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS payment;
DROP TABLE IF EXISTS status;




/* Create Tables */

CREATE TABLE administrator
(
  administrator_id int NOT NULL AUTO_INCREMENT,
  id varchar(32) BINARY NOT NULL,
  password varchar(32) BINARY NOT NULL,
  is_login boolean DEFAULT false NOT NULL,
  PRIMARY KEY (administrator_id),
  UNIQUE (id)
);


CREATE TABLE cart
(
  user_id int NOT NULL,
  item_id int NOT NULL,
  is_ebook boolean NOT NULL,
  qty int unsigned NOT NULL,
  registered_date datetime DEFAULT current_timestamp NOT NULL,
  renew_date datetime DEFAULT current_timestamp on update current_timestamp NOT NULL,
  PRIMARY KEY (user_id, item_id, is_ebook)
);


CREATE TABLE category
(
  category_id int NOT NULL AUTO_INCREMENT,
  category_name varchar(100) NOT NULL,
  PRIMARY KEY (category_id)
);


CREATE TABLE ebookdata
(
  ebookdata_id int NOT NULL AUTO_INCREMENT,
  data mediumblob NOT NULL,
  PRIMARY KEY (ebookdata_id)
);


CREATE TABLE image
(
  image_id int NOT NULL AUTO_INCREMENT,
  data mediumblob NOT NULL,
  PRIMARY KEY (image_id)
);


CREATE TABLE item
(
  item_id int NOT NULL AUTO_INCREMENT,
  category_id int NOT NULL,
  item_name varchar(100) NOT NULL,
  author varchar(100) NOT NULL,
  description text NOT NULL,
  sample text NOT NULL,
  price float NOT NULL,
  stock int unsigned NOT NULL,
  image_id int NOT NULL,
  ebookdata_id int,
  registered_date datetime DEFAULT current_timestamp NOT NULL,
  renew_date datetime DEFAULT current_timestamp on update current_timestamp NOT NULL,
  has_ebook boolean DEFAULT true NOT NULL,
  is_delete boolean DEFAULT false NOT NULL,
  PRIMARY KEY (item_id)
);


CREATE TABLE orders
(
  orders_id int NOT NULL AUTO_INCREMENT,
  user_id int NOT NULL,
  amount float NOT NULL,
  payment_id int NOT NULL,
  payment_number varchar(13),
  card_token varchar(100),
  status_id int NOT NULL,
  registered_date datetime DEFAULT current_timestamp NOT NULL,
  renew_date datetime DEFAULT current_timestamp on update current_timestamp NOT NULL,
  PRIMARY KEY (orders_id)
);


CREATE TABLE orders_item_relation
(
  orders_id int NOT NULL,
  item_id int NOT NULL,
  is_ebook boolean NOT NULL,
  qty int unsigned NOT NULL,
  PRIMARY KEY (orders_id, item_id, is_ebook)
);


CREATE TABLE payment
(
  payment_id int NOT NULL AUTO_INCREMENT,
  code varchar(16) NOT NULL,
  PRIMARY KEY (payment_id)
);


CREATE TABLE status
(
  status_id int NOT NULL AUTO_INCREMENT,
  code varchar(16) NOT NULL,
  PRIMARY KEY (status_id)
);


CREATE TABLE user
(
  user_id int NOT NULL AUTO_INCREMENT,
  email varchar(100) NOT NULL,
  password varchar(32) BINARY NOT NULL,
  name varchar(100) NOT NULL,
  telephone varchar(11) NOT NULL,
  zipcode varchar(7) NOT NULL,
  address varchar(255) NOT NULL,
  unique_id varchar(255) BINARY DEFAULT NULL,
  payment_id int NOT NULL,
  card_number varchar(16) NOT NULL,
  card_name varchar(100) NOT NULL,
  card_expirydate varchar(5) NOT NULL,
  card_code varchar(4) NOT NULL,
  registered_date datetime DEFAULT current_timestamp NOT NULL,
  renew_date datetime DEFAULT current_timestamp on update current_timestamp NOT NULL,
  is_unregister boolean DEFAULT false NOT NULL,
  PRIMARY KEY (user_id),
  UNIQUE (unique_id)
);



/* Create Foreign Keys */

ALTER TABLE item
  ADD FOREIGN KEY (category_id)
  REFERENCES category (category_id)
  ON UPDATE RESTRICT
  ON DELETE RESTRICT
;


ALTER TABLE item
  ADD FOREIGN KEY (ebookdata_id)
  REFERENCES ebookdata (ebookdata_id)
  ON UPDATE RESTRICT
  ON DELETE RESTRICT
;


ALTER TABLE item
  ADD FOREIGN KEY (image_id)
  REFERENCES image (image_id)
  ON UPDATE RESTRICT
  ON DELETE RESTRICT
;


ALTER TABLE cart
  ADD FOREIGN KEY (item_id)
  REFERENCES item (item_id)
  ON UPDATE RESTRICT
  ON DELETE RESTRICT
;


ALTER TABLE orders_item_relation
  ADD FOREIGN KEY (item_id)
  REFERENCES item (item_id)
  ON UPDATE RESTRICT
  ON DELETE RESTRICT
;


ALTER TABLE orders_item_relation
  ADD FOREIGN KEY (orders_id)
  REFERENCES orders (orders_id)
  ON UPDATE RESTRICT
  ON DELETE RESTRICT
;


ALTER TABLE orders
  ADD FOREIGN KEY (payment_id)
  REFERENCES payment (payment_id)
  ON UPDATE RESTRICT
  ON DELETE RESTRICT
;


ALTER TABLE user
  ADD FOREIGN KEY (payment_id)
  REFERENCES payment (payment_id)
  ON UPDATE RESTRICT
  ON DELETE RESTRICT
;


ALTER TABLE orders
  ADD FOREIGN KEY (status_id)
  REFERENCES status (status_id)
  ON UPDATE RESTRICT
  ON DELETE RESTRICT
;


ALTER TABLE cart
  ADD FOREIGN KEY (user_id)
  REFERENCES user (user_id)
  ON UPDATE RESTRICT
  ON DELETE RESTRICT
;


ALTER TABLE orders
  ADD FOREIGN KEY (user_id)
  REFERENCES user (user_id)
  ON UPDATE RESTRICT
  ON DELETE RESTRICT
;



