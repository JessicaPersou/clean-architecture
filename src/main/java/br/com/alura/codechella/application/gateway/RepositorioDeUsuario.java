package br.com.alura.codechella.application.gateway;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import java.util.List;

public interface RepositorioDeUsuario {

    Usuario cadastraUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
