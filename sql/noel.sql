drop database if exists noel;
create database noel;
use noel;

/*商品
 * 商品id = item_id
 * 商品名称 = item_name
 * ジャンル = item_category
 * 価格 = price
 * 詳細文 = overview
 * サイズ = size
 * アレルギー = allergy
 * 販売期間 = sales_period
 * 画像001 = img_address001
 * 画像002 = img_address002
 * 画像003 = img_address003
 * デリートフラグ = delete_flg
 * 登録日 = registration_date
 * 更新日 = updated_date
 * 会社名 = company_name
 */

create table item(
item_id int not null primary key auto_increment,
item_name varchar(100) not null,
item_category varchar(50) not null,
price int not null,
overview text not null,
size varchar(50) not null,
allergy varchar(100) not null,
sales_period date not null,
img_address001 text not null,
img_address002 text not null,
img_address003 text not null,
delete_flg boolean not null default false,
registration_date datetime not null,
updated_date datetime not null,
company_name varchar(100) not null
);

/*購入
 * 購入id = parchase_id
 * ユーザーid = user_id
 * 商品id = item_id
 * 商品名称 = item_name
 * 注文数 = order_count
 * 合計金額 = amount
 * 購入日 = purchase_date
 * 支払い方法 = payment_method
 * 登録日 = registration_date
 * 更新日 = updated_date
 */

create table parchase(
parchase_id int not null,
user_id int not null,
item_id int not null,
item_name varchar(100) not null,
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
 * 商品名称 = item_name
 * 注文数 = order_count
 * 価格 = price
 * 合計金額 = amount
 * 備考 = note
 */

create table cart(
user_id int not null,
item_id int not null default"0",
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
security_code int(4) not null,
expiration_day datetime not null,
corporation_name varchar(50) not null,
use_day date not null,
division varchar(10) not null,
split int,
spend int not null
);

/*一時保管
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

create table work(
credit_name enum('visa','mastercard','americanexpress') not null,
credit_number varchar(16) not null,
name_e varchar(50) not null,
security_code int(4) not null,
expiration_day datetime not null,
corporation_name varchar(50) not null,
use_day date not null,
division varchar(10) not null,
split int,
spend int not null
);

/*商品の追加１０件
 * おすすめ＆スタンダード５件ずつ
*/

insert into item(
item_name,
item_category,
price,
overview,
size,
allergy,
sales_period,
img_address001,
img_address002,
img_address003,
delete_flg,
registration_date,
updated_date,
company_name
)values(
"ルリシュワール/Lulishwar","お勧めケーキ/Recommendation Cake","5800",
"ふわふわスポンジ、乳味ゆたかな生クリームと苺、それぞれのおいしさを引き立合うバランスで仕上げました。
/Fluffy sponge, milky cream Fried cream and strawberries, finished in balance that attracts each other's taste.",
"直径195mm/Diameter 195 mm","卵,牛乳,小麦粉/egg,milk,flour","2016/11/08",
"cake.jpg","cake2.jpg","cake3.jpg",
false,"2016/11/08 11:29:00","2016/11/08 11:29:00","直樹製菓/Naoki Confectionery"
),(
"ブラン・アンジュ/Bran Anjou","お勧めケーキ/Recommendation Cake","5500",
"新鮮な上質のクリームチーズを数種、オリジナルレシピでブレンド。
/Several fresh, fine cream cheese, blended with original recipe.",
"直径210mm/Diameter 210 mm","卵,牛乳/egg,milk","2016/11/09",
"cheese.jpg","cheese2.jpg","cheese3.jpg",
false,"2016/11/08 13:19:00","2016/11/08 13:28:00","森長製菓株式会社/Morinaga Seika Co., Ltd."
),(
"フォレ・ノワール/Fore Noir","お勧めケーキ/Recommendation Cake","4500",
"2種類のアイスをチョコクリームでコーティング。
/Coat 2 types of ice with chocolate cream.",
"直径210mm/Diameter 210 mm","卵,牛乳.小麦粉/egg,milk,flour","2016/11/08",
"choco.jpg","choco2.jpg","choco3.jpg",
false,"2016/11/08 14:29:00","2016/11/08 14:38:00","シュトレーゼ/Chaterase"
),(
"ベルド・ソリレ/Berd Sorile","お勧めケーキ/Recommendation Cake","4800",
"チーズタルトに、秋冬にふさわしいウィリアム・ポワールやリンゴのプレザーブ（シロップ煮）など、8種類のフルーツを飾った華やかなタルトです。
/It is a gorgeous tart decorating eight kinds of fruits, including cheese tart, William Poir suitable for fall and winter and apple's preserve (syrup boiled).",
"直径200mm/Diameter 200 mm","卵,牛乳.小麦粉/egg,milk,flour","2016/11/08",
"fruit.jpg","fruit2.jpg","fruit3.jpg",
false,"2016/11/08 16:29:00","2016/11/08 16:38:00","ジャンヌアルベル/Jeanne Albert"
),(
"モンブラン/Mont Blanc","お勧めケーキ/Recommendation Cake","5900",
"アーモンドの入ったスポンジにラム酒のシロップを染み込ませ、濃厚なマロンクリームの内側には、生クリーム、バニラビーンズの入ったたっぷりのカ スタード、マロングラッセ、更にマロンクリームを閉じ込めた、モンブラン好きにはたまらないスイーツです。
/Immersed a sponge containing almonds with a syrup of rum, and inside the rich marron cream was confined a plenty of mustard with fresh cream, vanilla beans, malon glace and further malon cream, like Mont Blanc It is irresistible sweets.",
"直径165mm/Diameter 165 mm","卵,牛乳.小麦粉/egg,milk,flour","2016/11/08",
"montblanc.jpg","montblanc2.jpg","montblanc3.jpg",
false,"2016/11/08 15:29:00","2016/11/08 15:38:00","アディドス/Adidos"
),(
"ルリシュワール/Lulishwar","スタンダードケーキ/Standard Cake","5800",
"ふわふわスポンジ、乳味ゆたかな生クリームと苺、それぞれのおいしさを引き立合うバランスで仕上げました。
/Fluffy sponge, milky cream Fried cream and strawberries, finished in balance that attracts each other's taste.",
"直径195mm/Diameter 195 mm","卵,牛乳,小麦粉/egg,milk,flour","2016/11/08",
"cake.jpg","cake2.jpg","cake3.jpg",
false,"2016/11/08 11:29:00","2016/11/08 11:29:00","直樹製菓/Naoki Confectionery"
),(
"ブラン・アンジュ/Bran Anjou","スタンダードケーキ/Standard Cake","5500",
"新鮮な上質のクリームチーズを数種、オリジナルレシピでブレンド。
/Several fresh, fine cream cheese, blended with original recipe.",
"直径210mm/Diameter 210 mm","卵,牛乳/egg,milk","2016/11/09",
"cheese.jpg","cheese2.jpg","cheese3.jpg",
false,"2016/11/08 13:19:00","2016/11/08 13:28:00","森長製菓株式会社/Morinaga Seika Co., Ltd."
),(
"フォレ・ノワール/Fore Noir","スタンダードケーキ/Standard Cake","4500",
"2種類のアイスをチョコクリームでコーティング。
/Coat 2 types of ice with chocolate cream.",
"直径210mm/Diameter 210 mm","卵,牛乳.小麦粉/egg,milk,flour","2016/11/08",
"choco.jpg","choco2.jpg","choco3.jpg",
false,"2016/11/08 14:29:00","2016/11/08 14:38:00","シュトレーゼ/Chaterase"
),(
"ベルド・ソリレ/Berd Sorile","スタンダードケーキ/Standard Cake","4800",
"チーズタルトに、秋冬にふさわしいウィリアム・ポワールやリンゴのプレザーブ（シロップ煮）など、8種類のフルーツを飾った華やかなタルトです。
/It is a gorgeous tart decorating eight kinds of fruits, including cheese tart, William Poir suitable for fall and winter and apple's preserve (syrup boiled).",
"直径200mm/Diameter 200 mm","卵,牛乳.小麦粉/egg,milk,flour","2016/11/08",
"fruit.jpg","fruit2.jpg","fruit3.jpg",
false,"2016/11/08 16:29:00","2016/11/08 16:38:00","ジャンヌアルベル/Jeanne Albert"
),(
"モンブラン/Mont Blanc","スタンダードケーキ/Standard Cake","5900",
"アーモンドの入ったスポンジにラム酒のシロップを染み込ませ、濃厚なマロンクリームの内側には、生クリーム、バニラビーンズの入ったたっぷりのカ スタード、マロングラッセ、更にマロンクリームを閉じ込めた、モンブラン好きにはたまらないスイーツです。
/Immersed a sponge containing almonds with a syrup of rum, and inside the rich marron cream was confined a plenty of mustard with fresh cream, vanilla beans, malon glace and further malon cream, like Mont Blanc It is irresistible sweets.",
"直径165mm/Diameter 165 mm","卵,牛乳.小麦粉/egg,milk,flour","2016/11/08",
"montblanc.jpg","montblanc2.jpg","montblanc3.jpg",
false,"2016/11/08 15:29:00","2016/11/08 15:38:00","アディドス/Adidos"
);
