package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.domain.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {
}