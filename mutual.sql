-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: mutual
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `afiliados`
--

DROP TABLE IF EXISTS `afiliados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `afiliados` (
  `idAfiliado` int NOT NULL AUTO_INCREMENT,
  `nomYapeAfi` varchar(45) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `dniAfi` varchar(10) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `domicilioAfi` varchar(45) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `telefonoAfi` varchar(45) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `emailAfi` varchar(45) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `estadoAfiliado` int NOT NULL,
  PRIMARY KEY (`idAfiliado`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `afiliados`
--

LOCK TABLES `afiliados` WRITE;
/*!40000 ALTER TABLE `afiliados` DISABLE KEYS */;
INSERT INTO `afiliados` VALUES (1,'Paula Soria','24567897','Salta 23','3875432176','paula@hotmail.com',1),(2,'Alfonsina Ruiz','28765439','Cosquin 654','3517654321','alfonsina@gmail.com',0),(3,'Joaquin Ortiz','24567890','Santiago 7654','3854653455','joaquin123@hotmail.com',1),(4,'Jorge Saad','20674598','Apostoles 3245','3987654321','manu@gmail.com',1),(5,'Dante Iñiguez','25467897','clodomira 345','3855678903','dante@gmail.com',0);
/*!40000 ALTER TABLE `afiliados` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-15 20:34:04
