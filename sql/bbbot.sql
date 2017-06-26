set names utf8;


/* use openconnect;
insert into users values
(-1,'bot01','bot','bot','bot','bot','bot','bot','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','bot01@gmail.com','09012345678','bot01@ne.jp','男','1993-12-24',FALSE,FALSE,'1','2016','04','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','TestTeam','pic/user_img/syoki.png','テストbotくん','0','1','よろしくお願いします',FALSE),
(-2,'bot02','bot','bot','bot','bot','bot','bot','1130034','東京都文京区湯島3-2-12　御茶ノ水天神ビル','0123456789','bot02@gmail.com','09012345678','bot02@ne.jp','男','1990-09-25',FALSE,FALSE,'3','2010','13','','0','','2016-07-01 13:00:00','2016-07-01 13:00:00','AdminTeam','pic/user_img/syoki.png','妹bot','0','1','よろしくお願いします',FALSE);
*/

/* botのデータベース新設 */
drop database if exists bbbot;
create database if not exists bbbot;
use bbbot;


/* botの反応テーブル
 **************************/
create table response(
response_id int not null primary key auto_increment comment 'レスポンスID',
word varchar(50) not null comment '反応する単語',
response varchar(150) not null comment '反応'
);



insert into response(word,response) values
("カービィ","カービィかわいいね"),
("顔文字","(^^)"),
("よろしく","よろしくね"),
("ラーメン","https://tabelog.com/ramen/tokyo/rank/");



create table response_imouto(
response_id int not null primary key auto_increment comment 'レスポンスID',
word varchar(50) not null comment '反応する単語',
response varchar(150) not null comment '反応'
);


create table word_analysis(
word_id int not null primary key auto_increment comment '単語ID',
word varchar(50) not null comment '単語',
parts varchar(50) comment '単語の基本形（「行った」なら「行く」）',
part_of_speech varchar(20) comment '品詞',
dictionary boolean  default false comment '辞書に載ってるか',
after_word varchar(50) comment '次に続く言葉',
before_word varchar(50) comment '前に続いた言葉',
impression int comment '印象（良ければプラス、悪ければマイナス)'
);

insert into response_imouto(word,response) values
("あ","あっぷる"),
("い","いわし"),
("う","うさぎ"),
("え","えんどれす"),
("お","おかき"),
("か","かっぱ"),
("き","きもちわるい"),
("く","くらげ"),
("け","けんだま"),
("こ","こっぷ"),
("さ","さしみ"),
("し","しっぽ"),
("す","すこんぶ"),
("せ","せいろがん"),
("そ","そうじき"),
("た","たっぱ"),
("ち","ちかていこく"),
("つ","すめし"),
("て","てんぷら"),
("と","とっぽ"),
("な","なび"),
("に","にっぽり"),
("ぬ","ぬま"),
("ね","ねずみ"),
("の","のっぽ"),
("は","はっぱ"),
("ひ","ひっぷ"),
("ふ","ふうしゃ"),
("へ","へりおぽりす"),
("ほ","ほうがんなげ"),
("ま","まーまれーど"),
("み","みすど"),
("む",""),
("め",""),
("も",""),
("や",""),
("ゆ",""),
("よ",""),
("ら",""),
("り",""),
("る",""),
("れ",""),
("ろ",""),
("わ",""),
("を",""),
("ん","おにいちゃんのまけだよ！");

