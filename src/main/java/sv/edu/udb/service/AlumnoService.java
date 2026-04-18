package sv.edu.udb.service;

import sv.edu.udb.domain.Alumno;
import java.util.List;
import java.util.Optional;

public interface AlumnoService {
    List<Alumno> findAll();
    Optional<Alumno> findById(Long id);
    Alumno save(Alumno alumno);
    void deleteById(Long id);
}