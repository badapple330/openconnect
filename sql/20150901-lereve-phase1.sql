set names utf8;
set foreign_key_checks=0;
drop database if exists musical;
create database musical;
use musical;


/***********************************************************
* 将来はOPENCONNECT：USERSテーブルにて踏襲するため削除予定  **
***********************************************************/


create table orderinfo(
orderinfo_id    int       not null auto_increment,
user_id         int       not null,
ticket_id       int       not null,
card_token      varchar(100),
sheets          int       not null,
total_amount    float     not null,
registered_date timestamp not null default current_timestamp,
primary key(orderinfo_id)
);

create table theater(
theater_id      int          not null auto_increment,
theater_name    varchar(100) not null,
theater_address varchar(255) not null,
registered_date timestamp    not null default current_timestamp,
primary key(theater_id)
);

create table ticket(
ticket_id       int          not null auto_increment,
theater_id      int          not null,
musical_name    varchar(100) not null,
musical_date    timestamp    not null,
ticket_price    float        not null,
registered_date timestamp    not null default current_timestamp,
renew_date      timestamp    not null default current_timestamp on update current_timestamp,
primary key(ticket_id)
);

create table administrator(
id             int         not null auto_increment,
admin_id       varchar(25) binary not null,
admin_password varchar(25) binary not null,
is_login       boolean     default false,
primary key(id),
unique(admin_id)
);



