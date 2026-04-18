package sv.edu.udb.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "alumno")
@Schema(description = "Entidad que representa a un estudiante")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID autoincremental del alumno", example = "1")
    private Long id;

    @Schema(description = "Nombre del estudiante", example = "Lionel")
    private String nombre;

    @Schema(description = "Apellido del estudiante", example = "Messi")
    private String apellido;

    @ManyToMany
    @JoinTable(
            name = "alumno_materia",
            joinColumns = @JoinColumn(name = "id_alumno"),
            inverseJoinColumns = @JoinColumn(name = "id_materia")
    )
    private List<Materia> materias;
}
