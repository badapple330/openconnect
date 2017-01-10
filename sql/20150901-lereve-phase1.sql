set names utf8;
set foreign_key_checks=0;
drop database if exists musical;
create database musical;
use musical;


/***********************************************************
* 将来はOPENCONNECT：USERSテーブルにて踏襲するため削除予定  **
***********************************************************/
create table user(
user_id int not null auto_increment,
email varchar(100) binary not null,
password varchar(32)  binary not null,
user_name varchar(100) not null,
tel_number varchar(11)  not null,
postal_code varchar(8)   not null,
address varchar(255) not null,
unique_id varchar(50),
registered_date timestamp not null default current_timestamp,
renew_date      timestamp not null default current_timestamp on update current_timestamp,
is_unregister   boolean      not null default false,
primary key(user_id),
unique(email)
);

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

alter table orderinfo add constraint orderinfo_ibfk1
foreign key(user_id) references user(user_id)
on update cascade
on delete restrict
;

alter table orderinfo add constraint orderinfo_ibfk2
foreign key(ticket_id) references ticket(ticket_id)
on update cascade
on delete restrict
;

alter table ticket add constraint ticket_ibfk1
foreign key(theater_id) references theater(theater_id)
on update cascade
on delete restrict
;
