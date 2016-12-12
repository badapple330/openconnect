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
 *商品説明001 = overview001
 *商品説明002 = overview002
 *商品説明003 = overview003
 *商品説明004 = overview004
 *商品説明005 = overview005
 *商品説明006 = overview006
 *商品説明007 = overview007
 *商品説明008 = overview008
 *商品説明009 = overview009
 *商品説明010 = overview010
 *商品説明011 = overview011
 *商品説明012 = overview012
 *商品説明013 = overview013
 *商品説明014 = overview014
 *商品説明015 = overview015
 */

create table overview(
overview_genre varchar(50) comment '商品説明ジャンル',
overview001 text comment '商品説明001',
overview002 text comment '商品説明002',
overview003 text comment '商品説明003',
overview004 text comment '商品説明004',
overview005 text comment '商品説明005',
overview006 text comment '商品説明006',
overview007 text comment '商品説明007',
overview008 text comment '商品説明008',
overview009 text comment '商品説明009',
overview010 text comment '商品説明010',
overview011 text comment '商品説明011',
overview012 text comment '商品説明012',
overview013 text comment '商品説明013',
overview014 text comment '商品説明014',
overview015 text comment '商品説明015',
delete_flg boolean not null default false comment '削除フラグ'
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
delete_flg boolean not null default false comment '削除フラグ'
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
1,'aiueo','indoor',3000,false,"2016/11/08 11:29:00","2016/11/08 11:29:00");

insert into image values(
'indoor',
'darts1.jpg',
'darts_slide1.jpg',
'3',
'4',
'darts5.jpg',
'darts6.jpg',
'darts7.jpg',
'darts8.jpg',
'darts9.jpg',
'10',
'11',
'12',
'13',
'14',
'15',
false
);

insert into overview values(
'indoor',
'男女問わず人気の定番趣味！\n\n時間を気にせずみんなで盛り上がれる点もオススメ！',
'ダーツ入門の王道キット！',
'これで友達に差をつけよう！',
'ちょっと大人びた遊びのイメージがあるダーツ。\n
未経験者には敷居が高いと思われがちですが、実はそんな事全然ないんです。\n
最近ではネットカフェ等に併設されていることも多くお店側で道具も貸し出ししてくれるので、\n
他の趣味に比べるとむしろ入りやすい分類と言えるでしょう。\n
遊び方も一人でひたすらハイスコアを目指すものから、\n
四人でチームを組んでポイントを競い合うものまで様々で、飽きにくいのも特徴です。\n
しかしながらお店によって貸し出してくれるダーツの種類は違うので力加減や持ち方などが毎回変わってきてしまいます。\n
それでは上達速度にも影響を及ぼしてしまうので、あまりオススメは出来ません。\n
今回は最低限必要なアイテムだけを厳選したリーズナブルなキットをご紹介します！',
'・DEBUT特製入門用ダーツ\n
持ちやすさにとことん拘った初心者向けのダーツです。\n
各部分は取外し可能なので自分好みにアレンジする事も可能となっています。',
'・フライト\n
ダーツ上部に付いた羽のようなパーツ。\n
馴染みやすいライトグリーンのシンプルなデザインです。',
'・シャフト\n
ダーツ握る部分のバレルとフライトを繋ぐパーツ。\n
長さによって投げた時の感覚が違いますので、一般的な4種類をお付け致しします。',
'・チップ\n
ダーツ下部のボードに刺さるパーツ。\n
頻繁に取り替えるのが基本となりますので、9色50本お付け致します。',
'・ダーツケース\n
ダーツ本体や、予備パーツを収納するケースです。\n
フックが付いていますのでズボンのベルト等に装着できます。',
'肝心のお値段ですが、通常約8,000円のところ………、\n\n\n',
'これだけセットでなんと',
'3,000',
'円です！',
'在庫がなくなり次第販売終了となりますので、ご購入をお考えの方はお早めに！',
'15',
false);
