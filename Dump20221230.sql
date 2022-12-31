-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: navessofka
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
-- Table structure for table `lanzadera`
--

DROP TABLE IF EXISTS `lanzadera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lanzadera` (
  `nombre` varchar(45) NOT NULL,
  `peso` int NOT NULL,
  `empuje` int NOT NULL,
  `capacidad_carga` int NOT NULL,
  `altura` int NOT NULL,
  `alcance` int NOT NULL,
  `potencia` int NOT NULL,
  `combustible` varchar(45) NOT NULL,
  `pais` varchar(45) NOT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lanzadera`
--

LOCK TABLES `lanzadera` WRITE;
/*!40000 ALTER TABLE `lanzadera` DISABLE KEYS */;
INSERT INTO `lanzadera` VALUES ('Atenea',2900,3500,450,100,400,3500,'liquido','USA'),('Challenger',2000,3000,500,100,450,32000,'solido','USA'),('Challenger v',2000,3000,500,100,300,32000,'Liquido','China'),('Challenger-5',2000,3000,500,100,450,32000,'Liquido','USA'),('Zenit',2400,3000,400,60,250,32000,'oxido de nitrogeno','Rusia');
/*!40000 ALTER TABLE `lanzadera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notripuladas`
--

DROP TABLE IF EXISTS `notripuladas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notripuladas` (
  `nombre` varchar(45) NOT NULL,
  `cantidadMotores` int NOT NULL,
  `empuje` int NOT NULL,
  `mision` varchar(45) NOT NULL,
  `combustible` varchar(45) NOT NULL,
  `pais` varchar(45) NOT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notripuladas`
--

LOCK TABLES `notripuladas` WRITE;
/*!40000 ALTER TABLE `notripuladas` DISABLE KEYS */;
INSERT INTO `notripuladas` VALUES ('Hubble',5,100,'Exploracion','Solar','USA'),('Sputnik',2,60,'Exploracion','Solar','Rusia'),('Tian',5,120,'Lunar','Liquido y solar','China');
/*!40000 ALTER TABLE `notripuladas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tripuladas`
--

DROP TABLE IF EXISTS `tripuladas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tripuladas` (
  `nombre` varchar(45) NOT NULL,
  `finalidadUso` varchar(45) NOT NULL,
  `peso` int NOT NULL,
  `distanciadeorbita` int NOT NULL,
  `capacidad` int NOT NULL,
  `pais` varchar(45) NOT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tripuladas`
--

LOCK TABLES `tripuladas` WRITE;
/*!40000 ALTER TABLE `tripuladas` DISABLE KEYS */;
INSERT INTO `tripuladas` VALUES ('Apolo 10','Misiones lunares',66,400,4,'USA'),('Apolo 11','Misiones lunares',66,400,4,'USA'),('EEI','Mantenimiento y exploracion',100,300,6,'ONU');
/*!40000 ALTER TABLE `tripuladas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-30 19:26:31
