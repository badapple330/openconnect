DROP DATABASE IF EXISTS internousdev;

CREATE DATABASE internousdev;

USE internousdev;

/* イベント情報
 * 記事ID = id
 * 商品名 = goods
 * 本文 = text
 * 画像URL = picture_url
 * サイトID = site_id
 */

CREATE TABLE event_info(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT comment '記事ID',
goods VARCHAR(50) NOT NULL comment '商品名',
text text NOT NULL comment '本文',
picture_url VARCHAR(255) comment '画像URL',
site_id INT NOT NULL comment 'サイトID',
FOREIGN KEY(site_id)REFERENCES openconnect.site(site_id) ON UPDATE CASCADE ON DELETE CASCADE );

/* 学ぶ記事
 * 記事ID = id
 * タイトル = title
 * 本文 = text
 * 画像URL = picture_url
 * 作成日時 = create_day
 */

CREATE TABLE article_study(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT comment '記事ID',
title VARCHAR(50) NOT NULL comment 'タイトル',
text text NOT NULL comment '本文',
picture_url VARCHAR(255) comment '画像URL',
create_day datetime NOT NULL comment '作成日時');

/* ブログ記事
 * ブログID = id
 * タイトル = title
 * 著者 = writer_name
 * 本文 = text
 * 画像URL = picture_url
 * 作成日時 = create_day
 */

CREATE TABLE article_blog(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT comment 'ブログID',
title VARCHAR(50) NOT NULL comment 'タイトル',
writer_name VARCHAR(16) NOT NULL comment '著者',
text text NOT NULL comment '本文',
picture_url VARCHAR(255) comment '画像URL',
create_day datetime NOT NULL comment '作成日時');

/* チャットルーム情報
 * 部屋ID = id
 * 部屋名 = room_name
 * コメント = comment
 * 入室パスワード = password
 * 管理パスワード = admin_password
 */

CREATE TABLE chat_info(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT comment '部屋ID',
room_name VARCHAR(16) NOT NULL comment '部屋名',
comment VARCHAR(32) comment 'コメント',
password VARCHAR(8) comment '入室パスワード',
admin_password VARCHAR(8) NOT NULL comment '管理パスワード');

/* チャット
 * 部屋ID = id
 * ハンドルネーム = handle_name
 * テキストカラー = text_color
 * 投稿時間 = text_time
 * チャット内容 = text
 */

CREATE TABLE chat(
id INT NOT NULL comment '部屋ID',
handle_name VARCHAR(16) NOT NULL comment 'ハンドルネーム',
text_color VARCHAR(7) comment 'テキストカラー',
text_time datetime comment '投稿時間',
text VARCHAR(255) comment 'チャット内容');

/* 以下テスト用データ*/

/* イベント情報*/
INSERT INTO event_info(id,goods,text,picture_url,site_id)VALUES
(1,"柴犬","元気いっぱいな女の子です。","img/dog1.JPG","1"),
(2,"マルチーズ","元気いっぱいな男の子です。","img/dog2.JPG","2");


/* 学ぶ記事 */
INSERT INTO article_study(id,title,text,picture_url,create_day)VALUES
(1,"学ぶ記事について","
学ぶ記事では現在受講中カレッジ生及び、これから受講するか検討されてる方々に
今後の為になる、IT業界に関連する事や学習する上で役立つ情報をお届けします。これからもinternousdevを宜しくお願いします。
","img/slash.PNG","20160101010101"),
(2,"学ぶ記事について","
学ぶ記事では現在受講中カレッジ生及び、これから受講するか検討されてる方々に
今後の為になる、IT業界に関連する事や学習する上で役立つ情報をお届けします。これからもinternousdevを宜しくお願いします。
","img/slash.PNG","20160202020202");

/* ブログ記事 */
INSERT INTO article_blog(id,title,writer_name,text,picture_url,create_day)VALUES
(1,"本ブログについて","ブログ管理スタッフ","
本ブログでは現在受講中カレッジ生及び、これから受講するか検討されてる方々に
今後の為になる、IT業界に関連する事やプログラマとって役立つ情報をお届けします。これからもinternousdevを宜しくお願いします。
","img/slash.PNG","20160303030303"),
(2,"本ブログについて","ブログ管理スタッフ","本ブログでは現在受講中カレッジ生及び、これから受講するか検討されてる方々に
今後の為になる、IT業界に関連する事やプログラマとって役立つ情報をお届けします。これからもinternousdevを宜しくお願いします。
","img/slash.PNG","20160404040404");

/* チャットルーム */
INSERT INTO chat_info(id,room_name,comment,password,admin_password)VALUES
(1,"MongoDBにつて","Msongoについて学びたい人集合","1111","1111"),
(2,"オブジェクト指向について","オブジェクト指向について教えて下さい","2222","2222"),
(3,"インターノウスカレッジ","フリートークをしよう！！","3333","3333");

/* チャット */
INSERT INTO chat(id,handle_name,text_color,text_time,text)VALUES
(1,"江森壮太","black","2016/05/05/ 05:05:05","こんにちは！江森です。"),
(2,"我孫子春菜","red","2016/06/06/ 06:06:06","お疲れ様です。我孫子です。"),
(3,"松崎右京","green","2016/07/07/ 07:07:07","松崎です。よろしくお願いします。");
