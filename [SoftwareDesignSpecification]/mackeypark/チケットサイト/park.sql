create database if not exists park;

use park;

drop table if exists ticket;
create table ticket (

item_id int primary key not null auto_increment,

item_name varchar(100) not null,

period varchar(100) not null,

division varchar(100) not null,

explanation varchar(255) not null,

design varchar(100) not null,

img_path varchar(100) not null,

price int not null,

registration_date datetime not null

);

insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(大人)","1日","大人","20歳以上の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(大人)","1日","大人","20歳以上の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(大人)","1日","大人","20歳以上の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(大人)","1日","大人","20歳以上の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(大人)","1日","大人","20歳以上の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(大人)","1日","大人","20歳以上の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(大人)","1週間","大人","20歳以上の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",8000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(大人)","1週間","大人","20歳以上の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",8000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(大人)","1週間","大人","20歳以上の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",8000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(大人)","1週間","大人","20歳以上の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",8000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(大人)","1週間","大人","20歳以上の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",8000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(大人)","1週間","大人","20歳以上の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",8000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(大人)","1ヶ月","大人","20歳以上の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(大人)","1ヶ月","大人","20歳以上の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(大人)","1ヶ月","大人","20歳以上の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(大人)","1ヶ月","大人","20歳以上の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(大人)","1ヶ月","大人","20歳以上の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(大人)","1ヶ月","大人","20歳以上の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(大人)","1年","大人","20歳以上の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",80000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(大人)","1年","大人","20歳以上の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",80000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(大人)","1年","大人","20歳以上の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",80000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(大人)","1年","大人","20歳以上の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",80000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(大人)","1年","大人","20歳以上の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",80000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(大人)","1年","大人","20歳以上の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",80000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(小人)","1日","小人","6歳以上、20歳以下の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",3000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(小人)","1日","小人","6歳以上、20歳以下の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",3000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(小人)","1日","小人","6歳以上、20歳以下の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",3000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(小人)","1日","小人","6歳以上、20歳以下の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",3000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(小人)","1日","小人","6歳以上、20歳以下の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",3000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(小人)","1日","小人","6歳以上、20歳以下の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",3000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(小人)","1週間","小人","6歳以上、20歳以下の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",6000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(小人)","1週間","小人","6歳以上、20歳以下の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",6000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(小人)","1週間","小人","6歳以上、20歳以下の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",6000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(小人)","1週間","小人","6歳以上、20歳以下の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",6000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(小人)","1週間","小人","6歳以上、20歳以下の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",6000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(小人)","1週間","小人","6歳以上、20歳以下の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",6000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(小人)","1ヶ月","小人","6歳以上、20歳以下の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",30000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(小人)","1ヶ月","小人","6歳以上、20歳以下の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",30000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(小人)","1ヶ月","小人","6歳以上、20歳以下の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",30000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(小人)","1ヶ月","小人","6歳以上、20歳以下の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",30000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(小人)","1ヶ月","小人","6歳以上、20歳以下の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",30000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(小人)","1ヶ月","小人","6歳以上、20歳以下の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",30000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(小人)","1年","小人","6歳以上、20歳以下の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",60000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(小人)","1年","小人","6歳以上、20歳以下の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",60000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(小人)","1年","小人","6歳以上、20歳以下の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",60000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(小人)","1年","小人","6歳以上、20歳以下の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",60000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(小人)","1年","小人","6歳以上、20歳以下の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",60000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(小人)","1年","小人","6歳以上、20歳以下の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",60000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(幼児)","1日","幼児","5歳以下の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(幼児)","1日","幼児","5歳以下の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(幼児)","1日","幼児","5歳以下の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(幼児)","1日","幼児","5歳以下の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(幼児)","1日","幼児","5歳以下の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(幼児)","1日","幼児","5歳以下の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(幼児)","1週間","幼児","5歳以下の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(幼児)","1週間","幼児","5歳以下の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(幼児)","1週間","幼児","5歳以下の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(幼児)","1週間","幼児","5歳以下の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(幼児)","1週間","幼児","5歳以下の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(幼児)","1週間","幼児","5歳以下の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(幼児)","1ヶ月","幼児","5歳以下の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",20000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(幼児)","1ヶ月","幼児","5歳以下の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",20000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(幼児)","1ヶ月","幼児","5歳以下の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",20000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(幼児)","1ヶ月","幼児","5歳以下の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",20000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(幼児)","1ヶ月","幼児","5歳以下の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",20000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(幼児)","1ヶ月","幼児","5歳以下の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",20000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(幼児)","1年","幼児","5歳以下の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(幼児)","1年","幼児","5歳以下の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(幼児)","1年","幼児","5歳以下の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(幼児)","1年","幼児","5歳以下の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(幼児)","1年","幼児","5歳以下の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(幼児)","1年","幼児","5歳以下の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(団体)","1日","団体","20人以上の団体が対象です。","マッキー","./picture/マッキー.jpg",3500,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(団体)","1日","団体","20人以上の団体が対象です。","マニー","./picture/マニー.jpg",3500,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(団体)","1日","団体","20人以上の団体が対象です。","ドルナド","./picture/ドルナド.jpg",3500,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(団体)","1日","団体","20人以上の団体が対象です。","ドイジー","./picture/ドイジー.jpg",3500,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(団体)","1日","団体","20人以上の団体が対象です。","グッフィ","./picture/グッフィ.png",3500,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(団体)","1日","団体","20人以上の団体が対象です。","ポルート","./picture/ポルート.jpg",3500,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(バースデー)","1日","バースデー","当日お誕生日の方が対象です。お誕生日をお祝いするグッズがついています。","マッキー","./picture/マッキー.jpg",5000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(バースデー)","1日","バースデー","当日お誕生日の方が対象です。お誕生日をお祝いするグッズがついています。","マニー","./picture/マニー.jpg",5000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(バースデー)","1日","バースデー","当日お誕生日の方が対象です。お誕生日をお祝いするグッズがついています。","ドルナド","./picture/ドルナド.jpg",5000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(バースデー)","1日","バースデー","当日お誕生日の方が対象です。お誕生日をお祝いするグッズがついています。","ドイジー","./picture/ドイジー.jpg",5000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(バースデー)","1日","バースデー","当日お誕生日の方が対象です。お誕生日をお祝いするグッズがついています。","グッフィ","./picture/グッフィ.png",5000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(バースデー)","1日","バースデー","当日お誕生日の方が対象です。お誕生日をお祝いするグッズがついています。","ポルート","./picture/ポルート.jpg",5000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(アフター6)","1日","アフター6","午後6時以降に入園する方が対象です。。","マッキー","./picture/マッキー.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(アフター6)","1日","アフター6","午後6時以降に入園する方が対象です。。","マニー","./picture/マニー.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(アフター6)","1日","アフター6","午後6時以降に入園する方が対象です。。","ドルナド","./picture/ドルナド.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(アフター6)","1日","アフター6","午後6時以降に入園する方が対象です。。","ドイジー","./picture/ドイジー.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(アフター6)","1日","アフター6","午後6時以降に入園する方が対象です。。","グッフィ","./picture/グッフィ.png",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(アフター6)","1日","アフター6","午後6時以降に入園する方が対象です。。","ポルート","./picture/ポルート.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(シニア)","1日","シニア","65歳以上の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(シニア)","1日","シニア","65歳以上の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(シニア)","1日","シニア","65歳以上の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(シニア)","1日","シニア","65歳以上の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(シニア)","1日","シニア","65歳以上の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1日(シニア)","1日","シニア","65歳以上の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",2000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(シニア)","1週間","シニア","65歳以上の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(シニア)","1週間","シニア","65歳以上の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(シニア)","1週間","シニア","65歳以上の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(シニア)","1週間","シニア","65歳以上の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(シニア)","1週間","シニア","65歳以上の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1週間(シニア)","1週間","シニア","65歳以上の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",4000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(シニア)","1ヶ月","シニア","65歳以上の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",20000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(シニア)","1ヶ月","シニア","65歳以上の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",20000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(シニア)","1ヶ月","シニア","65歳以上の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",20000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(シニア)","1ヶ月","シニア","65歳以上の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",20000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(シニア)","1ヶ月","シニア","65歳以上の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",20000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1ヶ月(シニア)","1ヶ月","シニア","65歳以上の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",20000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(シニア)","1年","シニア","65歳以上の方がお楽しみいただけます。","マッキー","./picture/マッキー.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(シニア)","1年","シニア","65歳以上の方がお楽しみいただけます。","マニー","./picture/マニー.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(シニア)","1年","シニア","65歳以上の方がお楽しみいただけます。","ドルナド","./picture/ドルナド.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(シニア)","1年","シニア","65歳以上の方がお楽しみいただけます。","ドイジー","./picture/ドイジー.jpg",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(シニア)","1年","シニア","65歳以上の方がお楽しみいただけます。","グッフィ","./picture/グッフィ.png",40000,now());
insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values("1年(シニア)","1年","シニア","65歳以上の方がお楽しみいただけます。","ポルート","./picture/ポルート.jpg",40000,now());
