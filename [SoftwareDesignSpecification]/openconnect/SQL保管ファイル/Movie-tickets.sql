SET SESSION FOREIGN_KEY_CHECKS=0;
drop database if exists movietickets;
create database movietickets;
use movietickets;
/* Drop Tables */

DROP TABLE IF EXISTS administrator;
DROP TABLE IF EXISTS payment_info;
DROP TABLE IF EXISTS creditcard_history;
DROP TABLE IF EXISTS creditcard_kind;
DROP TABLE IF EXISTS reserve_seat;
DROP TABLE IF EXISTS movie_schedule;
DROP TABLE IF EXISTS movie;
DROP TABLE IF EXISTS screen;
DROP TABLE IF EXISTS seat_pos_info;
DROP TABLE IF EXISTS seat_pattern;
DROP TABLE IF EXISTS user;




/* Create Tables */

CREATE TABLE administrator
(
	administrator_login_id varchar(50) NOT NULL,
	administrator_pass varchar(50) NOT NULL
);


CREATE TABLE creditcard_history
(
	creditcard_history_id int(10) NOT NULL AUTO_INCREMENT,
	creditcard_kind_id int(10) NOT NULL,
	creditcard_number varchar(16) NOT NULL,
	creditcard_securitycode int(4) NOT NULL,
	PRIMARY KEY (creditcard_history_id)
);


CREATE TABLE creditcard_kind
(
	creditcard_kind_id int(10) NOT NULL AUTO_INCREMENT,
	creditcard_kind varchar(50) NOT NULL,
	PRIMARY KEY (creditcard_kind_id)
);


CREATE TABLE movie
(
	movie_id int(10) NOT NULL AUTO_INCREMENT,
	movie_title varchar(100) NOT NULL,
	director varchar(100),
	cast varchar(100),
	startday date,
	endday date,
	ticket_value int(5),
	img_url varchar(100),
	PRIMARY KEY (movie_id)
);


CREATE TABLE movie_schedule
(
	movie_schedule_id int(10) NOT NULL AUTO_INCREMENT,
	schedule_date date NOT NULL,
	schedule_start_time time NOT NULL,
	schedule_end_time time NOT NULL,
	movie_id int(10) NOT NULL,
	screen_id int(2) NOT NULL,
	PRIMARY KEY (movie_schedule_id)
);


CREATE TABLE payment_info
(
	payment_detail_id int(10) NOT NULL AUTO_INCREMENT,
	reserve_seat_id int(10) NOT NULL,
	creditcard_history_id int(10) NOT NULL,
	amountpaid int(10) NOT NULL,
	user_id int(10) NOT NULL,
	PRIMARY KEY (payment_detail_id),
	UNIQUE KEY (reserve_seat_id)
);


CREATE TABLE reserve_seat
(
	reserve_seat_id int(10) NOT NULL AUTO_INCREMENT,
	movie_schedule_id int(10) NOT NULL,
	pos_y int(2) NOT NULL,
	pos_x int(2) NOT NULL,
	user_id int(10) NOT NULL,
	PRIMARY KEY (reserve_seat_id),
	UNIQUE KEY (movie_schedule_id,pos_y,pos_x)
);


CREATE TABLE screen
(
	screen_id int(2) NOT NULL AUTO_INCREMENT,
	screen_name varchar(100) NOT NULL,
	seat_pattern_id int(10) NOT NULL,
	PRIMARY KEY (screen_id)
);


CREATE TABLE seat_pattern
(
	seat_pattern_id int(10) NOT NULL AUTO_INCREMENT,
	seat_pattern_name varchar(50),
	PRIMARY KEY (seat_pattern_id)
);


CREATE TABLE seat_pos_info
(
	seat_pattern_id int(10) NOT NULL,
	pos_name varchar(10) NOT NULL,
	pos_y int(10) NOT NULL,
	pos_x int(10) NOT NULL
);


CREATE TABLE user
(
	user_id int(10) NOT NULL AUTO_INCREMENT,
	user_login_id varchar(50) NOT NULL,
	user_name varchar(100),
	user_mail_address varchar(100),
	user_telnumber varchar(12),
	user_pass varchar(50) NOT NULL,
	PRIMARY KEY (user_id),
	UNIQUE (user_login_id)
);



/* Create Foreign Keys */

ALTER TABLE payment_info
	ADD FOREIGN KEY (creditcard_history_id)
	REFERENCES creditcard_history (creditcard_history_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE creditcard_history
	ADD FOREIGN KEY (creditcard_kind_id)
	REFERENCES creditcard_kind (creditcard_kind_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE movie_schedule
	ADD FOREIGN KEY (movie_id)
	REFERENCES movie (movie_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE reserve_seat
	ADD FOREIGN KEY (movie_schedule_id)
	REFERENCES movie_schedule (movie_schedule_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE payment_info
	ADD FOREIGN KEY (reserve_seat_id)
	REFERENCES reserve_seat (reserve_seat_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE movie_schedule
	ADD FOREIGN KEY (screen_id)
	REFERENCES screen (screen_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE screen
	ADD FOREIGN KEY (seat_pattern_id)
	REFERENCES seat_pattern (seat_pattern_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE seat_pos_info
	ADD FOREIGN KEY (seat_pattern_id)
	REFERENCES seat_pattern (seat_pattern_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE payment_info
	ADD FOREIGN KEY (user_id)
	REFERENCES user (user_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE reserve_seat
	ADD FOREIGN KEY (user_id)
	REFERENCES user (user_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



