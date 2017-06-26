set names utf8;


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

