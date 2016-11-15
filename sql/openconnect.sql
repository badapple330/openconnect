set names utf8;
DROP DATABASE IF EXISTS openconnect;
CREATE DATABASE openconnect;

/* 一旦消して再度作ることでデータの重複を防ぐ */

use openconnect;

/* 過去のユーザーテーブル 2016/08/31まで */

/* ユーザー情報登録 *
 * ユーザーID = user_id
 * パスワード = password
 * 名前 = name
 * 名前(ふりがな) = name_f
 * 郵便番号 = postal
 * 住所 = address
 * 電話番号 = tel_number
 * メールアドレス = email
 * 性別 = sex
 * 生年月日 = birthday
 * ハンドルネーム = handle_name
 * 登録日 = register_day
 * 更新日 = update_day
 * 退会フラグ = userdel_flg
 * ログインフラグ = login_flg
 * ユーザーフラグ = user_flg
 */
create table user (
user_id int not null auto_increment comment 'ユーザーID',
password varchar(255) not null comment 'パスワード',
name varchar(255) default "　" comment '名前',
name_f varchar(255) default "　" comment '名前(ふりがな)',
postal varchar(255) not null default "　" comment '郵便番号',
address varchar(255) not null default "　" comment '住所',
tel_number varchar(255) not null default "　" comment '電話番号',
email varchar(255) not null unique comment 'メールアドレス',
sex varchar(10) not null default "　" comment '性別',
birthday date not null default 00000000 comment '誕生日',
handle_name varchar(16) comment 'ハンドルネーム',
register_day datetime not null default 00000000000000 comment '登録日',
update_day datetime not null default 00000000000000 comment '更新日',
userdel_flg boolean not null default FALSE comment '退会フラグ',
login_flg boolean not null default TRUE comment 'ログインフラグ',
user_flg int not null default 1 comment 'ユーザーフラグ',
PRIMARY KEY (user_id)
)comment = 'ユーザー情報格納テーブル';

/* データ登録 */
/* ユーザー 一覧 / ユーザーID/パスワード/ユーザー名/ユーザー名(ふりがな)/郵便番号/住所/電話番号/メールアドレス/性別/生年月日/登録日/更新日/退会フラグ/ログインフラグ/ユーザーフラグ*/
insert into user(user_id,password,name,name_f,postal,address,tel_number,email,sex,birthday,handle_name,register_day,update_day,userdel_flg,login_flg,user_flg)values
(1,"testuser","インターノウス株式会社プログラマカレッジ　テストユーザー","いんたーのうすかぶしきがいしゃぷろぐらまかれっじ　てすとゆーざー","1130034","東京都文京区湯島3-2-12　御茶ノ水天神ビル","0312345678","internousdev.testuser@gmail.com","男","1993-12-24","testuser","2016-07-01 13:00:00","2016-07-11 12:11:25",FALSE,FALSE,"2"),
(2,"internous01","井上琢磨","いのうえたくま","1130034","東京都文京区湯島3-2-12　御茶ノ水天神ビル","09012341234","t.inoue@internous.co.jp","男","1990-09-25","takuma.inoe","2016-07-01 13:00:00","2016-07-11 13:54:20",FALSE,FALSE,"2"),
(3,"internous01","原田美由貴","はらだみゆき","1130034","東京都文京区湯島3-2-12　御茶ノ水天神ビル","09045674567","m.harada@internous.co.jp","女","1992-05-03","miyuki.harada","2016-07-01 13:00:00","2016-07-11 13:00:00",FALSE,FALSE,"2")
;

/* 新しいユーザーテーブル 2016/09/01から */

/* ユーザー情報登録 *
 * ユーザーID = user_id
 * パスワード = password
 * 姓 = last_name
 * 姓(ふりがな) = last_name_f
 * 名 = first_name
 * 名(ふりがな) = first_name_f
 * 郵便番号 = postal
 * 住所 = address
 * 電話番号 = tel_number
 * メールアドレス = email
 * 性別 = sex
 * 生年月日 = birthday
 * ハンドルネーム = handle_name
 * 登録日 = register_day
 * 更新日 = update_day
 * 退会フラグ = userdel_flg
 * ログインフラグ = login_flg
 * ユーザーフラグ = user_flg
 * 受講年 = year
 * 受講開始月 = month
 */
create table users (
user_id int primary key not null auto_increment comment 'ユーザーID',
password varchar(255)  comment 'パスワード',
family_name varchar(50) not null default "" comment '姓(英語)',
given_name varchar(50) not null default "" comment '名(英語)',
family_name_kanji varchar(50) not null default "" comment '姓(漢字)',
family_name_kana varchar(50) not null default "" comment '姓(ふりがな)',
given_name_kanji varchar(50) not null default "" comment '名(漢字)',
given_name_kana varchar(50) not null default "" comment '名(ふりがな)',
postal varchar(255) default "" comment '郵便番号',
address varchar(255) default "" comment '住所',
phone_number varchar(255) default "" comment '電話番号',
phone_email varchar(255)  unique comment 'メールアドレス',
mobile_number varchar(255) default "" comment '携帯電話番号',
mobile_email varchar(255) unique comment '携帯メールアドレス',
sex varchar(10) not null default "" comment '性別',
birthday date default 00000000 comment '誕生日',
register_day datetime default 00000000000000 comment '登録日',
update_day datetime default 00000000000000 comment '更新日',
userdel_flg boolean default FALSE comment '退会フラグ',
login_flg boolean default TRUE comment 'ログインフラグ',
user_flg int not null default 1 comment 'ユーザーフラグ',
year varchar(4) comment '受講年',
month varchar(2) comment '受講開始月',
oauth_id varchar(255) comment 'OAuthID',
oauth_name int comment 'OAuth名',
oauth_account varchar(100) comment'OAuthアカウント'
)comment = 'ユーザー情報格納テーブル';

/* ユーザー 一覧 / ユーザーID/パスワード/ユーザー名/ユーザー名(ふりがな)/郵便番号/住所/電話番号/メールアドレス/性別/生年月日/登録日/更新日/退会フラグ/ログインフラグ/ユーザーフラグ*/
insert into users()values
('1','testuser','test','user','テスト','てすと','ユーザー','ゆーざー','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test@gmail.com','09012345678','user.test@ne.jp','男','1993-12-24','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','04'),
('2','internous01','inoue','takuma','井上','いのうえ','琢磨','たくま','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','takuma.inoue@gmail.com','09012345678','takuma.inoue@ne.jp','男','1990-09-25','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'3','2010','04'),
('3','internous01','harada','miyuki','原田','はらだ','美由貴','みゆき','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','miyuki.harada@gmail.com','09012345678','miyuki.harada@ne.jp','女','1992-05-03','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'3','2010','04'),
('4','leader11','test','leader1','テスト','てすと','リーダー1','りーだー1','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','leader1.test@gmail.com','09012345678','leader1.test@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'2','2016','04'),
('5','leader22','test','leader2','テスト','てすと','リーダー2','りーだー2','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','leader2.test@gmail.com','09012345678','leader2.test@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'2','2016','04'),
('6','student1','nitabaru','kouhei','仁田原','にたばる','耕平','こうへい','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','kouhei.nitabaru@gmail.com','09012345678','kouhei.nitabaru@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','07'),
('7','student2','itou','tatsuhumi','伊藤','いとう','竜文','たつふみ','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','tatsuhumi.itou@gmail.com','09012345678','tatsuhumi.itou@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','07'),
('8','student3','sunakawa','minori','砂川','すなかわ','みのり','みのり','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','minori.sunakawa@gmail.com','09012345678','minori.sunakawa@ne.jp','女','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','07'),
('9','student4','keduka','masahiro','毛塚','けづか','正広','まさひろ','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','masahiro.keduka@gmail.com','09012345678','masahiro.keduka@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08'),
('10','student5','horiguchi','kennichi','堀口','ほりぐち','謙一','けんいち','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','kennichi.horiguchi@gmail.com','09012345678','kennichi.horiguchi@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08'),
('11','student6','kiryuu','youichi','霧生','きりゅう','雄一','ゆういち','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','yuuichi.kiryuu@gmail.com','09012345678','yuuichi.kiryuu@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08'),
('12','student7','hoshi','tatsuya','星','ほし','達也','たつや','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','tatsuya.hoshi@gmail.com','09012345678','tatsuya.hoshi@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08'),
('13','student8','iwamoto','koumei','岩本','いわもと','興明','こうめい','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','koumei.iwamoto@gmail.com','09012345678','koumei.iwamoto@ne.jp','男','1990-04-01','2016-07-01 13:00:00','2016-07-01 13:00:00',FALSE,FALSE,'1','2016','08');

/* サイト一覧情報 */
create table site(
site_id int primary key not null auto_increment comment 'サイトID',
site_name varchar(30) not null comment 'サイト名',
site_url varchar(255) not null unique comment 'サイトURL',
site_article text comment 'サイト記事',
genre varchar(30) comment 'ジャンル',
picture varchar(255) comment '画像',
banner varchar(80) comment 'バナー'
)comment = 'サイト情報格納テーブル';

/* サイト一覧 / サイト名/URL */
insert into site(site_id, site_name, site_url,site_article,genre,picture,banner)values
(1,"BaseBallTicket","http://www.internousdev.com/baseballTicket/","野球観戦チケットサイト","チケット",null,null),/* BaseBallTicketサイト情報 */
(2,"gekidanroadshow","http://www.internousdev.com/gekidanroadshow/","舞台チケット予約サイト","チケット",null,null),/* gekidanroadshowサイト情報 */
(3,"ichigoichie","http://www.internousdev.com/ichigoichie/","着物レンタルサイト","レンタル",null,null),/* ichigoichieサイト情報 */
(4,"chocotime","http://www.internousdev.com/chocotime/","チョコレート販売サイト","グルメ",null,null),/* chocotimeサイト情報 */
(5,"kinnosawa","http://www.internousdev.com/kinnosawa/","和菓子販売サイト","グルメ",null,null),/* kinnosawaサイト情報 */
(6,"kuruyama","http://www.internousdev.com/kuruyama/","ラーメン販売サイト","グルメ",null,null);/* kuruyamaサイト情報 */


/*権限マスター*
 * 権限レベルID = level_id
 * 権限レベル名 = level_name
 */
create table master(
level_id int not null comment '権限レベルID',
level_name varchar(10) not null  comment '権限レベル名'
)comment = '権限マスター情報格納テーブル';

/*権限マスター / 権限レベルID/権限レベル名*/
insert into master(level_id,level_name)value
(1,"ユーザー"),
(2,"管理者"),
(3,"テストユーザー"),
(4,"出品者");

/* カレッジ生名簿 *
 * 管理番号 = number
 * 名前 = name
 * ふりがな = symbol
 * 入講年月 = entrance
 */
create table students(
number varchar(5) comment '管理番号',
name varchar(50) comment '名前',
symbol varchar(50) comment 'ふりがな',
entrance varchar(10) comment '入稿年月',
PRIMARY KEY (number)
) comment = 'カレッジ生情報格納テーブル';

/* 遅刻登録 *
 * 管理番号 = number
 * 名前 = name
 * 遅刻理由 = reason
 */
create table tikoku(
number varchar(5) comment '管理番号',
name varchar(50) comment '名前',
reason varchar(50) comment '遅刻理由'
) comment = '遅刻登録情報格納テーブル';

/* 欠席登録 *
 * 管理番号 = number
 * 名前 = name
 * 欠席理由 = reason
 */
create table kesseki(
number varchar(5) comment '管理番号',
name varchar(50) comment '名前',
reason varchar(50) comment '欠席理由'
) comment = '欠席登録情報格納テーブル';

/* 面談登録 *
 * 管理番号 = number
 * 名前 = name
 * 面談開始時間 = time
 */
create table mendan(
number varchar(5) comment '管理番号',
name varchar(50) comment '名前',
time varchar(6) comment '面談開始時間'
) comment = '面談登録情報格納テーブル';

/* 出席登録 *
 * 管理番号 = number
 * 名前 = name
 */
create table syusseki(
number varchar(5) comment '管理番号',
name varchar(50) comment '名前'
) comment = '出席登録情報格納テーブル';

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


/*サブプロジェクト */

/*サブプロジェクト / プロジェクト一覧
 * プロジェクトID = project_id
 * プロジェクト名 = project_name
 * リーダーID = manager_id
 * サブリーダーID = sub_manager_id
 * 開始日 = start_date
 * 終了日 = end_date
 * メモ = note
 */

create table projects(
project_id int primary key not null auto_increment comment 'プロジェクトID',
project_name varchar(100) not null comment 'プロジェクト名',
manager_id int not null comment 'リーダーID',
sub_manager_id int not null comment 'サブリーダーID',
start_date date comment '開始日',
end_date date default 00000000 comment '終了日',
note varchar(255) comment 'メモ',
foreign key(manager_id) references users(user_id) on update cascade on delete cascade,
foreign key(sub_manager_id) references users(user_id) on update cascade on delete cascade
);

insert into projects()values
(1,"cosmos",1,2,"2016/09/01","2016/09/30","undecided"),
(2,"credit",3,4,"2016/09/01","2016/09/30","undecided"),
(3,"mira-mode",7,2,"2016/08/01","2016/08/31","undecided"),
(4,"rewrite",8,2,"2016/08/01","2016/08/31","undecided"),
(5,"internousdev",9,2,"2016/08/01","2016/08/31","undecided"),
(6,"visa",10,2,"2016/07/01","2016/07/31","undecided"),
(7,"openconnect",11,2,"2016/07/01","2016/07/31","undecided"),
(8,"chikezon",12,2,"2016/06/01","2016/06/30","undecided");

/*サブプロジェクト / プロジェクトリリース状況一覧
 * プロジェクトID = project_id
 * A環境開始日 = a_envstart
 * A環境終了日 = a_envend
 * B環境開始日 = b_envstart
 * B環境終了日 = b_envend
 * リリース環境開始日 = r_envstart
 * リリース環境終了日 = r_envend
 * AWSリリース状況 = aws_status
 * メモ = note
 * リリース状況ID = status_id
 */
create table project_status(
project_id int not null comment 'プロジェクト名',
a_envstart date default 00000000 comment 'A環境開始日',
a_envend date default 00000000 comment 'A環境終了日',
b_envstart date default 00000000 comment 'B環境開始日',
b_envend date default 00000000 comment 'B環境終了日',
r_envstart date default 00000000 comment 'リリース環境開始日',
r_envend date default 00000000 comment 'リリース環境終了日',
aws_status varchar(50) default "" comment 'AWSリリース状況',
note varchar(255) default "" comment 'メモ',
status_id int primary key auto_increment comment 'リリース状況ID',
foreign key(project_id) references projects(project_id) on update cascade on delete cascade
);

insert project_status(project_id)values
(1),(2),(3),(4),(5),(6),(7),(8);


/*サブプロジェクト / 勤怠更新
 * 日付 = date
 * ユーザーID = user_id
 * 勤怠 = attendance
 * 面談 = interview
 */
create table attendance(
date DATE not null comment '日付',
user_id int not null comment '生徒ID',
attendance int default 0  comment '出欠状況',
interview int default 2 comment '面談状況',
foreign key(user_id) references users(user_id) on update cascade on delete cascade
);

/*サブプロジェクト / 決裁状況一覧
 * 登録日 = registration
 * プロジェクトID = project_id
 * 決裁ID = decisioin_id
 * 案件名 = decision_name
 * 詳細 = detail
 * 実施起案番号 = i_drafting_id
 * 実施決裁番号 = i_approval_id
 * 契約起案番号 = a_drafting_id
 * 契約決裁番号 = cd_id
 * 実施兼契約起案番号 = i_a_d_id
 * 実施兼契約番号 = i_a_id
 */
create table decision(
registration date comment '登録日',
user_id int comment 'ユーザーID',
project_id int comment 'プロジェクト名',
decision_id int primary key auto_increment comment '決裁ID',
decision_name varchar(100) comment '案件名',
detail varchar(255) comment '詳細',
i_drafting_id varchar(100) comment '実施起案番号',
i_approval_id varchar(100) comment '実施決裁番号',
a_drafting_id varchar(100) comment '契約起案番号',
cd_id varchar(100) comment '契約決裁番号',
i_a_d_id varchar(100) comment '実施兼契約起案番号',
i_a_id varchar(100) comment '実施兼契約番号',
foreign key(user_id) references users(user_id) on update cascade on delete cascade,
foreign key(project_id) references projects(project_id) on update cascade on delete cascade
);

insert into decision()value
("2016/08/21",1,1,1,"cinemajapanサイトにおけるチーム開発の実施について","-","KN-2016-05-30-005","J-2016-05-30-005","K-KN-2016-05-30-005","K-2016-05-30-005","-","-"),
("2016/08/22",2,2,2,"opneconnectサイトにおけるチーム開発の実施について","0007-データベースの接続不備改修","-","-","-","-","KN-2016-05-30-007","JK-2016-05-30-001"),
("2016/08/23",3,3,3,"rewriteサイトにおけるチーム開発の実施について","0007-データベースの接続不備改修","-","-","-","-","KN-2016-05-30-008","JK-2016-05-30-002"),
("2016/08/24",4,4,4,"internousdevサイトにおけるチーム開発の実施について","0007-データベースの接続不備改修","-","-","-","-","KN-2016-05-30-009","JK-2016-05-30-003"),
("2016/08/25",5,5,5,"cosmosサイトにおけるチーム開発の実施について","0007-データベースの接続不備改修","-","-","-","-","KN-2016-05-30-010","JK-2016-05-30-004");

/*サブプロジェクト / 決裁手続き内容
 * プロジェクト名 = project_id
 * 日付 = day
 * 決裁種類 = decision_type
 * 決裁状況 = decision_status
 * ユーザーID = user_id
 * 案件名 = item_name
 * 概要 = summary
 * 理由 = cause
 * 開始日 = start_day
 * 終了日 = end_day
 * 実施計画の資料 = plan
 * 人数 = persons
 * パスワード = password
 * 決裁ID = decision_id
 * 決裁手続きID = decision_detail_id
 */
create table decision_detail(
project_id int not null comment 'プロジェクトID',
day date comment '日付',
decision_type varchar(100) default "実施決裁" comment '決裁種類',
decision_status varchar(100) default "未申請" comment '決裁状況',
user_id int comment 'ユーザーID',
item_name varchar(100) comment '案件名',
summary varchar(255) comment '概要',
cause varchar(255) comment '理由',
start_day date comment '開始日',
end_day date comment '終了日',
plan varchar(255) comment '実施計画の資料',
persons int comment '人数',
password varchar(100) comment 'パスワード',
decision_id int comment '決裁ID',
decision_detail_id int primary key auto_increment comment '決裁手続きID',
foreign key(decision_id) references decision(decision_id) on update cascade on delete cascade,
foreign key(user_id) references users(user_id) on update cascade on delete cascade,
foreign key(project_id) references projects(project_id) on update cascade on delete cascade
);

insert decision_detail(decision_detail_id,project_id, user_id,decision_id )
values(1,1,1,1),(2,2,2,2);

/*サブプロジェクト / 書籍一覧*/
/* ブックID *
 * タイトル
 */
create table books(
book_id int primary key not null auto_increment comment 'ブックID',
title varchar(100) not null unique comment 'タイトル'
);

insert into books(title)values
("やさしいJAVA"),("JAVAブロンズ問題集"),("JAVAシルバー問題集"),("JAVAゴールド問題集"),("unity");

/*サブプロジェクト / 書籍貸出状況一覧*/
/* ブックID *
 * 貸し出し状況
 * 貸出日
 * 貸し出しID
 */
create table books_borrow(
book_id int not null comment 'ブックID',
borrow_status varchar(10) not null default "貸出可" comment '貸し出し状況',
borrow_day date comment '貸出日',
borrow_id int comment '貸し出しID',
foreign key(book_id) references books(book_id) on update cascade on delete cascade,
foreign key(borrow_id) references users(user_id) on update cascade on delete cascade
);

insert books_borrow(book_id)values
(1),(2),(3),(4),(5);

/*サブプロジェクト / プロジェクト進捗状況*/
/* プロジェクト進捗状況ID *
 * プロジェクトID
 * プロジェクト進捗日付
 * プロジェクト進捗予定
 * プロジェクト進捗結果
 * その他報告
 */
create table project_progress(
progress_id int auto_increment key comment '進捗状況ID',
project_id int comment 'プロジェクトID',
project_day date not null comment 'プロジェクト進捗日付',
project_plan varchar(255) comment '進捗予定',
project_result varchar(255) comment '進捗結果',
other varchar(255) comment 'その他報告',
foreign key(project_id) references projects(project_id) on update cascade on delete cascade
);

insert into project_progress()values
(1,1,"2009-09-07","a","b","c"),
(2,2,"2009-09-07","a2","b2","c2");

/*サブプロジェクト / スケジュール*/
/* スケジュールID *
 * 開始日
 * 終了日
 * 件名
 * 内容
 */
create table schedule(
id int primary key auto_increment comment 'スケジュールID',
start_day date not null comment '開始日',
end_day date comment '終了日',
title varchar(100) not null comment '件名',
content varchar(100) comment '内容'
);

insert into schedule(id,start_day,title)values
(1,"20160801","test1"),(2,"20160802","test2"),(3,"20160803","test3");

