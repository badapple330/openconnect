set names utf8;
drop database if exists visa;
create database visa;
use visa;


/* ユーザー情報登録申請  *
 * ログインID = login_id
 * ログインパスワード = password
 * 姓名（漢字）= last_name
 * 姓名（ふりがな）= last_name_f
 * 名前(漢字) = first_name
 * 名前(ふりがな) = first_name_f
 * 郵便番号 = postal
 * 住所 = address
 * メールアドレス = email
 * 電話番号(自宅) = tel_number
 * 電話番号(携帯) = mobile
 * 生年月日 = birthday
 * 性別 = sex
 * 業種 = industry_type
 * 職業 = job
 * 勤務先名(法人呼称) = corporation_name
 * 勤務先名 = office_name
 * 勤務先所在地 = office_address
 * 勤務先電話番号(外線) = office_tel
 * 勤務年数 = office_years
 * 金融機関名 = bank_name
 * 支店番号 = bank_number
 * 口座種別 = account_type
 * 普通口座番号 = normal_account
 * 預金口座番号 = deposit_account
 * 預貯金額 = savings
 * 他社借入れ金額 = debt
 * 配偶者の有無 = spouse
 * カード使用目的 = use_card
 * 本人年収 = income
 * 世帯年収 = income_f
 * 希望利用可能枠 = spend
 * 希望暗証番号 = id_number
 * クレジットカード審査承認フラグ = judge_flg
 * 登録日 = register_day
 * 更新日 = update_day
 * 削除フラグ = delete_flg
 * */
create table user(
login_id varchar(10) not null primary key,
password varchar(10) not null,
last_name varchar(10) not null,
last_name_f varchar(20) not null,
first_name varchar(10) not null,
first_name_f varchar(20) not null,
postal int(7) not null,
address varchar(30) not null,
email varchar(40) not null unique,
tel_number varchar(11),
mobile varchar(11),
birthday date not null,
sex varchar(1) not null,
industry_type varchar(20),
job varchar(20),
corporation_name varchar(100),
office_name varchar(30),
office_address varchar(30),
office_tel varchar(11),
office_years int,
bank_name varchar(10),
bank_number varchar(3),
account_type varchar(5),
normal_account varchar(7) unique,
deposit_account varchar(7) unique,
savings int,
debt int,
spouse varchar(1) default "無",
use_card varchar(100),
income int,
income_f int,
spend int,
id_number varchar(4) not null,
judge_flg varchar(3) default "保留",
register_day datetime not null,
update_day datetime not null,
delete_flg boolean default false
);

/* 購入お支払履歴
 * ログインID = login_id
 * 姓名（漢字） = last_name
 * 名前（漢字） = first_name
 * ご利用店名 = office_name
 * ご利用日 = use_day
 * 支払い区分 = division
 * 分割回数 = split
 * 支払い予定日 = payment_day
 * 利用金額 = spend
 * 支払い金額 = payment
 * 手数料 = commission
 * 削除フラグ = delete_flg
 * */
create table user_history(
login_id varchar(10) not null primary key,
last_name varchar(10) not null,
first_name varchar(10) not null,
office_name varchar(20) not null,
use_day date not null,
division varchar(10) not null,
split int not null,
payment_day date not null,
spend int not null,
payment int not null,
commission int not null,
delete_flg boolean default false,
foreign key(login_id) references user(login_id)
);

/* クレジットカード情報
 * ログインID = login_id
 * 姓名 = last_name
 * 名前 = first_name
 * クレジット番号 = credit_number
 * セキュリティコード = security_code
 * 暗証番号 = id_number
 * 利用限度額 = credit_limit
 * 登録日 = register_day
 * 更新日 = update_day
 * 削除フラグ = delete_flg
 * */
create table credit_card(
login_id varchar(10) not null primary key,
last_name varchar(10) not null,
first_name varchar(10) not null,
credit_number int(16) not null unique auto_increment,
security_code int(4) not null,
id_number varchar(4) not null,
credit_limit int not null,
register_day datetime not null,
update_day datetime not null,
delete_flg boolean default false,
foreign key(login_id)references user(login_id)
);


/* 法人情報登録申請
 * ログインID = login_id
 * ログインパスワード = password
 * 会社名 = corporation_name
 * 本社郵便番号 = postal
 * 本社所在地 = address
 * 資本金 = capital
 * 代表者 = rep_name
 * 担当者 = charge
 * メールアドレス = email
 * 電話番号(外線) = tel_number
 * 従業員数 = employee
 * 設立年数 = established
 * ホームページURL = hp_url
 * 加盟店審査承認フラグ = judge_flg
 * 登録日 = regist_day
 * 更新日 = update_day
 * 削除フラグ = delete_flg
 * */
create table corporation(
login_id varchar(10) not null primary key,
password varchar(10) not null,
corporation_name varchar(20) not null,
postal varchar(7) not null,
address varchar(40) not null,
capital int not null,
rep_name varchar(20) not null,
charge varchar(20) not null,
email varchar(50) not null,
tel_number varchar(11) not null,
employee int not null,
established varchar(3) not null,
hp_url varchar(100),
judge_flg boolean default false,
register_day datetime not null,
update_day datetime not null,
delete_flg boolean default false
);


/* 管理者情報
 * 管理者ログインID = admin_id
 * 管理者ログインパスワード = admin_password
 * */
create table admin(
login_id varchar(10) not null,
password varchar(10) not null
);



/* 以下テスト用データ*/

/* ユーザーデータ */
insert into user(login_id,password,last_name,last_name_f,first_name,first_name_f,postal,address,email,tel_number,mobile,birthday,sex,industry_type,job,corporation_name,office_name,office_address,office_tel,office_years,bank_name,bank_number,account_type,normal_account,deposit_account,savings,debt,spouse,use_card,income,income_f,spend,id_number,judge_flg,register_day,update_day,delete_flg)values
("hidekisama","ikemen","工藤","くどう","秀樹","ひでき","1112222","東京都台東区上野1-1-1","hidekisama@gmail.com","0312341234","09012341234","1992-05-31","男","プログラマー","クドゥー開発者","株式会社クドゥー","クドゥー言語研究所","東京都","0355558888","1","クドゥ銀行","127","クヂュ","1234567",null,"5000000","1000000000", "有", "パチンコ","10","50","5000000","5555", "承認","2016-06-15 13:25:59","2016-06-15 13:26:00",false),
("hideki","ikemen","工藤","くどう","秀樹","ひでき","1112222","東京都台東区上野1-1-1","hideki@gmail.com","0312341234","09012341234","1992-05-31","男","プログラマー","クドゥー開発者","株式会社クドゥー","クドゥー言語研究所","東京都","0355558888","1","クドゥ銀行","127","クヂュ","1233367",null,"5000000","1000000000", "有","パチンコ","10","50","5000000","5555", "承認","2016-06-15 13:25:59","2016-06-15 13:26:00",false),
("java","ikemen","工藤","くどう","秀樹","ひでき","1112222","東京都台東区上野1-1-1","java@gmail.com","0312341234","09012341234","1992-05-31","男","Java神","クドゥー開発者","株式会社クドゥー","クドゥー言語研究所","東京都","0355558888","1","クドゥ銀行","127","クヂュ","1238368",null,"5000000","1000000000", "有","パチンコ","10","50","5000000","5555", "承認","2016-06-15 13:25:59","2016-06-15 13:26:00",false),
("naomi","mask","森田","もりた","直美","なおみ","1112222","東京都台東区上野1-1-1","naomi@gmail.com","0313331234","09012341234","1990-11-16","女","プログラマー","クドゥー開発者","株式会社クドゥー","クドゥー言語研究所","東京都","0355558888","1","クドゥ銀行","127","クヂュ","6264567",null,"5000000","1000000000", "無","スロット","10","50","5000000","5555", "保留","2016-06-15 13:25:59","2016-06-15 13:26:00",false),
("mura","megane","村上","むらかみ","俊一","しゅんいち","1112222","東京都台東区上野1-1-1","mura@gmail.com","0313331234","09012341234","2016-06-17","神","プログラマー","クドゥー開発者","株式会社クドゥー","クドゥー言語研究所","東京都","0355558888","1","クドゥ銀行","127","クヂュ","6264997",null,"5000000","1000000000", "無","マック食べたい","10","50","5000000","5555","保留","2016-06-15 13:25:59","2016-06-15 13:26:00",false),
("morita","mask","森田","もりた","直美","なおみ","1112222","東京都台東区上野1-1-1","morita@gmail.com","0313331234","09012341234","1990-11-16","女","プログラマー","クドゥー開発者","株式会社クドゥー","クドゥー言語研究所","東京都","0355558888","1","クドゥ銀行","127","クヂュ","6774567",null,"5000000","1000000000","無","スロット","10","50","5000000","5555","保留","2016-06-15 13:25:59","2016-06-15 13:26:00",false),
("shogo","ikemen","中村","なかむら","匠吾","しょうご","1116622","東京都台東区上野1-1-1","shogo@gmail.com","0313331234","09012341234","1995-07-18","男","プログラマー","クドゥー開発者","株式会社クドゥー","クドゥー言語研究所","東京都","0355558888","1","クドゥ銀行","127","クヂュ","6994567",null,"5000000","1000000000", "無","イケメン講義","10","50","5000000","5555", "不承認","2016-06-15 13:25:59","2016-06-15 13:26:00",false),
("kura","kawaii","倉地","くらち","祥吾","しょうご","1116622","東京都台東区上野1-1-1","kura@gmail.com","0313331234","09012341234","1995-07-18","男","プログラマー","クドゥー開発者","株式会社クドゥー","クドゥー言語研究所","東京都","0355558888","1","クドゥ銀行","127","クヂュ","9994567",null,"5000000","1000000000","無","天才になるため","10","50","5000000","5555", "保留","2016-06-15 13:25:59","2016-06-15 13:26:00",false),
("sasamin","ikemen","石鉢","いしのはち","ささみん","ささみん","1116622","東京都台東区上野1-1-1","sasamin@gmail.com","0313331234","09012341234","1990-10-15","男","プログラマー","クドゥー開発者","株式会社クドゥー","クドゥー言語研究所","東京都","0355558888","1","クドゥ銀行","127","クヂュ","9394567",null,"5000000","1000000000","無","ホモアプリ課金","10","50","5000000","5555", "不承認","2016-06-15 13:25:59","2016-06-15 13:26:00",false),
("aporo","aporo","冨澤","とみざわ","アポロ","あぽろ","1234567","23系銀河太陽系月の上","aporo@ginga.com","1232345122","08098721230","4896-10-10","無","宇宙調査隊","宇宙","熱式宇宙アポロ","アポロ言語伝達所","銀河太陽系地球","1231234000","2","アポロ銀行","456","アポロ","1122567",null,"5123123","12300", "有","宇宙旅行","10000000","500000","50","4885", "承認","2012-06-15 13:25:59","2020-06-15 13:48:53",false);

/**
 * 購入お支払い履歴
 */
insert into user_history(login_id,last_name,first_name,office_name,use_day,division,split,payment_day,spend,payment,commission,delete_flg)values
("hidekisama","工藤","秀樹","testOffice","2016-06-17","一括","1","2016-06-30","100000000","10","1000",false),
("aporo","冨澤","アポロ","Officeアポロ","2205-06-18","分割","50","2230-12-30","100000","1054","10010",false);

/**
 * クレジットカード情報
 */
insert into credit_card(login_id,last_name,first_name,credit_number,security_code,id_number,credit_limit,register_day,update_day,delete_flg)values
("hidekisama","工藤","秀樹","1","1234","1234","100000","2016-06-17 13:16:00","2016-06-17 13:25:00",false),
("aporo","冨澤","アポロ","2","4567","4567","456430","2202-08-17 15:16:00","2356-06-17 12:25:00",false);

/* 法人データ */
insert into corporation(login_id,password,corporation_name,postal,address,capital,rep_name,charge,email,tel_number,employee,established,hp_url,judge_flg,register_day,update_day,delete_flg)values
("kudo","ikemen","株式会社クドゥー","1119898","東京都台東区上野1-1-1","50000000","工藤秀樹","倉地祥吾","kudo@gmail.com","0311112222","800","50",null,true,20160617,20160617,false),
("hideki","ikemen","株式会社クドゥー","1119898","東京都台東区上野1-1-1","50000000","工藤秀樹","倉地祥吾","hideki@gmail.com","0311112222","800","50",null,false,20160617,20160617,false);

/* 管理者情報 */
insert into admin(login_id,password)values
("admin", "123");
