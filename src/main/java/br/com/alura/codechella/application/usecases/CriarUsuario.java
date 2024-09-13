package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateway.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;

public class CriarUsuario {

    private final RepositorioDeUsuario repositorio;

    public CriarUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorio.cadastraUsuario(usuario);
    }

}
