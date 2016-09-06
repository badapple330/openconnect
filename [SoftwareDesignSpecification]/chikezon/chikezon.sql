

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





-- goods テーブルサンプル挿入 --
insert into goods(goods_id,goods_name,price)values(1,"肩たたきチケット",1500);
insert into goods(goods_id,goods_name,price)values(2,"某ねずみの国片道チケット",5000);
insert into goods(goods_id,goods_name,price)values(3,"後楽園で僕と握手チケット",3000);
insert into goods(goods_id,goods_name,price)values(4,"世界二周旅行券",20000);
insert into goods(goods_id,goods_name,price)values(5,"雪かき体験チケット",5000);
insert into goods(goods_id,goods_name,price)values(6,"ニトロサーカスチケット C席",4000);
insert into goods(goods_id,goods_name,price)values(7,"黒鉛に導かれ者たちの宴(ダークカーニバル)チケット",1000);
insert into goods(goods_id,goods_name,price)values(8,"木村カエレコンサートチケット",100);
insert into goods(goods_id,goods_name,price)values(9,"ぐなっしー写真撮影チケット",0);
insert into goods(goods_id,goods_name,price)values(10,"10億!!PIG宝くじ",10000);


