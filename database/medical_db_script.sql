-- MySQL dump 10.13  Distrib 8.0.34, for macos13 (arm64)
--
-- Host: localhost    Database: medicaldb
-- ------------------------------------------------------
-- Server version	8.1.0

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
-- Table structure for table `medical_institution`
--

DROP TABLE IF EXISTS `medical_institution`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medical_institution` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` enum('Clinic','Hospital','MobileEmergencyDepartment') NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `visitors` int DEFAULT '0',
  `workers` int DEFAULT '0',
  `working_hours` varchar(45) DEFAULT 'around the clock',
  `treatment` enum('OUTPATIENT','STATIONARY') DEFAULT NULL,
  `doctors_appointment` tinyint(1) DEFAULT NULL,
  `physical_therapy` tinyint(1) DEFAULT NULL,
  `wards` tinyint(1) DEFAULT NULL,
  `reanimation` tinyint(1) DEFAULT NULL,
  `dining_room` tinyint(1) DEFAULT NULL,
  `perform_operation` tinyint(1) DEFAULT NULL,
  `mobile` tinyint(1) DEFAULT NULL,
  `car` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medical_institution`
--

LOCK TABLES `medical_institution` WRITE;
/*!40000 ALTER TABLE `medical_institution` DISABLE KEYS */;
INSERT INTO `medical_institution` VALUES (1,'Hospital','Klimpton',456,123,'around the clock','STATIONARY',NULL,NULL,1,1,1,1,NULL,NULL),(2,'Hospital','Hipos',1200,398,'around the clock','STATIONARY',NULL,NULL,1,1,1,1,NULL,NULL),(3,'Hospital','Nordon',625,236,'around the clock','STATIONARY',NULL,NULL,1,1,1,1,NULL,NULL),(4,'Hospital','Felix',340,97,'around the clock','STATIONARY',NULL,NULL,1,1,1,1,NULL,NULL),(5,'Clinic','Jersy',245,125,'9:00 - 17:00','OUTPATIENT',1,1,NULL,NULL,NULL,NULL,NULL,NULL),(6,'Clinic','Liops',550,321,'9:00 - 18:00','OUTPATIENT',1,1,NULL,NULL,NULL,NULL,NULL,NULL),(7,'Clinic','Factor',715,321,'9:00 - 17:00','OUTPATIENT',1,1,NULL,NULL,NULL,NULL,NULL,NULL),(8,'Clinic','Reberry',510,307,'9:00 - 21:00','OUTPATIENT',1,1,NULL,NULL,NULL,NULL,NULL,NULL),(9,'MobileEmergencyDepartment','Rochester',5,3,'around the clock','OUTPATIENT',NULL,NULL,NULL,NULL,NULL,NULL,1,1),(10,'MobileEmergencyDepartment','Klivlend',6,3,'around the clock','OUTPATIENT',NULL,NULL,NULL,NULL,NULL,NULL,1,1),(11,'MobileEmergencyDepartment','Baltimor',3,3,'around the clock','OUTPATIENT',NULL,NULL,NULL,NULL,NULL,NULL,1,1),(12,'MobileEmergencyDepartment','Boston',12,3,'around the clock','OUTPATIENT',NULL,NULL,NULL,NULL,NULL,NULL,1,1);
/*!40000 ALTER TABLE `medical_institution` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-28 17:18:15
