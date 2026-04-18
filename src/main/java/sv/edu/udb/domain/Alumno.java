package sv.edu.udb.domain;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;

    @ManyToMany
    @JoinTable(
            name = "alumno_materia",
            joinColumns = @JoinColumn(name = "id_alumno"),
            inverseJoinColumns = @JoinColumn(name = "id_materia")
    )
    private List<Materia> materias;
}
