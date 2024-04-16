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
-- Table structure for table `marriott_hotel_chain`
--

DROP TABLE IF EXISTS `marriott_hotel_chain`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marriott_hotel_chain` (
  `hid` int NOT NULL AUTO_INCREMENT,
  `city` varchar(45) NOT NULL,
  `state` char(2) NOT NULL,
  `zip_code` char(5) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `website` varchar(512) DEFAULT NULL,
  `no_rooms` int DEFAULT NULL,
  PRIMARY KEY (`hid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marriott_hotel_chain`
--

LOCK TABLES `marriott_hotel_chain` WRITE;
/*!40000 ALTER TABLE `marriott_hotel_chain` DISABLE KEYS */;
INSERT INTO `marriott_hotel_chain` VALUES (1,'Boston','MA','12130','5678329173','https://www.marriott.com/default.mi',200),(2,'Worcester ','MA','12936','3947285332','https://www.marriott.com/default.mi',120),(3,'Natick','MA','13826','9382749991','https://www.marriott.com/default.mi',39),(4,'Lowell','MA','19285','2847392856','https://www.marriott.com/default.mi',55),(5,'New York','NY','20589','2748349292','https://www.marriott.com/default.mi',340);
/*!40000 ALTER TABLE `marriott_hotel_chain` ENABLE KEYS */;
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
