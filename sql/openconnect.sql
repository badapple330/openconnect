/* @auther SHIORI OYAMA
 * @since 20160623
 * @version 1.2
 */

DROP DATABASE IF EXISTS openconnect;  /* DBを消す */
CREATE DATABASE openconnect;  /* DBを作る */

/* 一旦消して再度作ることでデータの重複を防ぐ */

use openconnect;  /* DBを使う */

/* テーブル作成 */
/* ユーザー */
create table user (  /* ユーザーのテーブルを作る */
user_id int not null auto_increment,  /* ユーザーに番号を割り振る、自動連番 */
password varchar(16) not null,   /* ユーザーのログイン用パスワード */
name varchar(10),  /* ユーザー名、使用する人の名前 */
name_f varchar(20),  /* ユーザー名、使用する人の名前 */
postal varchar(8) not null,
address varchar(30) not null,
tel_number varchar(12) not null,
email varchar(40) not null unique,
sex varchar(2) not null,
birthday date not null,
register_day datetime not null,
update_day datetime not null,
userdel_flg boolean not null default FALSE,
login_flg boolean not null default FALSE,
user_flg int not null,
PRIMARY KEY (user_id)  /* idの重複、null禁止 */
);

/* サイト一覧 */
create table site(  /* サイトのテーブルを作る */
site_id varchar(20) not null ,  /* サイトに番号を割り振る、自動連番 */
site_name varchar(30) not null,  /* サイトの名前 */
site_url varchar(255) not null unique,/* サイトのURL */
site_article text not null,/*サイトの記事*/
site_group varchar(30) not null,/*グループ*/
picture varchar(255),/*画像*/
banner varchar(80) not null,/*バナー*/
PRIMARY KEY (site_id)  /* idの重複、null禁止 */
);

/*権限マスター*/
create table master(
level_id int not null,
level_name varchar(10) not null,
);

/* カレッジ生名簿 */
create table students(  /* 名簿のテーブルを作る */
number varchar(5),  /* 管理番号、0001からスタート */
name varchar(50),  /* 名前、漢字で入力、姓と名の間は半角スペースを入れる */
symbol varchar(50),  /* ふりがな、ひらがなで入力、姓と名の間は半角スペースを入れる */
entrance varchar(10),  /* 入講年月、例：201604 */
PRIMARY KEY (number)  /* 管理番号の重複、null禁止 */
);

/* 遅刻登録 */
create table tikoku(  /* 遅刻登録のテーブルを作る */
number varchar(5),  /* 管理番号 名簿に登録されている番号 */
name varchar(50),  /* 名前 名簿に登録されている名前 */
reason varchar(50)  /* 遅刻の理由 */
);

/* 欠席登録 */
create table kesseki(  /* 欠席登録のテーブルを作る */
number varchar(5),  /* 管理番号 名簿に登録されている番号 */
name varchar(50),  /* 名前 名簿に登録されている名前 */
reason varchar(50)  /* 欠席の理由 */
);

/* 面談登録 */
create table mendan(  /* 面談登録のテーブルを作る */
number varchar(5),  /* 管理番号 名簿に登録されている番号 */
name varchar(50),  /* 名前 名簿に登録されている名前 */
time varchar(6)  /* 面談の開始時間 */
);

/* 出席登録 */
create table syusseki(  /* 出席登録のテーブルを作る */
number varchar(5),  /* 管理番号 名簿に登録されている番号 */
name varchar(50)  /* 名前 名簿に登録されている名前 */
);

/* データ登録 */
/* ユーザー一覧 */
insert into user(user_id, user_name, password)  /* ユーザーID/名前/パスワード */
values("testuser","テストユーザー","12345678"),
("takuma.inoue","井上琢磨","internous01"),
("miyuki.harada","原田美由貴","internous01");

/* サイト一覧 */
insert into site(name,url)  /* サイト名/URL */
values("YouJustJewelry","http://www.internousdev.com:8080/YouJustJewelry/"), /* YOU JUST JEWELRY */
("solare","http://www.internousdev.com:8080/solare/"), /* solare */
("UESTO","http://www.internousdev.com:8080/UESTO/"), /* UEST */
("WorldTravel","http://www.internousdev.com:8080/WorldTravel/"), /* WorldTravel */
("gpscoffee","http://www.internousdev.com:8080/gpscoffee/"), /* gpscoffee */
("la-poupee","http://www.internousdev.com:8080/la-poupee/"); /* la-poupee */

/* カレッジ生一覧 */
insert into students(number,name,symbol,entrance)  /* 管理番号/名前/なまえ/入講年月 */
values("0001","小西 瞬","こにし しゅん","201604"),
("0002","高野 由佳","たかの ゆか","201604"),
("0003","村上 俊一","むらかみ しゅんいち","201604"),
("0004","山田 晃大","やまだ あきひろ","201604"),
("0005","冨澤 正樹","とみざわ まさき","201604"),
("0006","安孫子 春菜","あびこ はるな","201604"),
("0007","江森 壮汰","えもり そうた","201604"),
("0008","大山 汐莉","おおやま しおり","201604"),
("0009","宮上 京介","みやがみ きょうすけ","201604"),
("0010","中村 匠吾","なかむら しょうご","201604"),
("0011","島 一成","しま かずなり","201604"),
("0012","奥平 拡規","おくだいら ひろき","201604"),
("0013","西脇 隼平","にしわき じゅんぺい","201604"),
("0014","加藤 英樹","かとう ひでき","201604"),
("0015","森田 直美","もりた なおみ","201605"),
("0016","工藤 秀樹","くどう ひでき","201605"),
("0017","水野 雄斗","みずの ゆうと","201605"),
("0018","斎藤 雄星","さいとう ゆうせい","201605"),
("0019","中島 竜太郎","なかじま りゅうたろう","201605"),
("0020","高橋 裕也","たかはし ゆうや","201605"),
("0021","永井 考樹","ながい こうき","201605"),
("0022","古瀬 諒","ふるせ りょう","201605"),
("0023","鈴木 博義","ふるせ りょう","201605"),
("0024","新保 裕一","しんぼ ゆういち","201605"),
("0025","石鉢 翔太郎","いしのはちしょうたろう","201605"),
("0026","岡野 真生","おかの まいき","201605"),
("0027","相澤 弘二","あいざわ こうじ","201605"),
("0028","工藤 祐介","くどう ゆうすけ","201605"),
("0029","渡邉 悟志","わたなべ さとし","201605"),
("0030","渡辺 優也","わたなべ ゆうや","201605"),
("0031","倉地 将吾","くらち しょうご","201605"),
("0032","永井 慎二","ながい しんじ","201606"),
("0033","垣下 瑞美","かきした たまみ","201606"),
("0034","吉原 亮","よしはら りょう","201606"),
("0035","前田 優樹","まえだ ゆうき","201606"),
("0036","朝 正樹","あさ まさき","201606"),
("0037","宮原 イアン","みやはら いあん","201606"),
("0038","木村 紳一郎","きむら しんいちろう","201606"),
("0039","只野 天馬","ただの てんま","201606"),
("0040","豊田 正信","とよた まさのぶ","201606"),
("0041","中田 咲季","なかた さき","201606"),
("0042","瀧澤 裕","たきざわ ゆう","201606"),
("0043","秋月 絵里香","あきづき えりか","2016106"),
("0044","川内谷 優輝","かわうちや ゆうき","201606"),
("0045","池上 朋希","いけがみ ともき","201606"),
("0046","大塚 美沙姫","おおつか みさき","201606"),
("0047","中田 拓郎","なかだ たくろう","201606"),
("0048","藤本 徳美","ふじもと めぐみ","201606"),
("0049","丸井 優吾","まるい ゆうご","201606"),
("0050","古長 三四郎","こちょう さんしろう","201606")
;/* 管理番号は自動連番ではないため、0を含めた数字を手入力する。
* 番号がいっぱいになった時は0001から入力していき、必要ないものは極力消去すること。 */