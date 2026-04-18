-- registros de tabla profesor
INSERT INTO profesor (nombre) VALUES ('Carlos Martínez');
INSERT INTO profesor (nombre) VALUES ('Ana López');
INSERT INTO profesor (nombre) VALUES ('Luis García');
INSERT INTO profesor (nombre) VALUES ('María Rodríguez');
INSERT INTO profesor (nombre) VALUES ('José Hernández');

-- registros de tabla materia
INSERT INTO materia (nombre, id_profesor) VALUES ('Matemática', 1);
INSERT INTO materia (nombre, id_profesor) VALUES ('Programación', 2);
INSERT INTO materia (nombre, id_profesor) VALUES ('Base de Datos', 3);
INSERT INTO materia (nombre, id_profesor) VALUES ('Física', 4);
INSERT INTO materia (nombre, id_profesor) VALUES ('Redes', 5);

-- registros de tabla alumno
INSERT INTO alumno (nombre, apellido) VALUES ('Juan', 'Pérez');
INSERT INTO alumno (nombre, apellido) VALUES ('Sofía', 'Gómez');
INSERT INTO alumno (nombre, apellido) VALUES ('Miguel', 'Ramírez');
INSERT INTO alumno (nombre, apellido) VALUES ('Valentina', 'Torres');
INSERT INTO alumno (nombre, apellido) VALUES ('Andrés', 'Castro');

-- registros de tabla alumno_materia
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (1, 1);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (1, 2);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (2, 3);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (3, 4);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (4, 5);