-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: bankmanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bankdata`
--

DROP TABLE IF EXISTS `bankdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bankdata` (
  `pin` varchar(10) DEFAULT NULL,
  `date` varchar(42) DEFAULT NULL,
  `type_of_trans` varchar(20) DEFAULT NULL,
  `amount` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bankdata`
--

LOCK TABLES `bankdata` WRITE;
/*!40000 ALTER TABLE `bankdata` DISABLE KEYS */;
INSERT INTO `bankdata` VALUES ('','Sat Jan 14 17:52:56 IST 2023','Deposit','2000'),('','Sat Jan 14 17:53:05 IST 2023','Deposit','2000'),('','Sat Jan 14 17:55:48 IST 2023','Deposit','5000'),('9988','Sat Jan 14 18:17:59 IST 2023','Deposit','5145'),('','Sat Jan 14 22:05:46 IST 2023','Withdrawal','8000'),('','Sat Jan 14 22:07:33 IST 2023','Withdrawal','4400'),('','Sat Jan 14 22:09:52 IST 2023','Deposit','5000\n\n'),('','Sat Jan 14 22:11:31 IST 2023','Withdrawal','500'),('','Sat Jan 14 22:11:48 IST 2023','Deposit','500'),('','Sat Jan 14 22:12:08 IST 2023','Withdrawal','600'),('','Sat Jan 14 22:12:35 IST 2023','Deposit','500'),('','Sat Jan 14 22:12:46 IST 2023','Withdrawal','500'),('','Sat Jan 14 22:13:02 IST 2023','Withdrawal','400'),('9988','Sun Jan 15 00:43:45 IST 2023','Withdrawal','2000'),('9988','Sun Jan 15 00:44:09 IST 2023','Deposit','500'),('9988','Sun Jan 15 17:15:56 IST 2023','Deposit','500\n'),('9988','Sun Jan 15 17:16:08 IST 2023','Withdrawal','200'),('7730','Sun Jan 15 19:00:29 IST 2023','Deposit','5000'),('7730','Sun Jan 15 19:00:40 IST 2023','Withdrawal','200'),('7730','Sun Jan 15 19:01:39 IST 2023','Withdrawal','200'),('7730','Sun Jan 15 19:02:01 IST 2023','Withdrawal','200'),('7730','Sun Jan 15 19:04:55 IST 2023','Withdrawal','200'),('7730','Mon Jan 16 11:50:51 IST 2023','Deposit','500'),('7730','Mon Jan 16 11:51:01 IST 2023','Deposit','600'),('7730','Mon Jan 16 11:51:09 IST 2023','Deposit','200'),('7730','Mon Jan 16 11:51:19 IST 2023','Deposit','1000'),('7730','Mon Jan 16 11:51:27 IST 2023','Withdrawal','600'),('7730','01/16/23 ','Deposit','100'),('7730','01/16/23 ','Deposit','100'),('7730','01/16/23 ','Deposit','100'),('7730','01/16/23 ','Deposit','100'),('7730','01/16/23 12:44 pm','Deposit','100'),('7730','01/16/23 12:45 pm','Deposit','100'),('7730','01/16/23 12:46 pm','Deposit','100'),('7730','01/16/23 12:46 pm','Deposit','100'),('7730','01/16/23 12:46 pm','Deposit','100'),('7730','01/16/23 12:46 pm','Deposit','1000'),('7730','01/16/23 12:48 pm','Withdrawal','500'),('7730','01/16/23 12:50 pm','Withdrawal','100'),('7730','01/16/23 12:50 pm','Withdrawal','100'),('7730','01/16/23 12:51 pm','Withdrawal','500\n'),('7730','01/16/23 12:51 pm','Deposit','200'),('','01/16/23 05:26 pm','Withdrawal','100'),('7884','01/16/23 05:35 pm','Deposit','5000'),('7884','01/16/23 05:35 pm','Deposit','300\n'),('7884','01/16/23 05:35 pm','Deposit','200'),('7884','01/16/23 07:04 pm','Withdrawal','1200'),('7884','01/16/23 07:33 pm','Withdrawal','200'),('7884','01/16/23 08:30 pm','Deposit','200\n'),('7730','01/16/23 08:37 pm','Deposit','200'),('7730','01/16/23 08:37 pm','Withdrawal','200'),('','01/17/23 12:06 pm','Withdrawal','200'),('7884','01/17/23 12:08 pm','Withdrawal','500'),('7884','01/17/23 12:18 pm','Deposit','550'),('7884','01/17/23 12:18 pm','Withdrawal','200'),('7884','01/17/23 12:38 pm','Withdrawal','250'),('9179','01/17/23 01:16 pm','Deposit','5000'),('9179','01/17/23 01:16 pm','Deposit','400'),('9179','01/17/23 01:16 pm','Withdrawal','300'),('9179','01/17/23 01:16 pm','Withdrawal','500'),('6363','01/17/23 01:21 pm','Deposit','5000'),('6363','01/17/23 01:21 pm','Withdrawal','300'),('6363','01/17/23 01:21 pm','Withdrawal','500'),('6363','01/17/23 01:21 pm','Withdrawal','200'),('6363','01/17/23 01:22 pm','Withdrawal','200');
/*!40000 ALTER TABLE `bankdata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `formn` varchar(4) DEFAULT NULL,
  `cardnumber` varchar(16) DEFAULT NULL,
  `pin` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('','5426819969848802','4958'),('8229','5426820351886506','7422'),('8229','5426820529482246','9988'),('','5426820667142574','5413'),('9902','5426820770567328','7730'),('7446','5426820834769589','7884'),('2167','5426820565755693','9179'),('3571','5426819525157036','6363');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signup`
--

DROP TABLE IF EXISTS `signup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signup` (
  `formno` varchar(25) DEFAULT NULL,
  `name` varchar(25) DEFAULT NULL,
  `fname` varchar(30) DEFAULT NULL,
  `dob` varchar(14) DEFAULT NULL,
  `gender` varchar(16) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `marital` varchar(10) DEFAULT NULL,
  `address` varchar(35) DEFAULT NULL,
  `cntry` varchar(20) DEFAULT NULL,
  `state` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `pcode` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signup`
--

LOCK TABLES `signup` WRITE;
/*!40000 ALTER TABLE `signup` DISABLE KEYS */;
INSERT INTO `signup` VALUES ('5868','fddsfsd','fdssf','08-Jan-2000','Female','dfds','Student','Address: ','dsfdsff','dfsdfsf','fdsfdsf','fsdfsd'),('5868','fddsfsd','fdssf','08-Jan-2000','Female','dfds','Student','Address: ','dsfdsff','dfsdfsf','fdsfdsf','fsdfsd'),('8295','Shivansh Vishwakarma','Manohar Vishwakarma','21-Dec-1999','Male','shivanshvish909@gmail.com','Single','Address: ','India','Madhya Pradesh','Jabalpur','482003'),('8805','Rakesh Kumar','Ravish Kumar','14-Jan-1998','Male','rakeshku80@gmail.com','Single','Address: ','India','Gujrat','Ahmedabad','280016'),('8402','sfsdffs','sdfdsfs','13-Jan-2005','Female','fdsfdsf','Student','Address: ','sdfsdfs','fsdfsd','fsdfs','fsdfsfd'),('2074','fdfs','fdff','18-Jan-2023','Female','fsdfs','Unmarried','Address: ','fsdfs','fsdfs','fsdffsdfsf','fsdf'),('','----Select----','--Select--','--Select--','--Select--','--Select--','kj','hj','--Select--','--Select--','null','null'),('3954','Savitri Raj','Suresham Raj','14-Jan-1995','Female','savitriraj88@gmail.com','Student','Address: ','India','Andhra Pradesh','Guntur','380017'),('7179','Himesh','Nimesh','31-Jan-1998','Male','himeshjai@gmail.com','Married','Address: ','Nepal','Kathmandu','Lumbini','566480'),('8229','Prishu Goel Sharma','Yash Goel Sharma','10-Jan-1998','Female','prishuyash10@gmail.com','Single','Address: ','India','Gujrat','Ahmedabad','200183'),('9902','Suresh Nema','Vishalli Nema','21-Jan-2000','Female','vishalinema78@gmail.com','Student','Address: ','India','Madhya Pradesh','Guna','470012'),('7446','Shivansh Vishwakarma','Manohar Vishwakarma','21-Dec-1999','Male','shivanshvish909@gmail.com','Single','Address: ','India','Madhya Pradesh','Jabalpur','482003'),('2167','Himanshu Singh','Raj Singh','18-Jan-1997','Male','himanshusingh34@gmail.com','Single','Address: ','India','Madhya Pradesh','Guna','452201'),('3571','Suresh Shah','Dinesh Shah','10-Jan-1998','Male','sureshshah98@gmail.com','Single','Address: ','India','Gujrat','Gandhinagar','450012');
/*!40000 ALTER TABLE `signup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signup1`
--

DROP TABLE IF EXISTS `signup1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signup1` (
  `sformn` varchar(4) DEFAULT NULL,
  `sdhrm` varchar(40) DEFAULT NULL,
  `sctgry` varchar(10) DEFAULT NULL,
  `samdani` varchar(20) DEFAULT NULL,
  `sshiksha` varchar(25) DEFAULT NULL,
  `spesha` varchar(15) DEFAULT NULL,
  `span` varchar(10) DEFAULT NULL,
  `sadhr` varchar(12) DEFAULT NULL,
  `sscitizn` varchar(3) DEFAULT NULL,
  `sexacc` varchar(3) DEFAULT NULL,
  `skhatano` varchar(14) DEFAULT NULL,
  `sifscod` varchar(14) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signup1`
--

LOCK TABLES `signup1` WRITE;
/*!40000 ALTER TABLE `signup1` DISABLE KEYS */;
INSERT INTO `signup1` VALUES ('3954','Hindu(Including Jain,Buddh,Sikh)','OBC','0 to 1,500,00','School','Graduate','BSFSD5486B','188445761467','NO','NO','null','null'),('7179','Hindu(Including Jain,Buddh,Sikh)','OBC','3,00,000 to 5,00,000','College/University','Businessman','RGSJT4535B','458525455400','NO','YES','5876754787542','SBINO04274'),('8229','Hindu(Including Jain,Buddh,Sikh)','SC/ST','3,00,000 to 5,00,000','School','Student','GHJNB4576O','457600671647','NO','NO','null','null'),('9902','Hindu(Including Jain,Buddh,Sikh)','GENERAL','3,00,000 to 5,00,000','College/University','Student','FDGHK4567L','445761549756','NO','NO','null','null'),('7446','Hindu(Including Jain,Buddh,Sikh)','OBC','1,500,00 to 3,00,000','College/University','Graduate','BMYOC3403X','241119892482','NO','NO','null','null'),('2167','Hindu(Including Jain,Buddh,Sikh)','OBC','3,00,000 to 5,00,000','College/University','Graduate','BMUAJ4561L','456721347895','NO','NO','null','null'),('3571','Hindu(Including Jain,Buddh,Sikh)','OBC','3,00,000 to 5,00,000','College/University','Graduate','JHMHY1548O','774456148932','NO','NO','null','null');
/*!40000 ALTER TABLE `signup1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signup2`
--

DROP TABLE IF EXISTS `signup2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signup2` (
  `formn` varchar(4) DEFAULT NULL,
  `sacctyp` varchar(40) DEFAULT NULL,
  `scardrndm` varchar(16) DEFAULT NULL,
  `pin` varchar(10) DEFAULT NULL,
  `sfacility` varchar(110) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signup2`
--

LOCK TABLES `signup2` WRITE;
/*!40000 ALTER TABLE `signup2` DISABLE KEYS */;
INSERT INTO `signup2` VALUES ('','Current Account','5426820506199357','1585',', Mobile Banking'),('','Current Account','5426820198342373','5037',', Mobile Banking'),('','Current Account','5426819600331099','1562',', Mobile Banking'),('','Current Account','5426820575516318','8611',' ATM CARD'),('','Current Account','5426819302901628','188',', Cheque Book'),('7179','Fixed Deposit Account','5426819515752078','7745',', Internet Banking'),('7179','Fixed Deposit Account','5426820369574942','8462',', Internet Banking'),('','Savings Account','5426819969848802','4958','ATM CARD'),('8229','Savings Account','5426820351886506','7422','ATM CARD'),('8229','Savings Account','5426820529482246','9988','ATM CARD'),('','Savings Account','5426820667142574','5413','ATM CARD'),('9902','Savings Account','5426820770567328','7730','ATM CARD'),('7446','Savings Account','5426820834769589','7884','ATM CARD'),('2167','Savings Account','5426820565755693','9179','ATM CARD'),('3571','Savings Account','5426819525157036','6363','ATM CARD');
/*!40000 ALTER TABLE `signup2` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-01 17:50:40
