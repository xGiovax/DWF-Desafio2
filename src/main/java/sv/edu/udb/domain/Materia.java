package sv.edu.udb.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "materia")
@Schema(description = "Entidad que representa una asignatura")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID autoincremental de la materia", example = "1")
    private Long id;

    @Schema(description = "Nombre de la asignatura", example = "Programación de Algoritmos")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;

    @ManyToMany(mappedBy = "materias")
    @JsonIgnore // Evita recursión infinita en JSON
    private List<Alumno> alumnos;
}