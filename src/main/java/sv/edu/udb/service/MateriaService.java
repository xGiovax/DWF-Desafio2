package sv.edu.udb.service;

import sv.edu.udb.domain.Materia;
import java.util.List;
import java.util.Optional;

public interface MateriaService {
    List<Materia> findAll();
    Optional<Materia> findById(Long id);
    Materia save(Materia materia);
    void deleteById(Long id);
}