set names utf8;
drop database if exists shiki;
create database shiki;
use shiki;

create table card(
	card_num int not null primary key,
	card varchar(255) not null
) engine=InnoDB;

insert into card(card_num, card) values(0, "visa");
insert into card(card_num, card) values(1, "master");
insert into card(card_num, card) values(2, "american express");

create table season(
  season_num int not null primary key,
  season varchar(255) not null
) engine=InnoDB;

insert into season(season_num, season) values(0, "Spring");
insert into season(season_num, season) values(1, "Summer");
insert into season(season_num, season) values(2, "Autumn");
insert into season(season_num, season) values(3, "Winter");

create table gender(
  gender_num int not null primary key,
  gender varchar(255) not null
) engine=InnoDB;

insert into gender(gender_num, gender) values(0, "not known");
insert into gender(gender_num, gender) values(1, "male");
insert into gender(gender_num, gender) values(2, "female");
insert into gender(gender_num, gender) values(9, "not applicable");

create table satisfaction(
  satisfaction_num int not null primary key,
  satisfaction varchar(255) not null
) engine=InnoDB;

insert into satisfaction(satisfaction_num, satisfaction) values(0, "Very dissatisfied");
insert into satisfaction(satisfaction_num, satisfaction) values(1, "dissatisfied");
insert into satisfaction(satisfaction_num, satisfaction) values(2, "Neutral");
insert into satisfaction(satisfaction_num, satisfaction) values(3, "Satisfied");
insert into satisfaction(satisfaction_num, satisfaction) values(4, "Very satisfied");

create table questionnaire(
  age int not null,
  gender int not null,
  tour_date int not null,
  satisfaction int not null,
  feedback text not null
);

create table payment(
	payment_num int not null primary key,
	payment varchar(255)
);

insert into payment(payment_num, payment) values(0, "Bank account instant transfer");
insert into payment(payment_num, payment) values(1, "Credit card");

create table tour(
  tour_id int not null,
  tour_name varchar(100) not null,
  tour_date date not null,
  tour_godate date not null,
  tour_category int not null,
  tour_amount int not null,
  tour_detail text not null,
  img varchar(255) not null,
  foreign key(tour_category) references season(season_num) on delete cascade
);

create table users(
  user_id int not null,
  mail_address varchar(255) not null,
  password varchar(255) not null,
  login_flg boolean not null,
  user_flg int not null default 3
);

insert into users(user_id, mail_address, password, login_flg, user_flg) values(0, "aa@gmail.com", "password", FALSE, 3);
insert into users(user_id, mail_address, password, login_flg, user_flg) values(1, "bb@gmail.com", "password", FALSE, 3);
insert into users(user_id, mail_address, password, login_flg, user_flg) values(2, "cc@gmail.com", "password", FALSE, 3);

create table credit(
  credit_type int not null,
  credit_number varchar(16) not null,
  name_e varchar(50) not null,
  security_code varchar(4) not null,
  expiration_month varchar(2) not null,
  expiration_year int(4) not null,
  payment_method int not null,
  foreign key(credit_type) references card(card_num) on delete cascade,
  foreign key(payment_method) references payment(payment_num) on delete cascade
);

