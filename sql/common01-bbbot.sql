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
impression tinyint comment '印象（良ければプラス、悪ければマイナス)'
);

create table word_impression(
word varchar(50) not null comment '単語',
impression tinyint not null comment '印象（とても良い+4、良い+2、普通0、悪い-2，とても悪い-4）'
);

insert into word_impression values
/* とても良い形容詞 */
("かわいい",4),("かっこいい",4),("強い",4),("楽しい",4),("すごい",4),("おいしい",4),("面白い",4),("うまい",4),("きれい",4),("清々しい",4),("良い",4),
/* とても良い名詞 */
("イケメン",4),("上手",4),("休日",4),("有休",4),("最高",4),("勝利",4),("最強",4),("笑",4),("感動",4),

/* 良い形容詞と名詞 */
("涼しい",2),("あたたかい",2),("得",2),("自由",2),("可能",2),

/* 悪い形容詞と名詞 */
("暑い",-2),("寒い",-2),("損",-2),("不自由",-2),("不可能",-2),

/* とても悪い形容詞 */
("つらい",-4),("ダサい",-4),("弱い",-4),("つまらない",-4),("ひどい",-4),("まずい",-4),("拙い",-4),("汚い",-4),("悪い",-4),
/* とても悪い名詞 */
("ブサ",-4),("下手",-4),("激務",-4),("残業",-4),("最低",-4),("最悪",-4),("敗北",-4),("怒り",-4),("悲しみ",-4),("減給",-4),("クビ",-4),("ハゲ",-4),("アホ",-4);


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

