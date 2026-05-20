package sv.edu.udb.service;

import sv.edu.udb.domain.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Usuario save(Usuario usuario);
    Optional<Usuario> findByUsername(String username);
    List<Usuario> findAll();
    void deleteById(Long id);
}