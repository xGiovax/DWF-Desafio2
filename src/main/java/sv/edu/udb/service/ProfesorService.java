package sv.edu.udb.service;

import sv.edu.udb.domain.Profesor;
import java.util.List;
import java.util.Optional;

public interface ProfesorService {
    List<Profesor> findAll();
    Optional<Profesor> findById(Long id);
    Profesor save(Profesor profesor);
    void deleteById(Long id);
}