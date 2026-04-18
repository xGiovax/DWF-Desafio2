package sv.edu.udb.domain;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter @Setter // Reemplazan a los métodos manuales
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "profesor")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "profesor")
    private List<Materia> materias;
}