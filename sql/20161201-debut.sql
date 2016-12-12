drop database if exists debut;
create database debut;
use debut;

/*商品テーブル = item
 *商品ID = item_id
 *商品名 = item_name
 *ジャンル = item_genre
 *価格 = price
 *デリートフラグ = item_delete_flg
 *登録日 = registration_date
 *更新日 = update_date
 */

create table item(
item_id int not null primary key auto_increment comment '商品ID',
item_name varchar(100) not null comment '商品名',
item_genre varchar(50) not null comment 'ジャンル',
price decimal(7,3) not null comment '価格',
item_delete_flg boolean not null default false comment '削除フラグ',
registration_date datetime not null comment '登録日',
updated_date datetime not null comment '更新日'
)comment = '商品テーブル';

/*商品説明テーブル = overview
 *商品説明ID = overview_id
 *商品説明ジャンル = overview_genre
 *商品説明トップ = overview_top
 *商品説明キャッチ01 = overview_catch01
 *商品説明キャッチ02 = overview_catch02
 *商品説明詳細 = overview_ex
 *商品説明キット01 = overview_kit01
 *商品説明キット02 = overview_kit02
 *商品説明キット03 = overview_kit03
 *商品説明キット04 = overview_kit04
 *商品説明キット05 = overview_kit05
 *商品説明キット06 = overview_kit06
 *商品説明売り文句01 = overview_slogan01
 *商品説明売り文句02 = overview_slogan02
 *商品説明売り文句03 = overview_slogan03
 *商品説明売り文句04 = overview_slogan04
 *商品説明売り文句05 = overview_slogan05
 *デリートフラグ = overview_delete_flg
 */

create table overview(
overview_id int comment '商品説明ID',
overview_genre varchar(50) comment '商品説明ジャンル',
overview_top text comment '商品説明トップ',
overview_catch01 text comment '商品説明キャッチ01',
overview_catch02 text comment '商品説明キャッチ02',
overview_ex text comment '商品説明詳細',
overview_kit01 text comment '商品説明キット01',
overview_kit02 text comment '商品説明キット02',
overview_kit03 text comment '商品説明キット03',
overview_kit04 text comment '商品説明キット04',
overview_kit05 text comment '商品説明キット05',
overview_kit06 text comment '商品説明キット06',
overview_slogan01 text comment '商品説明売り文句01',
overview_slogan02 text comment '商品説明売り文句02',
overview_slogan03 text comment '商品説明売り文句03',
overview_slogan04 text comment '商品説明売り文句04',
overview_slogan05 text comment '商品説明売り文句05',
overview_delete_flg boolean not null default false comment '削除フラグ',
foreign key(overview_id)references item(item_id)
)comment = '商品説明テーブル';

/*画像テーブル = image
 *画像ID = image_id
 *画像ジャンル = image_genre
 *画像トップ = image_top
 *画像スライド01 = image_slide01
 *画像スライド02 = image_slide02
 *画像スライド03 = image_slide03
 *画像キット01 = image_kit01
 *画像キット02 = image_kit02
 *画像キット03 = image_kit03
 *画像キット04 = image_kit04
 *画像キット05 = image_kit05
 *画像キット06 = image_kit06
 *デリートフラグ = image_delete_flg
 */

create table image(
image_id int comment '画像ID',
image_genre varchar(50) comment '画像ジャンル',
image_top text comment '画像トップ',
image_slide01 text comment '画像スライド01',
image_slide02 text comment '画像スライド02',
image_slide03 text comment '画像スライド03',
image_kit01 text comment '画像キット01',
image_kit02 text comment '画像キット02',
image_kit03 text comment '画像キット03',
image_kit04 text comment '画像キット04',
image_kit05 text comment '画像キット05',
image_kit06 text comment '画像キット06',
image_delete_flg boolean not null default false comment '削除フラグ',
foreign key(image_id)references item(item_id)
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

/*セーブテーブル = save
 *ユーザーフォーム = user_form
 *お名前 = user_name
 *メールアドレス = email_address
 *パスワード = password
 *郵便番号 = postal_code
 *住所 = address
 */

create table save(
user_form int comment 'ユーザーフォーム',
user_name varchar(100) comment 'お名前',
email_address varchar(100) comment 'メールアドレス',
password varchar(100) comment 'パスワード',
postal_code varchar(100) comment '郵便番号',
address varchar(100) comment '住所'
)comment = 'セーブテーブル';

insert into item(
item_name,
item_genre,
price,
item_delete_flg,
registration_date,
updated_date
)values(
'aiueo','indoor',3000,false,"2016/11/08 11:29:00","2016/11/08 11:29:00");

insert into overview(
overview_genre,
overview_top,
overview_catch01,
overview_catch02,
overview_ex,
overview_kit01,
overview_kit02,
overview_kit03,
overview_kit04,
overview_kit05,
overview_kit06,
overview_slogan01,
overview_slogan02,
overview_slogan03,
overview_slogan04,
overview_slogan05,
overview_delete_flg
)values(
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
null,
'肝心のお値段ですが、通常約8,000円のところ………、\n\n\n',
'これだけセットでなんと',
'3,000',
'円です！',
'在庫がなくなり次第販売終了となりますので、ご購入をお考えの方はお早めに！',
false);
