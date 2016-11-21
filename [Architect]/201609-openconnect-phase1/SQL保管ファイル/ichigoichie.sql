create database if not exists Ichigoichie;

use Ichigoichie;

set foreign_key_checks=0;

drop table if exists customer_info;
create table customer_info (
customer_id int(10) not null primary key auto_increment,
customer_name varchar(100) not null,
customer_pass varchar(32) not null,
email_address varchar(100) not null,
tel_number varchar(11) not null,
customer_address varchar(100) not null,
address_number varchar(30) not null,
customer_postcode int(7) not null,
customer_age tinyint not null,
unique_id varchar(30)
);

drop table if exists merchandise_info;
create table merchandise_info (
item_id tinyint not null primary key auto_increment,
item_name varchar(50) not null,
price int(10) not null
);

drop table if exists shop_info;
create table shop_info(
shop_id tinyint not null primary key,
shop_name varchar(30) not null,
shop_address varchar(100) not null,
shop_postcode int(7) not null
);

drop table if exists inventory_info;
create table inventory_info(
shop_id tinyint not null,
foreign key(shop_id) references shop_info(shop_id),
item_id tinyint not null,
foreign key(item_id) references merchandise_info(item_id),
item_count tinyint not null,
rental_date date not null
);

drop table if exists order_info;
create table order_info (
customer_id int(10) not null,
foreign key(customer_id) references customer_info(customer_id),
shop_id tinyint not null,
foreign key(shop_id) references shop_info(shop_id),
item_id tinyint not null,
foreign key(item_id) references merchandise_info(item_id),
unit_price int(10) not null,
payment_method tinyint not null,
credit_number bigint(16) not null,
security_code int(4) not null,
expiration_date varchar(6) not null,
rental_date date not null
);

drop table if exists calendar;
create table calendar(
day date not null,
shop_id tinyint,
foreign key(shop_id) references shop_info(shop_id),
item_id tinyint,
foreign key(item_id) references merchandise_info(item_id)
);

drop table if exists purchase_history;
create table purchase_history(
customer_id int(10) not null,
foreign key(customer_id) references customer_info(customer_id),
rental_date date not null,
sales_count int(3) not null,
unit_price int(10) not null,
shop_id tinyint not null,
item_id tinyint not null
);

drop table if exists mail_magazine;
create table mail_magazine(
title varchar(100),
contents text
);

drop table if exists administrator;
create table administrator(
admin_id varchar(25) not null,
admin_pass varchar(25) not null
);

set foreign_key_checks=1;

insert into merchandise_info values
(1, '浴衣', 5000),
(2, '振袖', 19000),
(3, '甚平', 4000),
(4, '単衣', 6000),
(5, '袴', 10000),
(6, '七五三用着物', 16000);

insert into shop_info values
(1, '一期一会御茶ノ水店', '東京都文京区湯島3-2-12　御茶ノ水天神ビル2F', 1130034),
(2, '一期一会浅草店', '東京都台東区浅草1-41-4', 1110032),
(3, '一期一会お台場店', '東京都港区台場1-7-1 アクアシティお台場6F', 1350091),
(4, '一期一会原宿店', '東京都渋谷区 神宮前6-1-9', 1500001);

insert into administrator values
('internousdev02', 'internous01'),
('aiueo', '12345'),
('yokohama' ,'gogo225');

insert into customer_info values (1, 'やまーだ', 'fjfjfjfj', 'yamada@co.jp', 09000000000, '山田のおうち', 1234, 1234567, 24, null);
insert into customer_info values (2, 'かずゆーき', 'fjfjfjfj', 'kazuyuki@co.jp', 09000000000, '和幸のおうち', 1234, 1234567, 24, null);
insert into customer_info values (3, 'あきもーと', 'fjfjfjfj', 'akimoto@co.jp', 09000000000, '秋元のおうち', 1234, 1234567, 24, null);
insert into customer_info values (4, 'こうへいへーい', 'fjfjfjfj', 'kouhei@co.jp', 09000000000, '浩平のおうち', 1234, 1234567, 24, null);

delimiter //
create procedure loop_customer_age()
begin
	declare i int;
	set i=0;
	while i<=1000 do
		set i=i+1;
		insert into customer_info(customer_name,customer_pass,email_address,
		tel_number,customer_address,address_number,customer_postcode,customer_age)
		value("不明","husigihusugi","aaaa@bbb.com","xx-xxx-xxxx","第三新東京市５－３１－９","メガロマンション２０１",9999999,ceil(rand()*28+7));
	end while;
end
//

delimiter ;
call loop_customer_age;
drop procedure loop_customer_age;

insert into inventory_info values (1, 1, 19, '2015-08-15'),
(1, 1, 0, '2015-08-16');


insert into purchase_history values (1, "20150730", 1, 5000, 1, 1);
insert into purchase_history values (1, "20150830", 1, 5000, 1, 1);
insert into purchase_history values (1, "20150830", 1, 5000, 2, 1);
insert into purchase_history values (1, "20150831", 1, 5000, 2, 1);
insert into purchase_history values (1, "20150831", 1, 5000, 2, 2);
insert into purchase_history values (2, "20150730", 1, 5000, 1, 1);
insert into purchase_history values (2, "20150830", 1, 5000, 1, 1);
insert into purchase_history values (2, "20150831", 1, 5000, 1, 1);

insert into mail_magazine values("MAILMAGAZINE 一期一会 ７月２２日号",
"こんにちは！一期一会からお知らせです。\\n▼△▼△▼△▼△▼△▼△▼△▼△▼△▼△▼△\\n７月２５日（土） 第３８回隅田川花火大会 開催されます！！\\n花火大会会場に近い浅草店、是非共ご利用くださいませ。\\n\\n浴衣　１日レンタル料金　5000円\\n甚平　１日レンタル料金　4000円\\n\\n▼△▼△▼△▼△▼△▼△▼△▼△▼△▼△▼△\\n\\n近日開催予定花火大会、まだまだありますのでお手軽レンタル一期一会ご利用お待ちしております。\\n\\n……………………………………………………………\\n(c)一期一会\\n\\n一期一会\\nhttp://internousdev-a.com/Ichigoichie/\\n\\nこちらのメールアドレスは発信専用となっておりますので返信できません。\\nご注意ください。"
);