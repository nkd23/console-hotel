-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: test3
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `gid` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `date_of_birth` date NOT NULL,
  `country_of_residence` varchar(45) NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state_or_province` varchar(45) DEFAULT NULL,
  `postal_code` varchar(15) DEFAULT NULL,
  `phone` varchar(15) NOT NULL,
  `email` varchar(128) NOT NULL,
  `password` varchar(15) DEFAULT NULL,
  `gender` varchar(15) NOT NULL,
  `account` varchar(50) NOT NULL DEFAULT 'user',
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB AUTO_INCREMENT=10006 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,'Mili','Parikh','1999-09-09','USA','87 Sheridan st','Boston','MA','2108','8573829184','parikhmili09@gmail.com','8573829184','Female','user'),(2,'Shaili','Parikh','1999-01-02','India','3 Mark','Mumbai','Mah','390020','123456789','shaili@gmail.com','123456789','Female','user'),(3,'Alex','Henry','1996-12-12','USA','20 Apple St','Boston','Mass','02367','5084561211','email@yahoo.com','5084561211','Female','user'),(4,'Harsh','Modi','1999-10-31','USA','3Mark','Boston','MA','02130','384930469','harsh@gmail.com','384930469','Male','user'),(5,'Amy','Hale','1999-09-12','USA','3Byner','Truro','MA','02381','97234873874','amy@sms.com','97234873874','Female','user'),(6,'Mili','PArikh','1999-09-09','USA','3MArk','Boston','MA','02130','82374973947','mili@s.com','82374973947','Female','user'),(7,'Mili','Parikh','1999-09-09','USA','3Mark','Boston','MA','02130','9347973974','sample@gmail.com','9347973974','Female','user'),(8,'duy','duy','2002-09-23','vietnam','hanoi','hanoi','hehe','hehe','039939393','duy@gmail.com','duy','male','duy'),(9,'duy2','duy2','2002-02-02','ddddddd','dddddd','ddddd','dddddddd','dddddd','202020202','dddddd','duy3','gey','duy1');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-15 23:12:16
