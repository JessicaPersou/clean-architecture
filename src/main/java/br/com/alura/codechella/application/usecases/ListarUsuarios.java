package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateway.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;
import java.util.List;

public class ListarUsuarios {

    private final RepositorioDeUsuario repositorio;

    public ListarUsuarios(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public List<Usuario> obterUsuarios() {
        return repositorio.listarTodos();
    }

}
