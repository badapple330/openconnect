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
category  varchar(50) not null
);

/*メニューテーブル作成*/
create table menu(
menu_id int  primary key not null,
master_id int not null,
alcohol_name varchar(15) not null ,
alcohol_img_address text not null,
alcohol_content varchar(50) not null,
food_name varchar(15) not null ,
food_img_address text not null,
food_content varchar(50) not null,
foreign key(master_id) references alcohol_category(master_id)
);

/*ユーザーテーブル作成*/
create table user(
user_id  int not null,
alcohol_name varchar(15) not null,
food_name varchar(15) not null,
delivery_day varchar(10) not null,
purchase_day varchar(20) not null,
name_e varchar(50) not null,
credit_number varchar(16) not null unique,
security_code int not null,
expiration_day varchar(7) not null,
foreign key(user_id) references openconnect.users(user_id)
);

/*アルコールカテゴリへ値挿入*/
insert into alcohol_category(master_id,category)
values(1,"beer"),
(2,"whisky"),
(3,"sake");

/*メニューへ値挿入*/
insert into menu() values
(1,1,"TRIBUTE","tribute.jpg","delicious","FISH&CHIPS","fish_and_chips.jpg","delicious"),
(2,1,"PROPER JOB","properjob.jpg","delicious","FRESH SALAD","salad.jpg","delicious"),
(3,1,"SPIT FIRE","spitfire.jpg","delicious","NUTS","nuts.jpg","delicious"),
(4,2,"SILKTASSEL","silktassel.jpg","delicious","Pasto Salami","pasto_salami.jpg","delicious"),
(5,2,"CHIVAS_REGAL","chivasregal.jpg","delicious","Vanilla Pudding","vanilla_pudding.jpg","delicious"),
(6,2,"Glen Garioch","glen_garioch.jpg","delicious","Cigar","cigar.jpg","delicious"),
(7,3,"HAKKAISAN","hakkaisan.jpg","delicious","CARPACCIO","carpaccio.jpg","delicious"),
(8,3,"KIKUYOI","kikuyoi.jpg","delicious","CLAMS","clams.jpg","delicious"),
(9,3,"KUBOTA","kubota.jpg","delicious","SEA URCHIN","sea_urchin.jpg","delicious");





