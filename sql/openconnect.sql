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
password varchar(255) not null,   /* ユーザーのログイン用パスワード */
name varchar(255) default "　",  /* ユーザー名 */
name_f varchar(255) default "　",  /* ユーザー名(ふりがな) */
postal varchar(255) not null default "　",/*郵便番号*/
address varchar(255) not null default "　",/*住所*/
tel_number varchar(255) not null default "　",/*電話番号*/
email varchar(255) not null unique,/*メールアドレス*/
sex varchar(10) not null default "　",/*性別*/
birthday date not null default 00000000,/*生年月日*/
handle_name varchar(16),
register_day datetime not null default 00000000000000,/*登録日*/
update_day datetime not null default 00000000000000,/*更新日*/
userdel_flg boolean not null default FALSE,/*退会フラグ*/
login_flg boolean not null default TRUE,/*ログインフラグ*/
user_flg int not null default 1,/*ユーザーを判別するフラグ 1.一般ユーザー 2.管理者 3.テストユーザー 4.出品者*/
PRIMARY KEY (user_id)  /* idの重複、null禁止 */
);


/* サイト一覧 */
create table site(  /* サイトのテーブルを作る */
site_id int not null auto_increment,  /* サイトに番号を割り振る、自動連番 */
site_name varchar(30) not null,  /* サイトの名前 */
site_url varchar(255) not null unique,/* サイトのURL */
site_article text not null,/*site_article text not null,サイトの記事*/
genre varchar(30),/*site_group varchar(30),グループ*/
picture varchar(255),/*picture varchar(255),画像*/
banner varchar(80), /*banner varchar(80) not null,バナー*/
PRIMARY KEY (site_id)  /* idの重複、null禁止 */
);

/*権限マスター*/
create table master(
level_id int not null,
level_name varchar(10) not null
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
/* ユーザー 一覧 / ユーザーID/パスワード/ユーザー名/ユーザー名(ふりがな)/郵便番号/住所/電話番号/メールアドレス/性別/生年月日/登録日/更新日/退会フラグ/ログインフラグ/ユーザーフラグ*/
insert into user(user_id,password,name,name_f,postal,address,tel_number,email,sex,birthday,handle_name,register_day,update_day,userdel_flg,login_flg,user_flg)values
(1,"testuser","インターノウス株式会社プログラマカレッジ　テストユーザー","いんたーのうすかぶしきがいしゃぷろぐらまかれっじ　てすとゆーざー","1130034","東京都文京区湯島3-2-12　御茶ノ水天神ビル","0312345678","internousdev.testuser@gmail.com","男","1993-12-24","testuser","2016-07-01 13:00:00","2016-07-11 12:11:25",FALSE,FALSE,"2"),
(2,"internous01","井上琢磨","いのうえたくま","1130034","東京都文京区湯島3-2-12　御茶ノ水天神ビル","09012341234","t.inoue@internous.co.jp","男","1990-09-25","takuma.inoe","2016-07-01 13:00:00","2016-07-11 13:54:20",FALSE,FALSE,"2"),
(3,"internous01","原田美由貴","はらだみゆき","1130034","東京都文京区湯島3-2-12　御茶ノ水天神ビル","09045674567","m.harada@internous.co.jp","女","1992-05-03","miyuki.harada","2016-07-01 13:00:00","2016-07-11 13:00:00",FALSE,FALSE,"2")
;

/* サイト一覧 / サイト名/URL */
insert into site(site_id, site_name, site_url,site_article,genre,picture,banner)values
(1,"BaseBallTicket","http://www.internousdev.com/baseballTicket/","野球観戦チケットサイト","チケット",null,null),/* BaseBallTicket */
(2,"gekidanroadshow","http://www.internousdev.com/gekidanroadshow/","舞台チケット予約サイト","チケット",null,null),/* gekidanroadshow */
(3,"ichigoichie","http://www.internousdev.com/ichigoichie/","着物レンタルサイト","レンタル",null,null),/* ichigoichie */
(4,"chocotime","http://www.internousdev.com/chocotime/","チョコレート販売サイト","グルメ",null,null),/* chocotime */
(5,"kinnosawa","http://www.internousdev.com/kinnosawa/","和菓子販売サイト","グルメ",null,null),/* kinnosawa */
(6,"kuruyama","http://www.internousdev.co/kuruyama/","ラーメン販売サイト","グルメ",null,null);/* kuruyama */

/*権限マスター / 権限レベルID/権限レベル名*/
insert into master(level_id,level_name)value
(1,"ユーザー"),
(2,"管理者"),
(3,"テストユーザー"),
(4,"出品者");


/* カレッジ生一覧 / 管理番号/名前/なまえ/入講年月 */
insert into students(number,name,symbol,entrance) values
("0001","小西 瞬","こにし しゅん","201604"),
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