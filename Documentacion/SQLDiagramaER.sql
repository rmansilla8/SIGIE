-- MySQL Script generated by MySQL Workbench
-- 03/30/16 22:41:30
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`table1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`table1` (
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Personal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Personal` (
  `DPI_personal` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellidos` VARCHAR(45) NOT NULL,
  `Residencia` VARCHAR(45) NULL,
  `Edad` INT NULL,
  `Fecha_Nacimiento` DATE NULL,
  `Estado_civil` VARCHAR(45) NULL,
  PRIMARY KEY (`DPI_personal`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `idUsuario` VARCHAR(10) NOT NULL,
  `Contraseña` VARCHAR(45) NULL,
  `Rol` VARCHAR(45) NULL,
  `Personal_DPI` INT NOT NULL,
  PRIMARY KEY (`idUsuario`),
  INDEX `fk_Usuario_Personal_idx` (`Personal_DPI` ASC),
  CONSTRAINT `fk_Usuario_Personal`
    FOREIGN KEY (`Personal_DPI`)
    REFERENCES `mydb`.`Personal` (`DPI_personal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Telefono_personal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Telefono_personal` (
  `Numero` INT NOT NULL,
  `Identificador` VARCHAR(10) NULL,
  `Personal_DPI` INT NOT NULL,
  PRIMARY KEY (`Numero`),
  INDEX `fk_Telefono_Personal1_idx` (`Personal_DPI` ASC),
  CONSTRAINT `fk_Telefono_Personal1`
    FOREIGN KEY (`Personal_DPI`)
    REFERENCES `mydb`.`Personal` (`DPI_personal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Estudiante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Estudiante` (
  `idEstudiante` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Apellido` VARCHAR(45) NULL,
  `Fecha_de_nacimiento` DATE NULL,
  `cui` INT NULL,
  `Lugar_de_Naciomiento` VARCHAR(45) NULL,
  `edad` INT NULL,
  PRIMARY KEY (`idEstudiante`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Encargado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Encargado` (
  `Dpi_encargado` INT NOT NULL,
  `Nombres` VARCHAR(45) NULL,
  `Apellidos` VARCHAR(45) NULL,
  `Residencia` VARCHAR(45) NULL,
  `Nombre_trabajo` VARCHAR(45) NULL,
  `Parentesco` VARCHAR(10) NULL,
  `Estudiante_idEstudiante` INT NOT NULL,
  PRIMARY KEY (`Dpi_encargado`),
  INDEX `fk_Encargado_Estudiante1_idx` (`Estudiante_idEstudiante` ASC),
  CONSTRAINT `fk_Encargado_Estudiante1`
    FOREIGN KEY (`Estudiante_idEstudiante`)
    REFERENCES `mydb`.`Estudiante` (`idEstudiante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Reglamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Reglamento` (
  `idReglamento` INT NOT NULL,
  `Fecha_reglamento` DATE NULL,
  `Estudiante_idEstudiante` INT NOT NULL,
  `Encargado_Dpi_encargado` INT NOT NULL,
  PRIMARY KEY (`idReglamento`),
  INDEX `fk_Reglamento_Estudiante1_idx` (`Estudiante_idEstudiante` ASC),
  INDEX `fk_Reglamento_Encargado1_idx` (`Encargado_Dpi_encargado` ASC),
  CONSTRAINT `fk_Reglamento_Estudiante1`
    FOREIGN KEY (`Estudiante_idEstudiante`)
    REFERENCES `mydb`.`Estudiante` (`idEstudiante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reglamento_Encargado1`
    FOREIGN KEY (`Encargado_Dpi_encargado`)
    REFERENCES `mydb`.`Encargado` (`Dpi_encargado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Dato_profesion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Dato_profesion` (
  `idProfesion` INT NOT NULL,
  `Afiliacion_IGSS` INT NULL,
  `Inicio_laboral` DATE NULL,
  `Personal_DPI` INT NOT NULL,
  PRIMARY KEY (`idProfesion`),
  INDEX `fk_Dato_profesion_Personal1_idx` (`Personal_DPI` ASC),
  CONSTRAINT `fk_Dato_profesion_Personal1`
    FOREIGN KEY (`Personal_DPI`)
    REFERENCES `mydb`.`Personal` (`DPI_personal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Info_Docente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Info_Docente` (
  `CedulaDocente` VARCHAR(12) NOT NULL,
  `Fecha_emision` DATE NULL,
  `Registro_escalafonario` VARCHAR(12) NULL,
  `Clase_escalafonaria` CHAR(1) NULL,
  `Fecha_de_ascenso` DATE NULL,
  `Personal_DPI` INT NOT NULL,
  PRIMARY KEY (`CedulaDocente`),
  INDEX `fk_Info_Docente_Personal1_idx` (`Personal_DPI` ASC),
  CONSTRAINT `fk_Info_Docente_Personal1`
    FOREIGN KEY (`Personal_DPI`)
    REFERENCES `mydb`.`Personal` (`DPI_personal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Telefono_encargado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Telefono_encargado` (
  `Telefono` INT NOT NULL,
  `Identificador` VARCHAR(10) NULL,
  `Encargado_Dpi_encargado` INT NOT NULL,
  PRIMARY KEY (`Telefono`),
  INDEX `fk_Telefono_encargado_Encargado1_idx` (`Encargado_Dpi_encargado` ASC),
  CONSTRAINT `fk_Telefono_encargado_Encargado1`
    FOREIGN KEY (`Encargado_Dpi_encargado`)
    REFERENCES `mydb`.`Encargado` (`Dpi_encargado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Ficha_inscripcion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Ficha_inscripcion` (
  `idFicha_inscripcion` INT NOT NULL,
  `Fecha_inscripcion` DATE NULL,
  `observaciones` VARCHAR(100) NULL,
  `Estudiante_idEstudiante` INT NOT NULL,
  `Encargado_Dpi_encargado` INT NOT NULL,
  PRIMARY KEY (`idFicha_inscripcion`),
  INDEX `fk_Ficha_inscripcion_Estudiante1_idx` (`Estudiante_idEstudiante` ASC),
  INDEX `fk_Ficha_inscripcion_Encargado1_idx` (`Encargado_Dpi_encargado` ASC),
  CONSTRAINT `fk_Ficha_inscripcion_Estudiante1`
    FOREIGN KEY (`Estudiante_idEstudiante`)
    REFERENCES `mydb`.`Estudiante` (`idEstudiante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ficha_inscripcion_Encargado1`
    FOREIGN KEY (`Encargado_Dpi_encargado`)
    REFERENCES `mydb`.`Encargado` (`Dpi_encargado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Titulo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Titulo` (
  `Registro_titulo` INT NOT NULL,
  `Año_graduacion` DATE NULL,
  `Profesion` VARCHAR(100) NULL,
  `Personal_DPI_personal` INT NOT NULL,
  PRIMARY KEY (`Registro_titulo`, `Personal_DPI_personal`),
  INDEX `fk_Titulo_Personal1_idx` (`Personal_DPI_personal` ASC),
  CONSTRAINT `fk_Titulo_Personal1`
    FOREIGN KEY (`Personal_DPI_personal`)
    REFERENCES `mydb`.`Personal` (`DPI_personal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Convenio_pagos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Convenio_pagos` (
  `idConvenio_pagos` INT NOT NULL,
  `fecha_convenio` DATE NULL,
  `Encargado_Dpi_encargado` INT NOT NULL,
  `Estudiante_idEstudiante` INT NOT NULL,
  PRIMARY KEY (`idConvenio_pagos`, `Encargado_Dpi_encargado`),
  INDEX `fk_Convenio_pagos_Encargado1_idx` (`Encargado_Dpi_encargado` ASC),
  INDEX `fk_Convenio_pagos_Estudiante1_idx` (`Estudiante_idEstudiante` ASC),
  CONSTRAINT `fk_Convenio_pagos_Encargado1`
    FOREIGN KEY (`Encargado_Dpi_encargado`)
    REFERENCES `mydb`.`Encargado` (`Dpi_encargado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convenio_pagos_Estudiante1`
    FOREIGN KEY (`Estudiante_idEstudiante`)
    REFERENCES `mydb`.`Estudiante` (`idEstudiante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`table2`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`table2` (
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`grado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`grado` (
  `idgrado` INT NOT NULL,
  `grado` CHAR(1) NULL,
  PRIMARY KEY (`idgrado`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Area_curricular`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Area_curricular` (
  `idArea_curricular` INT NOT NULL,
  `nombre_area` VARCHAR(45) NULL,
  `grado_idgrado` INT NOT NULL,
  PRIMARY KEY (`idArea_curricular`),
  INDEX `fk_Area_curricular_grado1_idx` (`grado_idgrado` ASC),
  CONSTRAINT `fk_Area_curricular_grado1`
    FOREIGN KEY (`grado_idgrado`)
    REFERENCES `mydb`.`grado` (`idgrado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Notas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Notas` (
  `idhistorial` INT NOT NULL,
  `ciclo` INT NULL,
  `seccion` CHAR(1) NULL,
  `bim1` INT NULL,
  `bim2` INT NULL,
  `bim3` INT NULL,
  `bim4` INT NULL,
  `grado_idgrado` INT NOT NULL,
  `Area_curricular_idArea_curricular` INT NOT NULL,
  `Estudiante_idEstudiante` INT NOT NULL,
  PRIMARY KEY (`idhistorial`),
  INDEX `fk_Notas_grado1_idx` (`grado_idgrado` ASC),
  INDEX `fk_Notas_Area_curricular1_idx` (`Area_curricular_idArea_curricular` ASC),
  INDEX `fk_Notas_Estudiante1_idx` (`Estudiante_idEstudiante` ASC),
  CONSTRAINT `fk_Notas_grado1`
    FOREIGN KEY (`grado_idgrado`)
    REFERENCES `mydb`.`grado` (`idgrado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Notas_Area_curricular1`
    FOREIGN KEY (`Area_curricular_idArea_curricular`)
    REFERENCES `mydb`.`Area_curricular` (`idArea_curricular`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Notas_Estudiante1`
    FOREIGN KEY (`Estudiante_idEstudiante`)
    REFERENCES `mydb`.`Estudiante` (`idEstudiante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
