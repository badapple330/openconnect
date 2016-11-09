drop database if exists lusso;
create database lusso;
use lusso;

create table alcohol_category(
master_id int primary key not null,
category  varchar(50) not null
);

insert into alcohol_category(master_id,category)
values(1,"beer"),
(2,"whisky"),
(3,"sake");


create table menu(
menu_id int  primary key not null,
master_id int not null,
alcohol_name varchar(10) not null ,
alcohol_img_address text not null,
alcohol_content varchar(50) not null,
food_name varchar(10) not null ,
food_img_address text not null,
food_content varchar(50) not null,
foreign key(master_id) references alcohol_category(master_id)
);

insert into menu() values
(1,1,"GUINNESS","guinness.jpg","delicious","karaage","karaage.jpg","delicious");


