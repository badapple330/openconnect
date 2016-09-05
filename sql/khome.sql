drop database if exists khome;

create database khome;

use khome;

SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS administer;
DROP TABLE IF EXISTS announces;
DROP TABLE IF EXISTS orderoption;
DROP TABLE IF EXISTS ordercottage;
DROP TABLE IF EXISTS cottageinfo;
DROP TABLE IF EXISTS optioninfo;
DROP TABLE IF EXISTS signoutreason;
DROP TABLE IF EXISTS userinfo;




/* Create Tables */

CREATE TABLE administer
(
	id varchar(10) NOT NULL,
	password varchar(10) NOT NULL,
	login boolean NOT NULL
);


CREATE TABLE announces
(
	date date NOT NULL,
	announce text NOT NULL
);


CREATE TABLE cottageinfo
(
	cottageid int(8) NOT NULL AUTO_INCREMENT,
	name varchar(20) NOT NULL,
	price int(10) NOT NULL,
	plan varchar(20) NOT NULL,
	guestnumber int(2) NOT NULL,
	detail text NOT NULL,
	PRIMARY KEY (cottageid)
);


CREATE TABLE optioninfo
(
	optionid int(8) NOT NULL AUTO_INCREMENT,
	optionname varchar(100) NOT NULL,
	price int(7) NOT NULL,
	stock int(2) NOT NULL,
	PRIMARY KEY (optionid)
);


CREATE TABLE ordercottage
(
	ordercottageid int(8) NOT NULL AUTO_INCREMENT,
	cottageid int(8) NOT NULL,
	userid int(8) NOT NULL,
	cottagename varchar(20) NOT NULL,
	checkin varchar(8) NOT NULL,
	checkout varchar(8) NOT NULL,
	term int(2) NOT NULL,
	guestnumber int(2) NOT NULL,
	method varchar(10) NOT NULL,
	total int(7) NOT NULL,
	ordernumber varchar(7) NOT NULL,
	reservationdate timestamp DEFAULT current_timestamp NOT NULL,
	PRIMARY KEY (ordercottageid),
	UNIQUE (ordernumber)
);


CREATE TABLE orderoption
(
	orderoptionid int(8) NOT NULL AUTO_INCREMENT,
	optionid int(8) NOT NULL,
	ordercottageid int(8) NOT NULL,
	userid int(8) NOT NULL,
	date varchar(8) NOT NULL,
	quantity int(2) NOT NULL,
	optiontotal int(7) NOT NULL,
	PRIMARY KEY (orderoptionid)
);


CREATE TABLE signoutreason
(
	a int(3) DEFAULT 0,
	b int(3) DEFAULT 0,
	c int(3) DEFAULT 0,
	d int(3) DEFAULT 0,
	e int(3) DEFAULT 0
);


CREATE TABLE userinfo
(
	userid int(8) NOT NULL AUTO_INCREMENT,
	name text NOT NULL,
	password varchar(16) NOT NULL,
	mailaddress varchar(100) NOT NULL,
	tellnumber varchar(11) NOT NULL,
	postal varchar(9) NOT NULL,
	address varchar(100) NOT NULL,
	uniqueid varchar(30),
	creditflag boolean DEFAULT '0' NOT NULL,
	userdeleteflag boolean DEFAULT '0' NOT NULL,
	PRIMARY KEY (userid),
	UNIQUE (mailaddress),
	UNIQUE (uniqueid)
);



/* Create Foreign Keys */

ALTER TABLE ordercottage
	ADD FOREIGN KEY (cottageid)
	REFERENCES cottageinfo (cottageid)
	ON UPDATE CASCADE
	ON DELETE CASCADE
;


ALTER TABLE orderoption
	ADD FOREIGN KEY (optionid)
	REFERENCES optioninfo (optionid)
	ON UPDATE CASCADE
	ON DELETE CASCADE
;



ALTER TABLE orderoption
	ADD FOREIGN KEY (ordercottageid)
	REFERENCES ordercottage (ordercottageid)
	ON UPDATE CASCADE
	ON DELETE CASCADE
;


ALTER TABLE ordercottage
	ADD FOREIGN KEY (userid)
	REFERENCES userinfo (userid)
	ON UPDATE CASCADE
	ON DELETE CASCADE
;


ALTER TABLE orderoption
	ADD FOREIGN KEY (userid)
	REFERENCES userinfo (userid)
	ON UPDATE CASCADE
	ON DELETE CASCADE
;




/*全部表示*/
/*
create view khome.orderinfoview as select ordercottage.ordercottageid,ordercottage.userid,ordercottage.cottageid,cottageinfo.name,cottageinfo.plan,ordercottage.checkin,ordercottage.checkout,ordercottage.term,ordercottage.guestnumber,ordercottage.method,ordercottage.total,ordercottage.reservationdate,orderoption.optionid,orderoption.quantity,orderoption.optiontotal,optioninfo.optionname from ordercottage left join cottageinfo on ordercottage.cottageid = cottageinfo.cottageid left join orderoption on ordercottage.ordercottageid = orderoption.ordercottageid left join optioninfo on orderoption.optionid = optioninfo.optionid;
 */
create view khome.orderinfoview as select ordercottage.ordercottageid,ordercottage.userid,ordercottage.cottageid,cottageinfo.name,cottageinfo.plan,ordercottage.checkin,ordercottage.checkout,ordercottage.term,ordercottage.guestnumber,ordercottage.method,ordercottage.total,orderoption.optiontotal,ordercottage.reservationdate,orderoption.optionid from ordercottage left join cottageinfo on ordercottage.cottageid = cottageinfo.cottageid left join orderoption on ordercottage.ordercottageid = orderoption.ordercottageid left join optioninfo on orderoption.optionid = optioninfo.optionid group by ordercottage.ordercottageid;

/*オプションなし*/
create view khome.ordercottageview as select ordercottage.ordercottageid,ordercottage.userid,ordercottage.cottageid,cottageinfo.name,cottageinfo.plan,ordercottage.checkin,ordercottage.checkout,ordercottage.term,ordercottage.guestnumber,ordercottage.method,ordercottage.total,ordercottage.reservationdate from ordercottage left join cottageinfo on ordercottage.cottageid = cottageinfo.cottageid;

/*オプションだけ*/
create view khome.orderoptionview as select orderoption.orderoptionid,orderoption.optionid,orderoption.ordercottageid,orderoption.userid,orderoption.quantity,orderoption.optiontotal,optioninfo.optionname from orderoption left join optioninfo on orderoption.optionid = optioninfo.optionid;

