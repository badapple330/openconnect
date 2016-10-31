drop database if exists noel;
create database noel;
use noel;

/*商品
 * プラン種別 = plan_category
 * 商品id = item_id
 * 商品名称 = item_name
 * 単価 = plice
 * 詳細文 = overview
 * 在庫 = count
 * 売上数 = earnings_count
 * 画像01 = img_address_001
 * 画像02 = img_address_002
 * 画像03 = img_address_003
 * デリートフラグ = delete_flg
 * 登録日 = registration_date
 * 更新日 = updated_date
 * 会社名 = company_name
 */

create table item(
item_id int not null primary key auto_increment,
item_name varchar(100) not null,
price int not null,
overview text not null,
count int not null,
earnings_count int not null,
img_address_001 text not null,
img_address_002 text not null,
img_address_003 text not null,
delete_flg boolean not null default false,
registration_date datetime not null,
updated_date datetime not null,
company_name varchar(100) not null
);

/*購入
 * id = id
 * ユーザーid = user_id
 * 商品id = item_id
 * 注文数 = order_count
 * 合計金額 = amount
 * 購入日 = purchase_date
 * 支払い方法 = payment_method
 * 登録日 = registration_date
 * 更新日 = updated_date
 */

create table parchase(
id int not null,
user_id int not null,
item_id int not null,
order_count int not null,
amount int not null,
purchase_date date not null,
payment_method int not null default "0",
registration_date datetime not null,
updated_date datetime not null,
foreign key(user_id) references openconnect.users(user_id) on delete cascade,
foreign key(item_id) references item(item_id)
);

/*カート
 * ユーザーID = user_id
 * 商品id = item_id
 * 姓（漢字） = family_name_kanji
 * 名（漢字） = given_name_kanji
 * 住所 = address
 * メールアドレス = email
 * 電話番号 = phone_number
 * 商品名称 = item_name
 * 注文数 = order_count
 * 単価 = price
 * 合計金額 = amount
 * 備考 = note
 */

create table cart(
user_id int not null,
item_id int not null default"0",
family_name_kanji varchar(50) not null,
given_name_kanji varchar(50) not null,
address varchar(255) not null,
email varchar(255) not null,
phone_number varchar(255) not null,
item_name varchar(100) not null,
order_count int not null,
price int not null,
amount int not null,
note varchar(100),
foreign key(user_id) references openconnect.users(user_id) on delete cascade,
foreign key(item_id) references item(item_id)
);

/*クレジット
 * クレジットの種類 = credit_name
 * クレジット番号 = credit_number
 * 姓名（ローマ字） = name_e
 * セキュリティコード = security_code
 * 有効期限 = expiration_day
 * ご利用店名 = corporation_name
 * ご利用日 = use_day
 * 支払い区分 = division
 * 分割回数 = split
 * ご利用金額 = spend
 */

create table credit(
credit_name enum('visa','mastercard','americanexpress') not null,
credit_number varchar(16) not null,
name_e varchar(50) not null,
security_code int not null,
expiration_day datetime not null,
corporation_name varchar(50) not null,
use_day date not null,
division varchar(10) not null,
split int not null,
spend int not null
);