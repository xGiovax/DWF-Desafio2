package sv.edu.udb.service;

import sv.edu.udb.domain.Nota;
import java.util.List;
import java.util.Optional;

public interface NotaService {
    Nota save(Nota nota);
    Optional<Nota> findById(Long id);
    List<Nota> findAll();
    void deleteById(Long id);
}