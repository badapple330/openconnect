set names utf8;
set foreign_key_checks=0;
drop database if exists uesto;
create database if not exists uesto;
use uesto;


drop table if exists goods;
drop table if exists customer;
drop table if exists order_info;

create table goods(
goods_id int(100) primary key auto_increment,
goods_name varchar(300) not null,
stock int(100),
price int,
kcal int(100))
;

insert into goods (goods_id,goods_name,stock,price,Kcal)values
(1,"プロテインチョコ味",10,800,1),
(2,"プロテインイチゴ味",9,900,1),
(3,"プロテインブドウ味",50,700,1),
(4,"えごま油(450ml)",100,2980,1),
(5,"亜麻仁油(450ml)",100,2780,1),
(6,"C1000ビタミンレモンゼリー",100,140,2),
(7,"SOYJOY",100,100,1),
(8,"REDBULL",100,298,1),
(9,"カロリーメイト",100,150,1),
(10,"プロテインダイエット",100,5000,3),
(11,"おからクッキー",100,3000,2),
(12,"カルシウムせんべい",100,300,1),
(13,"グリーンスムージー",100,3000,3),
(14,"アサイースムージー",100,3000,3),
(15,"青汁",100,3000,1),
(16,"トマトジュース500ｍｌ",100,300,1),
(17,"野菜ジュース500ｍｌ",100,100,1),
(18,"ヨーグルト",100,200,1),
(19,"ノニジュース500ｍｌ",100,3000,1),
(20,"黒ゴマ",100,300,1),
(21,"ウエストローラー",100,1600,2),
(22,"ダンベル(5kg)",100,1500,2),
(23,"ダンベル(10kg)",100,3000,1),
(24,"ダンベルセット",100,5000,2),
(25,"サウナスーツ",100,8000,3),
(26,"バランスボール",100,1000,3),
(27,"ランニングマシン",100,50000,3),
(28,"ぶら下がり健康器",100,8000,2),
(29,"ダイエットシューズ",100,3000,3),
(30,"ランニングシューズ",100,2980,3),
(31,"健康ステッパー",100,14000,1),
(32,"ヨガマット",100,1500,1),
(33,"足つぼウォークマット",100,9500,1),
(34,"ボディケアマシン",100,25000,1),
(35,"スリムウォーク",100,1000,1),
(36,"骨盤矯正ベルト",100,2500,1),
(37,"マッサージチェア",100,200000,1),
(38,"フットマッサージャー",100,20000,1),
(39,"美容ローラー",100,25000,1),
(40,"TRF　ダンササイズ",100,3000,1),
(41,"母の愛(30粒)",100,4980,1),
(42,"亜鉛　30粒",100,1000,1),
(43,"スリムサプリ　30日分",100,2000,3),
(44,"高麗人参",100,15000,1),
(45,"グルコサミン＆コンドロイチン",100,400,1),
(46,"ウコンサプリメント",100,650,1),
(47,"カルシム＆マグネシウム",100,2000,1),
(48,"コラーゲン",100,1000,1),
(49,"コエンザイムＱ10",100,200,1),
(50,"マルチビタミン",100,2500,1),
(51,"ユーグレナ　90粒",100,7000,1),
(52,"ビーポーレ　250ｇ",100,6000,1),
(53,"カプサイシンサプリメント",100,2500,1),
(54,"ヘム鉄サプリメント",100,600,1),
(55,"葉酸サプリメント",100,1200,1),
(56,"ハトムギ酵素",100,2700,1),
(57,"オリゴ糖",100,500,1),
(58,"アルギニンサプリメント",100,500,1),
(59,"酵素にんにく卵黄",100,5000,1),
(60,"卵とにんにく",100,1,1),
(61,"ブートキャンプ",100,6800,3),
(62,"クビレディ",100,7000,3),
(63,"エアロバイク",100,35000,3),
(64,"水素風呂",100,250000,1),
(65,"アブトロニック",100,15000,2),
(66,"ビール酵母",100,2000,1),
(67,"バスソルト900ｇ",100,1000,1),
(68,"水素発生入浴剤",100,1000,1),
(69,"バラの入浴剤",100,1500,1),
(70,"きのこセット",100,1500,1),
(71,"アンパンマンDVD",100,1500,3),
(72,"おから",100,1500,1),
(73,"ヘルスケアレア",100,1500,4),
(74,"レディス4",100,1500,2),
(75,"健康グッズ",100,1500,1),
(76,"ブート風呂増量版",100,1500,2),
(77,"ヘルススケルター",100,1500,1),
(78,"体重計",100,1500,3),
(79,"亜鉛風呂",100,1500,3);


/***********************************************************
* 将来はOPENCONNECT：USERSテーブルにて踏襲するため削除予定  **
***********************************************************/
create table customer (
id INT(100) NOT NULL AUTO_INCREMENT comment '顧客ID',
customer_name VARCHAR(255) NOT NULL comment '顧客名',
user_id VARCHAR(255) UNIQUE NOT NULL comment 'ユーザーID',
pass VARCHAR(255) NOT NULL comment '顧客パスワード',
mailad  VARCHAR(255) NOT NULL comment 'メールアドレス',
postcode VARCHAR(7) NOT NULL comment '郵便番号',
address VARCHAR(255) NOT NULL comment '住所',
telnumber VARCHAR(12) NOT NULL comment '電話番号',
credit_number varchar(4) comment 'クレジットカード番号',
credit_token varchar(255) comment 'クレジットカードトークン',
cardNumber varchar(50) comment 'クレジットカード番号',
cardHolder varchar(255) comment 'クレジットカード所有者',
expirationdate varchar(20) comment '有効期限日',
securityCode varchar(4) comment 'セキュリティコード',
primary key(id)
)
engine=MyISAM
default charset=utf8
comment='顧客情報テーブル'
;

drop table if exists temp;
create table temp(
temp_id int primary key auto_increment,
user_id varchar(255),
user_name varchar(255),
password varchar(255),
email varchar(100),
cell_number varchar(15),
postal_code varchar(8),
address varchar(100),
card_number varchar(50),
card_holder varchar(255),
expiration_date varchar(20),
security_code varchar(4),
oauth_id varchar(50),
oauth_name varchar(50),
registration_date datetime
)
engine=MyISAM
default charset=utf8
comment='テンポラリテーブル'
;

create table order_info(
id varchar(100),
goods_id int(100),
ORDER_COUNT int(100),
PURCHASEDAY timestamp default current_timestamp()
)
;
/***********************************************************
* 将来はOPENCONNECT：USERSテーブルにて踏襲するため削除予定  **
***********************************************************/
INSERT INTO CUSTOMER(CUSTOMER_NAME,USER_ID,PASS,MAILAD,POSTCODE,ADDRESS,TELNUMBER,credit_token
)VALUES(
"黒柳","totto","madogiwa","totto@gmail.com","1234567","東京都八王子市xxx","09012345678","ab8b31e064a7cf9ef187fd53a7a11b2df9d31b5c0da5fe7876a3092ceaaeade3");

-- ORDERテーブルにサンプルデータの挿入
INSERT INTO ORDER_INFO(ID,GOODS_ID,ORDER_COUNT)VALUES(1,1,4);
