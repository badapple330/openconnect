set names utf8;
set foreign_key_checks=0;
drop database if exists openconnect;
create database if not exists openconnect;
use openconnect;

drop table if exists books;
drop table if exists decision;
drop table if exists projects;
drop table if exists users;


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
regist_day datetime not null  default current_timestamp comment 'カレッジ登録日',
updated_day datetime not null  default current_timestamp on update current_timestamp comment '更新日'
);

use openconnect;
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
project_id int not null comment 'プロジェクトID',
decision_name varchar(100) comment '案件名',
decision_type enum('実施', '契約', '実施兼契約') default '実施' comment '決裁種類',
decision_status1 tinyint(1) default 0 comment '[実施]決裁状況(0:作成中, 1:申請中/承認待ち, 2:承認済み, 3:変更中)',
decision_status2 tinyint(1) default 0 comment '[契約/実施兼契約]決裁状況(0:作成中, 1:申請中/承認待ち, 2:承認済み, 3:変更中, 4:リリース済み)',
summary varchar(255) comment '概要',
cause varchar(255) comment '内容',
persons int comment '人数',
apply_day date  comment '申請日',
start_day date default  current_date comment '開始日',
end_day date default  current_date comment '終了日',
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

use openconnect;
insert into decision(decision_id, j_drafter_id, project_id ,decision_type, decision_name,summary , cause, bild_cost, benefit, amount_all, start_day, end_day, j_permiter_id1, j_permiter_id2, j_permiter_id3) values
(1,3,3, '実施','シートピア', '海関連のツアーさいと','若者向けのレジャーサイト', 100.0, 200.0, 300.0, '2017/06/20', '2017/06/30',8,3,2),
(2,4,2, '実施','キャッツアンド', '猫関連の猫さいと','猫向けのサイト', 800.0, 200.0, 1000.0, '2017/06/25', '2017/06/30',8,7,2);



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

use openconnect;
insert into projects(project_id, project_name, manager_id, sub_manager_id) values
(1, 'legmina', 3, 5),
(2, 'catsndogs', 4, 6),
(3, 'cetus', 7, 5),
(4, 'outdoor', 8, 9);




create table users (
user_id int primary key not null auto_increment comment 'ユーザーID',
password varchar(255)  comment 'パスワード',
family_name varchar(50) not null comment '姓(英語)',
given_name varchar(50) not null comment '名(英語)',
family_name_kanji varchar(50) not null comment '姓(漢字)',
family_name_kana varchar(50) not null comment '姓(ふりがな)',
given_name_kanji varchar(50) not null comment '名(漢字)',
given_name_kana varchar(50) not null comment '名(ふりがな)',
postal varchar(255) comment '郵便番号',
address varchar(255) comment '住所',
phone_number varchar(255) comment '電話番号',
phone_email varchar(255) unique comment 'メールアドレス',
mobile_number varchar(255) comment '携帯電話番号',
mobile_email varchar(255) unique comment '携帯メールアドレス',
sex varchar(10) not null comment '性別',
birthday date comment '誕生日',
userdel_flg boolean default FALSE comment '退会フラグ',
login_flg boolean default FALSE comment 'ログインフラグ',
user_flg int not null default 1 comment 'ユーザーフラグ',
year varchar(4) comment '受講年',
month varchar(2) comment '受講開始月',
oauth_id varchar(255) comment 'OAuthID',
oauth_name int default 0 comment 'OAuth名',
oauth_account varchar(100) comment 'OAuthアカウント',
register_day datetime comment '登録日',
update_day datetime comment '更新日'
)comment = 'ユーザー情報格納テーブル';

use openconnect;
insert into users values
(1,'t','test','user','テスト','てすと','ユーザー','ゆーざー','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','t@g','09012345678','user.test@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00'),
(2,'i','inoue','takuma','井上','いのうえ','琢磨','たくま','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','i@g','09012345678','takuma.inoue@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00'),
(3,'l1','test','leader1','テスト','てすと','リーダー1','りーだー1','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','l1@g','09012345678','leader1.test@ne.jp','男','1990-04-01',FALSE,FALSE,'2','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00'),
(4,'l2','test','leader2','テスト','てすと','リーダー2','りーだー2','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','l2@g','09012345678','leader2.test@ne.jp','男','1990-04-01',FALSE,FALSE,'2','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00'),
(5,'s1','test','subleader1','テスト','てすと','サブリーダー1','さぶりーだー1','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','s1@g','09012345678','subleader1.test@ne.jp','男','1990-04-01',FALSE,FALSE,'2','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00'),
(6,'s2','test','subleader2','テスト','てすと','サブリーダー2','さぶりーだー2','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','s2@g','09012345678','subleader2.test@ne.jp','男','1990-04-01',FALSE,FALSE,'2','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00'),
(7,'l3','test','leader3','テスト','てすと','リーダー3','りーだー3','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','l3@g','09012345678','leader3.test@ne.jp','男','1990-04-01',FALSE,FALSE,'2','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00'),
(8,'l4','test','leader4','テスト','てすと','リーダー4','りーだー4','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','l4@g','09012345678','leader4.test@ne.jp','男','1990-04-01',FALSE,FALSE,'2','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00'),
(9,'s3','test','subleader3','テスト','てすと','サブリーダー3','さぶりーだー3','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','s3@g','09012345678','subleader3.test@ne.jp','男','1990-04-01',FALSE,FALSE,'2','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00');
