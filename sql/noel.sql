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
 * 店舗名 = store_name
 */

create table item(
item_id int not null primary key auto_increment,
item_name varchar(100) not null,
item_category varchar(50) not null,
price int not null,
overview text not null,
size varchar(100) not null,
allergy varchar(100) not null,
sales_period date not null,
img_address001 text not null,
img_address002 text not null,
img_address003 text not null,
delete_flg boolean not null default false,
registration_date datetime not null,
updated_date datetime not null,
company_name varchar(100) not null,
store_name varchar(100) not null
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

/*商品の追加１５件
 * おすすめ＆スタンダード＆季節を５件ずつ
 * 追加致しました。
 * 入力の有無確認済み by れお
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
company_name,
store_name
)values(

"ルリシュワール/Lulishwar","スタンダードケーキ/Standard Cake","5800",
"ふわふわスポンジ、乳味ゆたかな生クリームと苺、それぞれのおいしさを引き立合うバランスで仕上げました。
/Fluffy sponge, milky cream Fried cream and strawberries, finished in balance that attracts each other's taste.",
"直径195mm/Diameter 195 mm","卵,牛乳,小麦粉/egg,milk,flour","2016/11/08",
"cake.jpg","cake2.jpg","cake3.jpg",
false,"2016/11/08 11:29:00","2016/11/08 11:29:00","直樹製菓/Naoki Confectionery","直樹製菓/Naoki Confectionery"
),(
"ブラン・アンジュ/Bran Anjou","スタンダードケーキ/Standard Cake","5500",
"新鮮な上質のクリームチーズを数種、オリジナルレシピでブレンド。
/Several fresh, fine cream cheese, blended with original recipe.",
"直径210mm/Diameter 210 mm","卵,牛乳/egg,milk","2016/11/09",
"cheese.jpg","cheese2.jpg","cheese3.jpg",
false,"2016/11/08 13:19:00","2016/11/08 13:28:00","森長製菓株式会社/Morinaga Seika Co., Ltd.","森長製菓株式会社/Morinaga Seika Co., Ltd."
),(
"フォレ・ノワール/Fore Noir","スタンダードケーキ/Standard Cake","4500",
"2種類のアイスをチョコクリームでコーティング。
/Coat 2 types of ice with chocolate cream.",
"直径210mm/Diameter 210 mm","卵,牛乳.小麦粉/egg,milk,flour","2016/11/08",
"choco.jpg","choco2.jpg","choco3.jpg",
false,"2016/11/08 14:29:00","2016/11/08 14:38:00","シュトレーゼ/Chaterase","シュトレーゼ/Chaterase"
),(
"ベルド・ソリレ/Berd Sorile","スタンダードケーキ/Standard Cake","4800",
"チーズタルトに、秋冬にふさわしいウィリアム・ポワールやリンゴのプレザーブ（シロップ煮）など、8種類のフルーツを飾った華やかなタルトです。
/It is a gorgeous tart decorating eight kinds of fruits, including cheese tart, William Poir suitable for fall and winter and apple's preserve (syrup boiled).",
"直径200mm/Diameter 200 mm","卵,牛乳.小麦粉/egg,milk,flour","2016/11/08",
"fruit.jpg","fruit2.jpg","fruit3.jpg",
false,"2016/11/08 16:29:00","2016/11/08 16:38:00","ジャンヌアルベル/Jeanne Albert","ジャンヌアルベル/Jeanne Albert"
),(
"モンブラン/Mont Blanc","スタンダードケーキ/Standard Cake","5900",
"アーモンドの入ったスポンジにラム酒のシロップを染み込ませ、濃厚なマロンクリームの内側には、生クリーム、バニラビーンズの入ったたっぷりのカ スタード、マロングラッセ、更にマロンクリームを閉じ込めた、モンブラン好きにはたまらないスイーツです。
/Immersed a sponge containing almonds with a syrup of rum, and inside the rich marron cream was confined a plenty of mustard with fresh cream, vanilla beans, malon glace and further malon cream, like Mont Blanc It is irresistible sweets.",
"直径165mm/Diameter 165 mm","卵,牛乳.小麦粉/egg,milk,flour","2016/11/08",
"montblanc.jpg","montblanc2.jpg","montblanc3.jpg",
false,"2016/11/08 15:29:00","2016/11/08 15:38:00","アディドス/Adidos","アディドス/Adidos"
),(
"カシスとミルクチョコレートのアイスケーキ/Cassis and milk chocolate ice cake","おすすめケーキ/Recommendation Cake","4450",
"さわやかな酸味のカシスムースの中にコクのあるミルクチョコのムースをいれました。
/I put a mousse milk chocolate mousse in a crisp mousse with refreshing acidity.",
"5号 15cm（お召し上がり目安3〜5名様）/No. 5 15 cm (3 to 5 persons per serving)","卵,牛乳.小麦粉/egg,milk,flour","2016/11/10",
"casischoco1.jpg","casischoco2.jpg","casischoco3.jpg",
false,"2016/11/10 14:30:00","2016/11/10 14:33:00","菓子工房オカダ/Confectionery Factory Okada","菓子工房オカダ/Confectionery Factory Okada"
),(
"生チョコフルーツデコレーション/Raw chocolate fruit decoration","おすすめケーキ/Recommendation Cake","5019",
"自慢のココアスポンジ生地に、良質のチョコレートを混ぜ込んだ生クリームを使用しました。そして、飾りにはたっぷりのフルーツを乗せました。
/We used fresh cream mixed with high quality chocolate in our cocoa sponge fabric. And I put plenty of fruit on the decoration.",
"6号 直径18cm(お召し上がり目安4〜6名様）/No. 6 diameter 18 cm (for eating 4 to 6 people)","卵,牛乳.小麦粉/egg,milk,flour","2016/11/11",
"chocofruit1.jpg","chocofruit2.jpg","chocofruit3.jpg",
false,"2016/11/11 14:30:00","2016/11/11 14:33:00","ケーキ工房　ミラベル/Cake Studio Mirabell","ケーキ工房　ミラベル/Cake Studio Mirabell"
),(
"パーティ用ショートケーキ/Short cake for parties","おすすめケーキ/Recommendation Cake","16000",
"パーティ用で特大サイズのふわふわスポンジ、乳味ゆたかな生クリームと苺、それぞれのおいしさを引き立合うバランスで仕上げました。
/Large size fluffy sponge for party use, milky cream and cream and strawberries, finished in balance that attracts each other's deliciousness.",
"21×21×8cm（お召し上がり目安20名様前後)/21 × 21 × 8 cm (standard for taking around 20 people)","卵,牛乳.小麦粉/egg,milk,flour","2016/11/12",
"party1.jpg","party2.jpg","party3.jpg",
false,"2016/11/12 14:30:00","2016/11/12 14:33:00","有限会社 タカヤナイ/Takayanai limited company","有限会社 タカヤナイ/Takayanai limited company"
),(
"チェリーのレアチーズケーキ/Cherry's rare cheesecake","おすすめケーキ/Recommendation Cake","4436",
"北海道産のクリームチーズと純生クリームをたっぷり使用したレアチーズケーキです。チェリーの酸味がアクセント！濃厚なのに、後味さわやか！クリームチーズの味がしっかり楽しめ、ごちそうの後でもさっぱり召し上がれるケーキです。味に自信あり！
/It is a rare cheesecake with plenty of Hokkaido cream cheese and purple cream. Acid of cherry accent! Even though it is rich, the aftertaste refreshing! You can enjoy the taste of cream cheese firmly, it is a cake that you can have after all a refreshing cake. I have confidence in the taste!",
"4号 12cm（お召し上がり目安2〜3名様)/No. 4 12cm (2 to 3 persons per serving)","卵,牛乳.小麦粉/egg,milk,flour","2016/11/11",
"cherrycheese1.jpg","cherrycheese2.jpg","cherrycheese3.jpg",
false,"2016/11/11 14:33:00","2016/11/11 14:53:00","洋菓子カフェかしこ/Confectionary Cafe","洋菓子カフェかしこ/Confectionary Cafe"
),(
"ベリー×ベリーケーキ/Berry × Berry cake","おすすめケーキ/Recommendation Cake","5500",
"ラフィネクリーム（チーズベース）の上を６種類のたっぷりベリーで飾った甘酸っぱいベリータルトです。
/It is a sweet and sour berry tart decorated with six kinds of plenty of berries on the top of the raffinate cream (cheese base).",
"5号 15cm(お召し上がり目安3〜5名様)/No. 5 15cm (3 to 5 persons per serving)","卵,牛乳.小麦粉/egg,milk,flour","2016/11/12",
"casischoco1.jpg","casischoco2.jpg","casischoco3.jpg",
false,"2016/11/12 12:30:00","2016/11/13 11:33:00","パティスリー　アン・スリール/Patisserie Anne ・ Sriel","パティスリー　アン・スリール/Patisserie Anne ・ Sriel"
),(
"ラズピスマス/raspberry×pistachio Christmascake","季節のケーキ/Seasonal Cake","5200",
"風味豊かなピスタチオ生地とラズベリーの爽やかな甘さが相性の良いクリスマスケーキです☆
/Christmas cake with compatible flavorful pistachio dough and refreshing sweetness of raspberry ☆",
"縦13cm 横25cm/Vertical 13cm width 25cm","卵,牛乳.小麦粉/egg,milk,flour","2016/11/12",
"xmas1.jpg","xmas2.jpg","xmas3.jpg",
false,"2016/11/12 11:30:00","2016/11/12 17:33:00","Souvenir-スブニール-/-Souvenir-","Souvenir-スブニール-/-Souvenir-"
),(
"ノエル　クーヘン/Noel Kuchen","季節のケーキ/Seasonal Cake","3200",
"バニラ風味のしっとりバームクーヘンをクリスマス飾りでにデコレーションしたかわいいケーキです☆
/It is a cute cake decorated with moisturizing Vanilla flavored Balmucuchen with Christmas decorations ☆",
"4号 12cm（お召し上がり目安3〜5名様)/No. 4 12cm(3 to 5 persons dining standard)","卵,牛乳.小麦粉/egg,milk,flour","2016/11/13",
"baumnoel1.jpg","baumnoel2.jpg","baumnoel3.jpg",
false,"2016/11/13 11:30:00","2016/11/13 17:33:00","Souvenir-スブニール-/-Souvenir-","Souvenir-スブニール-/-Souvenir-"
),(
"クリスマスプレミアムクラシックショコラ/Christmas premium classic chocolat","季節のケーキ/Seasonal Cake","4500",
"スペイン産のチョコを使用したチョコ好きにおすすめのプレミアムクラシックショコラです。
/It is a premium classic chocolate recommended for chocolate lovers who used chocolate from Spain.",
"5号 15cm（お召し上がり目安3～5名様)/No. 5 15cm(3 to 5 persons dining standard)","卵,牛乳.小麦粉/egg,milk,flour","2016/11/10",
"chocoxmas1.jpg","chocoxmas2.jpg","chocoxmas3.jpg",
false,"2016/11/10 10:30:00","2016/11/11 13:33:00","パティスリーテロワール/Patisserie terroir","パティスリーテロワール/Patisserie terroir"
),(
"バニラとチョコの極上ブッシュ・ド・ノエル/Vanilla and chocolate finest bush de noel","季節のケーキ/Seasonal Cake","4320",
"こだわりのいちご入り濃厚バニラクリーム♪自信作の2016年バージョン。
/Sticking strawberry-enriched thick vanilla cream ♪ 2016 version of self-confidence.",
"長さ18cm×9cm（お召し上がり目安4～6名様)/Length 18 cm × 9 cm(4 to 6 persons dining standard)","卵,牛乳.小麦粉/egg,milk,flour","2016/11/12",
"vanilanoel1.jpg","vanilanoel2.jpg","vanilanoel3.jpg",
false,"2016/11/12 12:30:00","2016/11/12 18:30:00","有限会社 タカヤナイ/Takayanai limited company","有限会社 タカヤナイ/Takayanai limited company"
),(
"クリスマスモンブラン/Christmas Mont Blanc","季節のケーキ/Seasonal Cake","3500",
"京マロンとカスタードクリームたっぷりのコポーのクリスマスケーキはいかがでしょうか。
/How about Christmas cake with Kyoto Maron and custard cream plenty of Kopoh?",
"5号 15cm（お召し上がり目安3～5名様)/No. 5 15 cm (3 ~ 5 persons' standard)","卵,牛乳.小麦粉/egg,milk,flour","2016/11/11",
"vanilanoel1.jpg","vanilanoel2.jpg","vanilanoel3.jpg",
false,"2016/11/11 10:20:00","2016/11/12 15:31:00","コポー洋菓子店/Kopoh bakery shop","コポー洋菓子店/Kopoh bakery shop"
);