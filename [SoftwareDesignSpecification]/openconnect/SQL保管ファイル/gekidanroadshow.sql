drop database if exists gekidanroadshow;
create database gekidanroadshow;
use gekidanroadshow;

create table user(
id int not null auto_increment,
user_id varchar(25) unique,
user_name varchar(255),
password varchar(255),
user_kana varchar(255),
gender enum('male','female'),
birthday date,
email varchar(100),
credit_number varchar(4),
credit_token varchar(255),
oauth_id varchar(50),
oauth_name varchar(50),
registration_date datetime,
updated_date datetime,
postal_code varchar(8),
address varchar(100),
cell_number varchar(15),
primary key(id)
);

create table site(
id int(10) NOT NULL AUTO_INCREMENT,
name varchar(50),
url varchar(255),
PRIMARY KEY (id)
);

create table admin(
id int(11) not null auto_increment,
admin_id varchar(25) unique,
admin_pass varchar(255) not null,
primary key(id)
);

-- tables
create table ticket(
ticket_id int not null primary key auto_increment,
ticket_name varchar(100) not null,
grade enum('S','A') not null,
price int,
bought_limit int,
img varchar(100)
);

create table order_history(
id int not null,
order_id int not null primary key auto_increment,
user_id varchar(25),
ticket_id int not null,
lot int,
order_date datetime,
go_date datetime,
foreign key(user_id) references user(user_id),
foreign key(ticket_id) references ticket(ticket_id)
);

create table temp(
id int not null auto_increment,
user_id varchar(25) unique,
user_name varchar(255),
password varchar(255),
user_kana varchar(255),
gender enum('male','female'),
birthday date,
email varchar(100),
credit_number varchar(4),
credit_fullnumber varchar(16),
credit_token varchar(255),
oauth_id varchar(50),
oauth_name varchar(50),
registration_date datetime,
updated_date datetime,
postal_code varchar(8),
address varchar(100),
cell_number varchar(15),
security_code varchar(4),
credit_name varchar(100),
credit_limit varchar(100),
primary key(id)
);

-- ticket table insert
insert into ticket
(ticket_id,ticket_name,grade,price,bought_limit,img)values
(1,'les miserables','S',8000,150,'./img/LesMiserable01.jpg'),
(2,'les miserables','A',6000,300,'./img/LesMiserable01.jpg'),
(3,'phantom of opera','S',36000,150,'./img/ThePhantomOfTheOpera02.jpg'),
(4,'phantom of opera','A',25000,300,'./img/ThePhantomOfTheOpera02.jpg'),
(5,'cats','S',9000,150,'./img/CATS01.jpg'),
(6,'cats','A',6000,300,'./img/CATS01.jpg'),
(7,'弱虫ペダル','S',11000,150,'./img/yowamushipedaru01.jpg'),
(8,'弱虫ペダル','A',8500,300,'./img/yowamushipedaru01.jpg'),
(9,'lion king','S',9000,150,'./img/LionKing01.jpeg'),
(10,'lion king','A',6500,300,'./img/LionKing01.jpeg');

insert into admin
(admin_id,admin_pass)values
('1','admin01');
