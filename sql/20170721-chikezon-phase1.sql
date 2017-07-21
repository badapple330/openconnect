set names utf8;
set foreign_key_checks=0;
drop database if exists chikezon;
create database chikezon;
use chikezon;


-- goodsテーブル作成
create table goods(
goods_id int(100) primary key not null auto_increment comment '商品ID',
goods_name varchar(255) not null comment '商品名',
price int not null comment '単価',
image_path varchar(255) not null comment '画像パス',
heading text not null comment '見出し',
message text not null comment 'メッセージ',
created_at datetime not null default current_timestamp comment '作成日',
updated_at datetime not null default current_timestamp comment '更新日'
);

-- goods テーブルサンプル挿入 --
insert into goods(goods_id,goods_name,price,image_path,heading,message) values
(1,"肩たたきチケット",1500,"img/肩たたき.jpg",
"決意を固めた僕の気持ち、君に届け――。",
"親愛なるご友人、仲間に渡しましょう。言葉では言えない日頃の感謝の気持ちを伝える橋渡しになるはずだ！"),

(2,"某ねずみの国片道チケット",5000,"img/某ねずみの国.jpg",
"夢と希望に満ちた聖地へ、いざ行かん――。",
"某ねずみの国へ通じる道の許可証です！高いですが帰りの分も買う必要があります。"),

(3,"後楽園で僕と握手チケット",3000,"img/後楽園.jpg",
"人々の未来をつくり、世界に希望をもたらした英雄――。",
"後楽園で憧れの僕と握手できるチケットです。ぜひお買い求めを！そして僕と握手！"),

(4,"世界二周旅行券",20000,"img/世界二周.jpg",
"美しきこの世界を知り尽くす、渾身の覚悟――。",
"世界を十二分に見て知れる、超ロングの旅、世界二周ツアーへの参加券です！"),

(5,"雪かき体験チケット",5000,"img/雪かき.jpg",
"重く降り積もった自然の力に抗え――。",
"雪を体で感じたいアナタにお勧め。がっつり雪をかきましょう！"),

(6,"ニトロサーカスチケット C席",4000,"img/ニトロサーカス.jpg",
"音も視界も爆炎で包み込む、爆発祭り――。",
"大量のニトロで芸術的で爆発的な演出が特徴のアメイジングなサーカスです！見に行こう！"),

(7,"黒鉛に導かれ者たちの宴(ダークカーニバル)チケット",1000,"img/ダークカーニバル.jpg",
"深遠なる闇の世界で互いを穿たん――。",
"国際舞台裏の闇をテーマにした、練り込まれた演劇が観客達を引き込む！"),

(8,"木村カエレコンサートチケット",100,"img/木村カエレ.jpg",
"魂震わし、大地をも震わす世界的歌手の凶宴――。",
"世界的歌手、木村カエレの魂震わすソウルコンサートチケットが今ならなんと100円です！"),

(9,"ぐなっしー写真撮影チケット",0,"img/ぐなっしー.jpg",
"大人気マスコットキャラクターぐなっしー。",
"巷で話題のぐなっしーと一緒に記念写真を撮れます。行きましょう！"),

(10,"10億!!PIG宝くじ",10000,"img/ピグくじ.jpg",
"自由を赦された世界には無限の可能性がある――",
"10億円当選チャンスのPIGなくじです。10億円の使い道に想像が膨らみます！"),

(11,"TEETO!2016ライブチケット",10000,"img/TEETO.jpg",
"不屈の闘志をかき立てる、英雄の詩――。",
"あの伝説的英雄Teetoが日本にやって来る！幾多の戦場を切り抜いた英雄のライブです！");

-- customers_infomationsテーブル作成
create table customers_infomations(
customer_id int(100) primary key auto_increment comment '顧客ID',
customer_name varchar(255) not null comment '顧客名',
postcode varchar(255) not null comment '郵便番号',
address varchar(255) not null comment '住所',
telnumber varchar(12) not null comment '電話番号',
mailaddress varchar(255) unique not null comment 'メールアドレス',
customer_pass varchar(255) not null comment '顧客パスワード',
created_at datetime not null default current_timestamp comment '作成日',
updated_at datetime not null default current_timestamp comment '更新日'
);

-- purchasesテーブル作成
create table purchases(
purchase_id int(100) not null primary key comment '購入ID',
user_id int(100) comment not null '顧客ID',
total_price decimal(9,2) not null comment '合計価格',
payment_method int not null comment '決済方法(1で代引き、2でクレカ)',
created_at datetime not null default current_timestamp comment '作成日',
updated_at datetime not null default current_timestamp comment '更新日',
foreign key(user_id) references openconnect.users(user_id)
);


-- purchases_unitsテーブル作成
create table purchases_units(
purchase_id int(100) not null comment '購入ID',
goods_id int(100) not null comment '商品ID',
order_count int(100) not null comment '注文数',
total_amount int not null comment '小計価格',
is_purchased boolean not null default FALSE comment '購入確定済フラグ(TRUEで確定済,FALSEはカートの中)'
created_at datetime not null default current_timestamp comment '作成日',
updated_at datetime not null default current_timestamp comment '更新日',
foreign key(purchase_id) references purchases(purchase_id),
foreign key(goods_id) references goods(goods_id)
);

