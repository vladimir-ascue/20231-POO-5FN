CREATE DATABASE  IF NOT EXISTS `bdfloreria` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bdfloreria`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bdfloreria
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
-- Table structure for table `tcliente`
--

DROP TABLE IF EXISTS `tcliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tcliente` (
  `idcliente` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `tipodocumento` varchar(45) NOT NULL,
  `numdocumento` varchar(45) NOT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `tipo` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY (`idcliente`),
  UNIQUE KEY `idcliente_UNIQUE` (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tcliente`
--

LOCK TABLES `tcliente` WRITE;
/*!40000 ALTER TABLE `tcliente` DISABLE KEYS */;
INSERT INTO `tcliente` VALUES (1,'vladi','Ascue','dni','40221155','correo@gmail.com','comun','activo'),(2,'carlos','Garcia','dni','52145214','correo@mail.com','vip','acivo');
/*!40000 ALTER TABLE `tcliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdetalleventa`
--

DROP TABLE IF EXISTS `tdetalleventa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tdetalleventa` (
  `iddetalleventa` int NOT NULL AUTO_INCREMENT,
  `tdocumentoventa_iddocumentoventa` int NOT NULL,
  `tflor_idflor` int NOT NULL,
  `p_unitario` double NOT NULL,
  `cantidad` int NOT NULL,
  `descuento` double NOT NULL,
  PRIMARY KEY (`iddetalleventa`,`tdocumentoventa_iddocumentoventa`,`tflor_idflor`),
  UNIQUE KEY `iddetalleventa_UNIQUE` (`iddetalleventa`),
  KEY `fk_tdetalleventa_tdocumentoventa_idx` (`tdocumentoventa_iddocumentoventa`),
  KEY `fk_tdetalleventa_tflor1_idx` (`tflor_idflor`),
  CONSTRAINT `fk_tdetalleventa_tdocumentoventa` FOREIGN KEY (`tdocumentoventa_iddocumentoventa`) REFERENCES `tdocumentoventa` (`iddocumentoventa`),
  CONSTRAINT `fk_tdetalleventa_tflor1` FOREIGN KEY (`tflor_idflor`) REFERENCES `tflor` (`idflor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdetalleventa`
--

LOCK TABLES `tdetalleventa` WRITE;
/*!40000 ALTER TABLE `tdetalleventa` DISABLE KEYS */;
/*!40000 ALTER TABLE `tdetalleventa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdocumentoventa`
--

DROP TABLE IF EXISTS `tdocumentoventa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tdocumentoventa` (
  `iddocumentoventa` int NOT NULL AUTO_INCREMENT,
  `tipodocumento` varchar(45) NOT NULL,
  `numdocumento` varchar(45) NOT NULL,
  `tcliente_idcliente` int NOT NULL,
  `tvendedor_idvendedor` int NOT NULL,
  PRIMARY KEY (`iddocumentoventa`,`tcliente_idcliente`,`tvendedor_idvendedor`),
  UNIQUE KEY `iddocumentoventa_UNIQUE` (`iddocumentoventa`),
  UNIQUE KEY `numdocumento_UNIQUE` (`numdocumento`),
  KEY `fk_tdocumentoventa_tcliente1_idx` (`tcliente_idcliente`),
  KEY `fk_tdocumentoventa_tvendedor1_idx` (`tvendedor_idvendedor`),
  CONSTRAINT `fk_tdocumentoventa_tcliente1` FOREIGN KEY (`tcliente_idcliente`) REFERENCES `tcliente` (`idcliente`),
  CONSTRAINT `fk_tdocumentoventa_tvendedor1` FOREIGN KEY (`tvendedor_idvendedor`) REFERENCES `tvendedor` (`idvendedor`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdocumentoventa`
--

LOCK TABLES `tdocumentoventa` WRITE;
/*!40000 ALTER TABLE `tdocumentoventa` DISABLE KEYS */;
INSERT INTO `tdocumentoventa` VALUES (4,'F','1',1,2),(5,'F','2',2,1),(6,'F','3',2,1);
/*!40000 ALTER TABLE `tdocumentoventa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tflor`
--

DROP TABLE IF EXISTS `tflor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tflor` (
  `idflor` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(75) NOT NULL,
  `aroma` varchar(45) NOT NULL,
  `color` varchar(45) NOT NULL,
  `precio` double NOT NULL DEFAULT '0',
  `stock` int NOT NULL,
  `fcreacion` datetime NOT NULL,
  `estado` varchar(12) NOT NULL DEFAULT '"inactivo"',
  PRIMARY KEY (`idflor`),
  UNIQUE KEY `idflor_UNIQUE` (`idflor`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tflor`
--

LOCK TABLES `tflor` WRITE;
/*!40000 ALTER TABLE `tflor` DISABLE KEYS */;
INSERT INTO `tflor` VALUES (1,'rosa','dulce','roja',34,100,'2023-02-28 17:02:00','activo'),(3,'Margarita','Salado','Negro',100,30,'2023-02-28 00:00:00','agotado'),(4,'Violeta','Amargo','Violeta',35,75,'2023-02-28 20:28:00','activo'),(5,'Geraneo','Suave','Blanco',48,17,'2023-02-28 00:00:00','inactivo');
/*!40000 ALTER TABLE `tflor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tvendedor`
--

DROP TABLE IF EXISTS `tvendedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tvendedor` (
  `idvendedor` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `comision` double NOT NULL,
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY (`idvendedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tvendedor`
--

LOCK TABLES `tvendedor` WRITE;
/*!40000 ALTER TABLE `tvendedor` DISABLE KEYS */;
INSERT INTO `tvendedor` VALUES (1,'Sandra','ccana','correo@mail.com',6,'activo'),(2,'Paul','Salas','Correo@mail.com',6,'activo');
/*!40000 ALTER TABLE `tvendedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'bdfloreria'
--
/*!50003 DROP PROCEDURE IF EXISTS `actualizarflor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizarflor`(
pidflor int,
pnombre varchar(75),
paroma varchar(45),
pcolor varchar(45),
pprecio double,
pstock int,
pfcreacion datetime,
pestado varchar(12)
)
BEGIN
	UPDATE `bdfloreria`.`tflor`
		SET	`nombre` = pnombre,
			`aroma` = paroma,
			`color` =pcolor,
			`precio` = pprecio,
			`stock` = pstock,
			`fcreacion` = pfcreacion,
			`estado` = pestado
		WHERE `idflor` = pidflor;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `crearFlor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `crearFlor`(
pnombre varchar(75),
paroma varchar(45),
pcolor varchar(45),
pprecio double,
pstock int,
pfcreacion datetime,
pestado varchar(12)
)
BEGIN
	INSERT INTO `bdfloreria`.`tflor`
		VALUES(	0,
				pnombre,paroma,
				pcolor,pprecio,
				pstock,pfcreacion,
				pestado
		);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `eliminarFlor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarFlor`(
pidflor int
)
BEGIN
	DELETE FROM `bdfloreria`.`tflor`
		WHERE idflor = pidflor;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `listarFlores` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `listarFlores`()
BEGIN
	SELECT * FROM `bdfloreria`.`tflor`;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `listarFloresActivas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `listarFloresActivas`(pestado varchar(45))
BEGIN
	SELECT * FROM `bdfloreria`.`tflor` where estado = pestado;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `listarFloresEstado` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `listarFloresEstado`(pestado varchar(45))
BEGIN
	SELECT * FROM `bdfloreria`.`tflor` where estado = pestado;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-28 20:38:39
