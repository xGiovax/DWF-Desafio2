package sv.edu.udb.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.domain.Profesor;
import sv.edu.udb.service.ProfesorService;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
@Tag(name = "Profesores", description = "Operaciones para la gestión de docentes")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @Operation(summary = "Listar todos los profesores")
    @GetMapping
    public List<Profesor> getAll() {
        return profesorService.findAll();
    }

    @Operation(summary = "Registrar un nuevo profesor")
    @PostMapping
    public Profesor create(@RequestBody Profesor profesor) {
        return profesorService.save(profesor);
    }

    @Operation(summary = "Eliminar un profesor")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        profesorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}