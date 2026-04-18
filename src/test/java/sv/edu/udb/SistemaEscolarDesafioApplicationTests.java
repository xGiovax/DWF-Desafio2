package sv.edu.udb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import sv.edu.udb.domain.Alumno;
import sv.edu.udb.domain.Materia;
import sv.edu.udb.domain.Profesor;
import sv.edu.udb.repository.AlumnoRepository;
import sv.edu.udb.repository.MateriaRepository;
import sv.edu.udb.repository.ProfesorRepository;

import java.util.ArrayList;

@SpringBootTest
class SistemaEscolarDesafioApplicationTests {

	@Autowired
	private ProfesorRepository profesorRepo;

	@Autowired
	private MateriaRepository materiaRepo;

	@Autowired
	private AlumnoRepository alumnoRepo;

	@Test
	@Transactional
	@Commit // Hace que los datos no se borren al terminar el test
	void insertarRegistrosExtraTest() {
		// Insertar 2 Profesores mas
		Profesor p1 = new Profesor();
		p1.setNombre("Don Bosco");
		profesorRepo.save(p1);

		Profesor p2 = new Profesor();
		p2.setNombre("Carlos Ruano");
		profesorRepo.save(p2);

		// Insertar 2 Materias
		Materia m1 = new Materia();
		m1.setNombre("PAL");
		m1.setProfesor(p1);
		materiaRepo.save(m1);

		Materia m2 = new Materia();
		m2.setNombre("DAW");
		m2.setProfesor(p2);
		materiaRepo.save(m2);

		// Insertar 2 Alumnos mas
		Alumno a1 = new Alumno();
		a1.setNombre("Lionel ");
		a1.setApellido("Messi ");
		alumnoRepo.save(a1);

		Alumno a2 = new Alumno();
		a2.setNombre("Cristiano");
		a2.setApellido("Ronaldo");
		alumnoRepo.save(a2);

		// Validacion de que funciona
		long totalProfesores = profesorRepo.count();
		long totalMaterias = materiaRepo.count();
		long totalAlumnos = alumnoRepo.count();

		System.out.println("--- VERIFICACIÓN DE DATOS ---");
		System.out.println("Total Profesores: " + totalProfesores);
		System.out.println("Total Materias: " + totalMaterias);
		System.out.println("Total Alumnos: " + totalAlumnos);

		// El test falla si no hay 7 registros
		assert totalProfesores == 7;
		assert totalMaterias == 7;
		assert totalAlumnos == 7;
	}
}