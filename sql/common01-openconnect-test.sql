set names utf8;
set foreign_key_checks=0;
drop database if exists openconnect;
create database if not exists openconnect;
use openconnect;

drop table if exists attendance;
drop table if exists books;
drop table if exists books_borrow;
drop table if exists decision;
drop table if exists decision_detail;
drop table if exists kesseki;
drop table if exists mendan;
drop table if exists projects;
drop table if exists project_progress;
drop table if exists  project_status;
drop table if exists schedule;
drop table if exists students;
drop table if exists syusseki;
drop table if exists tikoku;
drop table if exists users;

drop table if exists user;
drop table if exists site;
drop table if exists master;

drop database if exists openconnect;
create database openconnect;
use openconnect;

/* 年月日をnot nullに戻す */
create table attendance(
at_year int  comment '手入力の報告年',
at_month int comment '手入力の報告月',
at_day int  comment '手入力の報告日',
at_date timestamp not null default current_timestamp comment '日付',
user_id int not null comment '生徒ID',
attendance varchar(50) comment '出欠状況',
reason text comment'備考',
foreign key(user_id) references users(user_id) on update cascade on delete cascade
);

/* 書籍一覧 */
create table books(
book_id int primary key not null auto_increment comment 'ブックID',
title varchar(100) not null unique comment 'タイトル',
sub_title varchar(100) comment 'サブタイトル',
author varchar(100) not null comment '著者',
publisher varchar(100) not null comment '出版社',
publish_day varchar(10) not null comment '出版日',
initial varchar(10) not null comment 'イニシャル(例:ア,カ,サ/A,B,C/数字)',
status_flg tinyint(1) not null default '0' comment '状態フラグ(0:通常,1:削除,2:紛失)',
regist_day datetime not null default current_timestamp comment 'カレッジ登録日',
updated_day datetime not null default current_timestamp on update current_timestamp comment '更新日'
);

insert into books
(book_id, title, sub_title, author, publisher, publish_day, initial)
values
(1, 'クラスタを自宅で学ぼう! Life Keeper超入門', 'CentOS6/LifeKeeper v9.01対応', '小野澤基文', 'インターノウス', '2017.05', 'カ'),
(2, 'プロになるためのWeb技術入門', 'なぜ、あなたはWebシステムを開発できないのか', '小森祐介', '技術評論社', '2010.04', 'ハ'),
(3, 'なぜ、あなたはJavaでオブジェクト指向開発ができないのか', 'Javaの壁を克服する実践トレーニング', '小森祐介', '技術評論社', '2004.12', 'ナ'),
(4, 'リーダブルコード', 'より良いコードを書くためのシンプルで実践的なテクニック', 'Dustin Boswell, Trevor Foucher', 'オライリージャパン', '2012.06', 'ラ'),
(5, 'Apacheハンドブック 第3版', '', 'Ben Laurie, Peter Laurie', 'オライリージャパン', '2003.09', 'A'),
(6, 'Apacheクックブック 第2版', 'Webサーバ管理者のためのレシピ集', 'Ken Coar, Rich Bowen', 'オライリージャパン', '2008.09', 'A'),
(7, 'Play Framework2 徹底入門', 'JavaではじめるアジャイルWeb開発', '掌田津耶乃, 原一浩', '翔泳社', '2013.12', 'P'),
(8, 'Javaプログラマ Silver SE8', 'オラクル認定資格教科書', '山本道子', '翔泳社', '2016.02', 'J'),
(9, 'Webコンポーネントディベロッパ(SJC-WC)',	'[SUN教科書] (試験番号:310-083)', '山本道子', '翔泳社', '2010.06', 'W'),
(10, 'スーパーエンジニアへの道', '技術リーダーシップの人間学', 'G.M.ワインバーグ', '共立出版', '1991.10', 'サ'),
(11, 'PMBOK 問題集', 'PMBOKガイド第5版対応', 'アイテック教育研究開発部, 吉沢正文', 'アイテック', '2014.03', 'P'),
(12, '10日でおぼえるLinuxサーバー入門教室', 'CentOS対応', '一戸英男', '翔泳社', '2012.11', 'その他'),
(13, 'ソフトウェア職人気質', '人を育て、システム開発を成功へと導くための重要キーワード', 'ピート マクブリーン', 'ピアソンエデュケーション', '2001.03', 'サ'),
(14, '速効!図解 Excel2007 総合版', 'Windows Vista・Office2007対応', '木村幸子', '毎日コミュニケーションズ', '2007.01', 'サ'),
(15, '10日でおぼえるデータモデリング入門教室', '', '筒井彰彦', '翔泳社', '2003.11', 'その他'),
(16, 'スッキリわかるJava入門 第2版 (カレッジ内1)', '', '中山清喬, 国本大悟', 'インプレス', '2014.08', 'サ'),
(17, 'PMP試験 合格虎の巻', '第5版対応版', '吉沢正文, 落合和雄, 庄司敏浩', 'アイテック', '2014.03', 'P'),
(18, 'やさしいJava 第2版', '', '高橋麻奈', 'ソフトバンクパブリッシング', '2002.04', 'ヤ'),
(19, 'Junit 実践入門', '体系的に学ぶユニットテストの技法 ', '渡辺修司', '技術評論社', '2012.11', 'J'),
(20, 'Amazon Web Services クラウドデザインパターン実装ガイド', '', '大澤文孝', '日経BP社', '2014.09', 'A'),
(21, 'データビジュアライゼーションのためのD3.js徹底入門', 'Wevで魅せる[グラフ&チャートの作り方]', '古籏一浩', 'SBクリエイティブ', '2014.05', 'タ'),
(22, '基本情報技術者 大滝みや子先生のかんたんアルゴリズム解法 第2版', '流れ図と擬似言語', '大滝みや子', 'リックテレコム', '2009.11', 'カ'),
(23, 'サーバサイドAjax入門', 'Java／PHP／ASP.NET連携でAjaxプログラミングを極める！', '山田祥寛', '翔泳社', '2006.09', 'サ'),
(24, 'PMPパーフェクトマスター', 'PMBOK第5版対応', '伊熊昭等, 鈴木安而, 海部雅之', '評言社', '2013.08', 'P'),
(25, '9割が無料で遊ぶソーシャルアプリのマネタイズの仕組み', '', '加藤友助, 寺尾剛, 桑田一生', '秀和システム', '2012.09', 'その他'),
(26, '業務システムのための上流工程入門', '要件定義から分析・設計まで', '渡辺幸三', '日本実業出版社', '2003.10', 'カ'),
(27, '2050年の世界', '英『エコノミスト』誌は予測する', '英『エコノミスト』編集部', '文藝春秋', '2012.08', 'その他'),
(28, 'ザ・ゴール　コミック版', '', 'エリヤフ・ゴールドラット, ジェフ・コックス', 'ダイヤモンド社', '2014.12', 'サ'),
(29, '2030年の世界経済', '新興国と先進国 共同リーダーシップの時代', 'イワン・ツェリッシェフ', 'エヌティティ出版', '2014.07', 'その他'),
(30, '世界のエリートが学んできた「自分で考える力」の授業', '', '狩野みき', '日本実業出版社', '2013.06', 'サ'),
(31, 'ビジョナリー カンパニー', '時代を超える生存の原則', 'ジェームズ・C・コリンズ, ジェリー・I・ポラス', '日経BP社', '1995.09', 'ハ'),
(32, '基礎からのサーブレット/JSP 第3版', '', '宮本信二', 'SBクリエイティブ', '2010.08', 'カ'),
(33, '栢木先生の基本情報技術者教室 (情報処理技術者試験)', '平成24年度 イメージ＆クレバー方式でよくわかる', '栢木厚', '技術評論社', '2011.12', 'カ'),
(34, 'カンタン Struts1.2 改訂版', '', '石井真, 阿島哲夫', '秀和システム', '2015.04', 'カ'),
(35, '基礎からのWebアプリケーション開発入門', 'Webサーバを作りながら学ぶ', '前橋和弥', '技術評論社', '2016.06', 'カ'),
(36, 'Emacs実践入門', '思考を直感的にコード化し、開発を加速する', '大竹智也', '技術評論社', '2012.03', 'E'),
(37, '現場で使えるMySQL', '', '松信嘉範', '翔泳社', '2006.03', 'カ'),
(38, 'Java ポケットリファレンス', '', '高江翼, 山田祥寛', '技術評論社', '2011.03', 'J'),
(39, '2030年 世界はこう変わる', 'アメリカ情報機関が分析した「17年後の未来」', '米国国家情報会議', '講談社', '2013.04', 'その他'),
(40, 'TED 驚異のプレゼン', '人を惹きつけ、心を動かす9つの法則', 'カーマイン・ガロ', '日経BP社', '2014.07', 'T'),
(41, 'Linuxでなんでも復活させる本', '', '日経Linux', '日経BP社', '2010..12', 'L'),
(42, 'Ubuntu9.04完全ガイド', '', 'インフォレスト', 'インフォレスト', '2009.07', 'U'),
(43, 'Apache HTTP Serverポケットリファレンス', '2.0/2.2系対応(Linux版/Windows版)', '高江賢', '技術評論社', '2010.05', 'A'),
(44, '詳解HTML&CSS&JavaScript辞典 改訂版', '', '大藤幹, 半場方人', '秀和システム', '2005.04', 'サ'),
(45, 'スッキリわかるJava入門 第2版 (カレッジ内2)', '', '中山清喬, 国本大悟', 'インプレス', '2014.08', 'サ');

use openconnect;
insert into books
(book_id, title, sub_title, author, publisher, publish_day, initial, status_flg)
values
(46, 'EclipseではじめるJavaフレームワーク入門第4版', 'クラウド開発対応', '掌田津耶乃', '秀和システム', '2013.03', 'E', '2'),
(47, 'はじめてのJavaフレームワーク第3版', 'Struts2/Spring/Hibernate対応', '岡田賢治', '秀和システム', '2011.06', 'ハ', '2'),
(48, 'Eclipse 3.7 完全攻略', '', '宮本信二', 'ソフトバンククリエイティブ', '2011.10', 'E', '2'),
(49, '10日でおぼえるHTML5入門教室', '', '古籏一浩', '翔泳社', '2011.09', 'その他', '2'),
(50, '基本から学ぶHTML5+JavaScript', '', 'クジラ飛行机, 土井毅', 'SBクリエイティブ', '2012.04', 'カ', '2'),
(51, 'アプリを作ろう! HTML5入門', '', '山田祥寛', '日経BP社', '2012.06', 'ア', '2'),
(52, '独習Javaサーバサイド編 第2版', '', '山田祥寛', '翔泳社', '2013.01', 'タ', '2'),
(53, 'スッキリわかるJava入門 実践編', '', '中山清喬', 'インプレス', '2012.09', 'サ', '2');

/* 決裁 */
create table decision(
decision_id int primary key auto_increment comment '決裁ID',
project_id int unique not null comment 'プロジェクトID',
decision_name varchar(100) comment '案件名',
decision_type enum('実施', '契約', '実施兼契約') default '実施' comment '決裁種類',
decision_status1 tinyint(1) default 0 comment '[実施]決裁状況(0:作成中, 1:申請中/承認待ち, 2:承認済み, 3:変更中)',
decision_status2 tinyint(1) default 0 comment '[契約/実施兼契約]決裁状況(0:作成中, 1:申請中/承認待ち, 2:承認済み, 3:変更中, 4:リリース済み)',
summary varchar(255) comment '概要',
cause varchar(255) comment '内容',
persons int comment '人数',
apply_day varchar(10) comment '申請日',
start_day date comment '開始日',/* default current_date */
end_day date comment '終了日',
bild_cost float comment '建設費用',
benefit float comment '損益利益',
amount_all float comment '合計金額',
prove int default 7 comment '開発端末',
total_prove int comment '合計開発端末',
re float default 0.6 comment 'リリース環境使用料',
total_re float comment '合計リリース環境使用料',
line int default 1 comment '回線使用料',
total_line int comment '合計回線使用料',
room float default 55.5 comment '施設使用料',
total_room float comment '合計施設使用料',
human int default 100 comment '開発要員',
total_human int comment '合計開発要員',
etc float default 0.5 comment '雑費' ,
total_etc float comment '合計雑費' ,
plan varchar(255) comment '実施計画の資料',
j_imp_id varchar(100) comment '実施起案番号',
j_dec_id varchar(100) comment '実施決裁番号',
k_imp_id varchar(100) comment '契約起案番号',
k_dec_id varchar(100) comment '契約決裁番号',
jk_imp_id varchar(100) comment '実施兼契約起案番号',
jk_dec_id varchar(100) comment '実施兼契約決裁番号',
j_drafter_id int comment'実施起案者ID',
k_drafter_id int comment'契約/実施兼契約起案者ID',
permit_status tinyint(1) default 0 comment '承認状況(0:未承認, 1:リーダー1承認, 2:リーダー2承認, 0:先生承認)',
j_permiter_id1 int comment '実施_承認者ID(1人目:リーダー)',
j_permiter_id2 int comment '実施_承認者ID(2人目:リーダー)',
j_permiter_id3 int comment '実施_承認者ID(3人目:先生)',
k_permiter_id1 int comment '契約/実施兼契約_承認者ID(1人目:リーダー)',
k_permiter_id2 int comment '契約/実施兼契約_承認者ID(2人目:リーダー)',
k_permiter_id3 int comment '契約/実施兼契約_承認者ID(3人目:先生)',
foreign key(project_id) references projects(project_id) on update cascade on delete cascade,
foreign key(j_drafter_id) references users(user_id) on update cascade on delete cascade,
foreign key(k_drafter_id) references users(user_id) on update cascade on delete cascade,
foreign key(j_permiter_id1) references users(user_id) on update cascade on delete cascade,
foreign key(j_permiter_id2) references users(user_id) on update cascade on delete cascade,
foreign key(j_permiter_id3) references users(user_id) on update cascade on delete cascade,
foreign key(k_permiter_id1) references users(user_id) on update cascade on delete cascade,
foreign key(k_permiter_id2) references users(user_id) on update cascade on delete cascade,
foreign key(k_permiter_id3) references users(user_id) on update cascade on delete cascade
);

/* 欠席登録 *
 * 管理番号 = number
 * 名前 = name
 * 欠席理由 = reason
 */
create table kesseki(
number varchar(5) comment '管理番号',
name varchar(50) comment '名前',
reason varchar(50) comment '欠席理由'
) comment = '欠席登録テーブル';

create table master(
level_id int not null comment '権限レベルID',
level_name varchar(10) not null comment '権限レベル名'
) comment='権限マスターテーブル';

/* 面談登録 *
 * 管理番号 = number
 * 名前 = name
 * 面談開始時間 = time
 */
create table mendan(
number varchar(5) comment '管理番号',
name varchar(50) comment '名前',
time varchar(6) comment '面談開始時間'
) comment = '面談登録テーブル';

/*サブプロジェクト */


create table projects(
project_id int primary key not null auto_increment comment 'プロジェクトID',
project_name varchar(100) not null comment 'プロジェクト名',
manager_id int not null comment 'リーダーID',
sub_manager_id int not null comment 'サブリーダーID',
start_date date comment '開始日',
end_date date comment '終了日',
note varchar(255) comment 'メモ',
foreign key(manager_id) references users(user_id) on update cascade on delete cascade,
foreign key(sub_manager_id) references users(user_id) on update cascade on delete cascade
) comment='プロジェクト一覧テーブル';

create table project_status(
project_id int not null comment 'プロジェクトID',
a_envstart date comment 'A環境開始日',
a_envend date comment 'A環境終了日',
b_envstart date comment 'B環境開始日',
b_envend date comment 'B環境終了日',
r_envstart date comment 'リリース環境開始日',
r_envend date comment 'リリース環境終了日',
aws_status varchar(50) default '' comment 'AWSリリース状況',
note varchar(255) default '' comment 'メモ',
status_id int primary key auto_increment comment 'リリース状況ID',
foreign key(project_id) references projects(project_id) on update cascade on delete cascade
) comment='プロジェクトリリース状況一覧';

create table project_progress(
progress_id int auto_increment key comment '進捗状況ID',
project_id int comment 'プロジェクトID',
project_day date not null comment 'プロジェクト進捗日付',
project_plan varchar(255) comment '進捗予定',
project_result varchar(255) comment '進捗結果',
other varchar(255) comment 'その他報告',
foreign key(project_id) references projects(project_id) on update cascade on delete cascade
);

create table schedule(
id int primary key auto_increment comment 'スケジュールID',
start_day date not null comment '開始日',
end_day date comment '終了日',
title varchar(100) not null comment '件名',
content varchar(100) comment '内容',
team_name varchar(255) not null default '1stmonth' comment 'チーム名'
);

insert into schedule(id,start_day,end_day,title,content,team_name) values
(1,"2017-06-15","2017-06-20","実装","実装","TestTeam"),
(2,"2017-06-18","2017-06-25","実装2","実装2","AdminTeam");







create table users (
user_id int primary key not null auto_increment comment 'ユーザーID',
password varchar(255) not null comment 'パスワード',
family_name varchar(50)  comment '姓(英語)',
given_name varchar(50)  comment '名(英語)',
family_name_kanji varchar(50) not null comment '姓(漢字)',
family_name_kana varchar(50) not null comment '姓(ふりがな)',
given_name_kanji varchar(50) not null comment '名(漢字)',
given_name_kana varchar(50)  not null comment '名(ふりがな)',
postal varchar(255) comment '郵便番号',
address varchar(255) comment '住所',
phone_number varchar(255) comment '電話番号',
phone_email varchar(255) not null comment 'メールアドレス',
mobile_number varchar(255) comment '携帯電話番号',
mobile_email varchar(255) unique comment '携帯メールアドレス',
sex varchar(10)  comment '性別',
birthday date comment '誕生日',
userdel_flg boolean default FALSE comment '退会フラグ',
login_flg boolean default FALSE comment 'ログインフラグ',
user_flg int not null default 1 comment 'ユーザーフラグ',
year varchar(4) not null comment '受講年',
month varchar(2) not null comment '受講開始月',
oauth_id varchar(255) comment 'OAuthID',
oauth_name int default 0 comment 'OAuth名',
oauth_account varchar(100) comment 'OAuthアカウント',
register_day datetime comment '登録日',
update_day datetime comment '更新日',
team_name varchar(255) not null default '1stmonth' comment 'チーム名',
user_img varchar(50) default "pic/user_img/syoki.png" comment '写真',
user_name varchar(50) not null comment '名前',
point int not null default 0 comment 'ポイント',
lv int not null default 1 comment 'レベル',
profile varchar(150) comment 'プロフィール',
delete_flg boolean not null default false comment '削除フラグ')
comment = 'ユーザー情報格納テーブル';



/* 以下、SNSサイトのDB
 **************************/




/* グループマスター情報
 **************************/
create table group_master(
group_id int not null primary key auto_increment comment 'グループID',
group_name varchar(50) not null comment 'グループ名',
group_img varchar(50) default "papurika01.jpg" comment 'グループイメージ',
created_at datetime not null  default current_timestamp comment '作成日'
);

/* 投稿情報
 **************************/
create table post(
post_id int not null primary key auto_increment comment '投稿ID',
receiver_id int comment  '受取人ID',
sender_id int not null comment '送信者ID',
group_id int comment 'グループID',
post_contents varchar(255) not null comment '送信内容',
img varchar(50) comment '添付画像',
post_at timestamp not null default current_timestamp comment '投稿日時',
foreign key(receiver_id) references users(user_id),
foreign key(sender_id) references users(user_id),
foreign key(group_id) references group_master(group_id)
);

/* タイムライン投稿情報
 **************************/
create table send_timeline(
timeline_id int not null primary key auto_increment comment 'タイムラインID',
sender_id varchar(50) not null comment '送信者ID',
send_contents varchar(255) not null comment '送信内容',
img varchar(50) comment '添付画像',
send_at timestamp not null default current_timestamp comment '送信日時',
re_timeline_id int comment '返信する場合の、返信先のタイムラインID',
good int not null default 0 comment 'いいね'
);

/* タイムライン情報
 **************************/
create table timeline(
timeline_id int not null comment 'タイムラインID',
sender_id int not null comment '送信者ID',
follower_id int comment 'フォロワーID',
foreign key(sender_id) references users(user_id),
foreign key(follower_id) references users(user_id),
foreign key(timeline_id) references send_timeline(timeline_id)

);

/* グループ情報
 **************************/
create table groups(
user_id int not null comment 'ユーザーID',
group_id int not null comment 'グループID',
foreign key(user_id) references users(user_id),
foreign key(group_id) references group_master(group_id)
);

/* フォロー情報
 **************************/
create table follow(
follow_num int not null primary key auto_increment comment'フォロー番号',
do int not null comment 'する側ID',
done int not null comment 'される側ID',
foreign key(do) references users(user_id),
foreign key(done) references users(user_id)
);

/* いいね情報
 **************************/
create table good(
good_num int not null primary key auto_increment comment'フォロー番号',
user_id int not null comment 'ユーザーID',
timeline_id int not null comment 'タイムラインID',
foreign key(user_id) references users(user_id),
foreign key(timeline_id) references send_timeline(timeline_id)
);

/* チャット既読情報
 **************************/
create table read_flg(
post_id int not null comment'投稿ID',
user_id int not null comment 'ユーザーID',
foreign key(user_id) references users(user_id),
foreign key(post_id) references post(post_id)
);


/* 通知情報
 **************************/
create table message(
user_id int not null comment 'ユーザーID',
msg varchar(255) not null comment'通知文',
url varchar(50) comment '通知文にリンクを貼る際のURL',
send_at timestamp not null default current_timestamp comment '送信日時',
foreign key(user_id) references users(user_id)
);


/* スタンプ情報
 **************************/
create table stamp(
stamp_id int not null primary key auto_increment comment 'スタンプID',
type_id int not null comment '種別ID',
lv int not null default 1 comment '使用可能レベル',
url varchar(255) not null
);







set names utf8;
set foreign_key_checks=0;
use openconnect;
delete from users;
insert into users values
(1,'testuser','test','user','テスト','てすと','ユーザー','ゆーざー','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test@gmail.com','09012345678','user.test@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(2,'internous01','inoue','takuma','井上','いのうえ','琢磨','たくま','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','takuma.inoue@gmail.com','09012345678','takuma.inoue@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','井上琢磨','0','1','よろしくお願いします',FALSE),
(3,'internous01','harada','miyuki','原田','はらだ','美友貴','みゆき','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','miyuki.harada@gmail.com','09012345678','miyuki.harada@ne.jp','女','1992-05-03',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','原田美友貴','0','1','よろしくお願いします',FALSE),
(4,'internous01','test','admin1','テスト','てすと','管理者1','かんりしゃ1','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test1@gmail.com','09012345678','admin.test1@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(5,'internous01','test','admin2','テスト','てすと','管理者2','かんりしゃ2','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test2@gmail.com','09012345678','admin.test2@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(6,'internous01','test','admin3','テスト','てすと','管理者3','かんりしゃ3','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test3@gmail.com','09012345678','admin.test3@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(7,'internous01','test','admin4','テスト','てすと','管理者4','かんりしゃ4','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test4@gmail.com','09012345678','admin.test4@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(8,'internous01','test','admin5','テスト','てすと','管理者5','かんりしゃ5','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test5@gmail.com','09012345678','admin.test5@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(9,'internous01','test','admin6','テスト','てすと','管理者6','かんりしゃ6','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test6@gmail.com','09012345678','admin.test6@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(10,'internous01','test','admin7','テスト','てすと','管理者7','かんりしゃ7','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test7@gmail.com','09012345678','admin.test7@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(11,'internous01','test','admin8','テスト','てすと','管理者8','かんりしゃ8','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test8@gmail.com','09012345678','admin.test8@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(12,'internous01','test','admin9','テスト','てすと','管理者9','かんりしゃ9','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test9@gmail.com','09012345678','admin.test9@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(13,'internous01','test','admin10','テスト','てすと','管理者10','かんりしゃ10','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','admin.test10@gmail.com','09012345678','admin.test10@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(14,'leader11','test','leader1','テスト','てすと','リーダー1','りーだー1','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','leader1.test@gmail.com','09012345678','leader1.test@ne.jp','男','1990-04-01',FALSE,FALSE,'2','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(15,'leader22','test','leader2','テスト','てすと','リーダー2','りーだー2','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','leader2.test@gmail.com','09012345678','leader2.test@ne.jp','男','1990-04-01',FALSE,FALSE,'2','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(16,'student1','nitabaru','kouhei','仁田原','にたばる','耕平','こうへい','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','kouhei.nitabaru@gmail.com','09012345678','kouhei.nitabaru@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','07','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(17,'student2','itou','tatsuhumi','伊藤','いとう','竜文','たつふみ','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','tatsuhumi.itou@gmail.com','09012345678','tatsuhumi.itou@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','07','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(18,'student3','sunakawa','minori','砂川','すなかわ','みのり','みのり','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','minori.sunakawa@gmail.com','09012345678','minori.sunakawa@ne.jp','女','1990-04-01',FALSE,FALSE,'1','2016','07','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(19,'student4','keduka','masahiro','毛塚','けづか','正広','まさひろ','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','masahiro.keduka@gmail.com','09012345678','masahiro.keduka@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','08','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(20,'student5','horiguchi','kennichi','堀口','ほりぐち','謙一','けんいち','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','kennichi.horiguchi@gmail.com','09012345678','kennichi.horiguchi@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','08','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(21,'student6','kiryuu','youichi','霧生','きりゅう','雄一','ゆういち','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','yuuichi.kiryuu@gmail.com','09012345678','yuuichi.kiryuu@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','08','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(22,'student7','hoshi','tatsuya','星','ほし','達也','たつや','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','tatsuya.hoshi@gmail.com','09012345678','tatsuya.hoshi@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','08','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(23,'student8','iwamoto','koumei','岩本','いわもと','興明','こうめい','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','koumei.iwamoto@gmail.com','09012345678','koumei.iwamoto@ne.jp','男','1990-04-01',FALSE,FALSE,'1','2016','08','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(24,'testuser','test','user','テスト','てすと','ユーザー1','ゆーざー1','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test1@gmail.com','09012345678','user.test1@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(25,'testuser','test','user','テスト','てすと','ユーザー2','ゆーざー2','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test2@gmail.com','09012345678','user.test2@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(26,'testuser','test','user','テスト','てすと','ユーザー3','ゆーざー3','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test3@gmail.com','09012345678','user.test3@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(27,'testuser','test','user','テスト','てすと','ユーザー4','ゆーざー4','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test4@gmail.com','09012345678','user.test4@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(28,'testuser','test','user','テスト','てすと','ユーザー5','ゆーざー5','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test5@gmail.com','09012345678','user.test5@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(29,'testuser','test','user','テスト','てすと','ユーザー6','ゆーざー6','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test6@gmail.com','09012345678','user.test6@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(30,'testuser','test','user','テスト','てすと','ユーザー7','ゆーざー7','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test7@gmail.com','09012345678','user.test7@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(31,'testuser','test','user','テスト','てすと','ユーザー8','ゆーざー8','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test8@gmail.com','09012345678','user.test8@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(32,'testuser','test','user','テスト','てすと','ユーザー9','ゆーざー9','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test9@gmail.com','09012345678','user.test9@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(33,'testuser','test','user','テスト','てすと','ユーザー10','ゆーざー10','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test10@gmail.com','09012345678','user.test10@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(34,'testuser','test','user','テスト','てすと','ユーザー11','ゆーざー11','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test11@gmail.com','09012345678','user.test11@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(35,'testuser','test','user','テスト','てすと','ユーザー12','ゆーざー12','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test12@gmail.com','09012345678','user.test12@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(36,'testuser','test','user','テスト','てすと','ユーザー13','ゆーざー13','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test13@gmail.com','09012345678','user.test13@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(37,'testuser','test','user','テスト','てすと','ユーザー14','ゆーざー14','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test14@gmail.com','09012345678','user.test14@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(38,'testuser','test','user','テスト','てすと','ユーザー15','ゆーざー15','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test15@gmail.com','09012345678','user.test15@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(39,'testuser','test','user','テスト','てすと','ユーザー16','ゆーざー16','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test16@gmail.com','09012345678','user.test16@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(40,'testuser','test','user','テスト','てすと','ユーザー17','ゆーざー17','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','user.test17@gmail.com','09012345678','user.test17@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','test','0','1','よろしくお願いします',FALSE),
(41,'internous01','kazami','akira','風見','かざみ','顕','あきら','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','kazami@internous.co.jp','09012345678','kazami@internous.co.jp','男','2001-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','風見顕','0','1','よろしくお願いします',FALSE);





insert into stamp(type_id,url) values
(1,"pic/stamp/01_hipota/hipota_01.jpg"),
(1,"pic/stamp/01_hipota/hipota_02.jpg"),
(1,"pic/stamp/01_hipota/hipota_03.jpg"),
(1,"pic/stamp/01_hipota/hipota_04.jpg"),
(1,"pic/stamp/01_hipota/hipota_05.jpg"),
(1,"pic/stamp/01_hipota/hipota_06.jpg"),
(1,"pic/stamp/01_hipota/hipota_07.jpg"),
(1,"pic/stamp/01_hipota/hipota_08.jpg"),
(1,"pic/stamp/01_hipota/hipota_09.jpg"),
(1,"pic/stamp/01_hipota/hipota_10.jpg"),
(1,"pic/stamp/01_hipota/hipota_11.jpg"),
(1,"pic/stamp/01_hipota/hipota_12.jpg"),
(1,"pic/stamp/01_hipota/hipota_13.jpg"),
(1,"pic/stamp/01_hipota/hipota_14.jpg"),
(1,"pic/stamp/01_hipota/hipota_15.jpg"),
(1,"pic/stamp/01_hipota/hipota_16.jpg"),
(1,"pic/stamp/01_hipota/hipota_17.jpg"),
(1,"pic/stamp/01_hipota/hipota_18.jpg"),
(1,"pic/stamp/01_hipota/hipota_19.jpg"),
(1,"pic/stamp/01_hipota/hipota_20.jpg"),
(1,"pic/stamp/01_hipota/hipota_21.jpg"),
(1,"pic/stamp/01_hipota/hipota_22.jpg"),
(1,"pic/stamp/01_hipota/hipota_23.jpg"),
(1,"pic/stamp/01_hipota/hipota_24.jpg"),
(1,"pic/stamp/01_hipota/hipota_25.jpg"),
(2,"pic/stamp/02_lion/lion_01.jpg"),
(2,"pic/stamp/02_lion/lion_02.jpg"),
(2,"pic/stamp/02_lion/lion_03.jpg"),
(2,"pic/stamp/02_lion/lion_04.jpg"),
(2,"pic/stamp/02_lion/lion_05.jpg"),
(2,"pic/stamp/02_lion/lion_06.jpg"),
(2,"pic/stamp/02_lion/lion_07.jpg"),
(2,"pic/stamp/02_lion/lion_08.jpg"),
(2,"pic/stamp/02_lion/lion_09.jpg"),
(2,"pic/stamp/02_lion/lion_10.jpg"),
(2,"pic/stamp/02_lion/lion_11.jpg"),
(2,"pic/stamp/02_lion/lion_12.jpg"),
(2,"pic/stamp/02_lion/lion_13.jpg"),
(2,"pic/stamp/02_lion/lion_14.jpg"),
(2,"pic/stamp/02_lion/lion_15.jpg"),
(2,"pic/stamp/02_lion/lion_16.jpg");

insert into stamp(type_id,lv,url) values
(3,2,"pic/stamp/03_ham/ham_01.jpg"),
(3,2,"pic/stamp/03_ham/ham_02.jpg"),
(3,2,"pic/stamp/03_ham/ham_03.jpg"),
(3,2,"pic/stamp/03_ham/ham_04.jpg"),
(3,2,"pic/stamp/03_ham/ham_05.jpg"),
(3,2,"pic/stamp/03_ham/ham_06.jpg"),
(3,2,"pic/stamp/03_ham/ham_07.jpg"),
(3,2,"pic/stamp/03_ham/ham_08.jpg"),
(3,2,"pic/stamp/03_ham/ham_09.jpg"),
(3,2,"pic/stamp/03_ham/ham_10.jpg"),
(3,2,"pic/stamp/03_ham/ham_11.jpg"),
(3,2,"pic/stamp/03_ham/ham_12.jpg"),
(3,2,"pic/stamp/03_ham/ham_13.jpg"),
(3,2,"pic/stamp/03_ham/ham_14.jpg"),
(3,2,"pic/stamp/03_ham/ham_15.jpg"),
(3,2,"pic/stamp/03_ham/ham_16.jpg"),
(3,2,"pic/stamp/03_ham/ham_17.jpg"),
(3,2,"pic/stamp/03_ham/ham_18.jpg"),
(3,2,"pic/stamp/03_ham/ham_19.jpg"),
(3,2,"pic/stamp/03_ham/ham_20.jpg"),
(3,2,"pic/stamp/03_ham/ham_21.jpg"),
(3,2,"pic/stamp/03_ham/ham_22.jpg"),
(3,2,"pic/stamp/03_ham/ham_23.jpg"),
(3,2,"pic/stamp/03_ham/ham_24.jpg"),
(3,2,"pic/stamp/03_ham/ham_25.jpg"),
(3,2,"pic/stamp/03_ham/ham_26.jpg"),
(3,2,"pic/stamp/03_ham/ham_27.jpg");









set foreign_key_checks=1;