package sv.edu.udb.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.domain.Materia;
import sv.edu.udb.service.MateriaService;

import java.util.List;

@RestController
@RequestMapping("/api/materias")
@Tag(name = "Materias", description = "Operaciones para la gestión de asignaturas")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @Operation(summary = "Listar todas las materias")
    @GetMapping
    public List<Materia> getAll() {
        return materiaService.findAll();
    }

    @Operation(summary = "Registrar una nueva matería")
    @PostMapping
    public Materia create(@RequestBody Materia materia) {
        return materiaService.save(materia);
    }
}