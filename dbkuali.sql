/*
MySQL Data Transfer
Source Host: localhost
Source Database: dbkuali
Target Host: localhost
Target Database: dbkuali
Date: 12/08/2010 11:12:06
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for tblcliente
-- ----------------------------
DROP TABLE IF EXISTS `tblcliente`;
CREATE TABLE `tblcliente` (
  `NoCuenta` int(4) NOT NULL default '0',
  `Nombre` varchar(50) default NULL,
  `Direccion` varchar(50) default NULL,
  `Telefono` double(12,0) default NULL,
  `Rfc` varchar(20) default NULL,
  `Colonia` varchar(20) default NULL,
  `Comunidad` varchar(20) default NULL,
  `Municipio` varchar(20) default NULL,
  `CodigoPostal` double(10,0) default NULL,
  `Tarifa` varchar(20) default NULL,
  `FechaRegistro` date default NULL,
  PRIMARY KEY  (`NoCuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tblorden
-- ----------------------------
DROP TABLE IF EXISTS `tblorden`;
CREATE TABLE `tblorden` (
  `NoOrden` int(4) NOT NULL default '0',
  `Fecha` date default NULL,
  `NoCuenta` int(4) default NULL,
  `Tipo` varchar(15) default NULL,
  `Inspector` varchar(30) default NULL,
  `MotivoCorte` varchar(50) default NULL,
  PRIMARY KEY  (`NoOrden`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tblpago
-- ----------------------------
DROP TABLE IF EXISTS `tblpago`;
CREATE TABLE `tblpago` (
  `ClvFolio` int(4) NOT NULL default '0',
  `NoCuenta` int(4) default NULL,
  `FechaCubierta` varchar(9) default NULL,
  `MesesTranscurridos` int(4) default NULL,
  `FechaDePago` varchar(9) default NULL,
  `Rezago` float(4,0) default NULL,
  `PagoCalculado` float(4,0) default NULL,
  `Recargo` float(4,0) default NULL,
  `Total` float(4,0) default NULL,
  `FechaDeRegistro` date default NULL,
  PRIMARY KEY  (`ClvFolio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tblusuario
-- ----------------------------
DROP TABLE IF EXISTS `tblusuario`;
CREATE TABLE `tblusuario` (
  `ClvUsuario` int(4) NOT NULL default '0',
  `Usuario` varchar(10) default NULL,
  `Contraseña` varchar(10) default NULL,
  `Archivo` bit(1) default NULL,
  `IniciarSesion` bit(1) default NULL,
  `CerrarSesion` bit(1) default NULL,
  `RegistroDeUsuario` bit(1) default NULL,
  `SalirDeAplicacion` bit(1) default NULL,
  `Clientes` bit(1) default NULL,
  `RegistroDeClientes` bit(1) default NULL,
  `Pagos` bit(1) default NULL,
  `RegistroDePagos` bit(1) default NULL,
  `EmisionesOrdenes` bit(1) default NULL,
  `Reportes` bit(1) default NULL,
  `ReporteDeIngresos` bit(1) default NULL,
  `ReporteDePagos` bit(1) default NULL,
  `ReporteDeOrdenes` bit(1) default NULL,
  `Herramientas` bit(1) default NULL,
  `Calculadora` bit(1) default NULL,
  `RespaldarBd` bit(1) default NULL,
  `RestaurarBd` bit(1) default NULL,
  `Ayuda` bit(1) default NULL,
  `MostrarAyuda` bit(1) default NULL,
  `AcercaDe` bit(1) default NULL,
  PRIMARY KEY  (`ClvUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `tblcliente` VALUES ('0', 'joaquin martinez anibal', 'col. flavio crespo calle independencia s/n', '345', '345', 'r434r43', 'hutdsf', 'sdf', '34234', 'comercial', '2010-08-11');
INSERT INTO `tblorden` VALUES ('1', '2010-07-15', '1', 'reconexion', 'juan hernandez hernandez', 'a cubierto su pago');
INSERT INTO `tblorden` VALUES ('2', '2010-08-10', '2', 'RECONEXION', 'joe', 'ya pago');
INSERT INTO `tblorden` VALUES ('3', '2011-08-10', '2', 'corte', 'changoleon', 'no paga');
INSERT INTO `tblorden` VALUES ('4', '2011-08-10', '0', 'corte', 'utito', 'asda');
INSERT INTO `tblpago` VALUES ('1', '1', '09-08-10', '0', '09-08-10', '61', '0', '0', '61', '2010-08-09');
INSERT INTO `tblpago` VALUES ('2', '0', '11-08-10', '1', '11-09-10', '202', '0', '45', '247', '2010-08-11');
INSERT INTO `tblusuario` VALUES ('1', 'solis', 'so', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `tblusuario` VALUES ('2', 'carlos', 'ca', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `tblusuario` VALUES ('3', 'javier', 'ja', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `tblusuario` VALUES ('4', 'user', 'user', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
