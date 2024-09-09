package br.com.alura.codechella.old.repository;

import br.com.alura.codechella.old.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
