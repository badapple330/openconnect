set names utf8;
drop database if exists solare;
create database solare;
use solare;

/***********************************************************
* 将来はOPENCONNECT：USERSテーブルにて踏襲するため削除予定  **
***********************************************************/
create table customer_info(
account_number int(10) primary key auto_increment comment "",
customer_id varchar(30) unique comment "",
acc_password varchar(30) comment "",
user_uuid varchar(100) comment "",
last_name varchar(255) comment "",
first_name varchar(255) comment "",
customer_mailaddress varchar(255) comment "",
customer_gender int(1) comment "",
phone_number varchar(30) comment "",
register_date timestamp DEFAULT 0 comment "",
update_date timestamp DEFAULT current_timestamp on update current_timestamp comment ""
);

create table customerid_info(
customerid_number int(10) primary key auto_increment comment "",
customer_id varchar(30) comment "",
user_uuid varchar(100) comment "",
insert_date timestamp comment "",
delete_date timestamp comment ""
);

create table reservation_info(
reservation_number int(10) primary key auto_increment comment "",
customer_reservation_number int(1) comment "",
account_number int(10) comment "",
course_number int(20) comment "",
number_of_ppl int(10) comment "",
full_name varchar(50) comment "",
phone_number varchar(30) comment "",
reservation_date timestamp default 0 comment "",
reservation_dayofweek int(5) comment "",
reservation_time int(5) comment "",
register_date timestamp default 0 comment "",
update_date timestamp default current_timestamp on update current_timestamp comment "",
delete_date timestamp comment ""
);

create table seat_info(
date date comment "",
dayofweek int(1) comment "",
max_number_of_ppl int(5) comment "",
remaining_seats int(5) comment ""
);