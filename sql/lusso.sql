/*@auhter HIDEYA SATO
 * @since 2016/11/15
 * @virsion 1.0
 */

/*"lusso"データベース作成*/
drop database if exists lusso;
create database lusso;
use lusso;


/*アルコールカテゴリテーブル作成*/
create table alcohol_category(
master_id int primary key not null,
category  varchar(15) not null,
resistration_date datetime not null default CURRENT_TIMESTAMP,
updated_date datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);


/*メニューテーブル作成*/
create table menu(
menu_id int  primary key not null,
master_id int not null,
alcohol_name varchar(15) not null,
alcohol_img_address text not null,
alcohol_content varchar(50) not null,
food_name varchar(15) not null ,
food_img_address text not null,
food_content varchar(50) not null,
resistration_date datetime not null default CURRENT_TIMESTAMP,
updated_date datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
foreign key(master_id) references alcohol_category(master_id)
);

/*クレジットカードテーブル作成*/
create table credit_card(
user_id  int not null,
card_brand varchar(15) not null,
name_e varchar(50) not null,
credit_number varchar(16) not null unique,
security_code int not null,
expiration_day varchar(7) not null,
resistration_date datetime not null default CURRENT_TIMESTAMP,
updated_date datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
foreign key(user_id) references openconnect.users(user_id)
);

/*購入テーブル作成*/
create table purchase(
user_id  int not null,
alcohol_name varchar(15) not null,
food_name varchar(15) not null,
delivery_day varchar(10) not null,
purchase_day datetime not null default CURRENT_TIMESTAMP,
credit_number varchar(16) not null,
resistration_date datetime not null default CURRENT_TIMESTAMP,
updated_date datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
foreign key(user_id) references openconnect.users(user_id)
);


/*アルコールカテゴリへ値挿入*/
insert into alcohol_category(master_id,category)
values(1,"beer"),
(2,"whisky"),
(3,"sake");

/*メニューへ値挿入*/
insert into menu(menu_id,master_id,alcohol_name,alcohol_img_address,alcohol_content,food_name,food_img_address,food_content) values
(1,1,"TRIBUTE","tribute.jpg","delicious","FISH&CHIPS","fish_and_chips.jpg","delicious"),
(2,1,"PROPER JOB","properjob.jpg","delicious","FRESH SALAD","salad.jpg","delicious"),
(3,1,"SPIT FIRE","spitfire.jpg","delicious","NUTS","nuts.jpg","delicious"),
(4,2,"SILKTASSEL","silktassel.jpg","delicious","Pasto Salami","pasto_salami.jpg","delicious"),
(5,2,"CHIVAS_REGAL","chivasregal.jpg","delicious","Vanilla Pudding","vanilla_pudding.jpg","delicious"),
(6,2,"Glen Garioch","glen_garioch.jpg","delicious","Cigar","cigar.jpg","delicious"),
(7,3,"HAKKAISAN","hakkaisan.jpg","delicious","CARPACCIO","carpaccio.jpg","delicious"),
(8,3,"KIKUYOI","kikuyoi.jpg","delicious","CLAMS","clams.jpg","delicious"),
(9,3,"KUBOTA","kubota.jpg","delicious","SEA URCHIN","sea_urchin.jpg","delicious");





