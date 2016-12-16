/*
 * prototype1509のテーブル作成
 */

# データベースの作成
drop database if exists prototype1509;
create database prototype1509;

# データベースの指定
use prototype1509;

# テーブルがすでに存在したら削除
drop table if exists login_table;
drop table if exists member_table;

# カラムにbinary指定で大文字小文字を区別
# login_table
create table login_table
(
    id varchar(255) binary not null,
    password varchar(255) binary not null,
    unique(id)
);

# member_table
create table member_table
(
    id int(11) not null auto_increment,
    name varchar(255) binary not null,
    telnumber varchar(255) binary not null,
    email varchar(255) binary not null,
    primary key(id)
);