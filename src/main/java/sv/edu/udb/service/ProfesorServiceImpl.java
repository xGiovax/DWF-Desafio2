package sv.edu.udb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.domain.Profesor;
import sv.edu.udb.repository.ProfesorRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ProfesorServiceImpl implements ProfesorService {
    @Autowired
    private ProfesorRepository profesorRepository;

    @Override
    public List<Profesor> findAll() { return profesorRepository.findAll(); }

    @Override
    public Optional<Profesor> findById(Long id) { return profesorRepository.findById(id); }

    @Override
    public Profesor save(Profesor profesor) { return profesorRepository.save(profesor); }

    @Override
    public void deleteById(Long id) { profesorRepository.deleteById(id); }
}