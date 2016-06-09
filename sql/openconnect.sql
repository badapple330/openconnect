DROP DATABASE IF EXISTS openconnect;  /* DBを消す */
CREATE DATABASE openconnect;  /* DBを作る */

/* 一旦消して再度作ることでデータの重複を防ぐ */

use openconnect;  /* DBを使う */

/* テーブル作成 */
/* ユーザー */
create table user (  /* ユーザーのテーブルを作る */
id int(10) NOT NULL AUTO_INCREMENT,  /* ユーザーに番号を割り振る、自動連番 */
user_id varchar(30),  /* ユーザーID、ログインに使用 */
user_name varchar(50),  /* ユーザー名、使用する人の名前 */
password varchar(50),  /* ログイン用パスワード */
PRIMARY KEY (id)  /* 番号が優先される */
);

/* サイト一覧 */
create table site(  /* サイトのテーブルを作る */
id int(10) NOT NULL AUTO_INCREMENT,  /* サイトに番号を割り振る、自動連番 */
name varchar(50),  /* サイトの名前 */
url varchar(255),  /* サイトのURL */
PRIMARY KEY (id)  /* 番号が優先される */
);

/* カレッジ生名簿 */
create table students(  /* 名簿のテーブルを作る */
number varchar(5),  /* 管理番号、0001からスタート */
name varchar(50),  /* 名前、漢字で入力、姓と名の間は半角スペースを入れる */
symbol varchar(50),  /* ふりがな、ひらがなで入力、姓と名の間は半角スペースを入れる */
entrance varchar(10)  /* 入講年月、例：201604 */
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
insert into user(user_id, user_name, password)
values("testuser","テストユーザー","12345678"),
("takuma.inoue","井上琢磨","internous01"),
("miyuki.harada","原田美由貴","internous01");

/* サイト一覧 */
insert into site(name,url)
values("YouJustJewelry","http://www.internousdev.com:8080/YouJustJewelry/"),
("solare","http://www.internousdev.com:8080/solare/"),
("UESTO","http://www.internousdev.com:8080/UESTO/"),
("WorldTravel","http://www.internousdev.com:8080/WorldTravel/"),
("gpscoffee","http://www.internousdev.com:8080/gpscoffee/"),
("la-poupee","http://www.internousdev.com:8080/la-poupee/");

/* カレッジ生一覧 */
insert into students(number,name,symbol,entrance)
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
("0031","倉地 将吾","くらち しょうご","201605");
