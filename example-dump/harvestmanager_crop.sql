-- MySQL dump 10.13  Distrib 8.0.29, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: harvestmanager
-- ------------------------------------------------------
-- Server version	8.0.32-0ubuntu0.20.04.2

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
-- Table structure for table `crop`
--

DROP TABLE IF EXISTS `crop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `crop` (
  `crop_id` bigint NOT NULL AUTO_INCREMENT,
  `active` bit(1) NOT NULL,
  `crop_name` varchar(255) NOT NULL,
  `seedlings_number` int NOT NULL,
  `location_id` bigint NOT NULL,
  `plant_stage_id` bigint NOT NULL,
  `soil_id` bigint NOT NULL,
  `sort_id` bigint NOT NULL,
  PRIMARY KEY (`crop_id`),
  KEY `FKs2kbn7h1qt3h44rp2nvugf4v3` (`location_id`),
  KEY `FKcart3glftjjr267sgnd6f1w7d` (`plant_stage_id`),
  KEY `FKofmcjuxkp03kvdjtvjngr2vkj` (`soil_id`),
  KEY `FK4s70bxjkku9p1cessey70n84u` (`sort_id`),
  CONSTRAINT `FK4s70bxjkku9p1cessey70n84u` FOREIGN KEY (`sort_id`) REFERENCES `sort` (`sort_id`),
  CONSTRAINT `FKcart3glftjjr267sgnd6f1w7d` FOREIGN KEY (`plant_stage_id`) REFERENCES `plant_stage` (`plant_stage_id`),
  CONSTRAINT `FKofmcjuxkp03kvdjtvjngr2vkj` FOREIGN KEY (`soil_id`) REFERENCES `soil` (`soil_id`),
  CONSTRAINT `FKs2kbn7h1qt3h44rp2nvugf4v3` FOREIGN KEY (`location_id`) REFERENCES `location` (`location_id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crop`
--

LOCK TABLES `crop` WRITE;
/*!40000 ALTER TABLE `crop` DISABLE KEYS */;
INSERT INTO `crop` VALUES (37,_binary '','Domat',3,13,5,16,8),(38,_binary '\0','Strawberry',9,14,8,14,11),(39,_binary '','Cucumber',5,13,4,18,12);
/*!40000 ALTER TABLE `crop` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-15 12:04:50
