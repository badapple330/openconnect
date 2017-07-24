

set names utf8;
set foreign_key_checks=0;
drop database if exists oden;
create database oden;
use oden;



drop table if exists item;
create table item(
Item_id int(255) PRIMARY KEY AUTO_INCREMENT,
Gazou varchar(255) ,
Item_name varchar(255) UNIQUE not null,
Price int(255) not null,
Setumei varchar(255) not null,
stocks int not null
);



insert into item(Item_id,Gazou,Item_name,Price,Setumei,stocks)value(1,"img/motikin.png","餅巾着",1600,"出汁がしみた巾着と餅のハーモニーは最高！！",100);
insert into item(Item_id,Gazou,Item_name,Price,Setumei,stocks)value(2,"img/atuage.jpg","厚揚げ",2200,"食べ応えのある厚揚げを是非ご賞味ください！！",100);
insert into item(Item_id,Gazou,Item_name,Price,Setumei,stocks)value(3,"img/daikon.jpg","大根",500,"おでんと言えばこれ！！出汁のしみた大根がココロを癒します",100);
insert into item(Item_id,Gazou,Item_name,Price,Setumei,stocks)value(4,"img/tikuwabu.jpg","ちくわぶ",2000,"やさしい味で、他の種とも愛称抜群！！おでん界のサポート役",100);
insert into item(Item_id,Gazou,Item_name,Price,Setumei,stocks)value(5,"img/tamago.jpg","たまご",800,"秘伝の出汁につけたタマゴは、絶品の味。あなたを虜にして逃さない！！",100);
insert into item(Item_id,Gazou,Item_name,Price,Setumei,stocks)value(6,"img/konnyaku03.jpg","こんにゃく",600,"プルプル感が幅広い世代で支持！！あなたも支持者になりませんか？",100);
insert into item(Item_id,Gazou,Item_name,Price,Setumei,stocks)value(7,"img/hanpen.jpg","はんぺん",1500,"フワフロ感が、夢見心地にさせてくれるおでん界のアイドル的存在！！",100);
insert into item(Item_id,Gazou,Item_name,Price,Setumei,stocks)value(8,"img/gyusuji.jpg","牛すじ",2000,"肉と出しのハーモニーは絶品！！夜のお供に是非１ついかがですか？",100);
insert into item(Item_id,Gazou,Item_name,Price,Setumei,stocks)value(9,"img/tukune.jpg","つくね",2000,"大根との愛抜群称!!厳選した鶏肉をご賞味ください",100);
insert into item(Item_id,Gazou,Item_name,Price,Setumei,stocks)value(10,"img/image041.png","つみれ",1800,"魚肉と出汁の最強の組み合わせ！！",100);
insert into item(Item_id,Gazou,Item_name,Price,Setumei,stocks)value(11,"img/pic_ganmo01_03_l.jpg","がんもどき",600,"出汁が染みたガンモドキは、お酒のお伴に最高！！",100);
insert into item(Item_id,Gazou,Item_name,Price,Setumei,stocks)value(12,"img/brand_dish_image_370.jpg","白滝",400,"おでん界の脇役的存在ですが、はずすに外せないやつ他の種とも愛称抜群！！",100);

drop table if exists GoCartDTO;
create table GoCartDTO(user_name varchar(255) not null, item_name varchar(255) not null,price int(255) not null,kazu int(255) not null);



create table carts(
	user_id int not null, /*userId*/
	item_id int not null, /*itemId*/
	quantities int not null default 1,
	total_price decimal(9,2) not null,
	is_deleted boolean default false,/*商品削除*/

	foreign key(user_id) references openconnect.users(user_id),
	foreign key(item_id) references item(item_id)
	);




