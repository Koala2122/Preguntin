-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	6.0.10-alpha-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema proyecto2
--

CREATE DATABASE IF NOT EXISTS proyecto2;
USE proyecto2;

--
-- Definition of table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `User` varchar(45) DEFAULT NULL,
  `Pass` int(11) DEFAULT NULL,
  `Id` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`User`,`Pass`,`Id`) VALUES 
 ('Juan',11012011,2),
 ('root',12345,3),
 ('Jeremias',123456,4),
 ('Nahuel',1234567,5),
 ('Jona',12345678,6);
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;


--
-- Definition of table `correcta`
--

DROP TABLE IF EXISTS `correcta`;
CREATE TABLE `correcta` (
  `Id_Respuesta` int(11) NOT NULL,
  `respuesta` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id_Respuesta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `correcta`
--

/*!40000 ALTER TABLE `correcta` DISABLE KEYS */;
INSERT INTO `correcta` (`Id_Respuesta`,`respuesta`) VALUES 
 (2,'Corinthians'),
 (3,'Luciana Aymar'),
 (4,'Cuatro'),
 (5,'Christian Vieri'),
 (6,'Futbol'),
 (7,'Cuatro'),
 (8,'Crol'),
 (9,'Quince'),
 (10,'Doce'),
 (11,'Estados Unidos'),
 (12,'Desintegramiento de piedra'),
 (13,'Son jugadores de beisbol'),
 (14,'Inglaterra'),
 (15,'Argentina'),
 (16,'Bruce Lee'),
 (17,'Skateboard'),
 (18,'Rugby'),
 (19,'Verde'),
 (20,'Boedo'),
 (21,'San Nicol s'),
 (22,'Alejandro S nchez Pizarro'),
 (23,'Mexicana'),
 (24,'Britney Spears'),
 (25,'Michael Jackson'),
 (26,'Marc Anthony'),
 (27,'James Paul McCartney'),
 (28,'Jonh Lennon'),
 (29,'Jamaica'),
 (30,'Stefani Germanotta'),
 (31,'Miley Cirus'),
 (32,'My heart will go on'),
 (33,'Taylor Swift'),
 (34,'Justin Bieber'),
 (35,'Liverpool'),
 (36,'Freddy Mercury'),
 (37,'Katy Perry'),
 (38,'Veterinario'),
 (39,'Jose Mar¡a Carbajal'),
 (40,'Mariano Basterreix'),
 (41,'Hepatitis'),
 (42,'Ingerida'),
 (43,'La absorcion de nutrientes'),
 (44,'Cordias'),
 (45,'De solido a gaseoso'),
 (46,'Higado'),
 (47,'Rojo'),
 (48,'Esofago'),
 (49,'Del azucar'),
 (50,'20'),
 (51,'Mezcalina'),
 (52,'El nervio optico'),
 (53,'La primera leche materna'),
 (54,'El alce'),
 (55,'El estibo'),
 (56,'En el amazona'),
 (57,'Los peces'),
 (58,'Ballena azul'),
 (59,'15 metros'),
 (60,'Ciclo Hidrologico'),
 (61,'Sunismo'),
 (62,'De informacion y turismo'),
 (63,'1941'),
 (64,'Palestina'),
 (65,'Insurreccional autogestionario del XIX'),
 (66,'Hugo Chavez'),
 (67,'La principal masa social revolucionaria'),
 (68,'Protestas de plaza Tian Anmen, Pekin'),
 (69,'Todas son correctas'),
 (70,'649'),
 (71,'Caral'),
 (72,'Antonio Maura'),
 (73,'Gengis Kan'),
 (74,'Todas son correctas'),
 (75,'Comunion Tradicionalista Carlista'),
 (76,'Moderna'),
 (77,'Union sovietica'),
 (78,'El dia de la mujer'),
 (79,'Mariano Rajoy'),
 (80,'Dos'),
 (81,'Legislador'),
 (82,'Poligono'),
 (83,'Trapecio'),
 (84,'Cuadrilatero'),
 (85,'Falso'),
 (86,'Trapecio'),
 (87,'Trapezoide'),
 (88,'Perimetro'),
 (89,'La medida de las figuras geometricas'),
 (90,'Lado'),
 (91,'Agudo'),
 (92,'Recto'),
 (93,'Obtuso'),
 (94,'Apotema'),
 (95,'Suplementarios'),
 (96,'20grados y 110 grados'),
 (97,'30 y 60 son complementarios'),
 (98,'A la raiz cuadrada del producto'),
 (99,'4580'),
 (100,'3969'),
 (101,'6'),
 (102,'42'),
 (103,'Antartic'),
 (104,'Homero'),
 (105,'Nile'),
 (106,'America'),
 (107,'Red, White and Green'),
 (108,'The ocean Pacific'),
 (109,'1492'),
 (110,'Bernabeu'),
 (111,'Lionel Messi'),
 (112,'MotorCycling'),
 (113,'Uruguay'),
 (114,'Santa Elena'),
 (115,'Birth of Confucius'),
 (116,'George Washington'),
 (117,'Lenningrado'),
 (118,'To say that Earth revolved around the sun'),
 (119,'Germany'),
 (120,'Century XVI'),
 (121,'Cusco'),
 (122,'Anonimo'),
 (123,'Cobre'),
 (124,'Mir'),
 (125,'Telescopio'),
 (126,'2'),
 (127,'Un avion supersonico'),
 (128,'Pinocho'),
 (129,'Copenhague'),
 (130,'Platon'),
 (131,'Que come carne'),
 (132,'Producto'),
 (133,'El pacifico'),
 (134,'Thriller, Mickael Jackson'),
 (135,'Paris, Francia'),
 (136,'Baloncesto'),
 (137,'45'),
 (138,'Tierra'),
 (139,'Libra'),
 (140,'Murcielago'),
 (141,'Estados Unidos');
/*!40000 ALTER TABLE `correcta` ENABLE KEYS */;


--
-- Definition of table `incorrecta`
--

DROP TABLE IF EXISTS `incorrecta`;
CREATE TABLE `incorrecta` (
  `Id_Respuesta` int(11) NOT NULL,
  `respuesta` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id_Respuesta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `incorrecta`
--

/*!40000 ALTER TABLE `incorrecta` DISABLE KEYS */;
INSERT INTO `incorrecta` (`Id_Respuesta`,`respuesta`) VALUES 
 (6,'Botafogo'),
 (7,'Diego Formal'),
 (8,'Florencia Espino'),
 (9,'Luciana Salazar'),
 (10,'Cinco'),
 (11,'Tres'),
 (12,'Diez'),
 (13,'Lionel Messi'),
 (14,'Fernando Torres'),
 (15,'Ferreira Carrasco'),
 (16,'Voleibol'),
 (17,'Basquetbol'),
 (18,'H ndbol'),
 (19,'Cinco'),
 (20,'Tres'),
 (21,'Dos'),
 (22,'Mariposa'),
 (23,'Pecho'),
 (24,'Espalda'),
 (25,'Doce'),
 (26,'Treinta'),
 (27,'Veinte'),
 (28,'Nueve'),
 (29,'Ocho'),
 (30,'Ninguna'),
 (31,'Inglaterra'),
 (32,'Uruguay'),
 (33,'Francia'),
 (34,'Desintegramiento de madera'),
 (35,'Desintegramiento de casas'),
 (36,'Desintegramiento de todas las anteriores'),
 (37,'Son jugadores de f£tbol'),
 (38,'Son jugadores de ajedrez'),
 (39,'Son jugadores de Zudokku'),
 (40,'Escocia'),
 (41,'Brasil'),
 (42,'Sud frica'),
 (43,'Uruguay'),
 (44,'Brasil'),
 (45,'Chile'),
 (46,'Jakie Chan'),
 (47,'Chuck Norris'),
 (48,'J Olmander'),
 (49,'Tenis'),
 (50,'Ciclismo'),
 (51,'Surf'),
 (52,'Futbol'),
 (53,'Basquetbol'),
 (54,'Tenis'),
 (55,'Rojo'),
 (56,'Negro'),
 (57,'Blanco'),
 (58,'Barracas'),
 (59,'Rio Blanco'),
 (60,'San Justo'),
 (61,'San Juan'),
 (62,'San Fernando'),
 (63,'San Martin'),
 (64,'Alejandro Sandez Diaz'),
 (65,'Alejandro Diaz Aguiar'),
 (66,'Alejandro Vergara Cisneros'),
 (67,'Uruguaya'),
 (68,'Argentina'),
 (69,'Brasilera'),
 (70,'Justin Bieber'),
 (71,'One Direction'),
 (72,'Yao Cabrera'),
 (73,'Justin Bieber'),
 (74,'Bob Marley'),
 (75,'Luciano Belez'),
 (76,'Yao Cabrera'),
 (77,'Martin P Disalvo'),
 (78,'Fransisco Postiglione'),
 (79,'Juan Paul McCartney'),
 (80,'Jose Paul McCartney'),
 (81,'Josue Paul McCartney'),
 (82,'Ringo Star'),
 (83,'Martin Jocket'),
 (84,'Paul McCartney'),
 (85,'Africa'),
 (86,'Congo'),
 (87,'Honduras'),
 (88,'Selena Sirth'),
 (89,'Bryney Spear'),
 (90,'Julieta Venega'),
 (91,'Lady Gaga'),
 (92,'Demi Lovato'),
 (93,'Ariana Grande'),
 (94,'My heart not dead'),
 (95,'My heart in the sky'),
 (96,'My heart is a soul'),
 (97,'Jennifer Lopez'),
 (98,'Jeremias Olmando'),
 (99,'Florencia Dure'),
 (100,'Moreno Long'),
 (101,'Tu Pac'),
 (102,'Eminem'),
 (103,'Londres'),
 (104,'Paris'),
 (105,'Espa¤a'),
 (106,'Freddy Mordor'),
 (107,'Freddy Kruger'),
 (108,'Freddy Olmando'),
 (109,'Miley Cirus'),
 (110,'Jennifer Lopez'),
 (111,'Jonee Miller'),
 (112,'Astronauta'),
 (113,'Bombero'),
 (114,'Doctor'),
 (115,'Jose Maria Carro'),
 (116,'Jose Pedro Varela'),
 (117,'Maria Pedro Lopez'),
 (118,'Jonathan Perez'),
 (119,'Mariano Bordaberry'),
 (120,'Nahuel Silva'),
 (121,'Diabetes'),
 (122,'Artosis'),
 (123,'Cifoscoliosis'),
 (124,'Esnifada'),
 (125,'Inyectada'),
 (126,'Inalada'),
 (127,'La absorcion de agua'),
 (128,'La digestion quimica de a1fc868ntos'),
 (129,'El piloro'),
 (130,'Los cardias'),
 (131,'Los acidos gastricos'),
 (132,'De solido a liquido'),
 (133,'De gaseoso a liquido'),
 (134,'De liquido a solido'),
 (135,'Pancreas'),
 (136,'Intestino delgado'),
 (137,'Riñon'),
 (138,'Verde oscuro'),
 (139,'Marron oscuro'),
 (140,'Azul'),
 (141,'Medula osea'),
 (142,'Bazo'),
 (143,'Timo'),
 (144,'Del aceite de girasol'),
 (145,'Del carbon'),
 (146,'Del azufre'),
 (147,'16'),
 (148,'8'),
 (149,'24'),
 (150,'LSD'),
 (151,'MDMA'),
 (152,'Salvia'),
 (153,'El hipotalamo'),
 (154,'El bulbo raquideo'),
 (155,'La pituitaria'),
 (156,'El corzo'),
 (157,'El ciervo'),
 (158,'El pudu'),
 (159,'Un hueso de la espina dorsal'),
 (160,'Una hormona'),
 (161,'Una parte del intestino grueso'),
 (162,'La falange'),
 (163,'El yunque'),
 (164,'Ninguna es correcta'),
 (165,'En oceania'),
 (166,'Solo en aguas calidas'),
 (167,'Solo en aguas muy frias'),
 (168,'Los insectos'),
 (169,'Las erupciones cutaneas'),
 (170,'Las rocas'),
 (171,'Cachalote'),
 (172,'Elefante'),
 (173,'Rinoceronte'),
 (174,'20 metros'),
 (175,'30 metros'),
 (176,'10 metros'),
 (177,'Ciclo natural'),
 (178,'Ciclo acuoso'),
 (179,'Ciclo hidroponico'),
 (180,'Chiismo'),
 (181,'Jariyismo'),
 (182,'Sufrismo'),
 (183,'De interior'),
 (184,'De economia'),
 (185,'Del ejercito'),
 (186,'1939'),
 (187,'1940'),
 (188,'1942'),
 (189,'Montenegro'),
 (190,'Kosovo'),
 (191,'Checheina'),
 (192,'Del mayo de 68'),
 (193,'Hippie de los años 60'),
 (194,'De la revolucion francesa'),
 (195,'Evo Morales'),
 (196,'Fidel Castro'),
 (197,'Rafael Correa'),
 (198,'La burguesia durante la revolucion'),
 (199,'El nombre despectivo de los burgueses'),
 (200,'Ninguna es correcta'),
 (201,'Protestas de plaza Tahrir. El Cairo'),
 (202,'Protestas de plaza del Sol, Madrid'),
 (203,'Protestas de plaza de Mayo, Buenos Aires'),
 (204,'Tres años de desastres naturales'),
 (205,'Tres años de dificultades economicas'),
 (206,'Tres años amargos'),
 (207,'200'),
 (208,'987'),
 (209,'1452'),
 (210,'Valparaiso'),
 (211,'Arequipa'),
 (212,'La paz'),
 (213,'Eduardo Dato'),
 (214,'Segismundo Moret'),
 (215,'Canovas del Castillo'),
 (216,'Margaret Tatcher'),
 (217,'Mussolini'),
 (218,'Berlusconi'),
 (219,'Ptolomeo XIV'),
 (220,'Julio Cesar'),
 (221,'Marco Antonio'),
 (222,'Partido Carlista'),
 (223,'Ambas son correctas'),
 (224,'Ninguna es correcta'),
 (225,'Antiguedad clasica'),
 (226,'Contemporanea'),
 (227,'Media'),
 (228,'Cuba'),
 (229,'Alemania'),
 (230,'Polonia'),
 (231,'El dia del trabajo'),
 (232,'El dia del medio ambiente'),
 (233,'El dia del ni¤o'),
 (234,'Francisco Camps'),
 (235,'Esteban Gonzalez Pons'),
 (236,'Luis Barcenas'),
 (237,'Uno'),
 (238,'Tres'),
 (239,'Medio'),
 (240,'Comerciante'),
 (241,'Medico'),
 (242,'Guerrero'),
 (243,'angulo'),
 (244,'Trapezoide'),
 (245,'Bromboide'),
 (246,'Rectangulo'),
 (247,'Paralelogramo'),
 (248,'Cuadrado'),
 (249,'Poligono'),
 (250,'Verdadero'),
 (251,'ninguna'),
 (252,'Perpendiculares'),
 (253,'Rectangulo'),
 (254,'Romboide'),
 (255,'Rombo'),
 (257,'Trapecio'),
 (258,'Romboide'),
 (259,'Superficie'),
 (260,'Area'),
 (261,'Longitud'),
 (262,'Un tipo de red subterraneo'),
 (263,'La medida de la geografia'),
 (264,'Un deporte que se realiza en cuevas'),
 (265,'Poligono'),
 (266,'Angulo'),
 (267,'Vertice'),
 (268,'Obtuso'),
 (270,'LLano'),
 (271,'Recto'),
 (272,'Agudo'),
 (273,'Obtuso'),
 (274,'LLano'),
 (275,'LLano'),
 (276,'Recto'),
 (277,'Agudo'),
 (278,'Radio'),
 (279,'Centro'),
 (280,'Diamentro'),
 (281,'Rectos'),
 (282,'Agudos'),
 (283,'Complementarios'),
 (284,'90 y 90'),
 (285,'20 y 100'),
 (286,'30 y 110'),
 (287,'20 y 110'),
 (288,'20 y 60 son rectos'),
 (289,'30 y 60 son obtusos'),
 (290,'A la raiz cuadrada'),
 (291,'Mexico'),
 (292,'No hay ninguna regla'),
 (293,'2025'),
 (294,'1'),
 (295,'144'),
 (296,'4981'),
 (297,'3879'),
 (298,'7 multiplicado por 9'),
 (299,'8'),
 (300,'16'),
 (301,'12'),
 (302,'40'),
 (303,'41'),
 (304,'43'),
 (305,'Siberia'),
 (306,'Finlandia'),
 (307,'Estonia'),
 (308,'Socrates'),
 (309,'Sophocles'),
 (310,'Euripides'),
 (311,'River Plate'),
 (312,'River Amazon'),
 (313,'Europe'),
 (314,'Asia'),
 (315,'Africa'),
 (316,'Red, Yellow and Green'),
 (317,'Red, Yellow and Green'),
 (318,'Green, Brown and White'),
 (319,'White,Blue and White'),
 (320,'The ocean Atlantic'),
 (321,'The ocean Antartic'),
 (322,'The indian ocean'),
 (323,'In 1392'),
 (324,'In 1942'),
 (325,'In 1442'),
 (326,'Sibina'),
 (327,'Vazquez'),
 (328,'None is correct'),
 (329,'Samuel Etoo'),
 (330,'Ludislao Kubala'),
 (331,'Cesar Rodriguez'),
 (332,'Cycling'),
 (333,'Auto rcing'),
 (334,'Soccer player'),
 (335,'Brasil'),
 (336,'Argentina'),
 (337,'Paraguay'),
 (338,'Corcega'),
 (339,'Elba'),
 (340,'Cerdeña'),
 (341,'Birth of Jesus'),
 (342,'Birth of Mahoma'),
 (343,'Birth of Mirta Legrand'),
 (344,'Abraham Lincoln'),
 (345,'John Adams'),
 (346,'Thomas Jefferson'),
 (347,'Stalingrado'),
 (348,'Trotskigrado'),
 (349,'to say that the eart was sphercial'),
 (350,'For denyng the existence of God'),
 (351,'France'),
 (352,'Belguim'),
 (353,'Italy'),
 (354,'Franche'),
 (355,'Century XVII'),
 (356,'Century XIV'),
 (357,'Century XV'),
 (358,'Lima'),
 (359,'Machu Picchu'),
 (360,'Quito'),
 (361,'Antonimo'),
 (362,'Desconocido'),
 (363,'Ninguna de ellas'),
 (364,'Hierro'),
 (365,'Acero'),
 (366,'Oro'),
 (367,'Kiev'),
 (368,'Star'),
 (369,'Ziuler'),
 (370,'Periscopio'),
 (371,'Largavista'),
 (372,'Monoculo'),
 (373,'1'),
 (374,'7'),
 (375,'9'),
 (376,'Un auto supersonico'),
 (377,'Un ave gigante'),
 (378,'Una limusina'),
 (379,'Pilocho'),
 (380,'Pinolio'),
 (381,'Pinochio'),
 (382,'City of Dinamarca'),
 (383,'Kiev'),
 (384,'Transilvania'),
 (385,'Socrates'),
 (386,'Aristoteles'),
 (387,'Homero'),
 (388,'Que come vegetales'),
 (389,'Que come ladrillos'),
 (390,'Que come cereales'),
 (391,'Resultado'),
 (392,'Factor'),
 (393,'Multiplo'),
 (394,'El indico'),
 (395,'El Atlantico'),
 (396,'El Antartico'),
 (397,'Back un back, Ac/Dc'),
 (398,'The Dark side of the moon, Pink Floyd'),
 (399,'Nevermind, Nirvana'),
 (400,'Berlin, Alemania'),
 (401,'Madrid, España'),
 (402,'Lisboa, Portugal'),
 (403,'Futbol'),
 (404,'Voleyball'),
 (405,'Tenis'),
 (406,'49'),
 (407,'30'),
 (408,'42'),
 (409,'Marte'),
 (410,'Mercurio'),
 (411,'Saturno'),
 (412,'Euro'),
 (413,'Dolar'),
 (414,'Peso UK'),
 (415,'Aguila'),
 (416,'Pez Volador'),
 (417,'Perro'),
 (418,'Argentina'),
 (419,'Canada'),
 (420,'Mexico');
/*!40000 ALTER TABLE `incorrecta` ENABLE KEYS */;


--
-- Definition of table `juega`
--

DROP TABLE IF EXISTS `juega`;
CREATE TABLE `juega` (
  `Nombre` int(11) NOT NULL DEFAULT '0',
  `Id_Partida` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Nombre`,`Id_Partida`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `juega`
--

/*!40000 ALTER TABLE `juega` DISABLE KEYS */;
/*!40000 ALTER TABLE `juega` ENABLE KEYS */;


--
-- Definition of table `jugador`
--

DROP TABLE IF EXISTS `jugador`;
CREATE TABLE `jugador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jugador`
--

/*!40000 ALTER TABLE `jugador` DISABLE KEYS */;
INSERT INTO `jugador` (`id`,`nombre`) VALUES 
 (1,'EE'),
 (2,'AA');
/*!40000 ALTER TABLE `jugador` ENABLE KEYS */;


--
-- Definition of table `partida`
--

DROP TABLE IF EXISTS `partida`;
CREATE TABLE `partida` (
  `id_Partida` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `resultado` int(45) DEFAULT NULL,
  PRIMARY KEY (`id_Partida`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `partida`
--

/*!40000 ALTER TABLE `partida` DISABLE KEYS */;
/*!40000 ALTER TABLE `partida` ENABLE KEYS */;


--
-- Definition of table `pregunta`
--

DROP TABLE IF EXISTS `pregunta`;
CREATE TABLE `pregunta` (
  `id_pregunta` int(11) NOT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `pregunta` varchar(999) DEFAULT NULL,
  `Id_respuestaC` int(11) DEFAULT NULL,
  `Id_incorrecta1` int(11) DEFAULT NULL,
  `Id_incorrecta2` int(11) DEFAULT NULL,
  `Id_incorrecta3` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_pregunta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pregunta`
--

/*!40000 ALTER TABLE `pregunta` DISABLE KEYS */;
INSERT INTO `pregunta` (`id_pregunta`,`tipo`,`pregunta`,`Id_respuestaC`,`Id_incorrecta1`,`Id_incorrecta2`,`Id_incorrecta3`) VALUES 
 (3,'deporte','¨¿Que jugadora de hockey sobre cesped ha ganado 7 veces el premio a la mejor jugadora del mundo en 2013?',3,7,8,9),
 (4,'deporte','¨¿Cuantas finales del mundo jugo la Seleccion Argentina de futbol?',4,10,11,12),
 (5,'deporte','¨¿Quien marco el gol 3.500 en la Liga del Atletico de Madrid?',5,13,14,15),
 (6,'deporte','¨¿Ronaldinho es jugador de ?',6,16,17,18),
 (7,'deporte','¨¿Cuantos mangos por lado tiene un futbolin ?',7,19,20,21),
 (8,'deporte','¨¿Cual es el estilo de natacion mas rapido?',8,22,23,24),
 (9,'deporte','¨¿Cuantos jugadores componen un equipo de rugby?',9,25,26,27),
 (10,'deporte','¨¿Cuantas puntas de cada color hay en un tablero de Backgammon?',10,28,29,30),
 (11,'deporte','¨¿En que pa¡s se invento el Voleibol?',11,31,32,33),
 (12,'deporte','¨¿Cual de las siguientes modalidades no forma parte del deporte rural vasco?',12,34,35,36),
 (13,'deporte','¨¿Que tiene un comun TyCobb, Cy Young y Roberto Clemente?',13,37,38,39),
 (14,'deporte','¨¿Donde se jugo la Copa Mundial de Rugby en 2015?',14,40,41,42),
 (15,'deporte','¨¿Que seleccion acumula mayor cantidad de explusados en mundiales de futbol?',15,43,44,45),
 (16,'deporte','¨¿Quien invento el arte marcial llamado JeetKune Do?',16,46,47,48),
 (17,'deporte','¨¿De que deporte es el LongBoard una de las modalidades?',17,49,50,51),
 (18,'deporte','¨¿En que deporte se destaca Johnny Wikinson?',18,52,53,54),
 (19,'deporte','¨¿De que color es el cero en el cilindro de la ruleta?',19,55,56,57),
 (20,'deporte','¨¿A que barrio portero pertenece el club de futbol San Lorenzo?\"',20,58,59,60),
 (21,'Musica','\'Arroz con leche me quiero casa con una señorita de...\'',21,61,62,63),
 (22,'Musica','¨¿Cual es el verdadero nombre de Alejandro Sanz?',22,64,65,66),
 (23,'Musica','¨¿De que nacionalidad es la cantante Fey?',23,67,68,69),
 (24,'Musica','¨¿Quien interpreta la canci¢n \"Baby One More Time?',24,70,71,72),
 (25,'Musica','¨¿A quien se considera el Rey del pop?',25,73,74,75),
 (26,'Musica','¨¿Quien canta \"Vivir mi vida\"?',26,76,77,78),
 (27,'Musica','¨¿Cual es el nombre de Paul McCartney?',27,79,80,81),
 (28,'Musica','¨¿Que Beatle fue asesinado por un fan?',28,82,83,84),
 (29,'Musica','¨¿De donde proviene el reaggae?',29,85,86,87),
 (30,'Musica','¨¿Cual es el nombre real de Lady Gaga?',30,88,89,90),
 (31,'Musica','¨¿Cual es el nombre real de Hannah Montana?',31,91,92,93),
 (32,'Musica','¨¿Cual es el nombre de la cancion de la pelicula \"Titanic\"?',32,94,95,96),
 (33,'Musica','¨¿Quien gano \"Artista del año\" en los American Music Awards 2013?',33,97,98,99),
 (34,'Musica','¨¿Que cantante estuvo saliendo con Selena G¢mez?',34,100,101,102),
 (35,'Musica','¨¿Donde nacio Jhon Lennon?',35,103,104,105),
 (36,'Musica','¨¿Como se llamaba el cantante de Qeen?',36,106,107,108),
 (37,'Musica','¨¿Quien canta la cancion \"Fireworks?',37,109,110,111),
 (38,'Musica','¨¿De que trabajaba el \"Tio Mario\"?',38,112,113,114),
 (39,'Musica','¨¿Cual es el nombre real del sabalero?',39,115,116,117),
 (40,'Musica','¨¿Quien es el baterista de Aborigen?',40,118,119,120),
 (41,'Ciencia','¨¿Cual de las siguientes enfermedades atraca al higado?',41,121,122,123),
 (42,'Ciencia','¨¿Como tomarias la sustencia alucinogena natural llamada ayahuasca?',42,123,124,125),
 (43,'Ciencia','¨¿Cual es la funcion principal del intestino grueso?',43,126,127,128),
 (44,'Ciencia','¨¿Que hay en la boca del estomago?',44,129,130,131),
 (45,'Ciencia','¨¿Que cambio de estado ocurre en la sublimacion?',45,132,133,134),
 (46,'Ciencia','¨¿Que organo del cuerpo humano produce la bilis?',46,135,136,137),
 (47,'Ciencia','¨¿De que color es la sandre de los peces?',47,138,139,140),
 (48,'Ciencia','¨¿Cual de los siguientes organos NO es parte del sistema inmunologico?',48,141,142,143),
 (49,'Ciencia','¨¿De donde se saca la sacarina?',49,144,145,146),
 (50,'Ciencia','¨¿Cuantas caras tiene un icosaedro?',50,147,148,149),
 (51,'Ciencia','¨¿Que contiene el catus llamado peyote?',51,160,161,162),
 (52,'Ciencia','¨¿Que se altera cuando nos damos un golpe en la cabeza que nos hace \"ver las esrellas\"?',52,153,154,155),
 (53,'Ciencia','¨¿Cual es el cervido de mayor tamaño?',53,156,157,158),
 (54,'Ciencia','¨¿Que es el calostro?',54,159,160,161),
 (55,'Ciencia','¨¿Cual es el hueso mas pequeño del cuerpo?',55,162,163,164),
 (56,'Ciencia','¨¿Donde vive el delfin rosado?',56,165,166,167),
 (57,'Ciencia','¨¿Que estudia la ictiologia?',57,168,169,170),
 (58,'Ciencia','¨¿Cual es el mamifero mas grande conocido hasta la actualidad?',58,171,172,173),
 (59,'Ciencia','¨¿A que altura se apaga un fuego?',59,174,175,176),
 (60,'Ciencia','¨¿Con que otro nombre se conoce el ciclo del agua?',60,177,178,179),
 (61,'Historia','¨¿Cual es la rama mayoritaria del Islam?',61,180,182,183),
 (62,'Historia','¨¿De que fue ministro Manuel Fraga durante el franquismo?',62,183,184,185),
 (63,'Historia','¨¿En que año tuvo lugar el ataque de Pearl Harbor?',63,186,187,188),
 (64,'Historia','¨¿Las revueltas de donde son llamadas Intifadas?',64,189,190,191),
 (65,'Historia','La comuna de Partis fue un movimiento...',65,192,193,194),
 (66,'Historia','¨¿A que dirigente latinoamericano mando callar Juan Carlos de Bodron?',66,195,196,197),
 (67,'Historia','¨¿Quienes fueron los sans-culottes de la revolucion Francesa?',67,198,199,200),
 (68,'Historia','¨¿Con que hecho historico relacionarias al \"hombre del tanque\" o \"rebelde desconocido\"?',68,201,202,203),
 (69,'Historia','¨¿Que otro nombre recibio el periodo de la Gran Hambruna China?',69,204,205,206),
 (70,'Historia','¨¿Cuantos soldados argentinos murieron en la Guerra de las Malvinas?',70,207,208,209),
 (71,'Historia','¨¿Cual es la ciudad mas antigua de America Latina?',71,210,211,212),
 (72,'Historia','¨¿A que presidente ceso el rey Alfonso XIII tras las reacciones que sucedieron a la semana Tragica?',72,213,214,215),
 (73,'Historia','¨¿Quien pronuncio la frase: \"Bebamos de la copa de la destruccion\"?',73,216,217,218),
 (74,'Historia','¨¿Con que emperador estuvo casada Cleopatra?',74,219,220,221),
 (75,'Historia','¨¿En que partido se organizan hoy los carlistas?',75,222,223,224),
 (76,'Historia','El renacimiento marco el inicio de la edad...',76,225,226,227),
 (77,'Historia','¨¿Que pais fue dirigido por Stalin?',77,228,229,230),
 (78,'Historia','¨¿Que se celebra el 8 de marzo?',78,231,232,233),
 (79,'Historia','¨¿Cual de los siguientes politicos no ha estado implicado en la trama Gurtel?',79,234,235,236),
 (80,'Historia','¨¿Cuantos siglos duro el siglo de oro?',80,237,238,239),
 (81,'Historia','¨¿Que fue Dracon?',81,240,241,242),
 (83,'MyG','¨¿Cuadrilatero que posee solo un par de lados paralelos?',83,244,245,246),
 (84,'MyG','¨¿Porligono formado por cuatro lados, cuatro angulos y cuatro vertces?',84,247,248,249),
 (85,'MyG','Todos los cuadrilateros son paralelogramos',85,250,251,252),
 (86,'MyG','Cuadrilatero con ningun lado paralelo',86,253,254,255),
 (87,'MyG','Se calcula sumando las medidas de las longitudes de los lados de una figura',88,259,260,261),
 (90,'MyG','Cada uno de los segmentos que limitan un poligono es un',90,265,266,267),
 (91,'MyG','¿Si un angulo mide menos de 90 es?',91,268,269,270),
 (92,'MyG','¿Si un angulo mide 90 es?',92,271,272,273),
 (93,'MyG','¿Si un angulo mide mas de 90 es?',93,274,275,276),
 (94,'MyG','¿En un poligono, la distancia del centro al punto medio de cada lado es?',94,277,278,279),
 (95,'MyG','¿120 y 60 son angulos?',95,280,281,283),
 (96,'MyG','¿Para un angulo de 70, su complementario y su suplementarios si suman 180?',96,283,284,285),
 (97,'MyG','¿Dos angulos son complementarios si suman 90 y su sumplementarios si suman 180?',97,286,287,288),
 (98,'MyG','¿El producto de dos raices cuadradas es igual a?',98,289,290,291),
 (99,'MyG','¿Cual de los siguientes numeros no es un cuadrado perfecto?',99,292,293,294),
 (100,'MyG','La raiz cuadrada de 49 multiplicada por la raiz cuadrada de  81 es igual a la raiz cuadrada de',100,296,297,298),
 (101,'MyG','El triple de un numero disminuido en 20, equivale al numero disminuido en 8, ¨Que numero es?',101,299,300,301),
 (102,'MyG','La suma de tres numeros consecutivos es 126. El numero intermedio es...',102,302,303,304),
 (103,'MyG','What is the coldest place on Earth?',103,305,306,307),
 (104,'Ingles','Who wrote the Odyssey?',103,308,309,310),
 (105,'Ingles','What is the longest river in the world?',105,311,312,313),
 (106,'Ingles','On what continent is Ecuador?',106,313,314,315),
 (107,'Ingles','What color is the flag of Mexico?',107,316,317,318),
 (108,'Ingles','What is the largest ocean?',108,319,320,321),
 (109,'Ingles','What year did Chistopher Columbus arrive in America?',109,323,324,325),
 (110,'Ingles','What is the second last name of Gerard Pique?',110,326,327,328),
 (111,'Ingles','Who is FC Barcelonaïs top scorrer, up to 2013?',111,329,330,331),
 (112,'Ingles','Why sport is know Mas Biaggi?',112,332,333,334),
 (113,'Ingles','What country are the Boston River-Nacional teams?',113,335,336,337),
 (114,'Ingles','On which island did Napoleon die?',114,338,339,340),
 (115,'Ingles','Which of these historical fact is older?',115,341,342,343),
 (116,'Ingles','What was the name of the first President of the United States?',116,344,345,346),
 (117,'Ingles','What was it called for more than 50 years St.Petersburg?',117,347,348,348),
 (118,'Ingles','In what country was Adolf Hitler Born?',118,349,350,351),
 (119,'Ingles','when wat askt thien for me theeesr ssjbas?',119,352,353,354),
 (120,'Ingles','When did the Golden age mainly occur?',120,355,356,357),
 (121,'Ingles','What was the capital of the Inca Empire?',121,358,359,360),
 (122,'Cultura General','¿Como le llaman a los textos de autores desconocidos?',122,361,362,363),
 (123,'Cultura General','¿Cual fue el primer metal que empleo el hombre?',123,364,365,366),
 (124,'Cultura General','¿Como se llama la estacion espacial rusa?',124,367,368,369),
 (125,'Cultura General','¿Que instrumento optico permite ver loas atros de cerca?',125,370,371,372),
 (126,'Cultura General','¿Cual es el primero de la lista de numero primeros?',126,373,374,375),
 (127,'Cultura General','¨¿Que era el Concorde?',127,376,377,378),
 (128,'Cultura General','¨¿A quien le crecia la nariz cuando mentia?',128,379,380,381),
 (129,'Cultura General','¨¿Cual es la capital de Dinamarca?',129,382,383,384),
 (130,'Cultura General','¨¿Quien \"sabia que no sabia nada\"?',130,385,386,387),
 (131,'Cultura General','¨¿Que es un animal carnivoro?',131,388,389,390),
 (132,'Cultura General','¨¿Como se denomina el resultado de la multiplicacion?',132,391,392,393),
 (133,'Cultura General','¨¿Cual es el oceano mas grande?',133,394,395,396),
 (134,'Cultura General','¨¿Cual es el disco mas vendido de la historia?',134,397,398,399),
 (135,'Cultura General','¨¿Donde se encuentra la famosa Torre Eiffel?',135,400,401,402),
 (136,'Cultura General','¨¿Que deporte practicaba Michael Jordan?',136,403,404,405),
 (137,'Cultura General','¿Si 50 es el 100%¨Cuanto es el 90?',137,406,407,408),
 (138,'Cultura General','¨¿Cual es el tercer planeta en el sistema solar?',138,409,450,451),
 (139,'Cultura General','¨¿Cual es la moneda del Reino Unido?',139,412,413,414),
 (140,'Cultura General','¨¿Cual es el unico mamifero capaz de volar?',140,415,416,417),
 (141,'Cultura General','¨¿Donde esta la casa blanca?',141,418,419,420);
/*!40000 ALTER TABLE `pregunta` ENABLE KEYS */;


--
-- Definition of table `resultado`
--

DROP TABLE IF EXISTS `resultado`;
CREATE TABLE `resultado` (
  `Juego` int(10) unsigned NOT NULL,
  `Jugador-1` varchar(45) NOT NULL,
  `Jugador-2` varchar(45) NOT NULL,
  `Ganador` varchar(45) NOT NULL,
  `Fecha` varchar(45) NOT NULL,
  PRIMARY KEY (`Juego`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `resultado`
--

/*!40000 ALTER TABLE `resultado` DISABLE KEYS */;
INSERT INTO `resultado` (`Juego`,`Jugador-1`,`Jugador-2`,`Ganador`,`Fecha`) VALUES 
 (1,'Jona','Jere','Jona','29/10/2017'),
 (2,'Chino','Juan','Chino','29/10/2017'),
 (3,'EE','AA','EE','29/10/2017');
/*!40000 ALTER TABLE `resultado` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
