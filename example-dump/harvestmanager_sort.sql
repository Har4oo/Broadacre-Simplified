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
-- Table structure for table `sort`
--

DROP TABLE IF EXISTS `sort`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sort` (
  `sort_id` bigint NOT NULL AUTO_INCREMENT,
  `origin` varchar(255) NOT NULL,
  `sort_name` varchar(255) NOT NULL,
  `sort_description` varchar(1000) NOT NULL,
  PRIMARY KEY (`sort_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sort`
--

LOCK TABLES `sort` WRITE;
/*!40000 ALTER TABLE `sort` DISABLE KEYS */;
INSERT INTO `sort` VALUES (8,'Petrich','Campari','Campari is a type of tomato, noted for its juiciness, high sugar level, low acidity, and lack of mealiness. Campari\'s are deep red and larger than a cherry tomato, but smaller and rounder than a plum tomato. They are often sold as “tomato-on-the-vine” (TOV) in supermarkets, a category of tomato that has become increasingly popular over the years. Campari tomatoes can be produced from different varieties, such as Mountain Magic. As a hybrid, the seeds cost around $150,000 per pound. The company Mastronardi Produce registered the term “Campari” as a United States trademark for its tomatoes in 2003; however, the trademark was challenged in 2006 based on claims that “Campari” is actually the general name for the tomato variety bred in the 1990s by the Dutch company Enza Zaden.'),(9,'Sandanski','Cherokee','Cherokee Purple is the name of a cultivar of tomato that develops a fruit with a deep, dusky-rose color while maintaining a somewhat greenish hue near the stem when mature for eating. The deep crimson interior and clear skin combination give it its distinctive color. It was one of the first of the darker color group of tomatoes sometimes described as “blacks”; the variety Purple Calabash, with its highly irregularly shaped fruits, arose in a very few seed catalogs in the mid-1900s. Southern Exposure Seed Exchange was the first seed company to offer Cherokee Purple, released in limited quantity in 1993.'),(10,'Bansko','Albion','Day-neutral strawberries, ‘Albion’ are very large red fruits with excellent flavor and fruit quality. They are relatively resistant to common strawberry diseases, including verticillium wilt, phytophthora crown rot, and anthracnose crown rot.'),(11,'Plovdiv','Camarosa','Relatively heat-tolerant, ‘Camarosa’ is a June-bearing strawberry cultivar best suited for warm climates, such as Southern California. '),(12,'Svishtov','Gherkin','Diminutive gherkins, or cornichons, are pickled baby cucumbers that have been allowed to ferment.  Almost always found pickled in brine or vinegar, they are the perfect accompaniment to charcuterie and cheeses.'),(13,'Pleven','Gergana','Cucumber – Gergana is a vigorous early variety which produces a high yield of delicious cucumbers with a smooth skin. This variety comes highly recommended from my Bulgarian friend as the best tasting sweetest cucumber ever! It’s an open-pollinated variety but still produces bitter-free fruits.');
/*!40000 ALTER TABLE `sort` ENABLE KEYS */;
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
