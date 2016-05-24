SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `SIGIE` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `SIGIE` ;

-- -----------------------------------------------------
-- Table `SIGIE`.`persona`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`persona` (
  `cui` VARCHAR(15) NOT NULL ,
  `nombre` VARCHAR(45) NOT NULL ,
  `apellidos` VARCHAR(45) NOT NULL ,
  `residencia` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`cui`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`puesto`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`puesto` (
  `idpuesto` INT NOT NULL AUTO_INCREMENT ,
  `cargo` VARCHAR(45) NULL ,
  PRIMARY KEY (`idpuesto`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`empleado`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`empleado` (
  `idempleado` INT NOT NULL AUTO_INCREMENT ,
  `persona_cui` VARCHAR(15) NOT NULL ,
  `puesto_idpuesto` INT NOT NULL ,
  `telefonoempleado` INT(8) NULL ,
  PRIMARY KEY (`idempleado`) ,
  INDEX `fk_empleado_persona1_idx` (`persona_cui` ASC) ,
  INDEX `fk_empleado_puesto1_idx` (`puesto_idpuesto` ASC) ,
  CONSTRAINT `fk_empleado_persona1`
    FOREIGN KEY (`persona_cui` )
    REFERENCES `SIGIE`.`persona` (`cui` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_empleado_puesto1`
    FOREIGN KEY (`puesto_idpuesto` )
    REFERENCES `SIGIE`.`puesto` (`idpuesto` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`dato_profesion`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`dato_profesion` (
  `idprofesion` INT NOT NULL ,
  `igss` INT(12) NULL ,
  `inicio_labores` DATE NULL ,
  `empleado_idempleado` INT NOT NULL ,
  PRIMARY KEY (`idprofesion`) ,
  INDEX `fk_dato_profesion_empleado1_idx` (`empleado_idempleado` ASC) ,
  CONSTRAINT `fk_dato_profesion_empleado1`
    FOREIGN KEY (`empleado_idempleado` )
    REFERENCES `SIGIE`.`empleado` (`idempleado` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`info_docente`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`info_docente` (
  `ceduladocente` VARCHAR(12) NOT NULL ,
  `fechaemision` DATE NULL ,
  `claseescalafonaria` VARCHAR(1) NULL ,
  `fechaascenso` DATE NULL ,
  `empleadoidempleado` INT NOT NULL ,
  PRIMARY KEY (`ceduladocente`) ,
  INDEX `fk_docente_empleado1_idx` (`empleadoidempleado` ASC) ,
  CONSTRAINT `fk_docente_empleado1`
    FOREIGN KEY (`empleadoidempleado` )
    REFERENCES `SIGIE`.`empleado` (`idempleado` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`titulo`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`titulo` (
  `registrotitulo` INT NOT NULL ,
  `aniograduacion` YEAR NOT NULL ,
  `profesion` VARCHAR(100) NOT NULL ,
  `empleado_idempleado` INT NOT NULL ,
  PRIMARY KEY (`registrotitulo`) ,
  INDEX `fk_titulo_empleado1_idx` (`empleado_idempleado` ASC) ,
  CONSTRAINT `fk_titulo_empleado1`
    FOREIGN KEY (`empleado_idempleado` )
    REFERENCES `SIGIE`.`empleado` (`idempleado` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`seccion`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`seccion` (
  `idseccion` INT NOT NULL AUTO_INCREMENT ,
  `n_seccion` CHAR(1) NOT NULL ,
  PRIMARY KEY (`idseccion`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`ciclo`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`ciclo` (
  `idciclo` INT NOT NULL AUTO_INCREMENT ,
  `anio` YEAR NOT NULL ,
  PRIMARY KEY (`idciclo`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`grado`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`grado` (
  `idgrado` INT NOT NULL AUTO_INCREMENT ,
  `nombre_grado` VARCHAR(45) NOT NULL ,
  `seccion_idseccion` INT NOT NULL ,
  `ciclo_idciclo` INT NOT NULL ,
  PRIMARY KEY (`idgrado`) ,
  INDEX `fk_grado_seccion1_idx` (`seccion_idseccion` ASC) ,
  INDEX `fk_grado_ciclo1_idx` (`ciclo_idciclo` ASC) ,
  CONSTRAINT `fk_grado_seccion1`
    FOREIGN KEY (`seccion_idseccion` )
    REFERENCES `SIGIE`.`seccion` (`idseccion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_grado_ciclo1`
    FOREIGN KEY (`ciclo_idciclo` )
    REFERENCES `SIGIE`.`ciclo` (`idciclo` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`estudiante`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`estudiante` (
  `idestudiante` INT(13) NOT NULL ,
  `lugar_nacimiento` VARCHAR(10) NOT NULL ,
  `fechaNacimiento` DATE NULL ,
  `Edad` INT NULL ,
  `persona_cui` VARCHAR(15) NOT NULL ,
  `grado_idgrado` INT NOT NULL ,
  PRIMARY KEY (`idestudiante`) ,
  INDEX `fk_estudiante_persona1_idx` (`persona_cui` ASC) ,
  INDEX `fk_estudiante_grado1_idx` (`grado_idgrado` ASC) ,
  CONSTRAINT `fk_estudiante_persona1`
    FOREIGN KEY (`persona_cui` )
    REFERENCES `SIGIE`.`persona` (`cui` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_estudiante_grado1`
    FOREIGN KEY (`grado_idgrado` )
    REFERENCES `SIGIE`.`grado` (`idgrado` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`area_curricular`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`area_curricular` (
  `idarea_curricular` INT NOT NULL AUTO_INCREMENT ,
  `nombre_area` VARCHAR(50) NOT NULL ,
  `grado_idgrado` INT NOT NULL ,
  PRIMARY KEY (`idarea_curricular`) ,
  INDEX `fk_area_curricular_grado1_idx` (`grado_idgrado` ASC) ,
  CONSTRAINT `fk_area_curricular_grado1`
    FOREIGN KEY (`grado_idgrado` )
    REFERENCES `SIGIE`.`grado` (`idgrado` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`bimestre`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`bimestre` (
  `idbimestre` INT NOT NULL AUTO_INCREMENT ,
  `bimestre` VARCHAR(45) NULL ,
  PRIMARY KEY (`idbimestre`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`notas`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`notas` (
  `idbnota` INT NOT NULL AUTO_INCREMENT ,
  `bimestre_idbimestre` INT NOT NULL ,
  `nota` INT(3) NOT NULL ,
  `grado_idgrado` INT NOT NULL ,
  PRIMARY KEY (`idbnota`) ,
  INDEX `fk_notas_bimestre1_idx` (`bimestre_idbimestre` ASC) ,
  INDEX `fk_notas_grado1_idx` (`grado_idgrado` ASC) ,
  CONSTRAINT `fk_notas_bimestre1`
    FOREIGN KEY (`bimestre_idbimestre` )
    REFERENCES `SIGIE`.`bimestre` (`idbimestre` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_notas_grado1`
    FOREIGN KEY (`grado_idgrado` )
    REFERENCES `SIGIE`.`grado` (`idgrado` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`encargado`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`encargado` (
  `idencargado` INT NOT NULL AUTO_INCREMENT ,
  `nombretrabajo` VARCHAR(45) NOT NULL ,
  `relacionestudiante` VARCHAR(45) NOT NULL ,
  `persona_cui` VARCHAR(15) NOT NULL ,
  `telefonoencargado` VARCHAR(45) NULL ,
  PRIMARY KEY (`idencargado`) ,
  INDEX `fk_encargado_persona1_idx` (`persona_cui` ASC) ,
  CONSTRAINT `fk_encargado_persona1`
    FOREIGN KEY (`persona_cui` )
    REFERENCES `SIGIE`.`persona` (`cui` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`encargado_has_estudiante`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`encargado_has_estudiante` (
  `encargado_idencargado` INT NOT NULL ,
  `estudiante_cui` INT(13) NOT NULL ,
  PRIMARY KEY (`encargado_idencargado`, `estudiante_cui`) ,
  INDEX `fk_encargado_has_estudiante_estudiante1_idx` (`estudiante_cui` ASC) ,
  INDEX `fk_encargado_has_estudiante_encargado1_idx` (`encargado_idencargado` ASC) ,
  CONSTRAINT `fk_encargado_has_estudiante_encargado1`
    FOREIGN KEY (`encargado_idencargado` )
    REFERENCES `SIGIE`.`encargado` (`idencargado` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_encargado_has_estudiante_estudiante1`
    FOREIGN KEY (`estudiante_cui` )
    REFERENCES `SIGIE`.`estudiante` (`idestudiante` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`rol`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`rol` (
  `idrol` INT NOT NULL AUTO_INCREMENT ,
  `Rol_usuario` VARCHAR(45) NULL ,
  PRIMARY KEY (`idrol`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SIGIE`.`usuario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `SIGIE`.`usuario` (
  `idtable1` INT NOT NULL AUTO_INCREMENT ,
  `NombreUser` VARCHAR(45) NULL ,
  `password` VARCHAR(45) NULL ,
  `rol_idrol` INT NOT NULL ,
  `empleado_idempleado` INT NOT NULL ,
  PRIMARY KEY (`idtable1`) ,
  INDEX `fk_usuario_rol1_idx` (`rol_idrol` ASC) ,
  INDEX `fk_usuario_empleado1_idx` (`empleado_idempleado` ASC) ,
  CONSTRAINT `fk_usuario_rol1`
    FOREIGN KEY (`rol_idrol` )
    REFERENCES `SIGIE`.`rol` (`idrol` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_empleado1`
    FOREIGN KEY (`empleado_idempleado` )
    REFERENCES `SIGIE`.`empleado` (`idempleado` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `SIGIE` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
