drop database if exists debut;
create database debut;
use debut;

/*商品テーブル = item
 *商品ID = item_id
 *商品名 = item_name
 *ジャンル = item_genre
 *価格 = price
 *デリートフラグ = delete_flg
 *登録日 = registration_date
 *更新日 = update_date
 */

create table item(
item_id int not null primary key auto_increment comment '商品ID',
item_name varchar(100) not null comment '商品名',
item_genre varchar(50) not null comment 'ジャンル',
price decimal(7,3) not null comment '価格',
delete_flg boolean not null default false comment '削除フラグ',
registration_date datetime not null comment '登録日',
updated_date datetime not null comment '更新日'
)comment = '商品テーブル';

/*商品説明テーブル = overview
 *商品説明ジャンル = overview_genre
 *商品説明001 = overview_001
 *商品説明002 = overview_002
 *商品説明003 = overview_003
 *商品説明004 = overview_004
 *商品説明005 = overview_005
 *商品説明006 = overview_006
 *商品説明007 = overview_007
 *商品説明008 = overview_008
 *商品説明009 = overview_009
 *商品説明010 = overview_010
 *商品説明011 = overview_011
 *商品説明012 = overview_012
 *商品説明013 = overview_013
 *商品説明014 = overview_014
 *商品説明015 = overview_015
 *商品説明016 = overview_016
 *商品説明017 = overview_017
 *商品説明018 = overview_018
 *商品説明019 = overview_019
 *商品説明020 = overview_020
 */

create table overview(
overview_genre varchar(50) comment '商品説明ジャンル',
overview_001 text comment '商品説明001',
overview_002 text comment '商品説明002',
overview_003 text comment '商品説明003',
overview_004 text comment '商品説明004',
overview_005 text comment '商品説明005',
overview_006 text comment '商品説明006',
overview_007 text comment '商品説明007',
overview_008 text comment '商品説明008',
overview_009 text comment '商品説明009',
overview_010 text comment '商品説明010',
overview_011 text comment '商品説明011',
overview_012 text comment '商品説明012',
overview_013 text comment '商品説明013',
overview_014 text comment '商品説明014',
overview_015 text comment '商品説明015',
overview_016 text comment '商品説明016',
overview_017 text comment '商品説明017',
overview_018 text comment '商品説明018',
overview_019 text comment '商品説明019',
overview_020 text comment '商品説明020'
)comment = '商品説明テーブル';

/*画像テーブル = image
 *画像ジャンル = image_genre
 *画像001 = image_address001
 *画像002 = image_address002
 *画像003 = image_address003
 *画像004 = image_address004
 *画像005 = image_address005
 *画像006 = image_address006
 *画像007 = image_address007
 *画像008 = image_address008
 *画像009 = image_address009
 *画像010 = image_address010
 *画像011 = image_address011
 *画像012 = image_address012
 *画像013 = image_address013
 *画像014 = image_address014
 *画像015 = image_address015
 *画像016 = image_address016
 *画像017 = image_address017
 *画像018 = image_address018
 *画像019 = image_address019
 *画像020 = image_address020
 */

create table image(
image_genre varchar(50) comment '画像ジャンル',
image_address001 text comment '画像001',
image_address002 text comment '画像002',
image_address003 text comment '画像003',
image_address004 text comment '画像004',
image_address005 text comment '画像005',
image_address006 text comment '画像006',
image_address007 text comment '画像007',
image_address008 text comment '画像008',
image_address009 text comment '画像009',
image_address010 text comment '画像010',
image_address011 text comment '画像011',
image_address012 text comment '画像012',
image_address013 text comment '画像013',
image_address014 text comment '画像014',
image_address015 text comment '画像015',
image_address016 text comment '画像016',
image_address017 text comment '画像017',
image_address018 text comment '画像018',
image_address019 text comment '画像019',
image_address020 text comment '画像020'
)comment = '画像テーブル';

/*購入テーブル = puchase
 *購入ID = puchase_id
 *ユーザーID = user_id
 *商品ID = item_id
 *商品名 = item_name
 *注文数 = order_count
 *合計金額 = amount
 *購入日 = puchase_date
 *支払い方法 = payment_method
 *登録日 = registration_date
 *更新日 = updated_date
 */

create table purchase(
purchase_id int not null primary key auto_increment comment '購入ID',
user_id int not null comment 'ユーザーID',
item_id int not null comment '商品ID',
item_name varchar(100) not null comment '商品名',
order_count int not null comment '注文数',
amount decimal(7,3) not null comment '合計金額',
purchase_date date not null comment '購入日',
payment_method varchar(100) comment '支払い方法',
registration_date datetime comment '登録日',
updated_date datetime comment '更新日',
foreign key(user_id) references openconnect.users(user_id) on delete cascade,
foreign key(item_id) references item(item_id)
)comment = '購入テーブル';

/*クレジット種類テーブル = credit_type
 *カード種類番号 = card_num
 *カード名 = card_name
 */

create table credit_type(
credit_num int not null primary key comment 'カード種類番号',
credit_name varchar(255) not null comment 'カード会社名'
)comment = 'クレジット種類テーブル';

/*クレジットテーブル = credit
 *クレジット種類 = credit_type
 *クレジット番号 = credit_number
 *カード名義 = name_e
 *セキュリティコード = security_code
 *有効期限(月) = expiration_month
 *有効期限(年) = expiration_year
 *登録日 = registration_date
 *更新日 = updated_date
 */

create table credit(
credit_type int not null comment 'クレジット種類',
credit_number varchar(16) comment 'クレジット番号',
name_e varchar(50) comment 'カード名義',
security_code int(4) comment 'セキュリティコード',
expiration_month varchar(2) comment '有効期限(月)',
expiration_year varchar(2) comment '有効期限(年)',
registration_date datetime comment '登録日',
updated_date datetime comment '更新日',
foreign key(credit_type) references credit_type(credit_num) on delete cascade
)comment = 'クレジットテーブル';

insert into item values(
1,'ダーツ入門キット','indoor',3000,false,"2016/11/08 11:29:00","2016/11/08 11:29:00");