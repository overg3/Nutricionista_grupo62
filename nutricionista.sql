-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-10-2023 a las 01:56:21
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
(2, 'Dieta de la vaca loca', 8, 4, '2023-10-06', '2023-12-12', 65.2, 75.1, 1);

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
(10, 'Fernández', 'Carlos', '34567890', 'Avenida Principal 567', '567890123', 'MASCULINO', 'carlos@gmail.com', '1988-07-02', 90.7, 0, 80, 0),
(12, 'Pepperino', 'Pepe', '33833333', 'Av. ASasd 464', '464446465', 'OTRO', 'prueba@gmail.com', '1988-02-01', 90.5, 0, 75.2, 1),
(13, 'Pepperino', 'Pepe2', '33833331', 'Av. Asd 734', '46444444', 'MASCULINO', 'asd@asd.com', '1988-09-09', 90.5, 0, 75.2, 1),
(14, 'Prueba', 'NombrePrueba', '31312321', 'Av. ASasd 464', '464446465', 'MASCULINO', 'prueba@gmail.com', '1988-08-08', 200, 0, 110, 1);

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
(3, 'Ana', 'Martínez', '45678901', 'Plaza Central 789', '789012345', 'ana@gmail.com', 0, '67890'),
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
(3, 12, 180, '2023-10-06', 0);

--
-- Índices para tablas volcadas
--

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
  ADD UNIQUE KEY `nombre` (`nombre`),
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
-- AUTO_INCREMENT de la tabla `comidas`
--
ALTER TABLE `comidas`
  MODIFY `idComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `idDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `indicacion`
--
ALTER TABLE `indicacion`
  MODIFY `idIndic` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `profesional`
--
ALTER TABLE `profesional`
  MODIFY `idProfesional` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `registropeso`
--
ALTER TABLE `registropeso`
  MODIFY `idRegistro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

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
