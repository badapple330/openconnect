set names utf8;
drop database if exists shiki;
create database shiki;
use shiki;

create table card(
	card_num int not null primary key,
	card_name varchar(255) not null
) engine=InnoDB;

insert into card(card_num, card_name) values(0, "visa");
insert into card(card_num, card_name) values(1, "master");
insert into card(card_num, card_name) values(2, "american express");

create table season(
  season_num int not null primary key,
  season_name varchar(255) not null
) engine=InnoDB;

insert into season(season_num, season_name) values(0, "Spring");
insert into season(season_num, season_name) values(1, "Summer");
insert into season(season_num, season_name) values(2, "Autumn");
insert into season(season_num, season_name) values(3, "Winter");

create table gender(
  gender_num int not null primary key,
  gender_name varchar(255) not null
) engine=InnoDB;

insert into gender(gender_num, gender_name) values(0, "not known");
insert into gender(gender_num, gender_name) values(1, "male");
insert into gender(gender_num, gender_name) values(2, "female");
insert into gender(gender_num, gender_name) values(9, "not applicable");

create table satisfaction(
  satisfaction_id int not null primary key,
  satisfaction_name varchar(255) not null
) engine=InnoDB;

insert into satisfaction(satisfaction_id, satisfaction_name) values(0, "Very dissatisfied");
insert into satisfaction(satisfaction_id, satisfaction_name) values(1, "dissatisfied");
insert into satisfaction(satisfaction_id, satisfaction_name) values(2, "Neutral");
insert into satisfaction(satisfaction_id, satisfaction_name) values(3, "Satisfied");
insert into satisfaction(satisfaction_id, satisfaction_name) values(4, "Very satisfied");

create table questionnaire(
  age int not null,
  gender int not null,
  tour_date int not null,
  satisfaction int not null,
  feedback text not null
);

create table payment(
	payment_num int not null primary key,
	payment_name varchar(255)
);

insert into payment(payment_num, payment_name) values(0, "Bank Transfer");
insert into payment(payment_num, payment_name) values(1, "Credit Card");

create table tour(
  user_id int not null,
  tour_id int not null,
  mail_address varchar(255) not null,
  tour_name varchar(100) not null,
  tour_date date not null,
  tour_godate date not null,
  tour_returndate date not null,
  tour_category int not null,
  tour_amount int not null,
  tour_detail text not null,
 img_address001 text not null comment '画像001',
img_address002 text not null comment '画像002',
img_address003 text not null comment '画像003',
img_address004 text not null comment '画像004',
img_address005 text not null comment '画像005',
  foreign key(user_id) references openconnect.users(user_id) on delete cascade,
  foreign key(tour_category) references season(season_num) on delete cascade
);

create table credit(
  credit_type int not null,
  credit_number varchar(16) not null,
  name_e varchar(50) not null,
  security_code varchar(4) not null,
  expiration_month varchar(2) not null,
  expiration_year int(4) not null,
  payment_method int not null,
  spend int not null,
  foreign key(credit_type) references card(card_num) on delete cascade,
  foreign key(payment_method) references payment(payment_num) on delete cascade
);

