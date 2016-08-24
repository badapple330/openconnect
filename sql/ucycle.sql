drop database ucycle;
create database if not exists ucycle;
use ucycle;



/*顧客情報入力（新規登録・customer_typeは１．月額会員２．一般会員３．SNS会員）(SNSログインはfamilynameにアカウント名,givennameにSNS名)*/
create table if not exists customer(
customer_type int (1) not  null,
customer_id int(6) primary key auto_increment,
familyname varchar(20) not null,
givenname varchar(20) not null,
password varchar(8),
phone  varchar(12),
mailaddress varchar (40) unique,
postcode int (7),
address varchar(20),
housenumber varchar (50),
credit_name varchar (40),
credit_number  bigint(16),
expiredate int(6),
security_code int(4)
);


/*駐輪場情報*/
create table if not exists port(
port_id int(2) primary key auto_increment,
port_name varchar(20)unique not null,
port_address varchar(50) not null
);


/*自転車情報（statusの値で予約の有無を確認  1,無2,有）*/
create table if not exists cycle(
cycle_id int(6) unique not null,
port_id int(2)  not null,
port_name varchar(20) not null,
due_date int(8),
status int(1),
foreign key(port_id) references port(port_id),
foreign key(port_name) references port(port_name)
);


/*利用履歴情報*/
create table if not exists reservation_info(
customer_id int(6) not null,
port_name varchar(20) not null,
cycle_id int(6) not null,
plan int(1) not null,
reservation_date int(8),
price int(3),
foreign key(port_name) references port(port_name),
foreign key(cycle_id) references cycle(cycle_id)
);


/*管理者情報*/
create table if not exists admin(
admin_id int(8) not null,
admin_password varchar(30) not null,
port_id int(2),
foreign key(port_id) references port(port_id)
);



/*顧客情報（テストユーザー）*/
insert into customer(customer_type,customer_id,familyname,givenname,password,phone,mailaddress,postcode,address,housenumber,credit_name,credit_number,expiredate,security_code
)values(
1,1,'三戸','康太郎','1111','0901234567','aaa@co.jp',4211212,'静岡市葵区千代','2-2-2','mito',5555555555554444,160101,222
);
insert into customer(customer_type,customer_id,familyname,givenname,password,phone,mailaddress,postcode,address,housenumber,credit_name,credit_number,expiredate,security_code
)values(
2,2,'山田','太郎','1111','0901234567','bbb@co.jp',4211212,'静岡市葵区千代','2-2-3','nanasi',5105105105105100,160101,223
);
insert into customer(customer_type,customer_id,familyname,givenname,password,phone,mailaddress,postcode,address,housenumber,credit_name,credit_number,expiredate,security_code
)values(
3,3,'SATOfacebook','facebook','1111','0901234567','ccc@co.jp',4211212,'静岡市葵区千代','2-2-2','yamada',4111111111111111,160101,222
);


/*駐輪場情報（実例）*/
insert into port(port_id,port_name,port_address
)values(
1,'半蔵門店','東京都千代田区麹町２丁目１４'
);
insert into port(port_id,port_name,port_address
)values(
2,'麹町店','東京都千代田区二番町９−１２'
);
insert into port(port_id,port_name,port_address
)values(
3,'築地店','東京都中央区築地３丁目１５'
);
insert into port(port_id,port_name,port_address
)values(
4,'押上店','東京都墨田区押上１丁目１−４'
);
insert into port(port_id,port_name,port_address
)values(
5,'業平店','東京都墨田区業平３丁目１７−６'
);
insert into port(port_id,port_name,port_address
)values(
6,'東向島店','東京都墨田区東向島２丁目２６−９'
);
insert into port(port_id,port_name,port_address
)values(
7,'新富駅前店','東京都中央区新富２丁目１２'
);
insert into port(port_id,port_name,port_address
)values(
8,'上野駅前店','東京都台東区東上野３丁目１８−１１'
);
insert into port(port_id,port_name,port_address
)values(
9,'稲荷町店','東京都台東区東上野３丁目３３−２'
);
insert into port(port_id,port_name,port_address
)values(
10,'上野御徒町店','東京都台東区上野４丁目２'
);


/*自転車情報*/
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(1,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(2,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(3,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(4,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(5,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(6,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(7,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(8,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(9,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(10,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(15,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(16,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(17,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(18,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(19,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(20,1,'半蔵門店',150608,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(21,2,'麹町店',150623,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(22,2,'麹町店',150612,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(23,2,'麹町店',150623,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(24,2,'麹町店',150612,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(25,2,'麹町店',150623,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(26,2,'麹町店',150612,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(27,2,'麹町店',150623,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(28,2,'麹町店',150612,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(29,2,'麹町店',150623,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(30,2,'麹町店',150612,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(31,2,'麹町店',150623,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(32,2,'麹町店',150612,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(33,2,'麹町店',150623,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(34,2,'麹町店',150612,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(35,2,'麹町店',150623,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(36,2,'麹町店',150612,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(37,2,'麹町店',150623,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(38,2,'麹町店',150612,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(39,2,'麹町店',150623,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(40,2,'麹町店',150612,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(41,3,'築地店',150610,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(42,3,'築地店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(43,3,'築地店',150610,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(44,3,'築地店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(45,3,'築地店',150610,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(46,3,'築地店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(47,3,'築地店',150610,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(48,3,'築地店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(49,3,'築地店',150610,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(50,3,'築地店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(51,3,'築地店',150610,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(52,3,'築地店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(53,3,'築地店',150610,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(54,3,'築地店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(55,3,'築地店',150610,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(56,3,'築地店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(57,3,'築地店',150610,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(58,3,'築地店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(59,3,'築地店',150610,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(60,3,'築地店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(61,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(62,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(63,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(64,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(65,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(66,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(67,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(68,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(69,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(70,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(71,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(72,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(73,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(74,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(75,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(76,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(77,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(78,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(79,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(80,4,'押上店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(81,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(82,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(83,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(84,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(85,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(86,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(87,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(88,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(89,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(90,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(91,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(92,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(93,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(94,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(95,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(96,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(97,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(98,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(99,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(100,5,'業平店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(101,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(102,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(103,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(104,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(105,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(106,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(107,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(108,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(109,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(110,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(111,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(112,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(113,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(114,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(115,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(116,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(117,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(118,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(119,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(120,6,'東向島店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(121,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(122,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(123,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(124,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(125,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(126,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(127,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(128,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(129,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(130,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(131,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(132,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(133,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(134,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(135,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(136,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(137,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(138,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(139,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(140,7,'新富駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(141,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(142,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(143,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(144,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(145,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(146,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(147,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(148,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(149,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(150,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(151,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(152,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(153,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(154,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(155,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(156,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(157,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(158,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(159,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(160,8,'上野駅前店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(161,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(162,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(163,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(164,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(165,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(166,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(167,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(168,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(169,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(170,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(171,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(172,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(173,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(174,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(175,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(176,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(177,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(178,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(179,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(180,9,'稲荷町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(181,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(182,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(183,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(184,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(185,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(186,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(187,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(188,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(189,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(190,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(191,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(192,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(193,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(194,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(195,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(196,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(197,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(198,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(199,10,'上野御徒町店',150622,1);
insert into cycle(cycle_id,port_id,port_name,due_date,status)values(200,10,'上野御徒町店',150622,1);


/*利用履歴情報*/
insert into reservation_info(customer_id,port_name,cycle_id,plan,reservation_date,price
)values(2,'麹町店',21,1,20150601,200
);
/*利用履歴情報 @author Kaito*/
INSERT INTO reservation_info VALUES(2, '半蔵門店', 1, 2, 20150615,200);
INSERT INTO reservation_info VALUES(2, '麹町店', 21, 1, 20150613,200);
INSERT INTO reservation_info VALUES(1, '麹町店', 22, 2, 20150614,200);
INSERT INTO reservation_info VALUES(2, '築地店', 23, 1, 20150618,200);
INSERT INTO reservation_info VALUES(2, '築地店', 24, 2, 20150619,200);
INSERT INTO reservation_info VALUES(2, '押上店', 25, 1, 20150617,200);
INSERT INTO reservation_info VALUES(2, '押上店', 26, 2, 20150601,200);
INSERT INTO reservation_info VALUES(2, '業平店', 27, 1, 20150601,200);
INSERT INTO reservation_info VALUES(2, '業平店', 28, 2, 20150601,200);
INSERT INTO reservation_info VALUES(2, '東向島店', 29, 1, 20150601,200);
INSERT INTO reservation_info VALUES(2, '東向島店', 30, 3, 20150601,400);
INSERT INTO reservation_info VALUES(2, '新富駅前店', 31, 1, 20150601,200);
INSERT INTO reservation_info VALUES(1, '新富駅前店', 32, 3, 20150601,400);
INSERT INTO reservation_info VALUES(2, '上野駅前店', 33, 1, 20150601,200);
INSERT INTO reservation_info VALUES(2, '上野駅前店', 34, 2, 20150601,200);


/*/Kaito*/



/*管理者情報*/
insert into admin(admin_id,admin_password,port_id
)values(1072,'kaito',1
);
insert into admin(admin_id,admin_password,port_id
)values(2072,'kaito',2
);
insert into admin(admin_id,admin_password,port_id
)values(3072,'kaito',3
);
insert into admin(admin_id,admin_password,port_id
)values(4072,'kaito',4
);
insert into admin(admin_id,admin_password,port_id
)values(5072,'kaito',5
);
insert into admin(admin_id,admin_password,port_id
)values(6072,'kaito',6
);
insert into admin(admin_id,admin_password,port_id
)values(7072,'kaito',7
);
insert into admin(admin_id,admin_password,port_id
)values(8072,'kaito',8
);
