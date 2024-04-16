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
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `MANV` int NOT NULL,
  `HOTEN` varchar(50) DEFAULT NULL,
  `GIOITINH` varchar(50) DEFAULT NULL,
  `SDT` varchar(50) DEFAULT NULL,
  `QUEQUAN` varchar(255) DEFAULT NULL,
  `NGAYSINH` date DEFAULT NULL,
  `MACV` varchar(50) DEFAULT NULL,
  `password` int DEFAULT NULL,
  PRIMARY KEY (`MANV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1101,'Nguyễn Minh Đức','Nam','0374329231','Hà Nam','1997-03-28','CV01',11101),(1102,'Nguyễn Hải Nam','Nam','0566736103','Thái Bình','1994-01-17','CV01',1102),(1103,'Lê Hồng Vân','Nữ','0637328392','Hà Nội','1995-10-05','CV01',1103),(1104,'Nguyễn Hồng Hạnh','Nữ','0738473329','Nam Định','1996-03-18','CV01',1104),(1105,'Bùi Văn Dũng','Nam','0957298592','Hà Nội','1991-06-01','CV03',1105),(1106,'Nguyễn Khánh Linh','Nữ','0376632372','Hải Phòng','1990-09-11','CV04',1106),(2201,'Nguyễn Hai Long','Nam','0904398414','Hà Nội','1992-03-04','CV01',2201),(2202,'Pham Thi Linh','Nữ','0973285010','Bắc Giang','1997-12-24','CV01',2202),(2203,'Nguyễn Phương Nhi','Nữ','0989272188','Bắc Ninh','1995-01-01','CV01',2203),(2204,'Trần Như Ý','Nữ','0374820011','Hà Nội','1992-12-05','CV01',2204),(2205,'Lê Bảo Lâm','Nam','0934390245','Hà Nội','1990-06-15','CV02',2205),(2206,'Nguyễn Văn Thành','Nam','0970326224','Hải Phòng','1988-05-27','CV03',2206),(2207,'Cao Ngọc Linh','Nữ','0334724829','Hà Nội','1985-03-03','CV04',2207),(3301,'Nguyễn Thị Hân','Nữ','0538722923','Hưng Yên','2000-10-19','CV01',3301),(3302,'Nguyễn Minh Hồng','Nữ','0673828990','Hà Nội','1997-08-08','CV01',3302),(3303,'Lê Hồng Hoa','Nữ','0932743822','Nam Định','1999-02-03','CV01',3303),(3304,'Trần Thảo Vy','Nữ','0364237481','Hải Dương','1996-12-20','CV01',3304),(3305,'Nguyễn Tiến Minh','Nam','0337422741','Hà Nội','1993-04-09','CV01',3305),(3306,'Bùi Thị Hồng Hạnh','Nữ','0738493473','Vĩnh Phúc','1994-04-19','CV02',3306),(3307,'Nguyễn Cao Hạnh','Nữ','0901282117','Nam Định','1991-11-10','CV03',3307),(3308,'Lê Hải Yến','Nữ','0374822736','Hà Nội','1990-09-30','CV04',3308),(4401,'Nguyễn Văn Vũ','Nam','0986529021','Hà Nội','1995-08-08','CV01',4401),(4402,'Hồ Ý Nhi','Nữ','0917758459','Hà Nội','1997-02-28','CV01',4402),(4403,'Nguyễn Hòng Yến','Nữ','0437832842','Bắc Ninh','1996-11-18','CV01',4403),(4404,'Lê Bảo Trâm','Nữ','0437574810','Ninh Bình','1994-04-01','CV01',4404),(4405,'Lê Văn Đức','Nam','0467282172','Hà Nội','1992-11-11','CV03',4405),(4406,'Bùi Linh Chi','Nữ','0972632994','Hà Nội','1989-01-16','CV04',4406),(5501,'Trần Thị Ánh','Nữ','0733947889','Hà Nội','1995-07-07','CV01',5501),(5502,'Ngô Phương Mai','Nữ','0528323280','Hải Dương','1996-12-17','CV01',5502),(5503,'Ngô Thị Thùy Trang','Nữ','0998632012','Hà Nội','1993-02-10','CV01',5503),(5504,'Vũ Văn Dương','Nam','0163274833','Hà Nội','1997-09-11','CV01',5504),(5505,'Nguyễn Hải Ngân','Nữ','0728256711','Nam Định','1992-06-30','CV02',5505),(5506,'Cao Vũ Thư','Nữ','0983284003','Hải Phòng','1989-10-03','CV03',5506),(5507,'Lê Hải Vân','Nữ','0657838295','Hà Nội','1990-05-15','CV04',5507),(6601,'Nguyễn Thu Thủy','Nữ','0983452060','Hà Nội','2000-01-02','CV01',6601),(6602,'Nguyễn Hồng Hà','Nữ','0917304302','Hà Nội','1999-08-01','CV01',6602),(6603,'Lê Bảo Trâm','Nữ','0873483211','Bắc Ninh','1996-12-25','CV01',6603),(6604,'Hoàng Chí Bảo','Nam','0767526291','Hưng Yên','1999-04-11','CV01',6604),(6605,'Hoàng Thị Giang Anh','Nữ','0834768917','Hà Nội','2001-05-22','CV01',6605),(6606,'Nguyễn Hông Thắm','Nữ','0457348348','Thái Bình','1991-11-13','CV03',6606),(6607,'Trần Ngọc Ánh','Nữ','0870890126','Hà Nội','1994-07-31','CV04',6607),(7701,'Nguyễn Bảo Bình','Nam','0457822898','Hà Nội','1998-11-03','CV01',7701),(7702,'Bùi Thị Ngọc Lan','Nữ','0847229120','Vĩnh Phúc','1996-11-29','CV01',7702),(7703,'Nguyễn Ngọc Linh','Nữ','0871884102','Hà Nội','2001-02-21','CV01',7703),(7704,'Vũ Tùng Hoa','Nữ','0287842192','Ninh Bình','1999-09-26','CV01',7704),(7705,'Trần Tuấn Lân','Nam','0861829201','Hà Nội','1996-05-12','CV02',7705),(7706,'Bùi Thu Trang','Nữ','0829275503','Hà Nội','1994-07-04','CV03',7706),(7707,'Nuyễn Tấn Tài','Nam','0347208518','Hà Nội','1992-01-18','CV04',7707),(8801,'Nguyễn Tuấn Minh','Nam','083246284','Hà Nam','1997-06-09','CV01',8801),(8802,'Nguyễn Hoàng Dương','Nam','0762300878','Bắc Ninh','1995-12-02','CV01',8802),(8803,'Phạm Hồng Phong','Nam','0917090234','Hà Nội','1996-03-12','CV01',8803),(8804,'Cao Thế Long','Nam','0387487905','Hà Nội','1997-01-24','CV01',8804),(8805,'Nguyễn Bá Duy','Nam','0947821745','Lạng Sơn','1995-10-01','CV02',8805),(8806,'Nguyễn Minh Tuấn','Nam','0993002341','Hà Nội','1993-10-01','CV03',8806),(8807,'Lê Anh Đức','Nam','0172485459','Hà Nội','1992-04-11','CV04',8807),(9901,'Nguyễn Mạnh Tiến','Nam','0999988806','Hà Nội','1989-04-22','CV05',9901),(9902,'Bùi Thu Trà','Nữ','0777899043','Hà Nội','1988-02-29','CV05',9902),(9903,'Nguyễn Tiến Đạt','Nam','0378894566','Nam Định','1985-10-09','CV05',9903),(9904,'Phạm Nhật Anh','Nam','0777888666','Hà Nội','1986-12-06','CV05',9904),(9905,'Nguyễn Cao Tường','Nam','0666777999','Hà Nội','1983-04-22','CV06',9905);
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
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
