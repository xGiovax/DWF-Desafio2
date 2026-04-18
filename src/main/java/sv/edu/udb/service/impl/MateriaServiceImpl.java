package sv.edu.udb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.domain.Materia;
import sv.edu.udb.repository.MateriaRepository;
import sv.edu.udb.service.MateriaService;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaServiceImpl implements MateriaService {
    @Autowired
    private MateriaRepository materiaRepository;

    @Override
    public List<Materia> findAll() { return materiaRepository.findAll(); }

    @Override
    public Optional<Materia> findById(Long id) { return materiaRepository.findById(id); }

    @Override
    public Materia save(Materia materia) { return materiaRepository.save(materia); }

    @Override
    public void deleteById(Long id) { materiaRepository.deleteById(id); }
}