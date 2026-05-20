package sv.edu.udb.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sv.edu.udb.domain.Nota;
import sv.edu.udb.repository.NotaRepository;
import sv.edu.udb.service.NotaService;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NotaServiceImpl implements NotaService {

    private final NotaRepository notaRepository;

    @Override
    public Nota save(Nota nota) {
        return notaRepository.save(nota);
    }

    @Override
    public Optional<Nota> findById(Long id) {
        return notaRepository.findById(id);
    }

    @Override
    public List<Nota> findAll() {
        return notaRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        notaRepository.deleteById(id);
    }
}