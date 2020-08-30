-- 
-- Uncomment me if you want :)
-- CREATE DATABASE CasoVolley;

CREATE TABLE Solicitud
(
    fechaSolicitud String NOT NULL
);

CREATE TABLE Pago
(
    nroTransferencia Integer NOT NULL,
    nombreEntidadFinanciera String NOT NULL,
    fechaPago String NOT NULL
);

CREATE TABLE Factura
(
    nroFactura Integer NOT NULL,
    fechaPagoOportuno String NOT NULL,
    valor Real NOT NULL,
    detalle String NOT NULL
);

CREATE TABLE Employee
(
    cargo String NOT NULL,
    sueldo Real NOT NULL,
    fechaInicio String NOT NULL,
    fechaFin String NOT NULL
);

CREATE TABLE Tarifa
(
    costoAnualMembresia Real NOT NULL
);

CREATE TABLE Persona
(
    nombre   String NOT NULL,
    apellido String NOT NULL,
    fechaNacimiento String NOT NULL,
    sexo String NOT NULL,
    telefono Integer NOT NULL,
    direccion String NOT NULL,
    correoElectronico String NOT NULL
);

CREATE TABLE Membresia
(
    esMiembro Boolean NOT NULL,
    fechaInicio String NOT NULL,
    fechaFin String NOT NULL,
    nroMiembro Integer NOT NULL
);

