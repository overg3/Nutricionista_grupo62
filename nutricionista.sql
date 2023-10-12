-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-10-2023 a las 23:55:56
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
(1, 6, 'DIABETES', 1),
(2, 7, 'HIPERTENSION', 1),
(3, 8, 'CELIACO', 1),
(4, 9, 'RENAL', 1),
(5, 10, 'CANCER', 1);

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
(1, 'Manzana', 'FRUTA', 50, 0),
(2, 'Milanesa de pollo', 'CARNES_ROJAS', 250, 1),
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
(2, 'Dieta de la vaca loca', 8, 4, '2023-10-06', '2023-12-12', 65.2, 75.1, 1),
(9, 'Dieta Atkins', 6, 1, '2023-01-10', '2023-02-10', 150.5, 145.2, 1),
(10, 'Dieta Mediterránea', 7, 2, '2023-02-15', '2023-03-15', 160.3, 155.7, 1),
(11, 'Dieta DASH', 8, 3, '2023-03-20', '2023-04-20', 140.2, 136.8, 1),
(12, 'Dieta Paleo', 9, 4, '2023-04-25', '2023-05-25', 175.1, 170.3, 1),
(13, 'Dieta Vegana', 10, 5, '2023-05-30', '2023-06-30', 135.8, 130.4, 1),
(15, 'Dieta Atkins', 6, 1, '2023-01-10', '2023-02-10', 150.5, 145.2, 1),
(16, 'Dieta Mediterránea', 7, 2, '2023-02-15', '2023-03-15', 160.3, 155.7, 1),
(17, 'Dieta DASH', 8, 3, '2023-03-20', '2023-04-20', 140.2, 136.8, 1),
(18, 'Dieta Paleo', 9, 4, '2023-04-25', '2023-05-25', 175.1, 170.3, 1),
(19, 'Dieta Vegana', 10, 5, '2023-05-30', '2023-06-30', 135.8, 130.4, 1),
(20, 'Dieta Cetogénica', 10, 6, '2023-07-05', '2023-08-05', 155.7, 150.1, 1),
(21, 'Dieta Weight Watchers', 12, 1, '2023-08-10', '2023-09-10', 145.9, 141.6, 1);

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
(1, 1, 2, 'REFRIGERIO_NOCTURNO', 150, 1),
(2, 1, 2, 'ALMUERZO', 200, 0),
(3, 1, 2, 'ALMUERZO', 90, 1);

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
(6, 'Gómez', 'María', '12345678', 'Calle Principal 123', '123456789', 'Femenino', 'maria@gmail.com', '1990-05-15', 80.3, 0, 60, 1),
(7, 'Pérez', 'Juan', '38765432', 'Avenida Secundaria 456', '987654321', 'Masculino', 'juan@gmail.com', '1985-08-20', 85, 0, 75, 1),
(8, 'López', 'Ana', '45678901', 'Plaza Central 789', '789012345', 'Femenino', 'ana@gmail.com', '1995-03-10', 65.2, 0, 55, 1),
(9, 'Rodríguez', 'Luis', '23456789', 'Calle Secundaria 789', '456789012', 'Masculino', 'luis@gmail.com', '1992-11-25', 78.3, 0, 70, 1),
(10, 'Fernández', 'Carlos', '34567890', 'Avenida Principal 567', '567890123', 'MASCULINO', 'carlos@gmail.com', '1988-07-02', 90.7, 0, 80, 1),
(12, 'Pepperino', 'Pepe', '33833333', 'Av. ASasd 464', '464446465', 'OTRO', 'prueba@gmail.com', '1988-02-01', 90.5, 0, 75.2, 1),
(13, 'Pepperino', 'Pepe2', '33833331', 'Av. Asd 734', '46444444', 'MASCULINO', 'asd@asd.com', '1988-09-09', 90.5, 0, 75.2, 1),
(14, 'Prueba', 'NombrePrueba', '31312321', 'Av. ASasd 464', '464446465', 'MASCULINO', 'prueba@gmail.com', '1988-08-08', 200, 0, 110, 1),
(15, 'Luthor', 'Lex', '123456789', '123 Main St', '5551234567', 'MASCULINO', 'lex@example.com', '1990-03-15', 180.5, 185, 175, 1),
(16, 'Parker', 'Peter', '987654321', '456 Elm St', '5552345678', 'MASCULINO', 'peter@example.com', '1985-07-10', 160, 175, 170, 1),
(17, 'Quinn', 'Harley', '654321987', '789 Oak St', '5553456789', 'FEMENINO', 'harley@example.com', '1993-02-20', 135.5, 160, 130, 1),
(18, 'Wayne', 'Bruce', '789123456', '101 Gotham Ln', '5554567890', 'MASCULINO', 'bruce@example.com', '1980-06-30', 190, 188, 180, 1),
(19, 'Danvers', 'Carol', '234567891', '234 Krypton Rd', '5555678901', 'FEMENINO', 'carol@example.com', '1989-04-25', 150.5, 173, 145, 1),
(20, 'Osborn', 'Norman', '345678912', '345 Villain Ave', '5556789012', 'MASCULINO', 'norman@example.com', '1975-08-05', 175, 180, 170, 1),
(21, 'Munroe', 'Ororo', '456789123', '456 X-Mansion Rd', '5557890123', 'FEMENINO', 'ororo@example.com', '1984-01-18', 140, 165, 135, 1),
(22, 'Fisk', 'Wilson', '567891234', '567 Crime St', '5558901234', 'MASCULINO', 'wilson@example.com', '1970-11-20', 200, 185, 195, 1),
(23, 'Prince', 'Diana', '678912345', '678 Amazon Ave', '5559012345', 'FEMENINO', 'diana@example.com', '1982-09-12', 140, 170, 130, 1);

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
(1, 12, 200, '2023-10-06', 1),
(2, 12, 180.5, '2023-10-06', 1),
(3, 12, 180, '2023-10-06', 0),
(8, 6, 90.5, '2023-01-01', 1),
(9, 7, 65.7, '2023-01-01', 1),
(10, 8, 77.1, '2023-01-01', 1),
(11, 9, 59.3, '2023-01-01', 1),
(12, 10, 70.8, '2023-01-01', 1),
(14, 6, 90.5, '2023-01-01', 1),
(15, 7, 65.7, '2023-01-01', 1),
(16, 8, 77.1, '2023-01-01', 1),
(17, 9, 59.3, '2023-01-01', 1),
(18, 10, 70.8, '2023-01-01', 1),
(19, 12, 64.5, '2023-01-01', 1),
(20, 13, 70.2, '2023-01-01', 1),
(21, 14, 83.7, '2023-01-01', 1),
(22, 15, 66.4, '2023-01-01', 1),
(23, 16, 75.8, '2023-01-01', 1),
(24, 17, 81.2, '2023-01-01', 1);

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
  MODIFY `idAntecedente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `comidas`
--
ALTER TABLE `comidas`
  MODIFY `idComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `idDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `indicacion`
--
ALTER TABLE `indicacion`
  MODIFY `idIndic` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `profesional`
--
ALTER TABLE `profesional`
  MODIFY `idProfesional` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `registropeso`
--
ALTER TABLE `registropeso`
  MODIFY `idRegistro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

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
