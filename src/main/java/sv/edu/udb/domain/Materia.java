package sv.edu.udb.domain;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "materia")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;

    @ManyToMany(mappedBy = "materias")
    private List<Alumno> alumnos;
}