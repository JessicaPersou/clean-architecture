package br.com.alura.codechella.old.service;

import br.com.alura.codechella.old.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
