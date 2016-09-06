

-- chikezon データベースを作成
drop database if exists chikezon;
create database if not Exists chikezon;
use chikezon;


-- goodsテーブル作成
create table goods(
goods_id int(100) primary key auto_increment,
goods_name varchar(255) not null,
price int,
index(goods_id)
);




-- customer_infoテーブル作成
create table customer_info(
customer_id int(100) primary key auto_increment,
customer_name varchar(255) not null,
postcode varchar(255) not null,
address varchar(255) not null,
telnumber varchar(12) not null,
mailad varchar(255) unique not null,
customer_pass varchar(255) not null,
index(customer_id)
);


-- order_infoテーブル作成
create table order_info(
customer_id int(100),
goods_id int(100),
order_count int(100) default 0,
total_amount int,
purchaseday timestamp default current_timestamp,
foreign key(customer_id) references customer_info(customer_id),
foreign key(goods_id) references goods(goods_id)
);



-- cartテーブル作成

CREATE TABLE cart(
session_ID VARCHAR(255) NOT NULL,
goods_name VARCHAR(255) NOT NULL,
sales_number INT(100) NOT NULL,
price INT NULL,
total_amount INT NOT NULL
);


-- goods テーブルサンプル挿入 --
insert into goods(goods_id,goods_name,price)values(1,"肩たたきチケット",1500);
insert into goods(goods_id,goods_name,price)values(2,"ディズニーランドチケット",10000000);
insert into goods(goods_id,goods_name,price)values(3,"AKB握手チケット",3000);
insert into goods(goods_id,goods_name,price)values(4,"世界一周旅行券",200000);
insert into goods(goods_id,goods_name,price)values(5,"雪かき体験チケット",5000);
insert into goods(goods_id,goods_name,price)values(6,"福田さん貸し出しチケット",20);
insert into goods(goods_id,goods_name,price)values(7,"福田さんと映画を見に行くチケット",10);
insert into goods(goods_id,goods_name,price)values(8,"木村カエレコンサートチケット",100);
insert into goods(goods_id,goods_name,price)values(9,"ぐなっしー写真撮影チケット",0);
insert into goods(goods_id,goods_name,price)values(10,"10億!!PIG宝くじ",10000);


