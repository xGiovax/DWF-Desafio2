package sv.edu.udb.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "profesor")
@Schema(description = "Entidad que representa a un docente")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID autoincremental del profesor", example = "1")
    private Long id;

    @Schema(description = "Nombre completo del docente", example = "Carlos Ruano")
    private String nombre;

    @OneToMany(mappedBy = "profesor")
    @JsonIgnore // Evita recursión infinita en JSON
    private List<Materia> materias;
}