drop database if exists sports_gym;

create database if not exists sports_gym;
use sports_gym;
-- MySQL dump 10.13  Distrib 5.6.26, for Win64 (x86_64)
--
-- Host: localhost    Database: sports_gym
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_password` varchar(32) NOT NULL,
  `admin_name` varchar(32) NOT NULL,
  `is_login` tinyint(1) DEFAULT NULL,
  `registered_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'admin1','admin1',0,'2015-11-01 12:00:00'),(2,'admin2','admin2',0,'2015-11-02 12:00:00'),(3,'admin3','admin3',0,'2015-11-03 12:00:00'),(4,'admin4','admin4',0,'2015-11-04 12:00:00'),(5,'admin5','admin5',0,'2015-11-05 12:00:00'),(6,'admin6','admin6',0,'2015-11-06 12:00:00'),(7,'admin7','admin7',0,'2015-11-07 12:00:00'),(8,'admin8','admin8',0,'2015-11-08 12:00:00'),(9,'admin9','admin9',0,'2015-11-09 12:00:00'),(10,'admin10','admin10',0,'2015-11-10 12:00:00'),(11,'test','test',0,'0000-01-01 00:00:00');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `registered_date` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (1,1005,'2015-10-03 11:00:00'),(2,1001,'2015-10-04 12:00:00'),(3,1030,'2015-10-04 13:00:00'),(4,1024,'2015-10-05 14:00:00'),(5,1004,'2015-10-08 15:00:00'),(6,1008,'2015-10-16 16:00:00'),(7,1009,'2015-10-17 15:00:00'),(8,1013,'2015-10-17 14:00:00'),(9,1018,'2015-10-18 22:00:00'),(10,1020,'2015-10-18 14:00:00'),(11,1022,'2015-10-18 18:00:00'),(12,1007,'2015-10-19 19:00:00'),(13,1009,'2015-10-19 17:00:00'),(14,1013,'2015-10-21 22:00:00'),(15,1016,'2015-10-23 09:00:00'),(16,1023,'2015-10-23 07:00:00'),(17,1002,'2015-10-23 01:00:00'),(18,1003,'2015-10-24 03:00:00'),(19,1019,'2015-10-28 22:00:00'),(20,1027,'2015-10-29 13:00:00'),(21,1029,'2015-11-01 11:00:00'),(22,1006,'2015-11-03 16:00:00'),(23,1006,'2015-11-04 18:00:00'),(24,1003,'2015-11-06 17:00:00'),(25,1027,'2015-11-11 23:00:00'),(26,1002,'2015-11-14 19:00:00'),(27,1011,'2015-11-14 19:00:00'),(28,1025,'2015-11-14 14:00:00'),(29,1030,'2015-11-15 20:00:00'),(30,1012,'2015-11-21 10:00:00'),(31,1014,'2015-11-23 06:00:00'),(32,1031,'0000-01-01 00:00:00');
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_ticket`
--

DROP TABLE IF EXISTS `order_ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_ticket` (
  `order_id` int(11) NOT NULL,
  `ticket_id` int(11) NOT NULL,
  `sheets` int(11) NOT NULL,
  `total_amount` float NOT NULL,
  `registered_date` datetime NOT NULL,
  KEY `order_id` (`order_id`),
  KEY `ticket_id` (`ticket_id`),
  CONSTRAINT `order_ticket_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `order` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `order_ticket_ibfk_2` FOREIGN KEY (`ticket_id`) REFERENCES `ticket` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_ticket`
--

LOCK TABLES `order_ticket` WRITE;
/*!40000 ALTER TABLE `order_ticket` DISABLE KEYS */;
INSERT INTO `order_ticket` VALUES (1,1,4,6400,'2015-10-03 11:00:00'),(1,5,4,2000,'2015-10-03 11:00:00'),(1,6,2,10000,'2015-10-03 11:00:00'),(2,1,5,8000,'2015-10-04 12:00:00'),(2,5,5,2500,'2015-10-04 12:00:00'),(3,2,2,1400,'2015-10-04 13:00:00'),(4,1,15,22400,'2015-10-05 14:00:00'),(5,4,12,8400,'2015-10-08 15:00:00'),(6,1,2,3200,'2015-10-16 16:00:00'),(6,6,2,10000,'2015-10-16 16:00:00'),(7,1,4,6400,'2015-10-17 15:00:00'),(7,5,4,2500,'2015-10-17 15:00:00'),(8,2,7,4900,'2015-10-17 14:00:00'),(8,4,7,4900,'2015-10-17 14:00:00'),(9,2,19,13300,'2015-10-18 22:00:00'),(9,3,19,13300,'2015-10-18 22:00:00'),(10,1,8,12800,'2015-10-18 14:00:00'),(11,1,12,19200,'2015-10-18 18:00:00'),(11,5,12,6000,'2015-10-18 18:00:00'),(12,3,4,2800,'2015-10-19 19:00:00'),(12,4,4,2800,'2015-10-19 19:00:00'),(13,2,8,5600,'2015-10-19 17:00:00'),(13,3,4,2800,'2015-10-19 17:00:00'),(13,4,4,2800,'2015-10-19 17:00:00'),(14,1,1,1600,'2015-10-21 22:00:00'),(14,6,1,5000,'2015-10-21 22:00:00'),(15,2,10,7000,'2015-10-23 09:00:00'),(16,4,3,2100,'2015-10-23 07:00:00'),(17,1,3,4800,'2015-10-23 01:00:00'),(17,5,3,1500,'2015-10-23 01:00:00'),(18,1,7,11200,'2015-10-24 03:00:00'),(18,6,7,35000,'2015-10-24 03:00:00'),(19,2,5,3500,'2015-10-28 22:00:00'),(19,3,5,3500,'2015-10-28 22:00:00'),(20,1,8,12800,'2015-10-29 13:00:00'),(21,1,3,4800,'2015-11-01 11:00:00'),(21,6,3,15000,'2015-11-01 11:00:00'),(22,4,7,4900,'2015-11-03 16:00:00'),(23,2,7,4900,'2015-11-04 18:00:00'),(23,5,7,3500,'2015-11-04 18:00:00'),(23,6,7,35000,'2015-11-04 18:00:00'),(24,1,2,3200,'2015-11-06 17:00:00'),(24,6,2,10000,'2015-11-06 17:00:00'),(25,3,8,5600,'2015-11-11 23:00:00'),(26,1,5,8000,'2015-11-14 19:00:00'),(26,6,1,5000,'2015-11-14 19:00:00'),(27,3,3,4800,'2015-11-14 19:00:00'),(28,1,6,9600,'2015-11-14 14:00:00'),(29,1,1,1600,'2015-11-15 20:00:00'),(30,2,3,4800,'2015-11-21 10:00:00'),(31,1,7,11200,'2015-11-23 06:00:00'),(31,5,7,3500,'2015-11-23 06:00:00'),(31,6,1,5000,'2015-11-23 06:00:00'),(32,7,10,1000,'0000-01-01 00:00:00');
/*!40000 ALTER TABLE `order_ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `price` float NOT NULL,
  `ticket_type` varchar(25) NOT NULL,
  `is_sale` tinyint(1) NOT NULL,
  `is_show` tinyint(1) NOT NULL,
  `registered_date` datetime NOT NULL,
  `renew_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (1,'フルセット',1600,'use',1,1,'2015-01-01 09:00:00','2015-07-07 15:00:00'),(2,'マシンジム',700,'use',1,1,'2015-02-02 10:00:00','2015-08-08 16:00:00'),(3,'プール',700,'use',1,1,'2015-03-03 11:00:00','2015-09-09 17:00:00'),(4,'ジャグジー',700,'use',1,1,'2015-04-04 12:00:00','2015-10-10 18:00:00'),(5,'レンタル',500,'option',1,1,'2015-05-05 13:00:00','2015-11-11 19:00:00'),(6,'パーソナルトレーナー(1H)',5000,'option',1,1,'2015-06-06 14:00:00','2015-12-12 20:00:00'),(7,'test',100,'test',0,0,'2015-01-01 00:00:00','0001-01-01 00:00:00');
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(100) NOT NULL,
  `password` varchar(32) NOT NULL,
  `name` varchar(100) NOT NULL,
  `tel_num` varchar(13) NOT NULL,
  `postal_code` varchar(8) NOT NULL,
  `address` varchar(255) NOT NULL,
  `unique_id` varchar(50) DEFAULT NULL,
  `oauth_name` varchar(15) DEFAULT NULL,
  `credit_token` varchar(255) DEFAULT NULL,
  `credit_num` varchar(4) DEFAULT NULL,
  `registered_date` datetime NOT NULL,
  `renew_date` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=1032 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1001,'hidehiko202@dydrfgvpca.com','XWchBiUd','中　英彦','07-6406-0942','922-0307','石川県加賀市干拓町2-16-1',NULL,NULL,NULL,NULL,'2015-09-01 12:00:00','2015-11-01 12:00:00'),(1002,'soratsuruta@rvwac.co.jp','VvPdcVjl','鶴田　空','463-319-2048','244-0806','神奈川県横浜市戸塚区上品濃4-9',NULL,NULL,NULL,NULL,'2015-09-02 12:00:00','2015-11-02 12:00:00'),(1003,'vz=tmbwrm=zcg-vkazuto376@jfgm.ne.jp','A2DcygAw','河野　和人','8411808040','722-1201','広島県世羅郡世羅町戸張1-4-3',NULL,NULL,NULL,NULL,'2015-09-03 12:00:00','2015-11-03 12:00:00'),(1004,'qbjhyjontrinka677@jfftsf.com','n7KXShHE','牧野　凛香','773-283-6743','620-0947','京都府福知山市旭が丘4-14',NULL,NULL,NULL,NULL,'2015-09-03 15:00:00','2015-11-03 15:00:00'),(1005,'Ayana_Mizukami@lwbjtf.co.jp','wTJFuCvn','水上　絢菜','98-2355-4314','882-0003','宮崎県延岡市稲葉崎町3-12テラス稲葉崎町104',NULL,NULL,NULL,NULL,'2015-09-05 12:00:00','2015-11-05 12:00:00'),(1006,'vrftrqucu-opkfwyasuko952@xgxmxhuh.ne.jp','GX3gSqai','杉山　泰子','993-352-4892','894-0015','鹿児島県奄美市名瀬真名津町2-4',NULL,NULL,NULL,NULL,'2015-09-10 12:00:00','2015-11-10 12:00:00'),(1007,'yoshihiko4313@pnkco.com','gGzasXOo','松浦　芳彦','5857-37-7933','501-2805','岐阜県関市洞戸尾倉3-18-14洞戸尾倉ドリーム416',NULL,NULL,NULL,NULL,'2015-09-12 12:00:00','2015-11-12 12:00:00'),(1008,'yoshiaki2129@wlzeem.co.jp','SdwBIED9','宮内　義昭','85-3851-3628','753-0088','山口県山口市中河原2-1-13',NULL,NULL,'328C5022CCC950D0BC9CE3E3F752CC0B9363AB949D46C63DDC4C95FF2D2F2609','1133','2015-09-21 12:00:00','2015-11-21 12:00:00'),(1009,'kikuo086@mwvrdxkjxt.ne.jp','Lw7OriGO','大村　菊男','027-270-9051','370-2301','群馬県富岡市桑原1-7-3',NULL,NULL,NULL,NULL,'2015-09-22 12:00:00','2015-11-22 12:00:00'),(1010,'ikimoto@surnlio.com','iyOT8VLl','木本　忠良','568-8082-840','479-0016','愛知県常滑市高坂2-2-7',NULL,NULL,'BFB1D1AF954E6B07D1D7A17DF3E8F305FEA11155A0DA98610DA39EF3CCC5A8E0','5643','2015-10-02 12:00:00','2015-11-02 12:00:00'),(1011,'masumiichikawa@srul.co.jp','bG2MT6vP','市川　真澄','88-4178-2678','789-0168','高知県長岡郡大豊町立野4-17-9',NULL,NULL,NULL,NULL,'2015-10-04 12:00:00','2015-11-04 12:00:00'),(1012,'chouhei199@lqifrllg.ne.jp','wVI4c3lc','飯塚　長平','950-458-9259','841-0045','佐賀県鳥栖市安楽寺町3-16-4',NULL,NULL,NULL,NULL,'2015-10-07 12:00:00','2015-11-07 12:00:00'),(1013,'ks=kiai-lhrfsutoshiaki108@lfmtwazt.com','gmSUI2ui','金子　俊章','62-6900-0925','560-0041','大阪府豊中市清風荘3-19',NULL,NULL,'4D46044EE7AFDD2EE36799B297FCC3C5652AFF56DCA0F42DC880BD213CA55591C','2287','2015-10-14 12:00:00','2015-11-14 12:00:00'),(1014,'Ayaka_Matsuzaki@mumydonus.co.jp','HYweTohg','松崎　綾華','7206-301-377','574-0033','大阪府大東市扇町3-2-15',NULL,NULL,NULL,NULL,'2015-10-15 12:00:00','2015-11-15 12:00:00'),(1015,'yayoi41382@dxikfoczhf.ne.jp','CbeKi2ua','福島　弥生','95-2037-2277','848-0027','佐賀県伊万里市立花町4-14-17',NULL,NULL,NULL,NULL,'2015-10-16 12:00:00','2015-11-16 12:00:00'),(1016,'eijimasuda@ttkvcq.com','2uZA5cWi','増田　栄二','970-159-5438','870-1123','大分県大分市寒田2-14-4コート寒田319',NULL,NULL,'D06F42AA0C5C4AF8CC499E9FBB408F28C195774DD85370C0790F246ADEA67B39','3795','2015-10-20 12:00:00','2015-11-20 12:00:00'),(1017,'ginzou11232@nounxzos.co.jp','9IyQHNtq','大井　銀蔵','05-4208-2720','436-0334','静岡県掛川市孕石1-16シティ孕石300',NULL,NULL,NULL,NULL,'2015-10-23 12:00:00','2015-11-23 12:00:00'),(1018,'esbjlbemiwao23281@nfdtmf.ne.jp','nsYwkrBO','川崎　岩夫','276-016-3090','370-0024','群馬県高崎市八幡原町1-2-15ハイツ八幡原町102',NULL,NULL,NULL,NULL,'2015-10-25 12:00:00','2015-12-25 12:00:00'),(1019,'apmgyrrrp=jfpmitsuaki823@bgjp.com','CXABNQwh','奈良　光昭','114-6902-788','090-0051','北海道北見市高栄東町4-5-19',NULL,NULL,NULL,NULL,'2015-10-28 12:00:00','2015-12-28 12:00:00'),(1020,'takashi_akasaka@osdrpm.co.jp','8WqvyQwo','赤坂　卓','99-4800-8209','891-6154','鹿児島県大島郡喜界町白水2-4-1',NULL,NULL,NULL,NULL,'2015-10-29 12:00:00','2015-12-29 12:00:00'),(1021,'tateaki11554@dhrqfwidb.ne.jp','YS04qAzz','榊原　賢明','073-550-2932','643-0602','和歌山県有田郡有田川町杉野原3-12キャッスル杉野原412',NULL,NULL,NULL,NULL,'2015-11-06 12:00:00','2015-12-06 12:00:00'),(1022,'Sachiko_Uchimura@ckdyysm.com','zFJJlIgr','内村　幸子','805-8614-463','683-0364','鳥取県西伯郡南部町絹屋1-8-18絹屋プラチナ406',NULL,NULL,NULL,NULL,'2015-11-08 12:00:00','2015-12-08 12:00:00'),(1023,'yumiko_egashira@ewwflo.co.jp','XQZ6f0Xj','江頭　弓子','7062-851-405','929-0432','石川県河北郡津幡町北横根3-14-1ザ北横根318',NULL,NULL,NULL,NULL,'2015-11-09 12:00:00','2015-12-09 12:00:00'),(1024,'kenji59106@cktpddbtd.ne.jp','3KoN97XP','手島　健二','90-5377-9098','851-3504','長崎県西海市西海町木場郷1-2-14西海町木場郷コーポ204',NULL,NULL,NULL,NULL,'2015-11-11 12:00:00','2015-12-11 12:00:00'),(1025,'iojima@taqortyttl.com','hHdgAJ7N','小嶋　敬一','554-007-2942','419-0115','静岡県田方郡函南町新田4-13-2リバーサイド新田102',NULL,NULL,NULL,NULL,'2015-11-13 12:00:00','2015-12-13 12:00:00'),(1026,'akira0894@rsed.co.jp','RhrBSvbW','平尾　晶','20-3213-4540','999-3722','山形県東根市泉郷4-10-17泉郷ダイヤモンド416',NULL,NULL,NULL,NULL,'2015-11-17 12:00:00','2015-12-17 12:00:00'),(1027,'youko7746@glkszkvooe.ne.jp','PjIejJ9K','金井　容子','769-085-1613','939-0245','富山県射水市棚田3-14-1',NULL,NULL,NULL,NULL,'2015-11-18 12:00:00','2015-12-18 12:00:00'),(1028,'hatsue_takefuji@wwhkiha.com','2vp5TPQa','武藤　初江','2880-44-9679','329-0418','栃木県下野市紫2-10',NULL,NULL,'0CBB82BC1016A8934B8FD188B4537C0E02053D89DC9CD6950D85D5D7C71279B4','6187','2015-11-19 12:00:00','2015-12-19 12:00:00'),(1029,'Isao_Asano@guxpb.co.jp','R7tCEoR1','浅野　勲','242-067-1230','963-4313','福島県田村市船引町石森1-9船引町石森ドリーム305',NULL,NULL,NULL,NULL,'2015-11-24 12:00:00','2015-01-24 12:00:00'),(1030,'ildmgwpmzpcnobaoi1316@sszqifnk.ne.jp','IGfd1Usq','古市　蒼依','04-4888-7703','257-0015','神奈川県秦野市平沢4-7-20プレシャス平沢417',NULL,NULL,NULL,NULL,'2015-11-26 12:00:00','2015-01-26 12:00:00'),(1031,'test@test.com','testtest','test','00-0000-0000','000-0000','test','test',NULL,'test','0000','0000-01-01 00:00:00','0001-01-01 00:00:00');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-26 14:32:27
