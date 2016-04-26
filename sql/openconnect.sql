DROP DATABASE IF EXISTS openconnect;
CREATE DATABASE openconnect;

use openconnect

drop table if exists user;
drop table if exists site;

create table if not exists user(
id int(10) NOT NULL AUTO_INCREMENT,
user_id varchar(30),
user_name varchar(50),
password varchar(50),
PRIMARY KEY (id)
);

create table if not exists site(
id int(10) NOT NULL AUTO_INCREMENT,
name varchar(50),
url varchar(255),
PRIMARY KEY (id)
);

insert into user(user_id, user_name, password) values('testuser','テストユーザー','12345678');

insert into site(name,url)
values('YouJustJewelry','http://www.internousdev.com:8080/YouJustJewelry/'),
('solare','http://www.internousdev.com:8080/solare/'),
('UESTO','http://www.internousdev.com:8080/UESTO/'),
('WorldTravel','http://www.internousdev.com:8080/WorldTravel/'),
('gpscoffee','http://www.internousdev.com:8080/gpscoffee/'),
('la-poupee','http://www.internousdev.com:8080/la-poupee/');
