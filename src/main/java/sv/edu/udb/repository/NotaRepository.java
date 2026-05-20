package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.domain.Nota;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}