-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 03-04-2016 a las 18:22:47
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `sigie`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `area_curricular`
--

CREATE TABLE IF NOT EXISTS `area_curricular` (
  `idArea_curricular` int(11) NOT NULL,
  `nombre_area` varchar(45) NOT NULL,
  `grado_idgrado` int(11) NOT NULL,
  PRIMARY KEY (`idArea_curricular`),
  KEY `fk_Area_curricular_grado1_idx` (`grado_idgrado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `convenio_pagos`
--

CREATE TABLE IF NOT EXISTS `convenio_pagos` (
  `idConvenio_pagos` int(11) NOT NULL,
  `fecha_convenio` date DEFAULT NULL,
  `Encargado_Dpi_encargado` int(11) NOT NULL,
  `Estudiante_idEstudiante` int(11) NOT NULL,
  PRIMARY KEY (`idConvenio_pagos`,`Encargado_Dpi_encargado`),
  KEY `fk_Convenio_pagos_Encargado1_idx` (`Encargado_Dpi_encargado`),
  KEY `fk_Convenio_pagos_Estudiante1_idx` (`Estudiante_idEstudiante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dato_profesion`
--

CREATE TABLE IF NOT EXISTS `dato_profesion` (
  `idProfesion` int(11) NOT NULL,
  `Afiliacion_IGSS` int(11) DEFAULT NULL,
  `Inicio_laboral` date NOT NULL,
  `Personal_DPI` int(11) NOT NULL,
  PRIMARY KEY (`idProfesion`),
  KEY `fk_Dato_profesion_Personal1_idx` (`Personal_DPI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encargado`
--

CREATE TABLE IF NOT EXISTS `encargado` (
  `Dpi_encargado` int(11) NOT NULL,
  `Nombres` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Residencia` varchar(45) NOT NULL,
  `Nombre_trabajo` varchar(45) DEFAULT NULL,
  `Parentesco` varchar(10) NOT NULL,
  `Estudiante_idEstudiante` int(11) NOT NULL,
  PRIMARY KEY (`Dpi_encargado`),
  KEY `fk_Encargado_Estudiante1_idx` (`Estudiante_idEstudiante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE IF NOT EXISTS `estudiante` (
  `idEstudiante` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Fecha_de_nacimiento` date NOT NULL,
  `cui` int(11) NOT NULL,
  `Lugar_de_Naciomiento` varchar(45) NOT NULL,
  `edad` int(11) DEFAULT NULL,
  PRIMARY KEY (`idEstudiante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ficha_inscripcion`
--

CREATE TABLE IF NOT EXISTS `ficha_inscripcion` (
  `idFicha_inscripcion` int(11) NOT NULL,
  `Fecha_inscripcion` date NOT NULL,
  `observaciones` varchar(100) DEFAULT NULL,
  `Estudiante_idEstudiante` int(11) NOT NULL,
  `Encargado_Dpi_encargado` int(11) NOT NULL,
  PRIMARY KEY (`idFicha_inscripcion`),
  KEY `fk_Ficha_inscripcion_Estudiante1_idx` (`Estudiante_idEstudiante`),
  KEY `fk_Ficha_inscripcion_Encargado1_idx` (`Encargado_Dpi_encargado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grado`
--

CREATE TABLE IF NOT EXISTS `grado` (
  `idgrado` int(11) NOT NULL,
  `grado` char(1) NOT NULL,
  PRIMARY KEY (`idgrado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `info_docente`
--

CREATE TABLE IF NOT EXISTS `info_docente` (
  `CedulaDocente` varchar(12) NOT NULL,
  `Fecha_emision` date DEFAULT NULL,
  `Registro_escalafonario` varchar(12) DEFAULT NULL,
  `Clase_escalafonaria` char(1) DEFAULT NULL,
  `Fecha_de_ascenso` date DEFAULT NULL,
  `Personal_DPI` int(11) NOT NULL,
  PRIMARY KEY (`CedulaDocente`),
  KEY `fk_Info_Docente_Personal1_idx` (`Personal_DPI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notas`
--

CREATE TABLE IF NOT EXISTS `notas` (
  `idhistorial` int(11) NOT NULL,
  `ciclo` int(11) NOT NULL,
  `seccion` char(1) NOT NULL,
  `bim1` int(11) DEFAULT NULL,
  `bim2` int(11) DEFAULT NULL,
  `bim3` int(11) DEFAULT NULL,
  `bim4` int(11) DEFAULT NULL,
  `grado_idgrado` int(11) NOT NULL,
  `Area_curricular_idArea_curricular` int(11) NOT NULL,
  `Estudiante_idEstudiante` int(11) NOT NULL,
  PRIMARY KEY (`idhistorial`),
  KEY `fk_Notas_grado1_idx` (`grado_idgrado`),
  KEY `fk_Notas_Area_curricular1_idx` (`Area_curricular_idArea_curricular`),
  KEY `fk_Notas_Estudiante1_idx` (`Estudiante_idEstudiante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE IF NOT EXISTS `personal` (
  `DPI_personal` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Residencia` varchar(45) DEFAULT NULL,
  `Edad` int(11) DEFAULT NULL,
  `Fecha_Nacimiento` date NOT NULL,
  `Estado_civil` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`DPI_personal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reglamento`
--

CREATE TABLE IF NOT EXISTS `reglamento` (
  `idReglamento` int(11) NOT NULL,
  `Fecha_reglamento` date NOT NULL,
  `Estudiante_idEstudiante` int(11) NOT NULL,
  `Encargado_Dpi_encargado` int(11) NOT NULL,
  PRIMARY KEY (`idReglamento`),
  KEY `fk_Reglamento_Estudiante1_idx` (`Estudiante_idEstudiante`),
  KEY `fk_Reglamento_Encargado1_idx` (`Encargado_Dpi_encargado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefono_encargado`
--

CREATE TABLE IF NOT EXISTS `telefono_encargado` (
  `Telefono` int(11) NOT NULL,
  `Identificador` varchar(10) NOT NULL,
  `Encargado_Dpi_encargado` int(11) NOT NULL,
  PRIMARY KEY (`Telefono`),
  KEY `fk_Telefono_encargado_Encargado1_idx` (`Encargado_Dpi_encargado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefono_personal`
--

CREATE TABLE IF NOT EXISTS `telefono_personal` (
  `Numero` int(11) NOT NULL,
  `Identificador` varchar(10) NOT NULL,
  `Personal_DPI` int(11) NOT NULL,
  PRIMARY KEY (`Numero`),
  KEY `fk_Telefono_Personal1_idx` (`Personal_DPI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `titulo`
--

CREATE TABLE IF NOT EXISTS `titulo` (
  `Registro_titulo` int(11) NOT NULL,
  `Anio_graduacion` date DEFAULT NULL,
  `Profesion` varchar(100) NOT NULL,
  `Personal_DPI_personal` int(11) NOT NULL,
  PRIMARY KEY (`Registro_titulo`,`Personal_DPI_personal`),
  KEY `fk_Titulo_Personal1_idx` (`Personal_DPI_personal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `idUsuario` varchar(10) NOT NULL,
  `Contrasena` varchar(45) NOT NULL,
  `Rol` varchar(45) NOT NULL,
  `Personal_DPI` int(11) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `fk_Usuario_Personal_idx` (`Personal_DPI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `area_curricular`
--
ALTER TABLE `area_curricular`
  ADD CONSTRAINT `fk_Area_curricular_grado1` FOREIGN KEY (`grado_idgrado`) REFERENCES `grado` (`idgrado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `convenio_pagos`
--
ALTER TABLE `convenio_pagos`
  ADD CONSTRAINT `fk_Convenio_pagos_Encargado1` FOREIGN KEY (`Encargado_Dpi_encargado`) REFERENCES `encargado` (`Dpi_encargado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Convenio_pagos_Estudiante1` FOREIGN KEY (`Estudiante_idEstudiante`) REFERENCES `estudiante` (`idEstudiante`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `dato_profesion`
--
ALTER TABLE `dato_profesion`
  ADD CONSTRAINT `fk_Dato_profesion_Personal1` FOREIGN KEY (`Personal_DPI`) REFERENCES `personal` (`DPI_personal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `encargado`
--
ALTER TABLE `encargado`
  ADD CONSTRAINT `fk_Encargado_Estudiante1` FOREIGN KEY (`Estudiante_idEstudiante`) REFERENCES `estudiante` (`idEstudiante`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `ficha_inscripcion`
--
ALTER TABLE `ficha_inscripcion`
  ADD CONSTRAINT `fk_Ficha_inscripcion_Estudiante1` FOREIGN KEY (`Estudiante_idEstudiante`) REFERENCES `estudiante` (`idEstudiante`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Ficha_inscripcion_Encargado1` FOREIGN KEY (`Encargado_Dpi_encargado`) REFERENCES `encargado` (`Dpi_encargado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `info_docente`
--
ALTER TABLE `info_docente`
  ADD CONSTRAINT `fk_Info_Docente_Personal1` FOREIGN KEY (`Personal_DPI`) REFERENCES `personal` (`DPI_personal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `notas`
--
ALTER TABLE `notas`
  ADD CONSTRAINT `fk_Notas_grado1` FOREIGN KEY (`grado_idgrado`) REFERENCES `grado` (`idgrado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Notas_Area_curricular1` FOREIGN KEY (`Area_curricular_idArea_curricular`) REFERENCES `area_curricular` (`idArea_curricular`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Notas_Estudiante1` FOREIGN KEY (`Estudiante_idEstudiante`) REFERENCES `estudiante` (`idEstudiante`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reglamento`
--
ALTER TABLE `reglamento`
  ADD CONSTRAINT `fk_Reglamento_Estudiante1` FOREIGN KEY (`Estudiante_idEstudiante`) REFERENCES `estudiante` (`idEstudiante`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Reglamento_Encargado1` FOREIGN KEY (`Encargado_Dpi_encargado`) REFERENCES `encargado` (`Dpi_encargado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `telefono_encargado`
--
ALTER TABLE `telefono_encargado`
  ADD CONSTRAINT `fk_Telefono_encargado_Encargado1` FOREIGN KEY (`Encargado_Dpi_encargado`) REFERENCES `encargado` (`Dpi_encargado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `telefono_personal`
--
ALTER TABLE `telefono_personal`
  ADD CONSTRAINT `fk_Telefono_Personal1` FOREIGN KEY (`Personal_DPI`) REFERENCES `personal` (`DPI_personal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `titulo`
--
ALTER TABLE `titulo`
  ADD CONSTRAINT `fk_Titulo_Personal1` FOREIGN KEY (`Personal_DPI_personal`) REFERENCES `personal` (`DPI_personal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_Usuario_Personal` FOREIGN KEY (`Personal_DPI`) REFERENCES `personal` (`DPI_personal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
