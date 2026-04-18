
--Tablas del desafio

-- Tabla Profesor
CREATE TABLE profesor (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);


-- Tabla Materia
CREATE TABLE materia (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    id_profesor BIGINT,
    FOREIGN KEY (id_profesor) REFERENCES profesor(id)
);


-- Tabla Alumno
CREATE TABLE alumno (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL
);


-- Tabla Intermedia (Inscripciones)
CREATE TABLE alumno_materia (
    id_alumno BIGINT,
    id_materia BIGINT,
    PRIMARY KEY (id_alumno, id_materia),
    FOREIGN KEY (id_alumno) REFERENCES alumno(id),
    FOREIGN KEY (id_materia) REFERENCES materia(id)
);

