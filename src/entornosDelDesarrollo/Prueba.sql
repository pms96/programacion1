SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS cursan;
DROP TABLE IF EXISTS hacen;
DROP TABLE IF EXISTS new_table;
DROP TABLE IF EXISTS alumnos;
DROP TABLE IF EXISTS elaboran;
DROP TABLE IF EXISTS profesores;
DROP TABLE IF EXISTS asignaturas;
DROP TABLE IF EXISTS examenes;
DROP TABLE IF EXISTS practicas;




/* Create Tables */

CREATE TABLE alumnos
(
	numAlumnos int NOT NULL,
	nombre text,
	grupo int,
	PRIMARY KEY (numAlumnos)
);


CREATE TABLE asignaturas
(
	numAsignatura int NOT NULL,
	nombre longtext,
	PRIMARY KEY (numAsignatura)
);


CREATE TABLE cursan
(
	numAlumnos int NOT NULL,
	numAsignatura int NOT NULL,
	trimestre int
);


CREATE TABLE elaboran
(
	codPractica int NOT NULL,
	numProfesores int NOT NULL,
	fechaPP date
);


CREATE TABLE examenes
(
	numExamen int NOT NULL,
	numPreguntas int,
	fecha date NOT NULL,
	PRIMARY KEY (numExamen, fecha)
);


CREATE TABLE hacen
(
	numAlumnos int NOT NULL,
	numExamen int NOT NULL,
	fecha date NOT NULL,
	nota float(2,2)
);


CREATE TABLE new_table
(
	numAlumnos int NOT NULL,
	codPractica int NOT NULL,
	nota float(2,2),
	fecha date
);


CREATE TABLE practicas
(
	codPractica int NOT NULL,
	titulo longtext,
	nivel text,
	PRIMARY KEY (codPractica)
);


CREATE TABLE profesores
(
	numProfesores int NOT NULL,
	nombreProfesor longtext,
	numAsignatura int NOT NULL,
	PRIMARY KEY (numProfesores)
);



/* Create Foreign Keys */

ALTER TABLE cursan
	ADD FOREIGN KEY (numAlumnos)
	REFERENCES alumnos (numAlumnos)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE hacen
	ADD FOREIGN KEY (numAlumnos)
	REFERENCES alumnos (numAlumnos)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE new_table
	ADD FOREIGN KEY (numAlumnos)
	REFERENCES alumnos (numAlumnos)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE cursan
	ADD FOREIGN KEY (numAsignatura)
	REFERENCES asignaturas (numAsignatura)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE profesores
	ADD FOREIGN KEY (numAsignatura)
	REFERENCES asignaturas (numAsignatura)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE hacen
	ADD FOREIGN KEY (numExamen, fecha)
	REFERENCES examenes (numExamen, fecha)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE elaboran
	ADD FOREIGN KEY (codPractica)
	REFERENCES practicas (codPractica)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE new_table
	ADD FOREIGN KEY (codPractica)
	REFERENCES practicas (codPractica)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE elaboran
	ADD FOREIGN KEY (numProfesores)
	REFERENCES profesores (numProfesores)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



