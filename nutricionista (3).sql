-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 19:51:12
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nutricionista`
--
CREATE DATABASE IF NOT EXISTS `nutricionista` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `nutricionista`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `antecedentes`
--

CREATE TABLE `antecedentes` (
  `idAntecedente` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `antecedente` varchar(50) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `antecedentes`
--

INSERT INTO `antecedentes` (`idAntecedente`, `idPaciente`, `antecedente`, `estado`) VALUES
(6, 15, 'DIABETES', 1),
(7, 16, 'HIPERTENSION', 1),
(8, 17, 'CELIAHCO', 1),
(9, 18, 'RENAL', 1),
(10, 19, 'CANCER', 1),
(11, 20, 'ENFERMEDADES_RESPIRATORIAS', 1),
(12, 21, 'BULIMIA', 1),
(13, 22, 'ANOREXIA', 1),
(14, 23, 'ALZHEIMER', 1),
(15, 28, 'PARKINSON', 1),
(16, 29, 'ALERGIA', 1),
(17, 30, 'COLITIS', 1),
(18, 31, 'HEMORROIDES', 1),
(19, 32, 'OSTEOPOROSIS', 1),
(20, 33, 'ACV', 1),
(21, 34, 'ACIDEZ', 1),
(22, 36, 'ANEMIA', 1),
(23, 15, 'OBESIDAD', 1),
(24, 16, 'ULCERAS_PEPTICAS', 1),
(25, 17, 'DESNUTRICION', 1),
(26, 18, 'HIPERTIROIDISMO', 1),
(27, 19, 'HIPOTIROIDISMO', 1),
(28, 20, 'ESTRES', 1),
(29, 21, 'INSOMNIO', 1),
(30, 22, 'EPILEPSIA', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comidas`
--

CREATE TABLE `comidas` (
  `idComida` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `calorias` double NOT NULL,
  `estadoComida` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comidas`
--

INSERT INTO `comidas` (`idComida`, `nombre`, `tipo`, `calorias`, `estadoComida`) VALUES
(1, 'Manzana', 'FRUTA', 52, 1),
(2, 'Milanesa de pollo', 'CARNES_ROJAS', 249, 1),
(3, 'Brócoli', 'VERDURA', 55, 1),
(4, 'Yogur', 'LACTEOS', 120, 1),
(5, 'Filete de res', 'CARNES_ROJAS', 250, 1),
(6, 'Pechuga de pollo', 'CARNES_MAGRAS', 165, 1),
(7, 'Lentejas', 'LEGUMBRES', 230, 1),
(8, 'Arroz integral', 'GRANOS_ENTEROS', 210, 1),
(9, 'Aceite de oliva', 'GRASAS_SALUDABLES', 120, 1),
(10, 'Avena', 'CEREALES', 150, 1),
(11, 'Té verde', 'INFUSIONES', 0, 1),
(12, 'Naranja', 'FRUTA', 43, 1),
(13, 'Zanahoria', 'VERDURA', 41, 1),
(14, 'Leche', 'LACTEOS', 150, 1),
(15, 'Salmón', 'CARNES_MAGRAS', 206, 1),
(16, 'Garbanzos', 'LEGUMBRES', 164, 1),
(17, 'Quinua', 'GRANOS_ENTEROS', 222, 1),
(18, 'Aguacate', 'GRASAS_SALUDABLES', 234, 1),
(19, 'Pan integral', 'CEREALES', 80, 1),
(20, 'Té de manzanilla', 'INFUSIONES', 0, 1),
(21, 'Yogur griego', 'LACTEOS', 150, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `idDieta` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `idProfesional` int(11) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFinal` date NOT NULL,
  `pesoInicial` double NOT NULL,
  `pesoFinal` double NOT NULL,
  `estadoDieta` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`idDieta`, `nombre`, `idPaciente`, `idProfesional`, `fechaInicio`, `fechaFinal`, `pesoInicial`, `pesoFinal`, `estadoDieta`) VALUES
(22, 'Dieta Mediterránea', 15, 1, '2023-01-15', '2023-02-15', 90, 85, 1),
(23, 'Dieta Paleo', 16, 2, '2023-03-01', '2023-04-01', 80, 75.5, 1),
(24, 'Dieta Vegana', 17, 3, '2023-02-10', '2023-03-10', 70, 68.5, 1),
(25, 'Dieta Cetogénica', 18, 4, '2023-04-15', '2023-05-15', 100, 95, 1),
(26, 'Dieta Atkins', 19, 5, '2023-03-20', '2023-04-20', 75, 72, 1),
(27, 'Dieta DASH', 20, 6, '2023-05-01', '2023-06-01', 88, 85, 1),
(28, 'Dieta Flexitariana', 21, 1, '2023-02-15', '2023-03-15', 65, 63.5, 1),
(29, 'Dieta de Ayuno Intermitente', 22, 2, '2023-03-10', '2023-04-10', 70, 68, 1),
(30, 'Dieta Sin Gluten', 23, 3, '2023-04-01', '2023-05-01', 72, 70, 1),
(31, 'Dieta de Mantenimiento', 28, 4, '2023-02-20', '2023-03-20', 75, 75, 1),
(32, 'Dieta Hipocalórica', 29, 5, '2023-05-15', '2023-06-15', 85, 80, 1),
(33, 'Dieta Vegetariana', 30, 6, '2023-04-05', '2023-05-05', 68, 65.5, 1),
(34, 'Dieta de Entrenamiento', 31, 1, '2023-01-10', '2023-02-10', 90, 88, 1),
(35, 'Dieta para Hipertensos', 32, 2, '2023-03-05', '2023-04-05', 78, 76, 1),
(36, 'Dieta para Diabéticos', 33, 3, '2023-04-10', '2023-05-10', 82, 80.5, 1),
(37, 'Dieta de Control de Peso', 34, 4, '2023-02-25', '2023-03-25', 85, 82.5, 1),
(38, 'Dieta de Bienestar', 36, 5, '2023-02-05', '2023-03-05', 78, 75, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `indicacion`
--

CREATE TABLE `indicacion` (
  `idIndic` int(11) NOT NULL,
  `idComida` int(11) NOT NULL,
  `idDieta` int(11) NOT NULL,
  `horario` varchar(50) NOT NULL,
  `porcion` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `indicacion`
--

INSERT INTO `indicacion` (`idIndic`, `idComida`, `idDieta`, `horario`, `porcion`, `estado`) VALUES
(4, 1, 22, 'DESAYUNO', 1, 1),
(5, 5, 22, 'ALMUERZO', 1, 1),
(6, 9, 22, 'MERIENDA', 1, 1),
(7, 13, 22, 'CENA', 1, 1),
(8, 17, 22, 'COLACION', 1, 1),
(9, 2, 23, 'DESAYUNO', 1, 1),
(10, 6, 23, 'ALMUERZO', 1, 1),
(11, 10, 23, 'MERIENDA', 1, 1),
(12, 14, 23, 'CENA', 1, 1),
(13, 18, 23, 'COLACION', 1, 1),
(14, 3, 24, 'DESAYUNO', 1, 1),
(15, 7, 24, 'ALMUERZO', 1, 1),
(16, 11, 24, 'MERIENDA', 1, 1),
(17, 15, 24, 'CENA', 1, 1),
(18, 19, 24, 'COLACION', 1, 1),
(19, 4, 25, 'DESAYUNO', 1, 1),
(20, 8, 25, 'ALMUERZO', 1, 1),
(21, 12, 25, 'MERIENDA', 1, 1),
(22, 16, 25, 'CENA', 1, 1),
(23, 20, 25, 'COLACION', 1, 1),
(24, 1, 26, 'DESAYUNO', 1, 1),
(25, 5, 26, 'ALMUERZO', 1, 1),
(26, 9, 26, 'MERIENDA', 1, 1),
(27, 13, 26, 'CENA', 1, 1),
(28, 2, 27, 'DESAYUNO', 1, 1),
(29, 6, 27, 'ALMUERZO', 1, 1),
(30, 10, 27, 'MERIENDA', 1, 1),
(31, 14, 27, 'CENA', 1, 1),
(32, 3, 28, 'DESAYUNO', 1, 1),
(33, 7, 28, 'ALMUERZO', 1, 1),
(34, 11, 28, 'MERIENDA', 1, 1),
(35, 15, 28, 'CENA', 1, 1),
(36, 4, 29, 'DESAYUNO', 1, 1),
(37, 8, 29, 'ALMUERZO', 1, 1),
(38, 12, 29, 'MERIENDA', 1, 1),
(39, 16, 29, 'CENA', 1, 1),
(40, 1, 30, 'DESAYUNO', 1, 1),
(41, 5, 30, 'ALMUERZO', 1, 1),
(42, 9, 30, 'MERIENDA', 1, 1),
(43, 13, 30, 'CENA', 1, 1),
(44, 2, 31, 'DESAYUNO', 1, 1),
(45, 6, 31, 'ALMUERZO', 1, 1),
(46, 10, 31, 'MERIENDA', 1, 1),
(47, 14, 31, 'CENA', 1, 1),
(48, 4, 37, 'MERIENDA', 50, 1),
(49, 4, 37, 'DESAYUNO', 4, 0),
(50, 21, 37, 'DESAYUNO', 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `idPaciente` int(11) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `dni` varchar(30) NOT NULL,
  `domicilio` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `genero` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `fechaNac` date NOT NULL,
  `pesoActual` double NOT NULL,
  `altura` double NOT NULL,
  `pesoDeseado` double NOT NULL,
  `estadoPaciente` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`idPaciente`, `apellido`, `nombre`, `dni`, `domicilio`, `telefono`, `genero`, `email`, `fechaNac`, `pesoActual`, `altura`, `pesoDeseado`, `estadoPaciente`) VALUES
(15, 'Luthor', 'Lex', '123456789', '123 Main St', '5551234567', 'MASCULINO', 'lex@example.com', '1990-03-15', 180.5, 185, 175, 1),
(16, 'Parker', 'Peter', '987654321', '456 Elm St', '5552345678', 'MASCULINO', 'peter@example.com', '1985-07-10', 160, 175, 170, 1),
(17, 'Quinn', 'Harley', '654321987', '789 Oak St', '5553456789', 'FEMENINO', 'harley@example.com', '1993-02-20', 135.5, 160, 130, 1),
(18, 'Wayne', 'Bruce', '789123456', '101 Gotham Ln', '5554567890', 'MASCULINO', 'bruce@example.com', '1980-06-30', 190, 188, 180, 1),
(19, 'Danvers', 'Carol', '234567891', '234 Krypton Rd', '5555678901', 'FEMENINO', 'carol@example.com', '1989-04-25', 150.5, 173, 145, 1),
(20, 'Osborn', 'Norman', '345678912', '345 Villain Ave', '5556789012', 'MASCULINO', 'norman@example.com', '1975-08-05', 175, 180, 170, 1),
(21, 'Munroe', 'Ororo', '456789123', '456 X-Mansion Rd', '5557890123', 'FEMENINO', 'ororo@example.com', '1984-01-18', 140, 165, 135, 1),
(22, 'Fisk', 'Wilson', '567891234', '567 Crime St', '5558901234', 'MASCULINO', 'wilson@example.com', '1970-11-20', 200, 185, 195, 1),
(23, 'Prince', 'Diana', '678912345', '678 Amazon Ave', '5559012345', 'FEMENINO', 'diana@example.com', '1982-09-12', 140, 170, 130, 1),
(28, 'Stark', 'Tony', '111111111', 'Malibu', '555-1234', 'MASCULINO', 'tony@stark.com', '1970-05-29', 185.5, 185, 200, 1),
(29, 'Romanoff', 'Natasha', '333333333', 'Nueva York', '555-9876', 'FEMENINO', 'natasha@shield.com', '1984-06-07', 58, 170, 60, 1),
(30, 'Odinson', 'Thor', '444444444', 'Asgard', '555-4321', 'MASCULINO', 'thor@asgard.com', '1980-11-11', 95.7, 190, 100, 1),
(31, 'Rogers', 'Steve', '555555555', 'Nueva York', '555-8765', 'MASCULINO', 'steve@avengers.com', '1918-07-04', 92, 188, 95, 1),
(32, 'Banner', 'Bruce', '666666666', 'Nueva York', '555-2345', 'MASCULINO', 'bruce@hulk.com', '1969-12-18', 76.3, 175, 85, 1),
(33, 'Maximoff', 'Wanda', '777777777', 'Sokovia', '555-6543', 'FEMENINO', 'wanda@scarletwitch.com', '1989-05-10', 55.2, 170, 58, 1),
(34, 'Wilson', 'Sam', '888888888', 'Washington, D.C.', '555-7890', 'MASCULINO', 'sam@falcon.com', '1980-08-19', 79.1, 183, 85, 1),
(35, 'T Challa', 'Black Panther', '999999999', 'Wakanda', '555-8765', 'MASCULINO', 'tchalla@wakanda.com', '1978-02-16', 92.5, 183, 90, 1),
(36, 'Potts', 'Pepper', '101010101', 'Malibu', '555-5678', 'FEMENINO', 'pepper@stark.com', '1979-04-15', 60.3, 170, 65, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesional`
--

CREATE TABLE `profesional` (
  `idProfesional` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `dni` varchar(20) NOT NULL,
  `domicilio` varchar(50) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `matricula` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `profesional`
--

INSERT INTO `profesional` (`idProfesional`, `nombre`, `apellido`, `dni`, `domicilio`, `telefono`, `email`, `estado`, `matricula`) VALUES
(1, 'Juan', 'González', '12345678', 'Calle Principal 123', '123456789', 'juan@gmail.com', 1, '12345'),
(2, 'María', 'López', '98765432', 'Avenida Secundaria 456', '987654321', 'maria@gmail.com', 1, '54321'),
(3, 'Ana', 'Martínez', '45678901', 'Plaza Central 789', '789012345', 'ana@gmail.com', 1, '67890'),
(4, 'Luis', 'Pérez', '23456789', 'Calle Secundaria 789', '456789012', 'luis@gmail.com', 1, '34567'),
(5, 'Carlos', 'Fernández', '34567890E', 'Avenida Principal 567', '567890123', 'carlos@gmail.com', 1, '45678'),
(6, 'Gil', 'Carranzo', '33834768', 'Av. Particular 78', '46445262', 'asadad@gmail.com', 1, '3597564');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registropeso`
--

CREATE TABLE `registropeso` (
  `idRegistro` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `peso` double NOT NULL,
  `fecha` date NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `registropeso`
--

INSERT INTO `registropeso` (`idRegistro`, `idPaciente`, `peso`, `fecha`, `estado`) VALUES
(25, 15, 80.5, '2023-01-15', 1),
(26, 16, 75, '2023-02-01', 1),
(27, 17, 68.5, '2023-02-15', 1),
(28, 18, 90, '2023-03-01', 1),
(29, 19, 72.5, '2023-03-15', 1),
(30, 20, 85, '2023-04-01', 1),
(31, 21, 63, '2023-04-15', 1),
(32, 22, 70, '2023-05-01', 1),
(33, 23, 75.5, '2023-05-15', 1),
(34, 28, 85.5, '2023-06-01', 1),
(35, 29, 79, '2023-06-15', 1),
(36, 30, 68, '2023-07-01', 1),
(37, 31, 74.5, '2023-07-15', 1),
(38, 32, 88, '2023-08-01', 1),
(39, 33, 76.5, '2023-08-15', 1),
(40, 34, 90.5, '2023-09-01', 1),
(41, 36, 82, '2023-09-15', 1),
(42, 15, 150, '2023-10-26', 1),
(43, 15, 151, '2023-10-27', 1),
(44, 15, 153, '2023-10-27', 1),
(45, 15, 154, '2023-10-27', 1),
(46, 16, 74, '2023-10-27', 1),
(47, 16, 73, '2023-10-27', 1),
(48, 15, 155, '2023-10-27', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `antecedentes`
--
ALTER TABLE `antecedentes`
  ADD PRIMARY KEY (`idAntecedente`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `comidas`
--
ALTER TABLE `comidas`
  ADD PRIMARY KEY (`idComida`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`idDieta`),
  ADD KEY `idPaciente` (`idPaciente`),
  ADD KEY `dieta_ibfk_1` (`idProfesional`);

--
-- Indices de la tabla `indicacion`
--
ALTER TABLE `indicacion`
  ADD PRIMARY KEY (`idIndic`),
  ADD KEY `idDieta` (`idDieta`),
  ADD KEY `idComida` (`idComida`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idPaciente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `profesional`
--
ALTER TABLE `profesional`
  ADD PRIMARY KEY (`idProfesional`),
  ADD UNIQUE KEY `matricula` (`matricula`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `registropeso`
--
ALTER TABLE `registropeso`
  ADD PRIMARY KEY (`idRegistro`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `antecedentes`
--
ALTER TABLE `antecedentes`
  MODIFY `idAntecedente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `comidas`
--
ALTER TABLE `comidas`
  MODIFY `idComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `idDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT de la tabla `indicacion`
--
ALTER TABLE `indicacion`
  MODIFY `idIndic` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT de la tabla `profesional`
--
ALTER TABLE `profesional`
  MODIFY `idProfesional` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `registropeso`
--
ALTER TABLE `registropeso`
  MODIFY `idRegistro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `antecedentes`
--
ALTER TABLE `antecedentes`
  ADD CONSTRAINT `antecedentes_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`idProfesional`) REFERENCES `profesional` (`idProfesional`),
  ADD CONSTRAINT `dieta_ibfk_2` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);

--
-- Filtros para la tabla `indicacion`
--
ALTER TABLE `indicacion`
  ADD CONSTRAINT `indicacion_ibfk_1` FOREIGN KEY (`idDieta`) REFERENCES `dieta` (`idDieta`),
  ADD CONSTRAINT `indicacion_ibfk_2` FOREIGN KEY (`idComida`) REFERENCES `comidas` (`idComida`);

--
-- Filtros para la tabla `registropeso`
--
ALTER TABLE `registropeso`
  ADD CONSTRAINT `registropeso_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
