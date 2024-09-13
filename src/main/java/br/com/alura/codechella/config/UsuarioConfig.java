package br.com.alura.codechella.config;

import br.com.alura.codechella.application.gateway.RepositorioDeUsuario;
import br.com.alura.codechella.application.usecases.CriarUsuario;
import br.com.alura.codechella.application.usecases.ListarUsuarios;
import br.com.alura.codechella.infrastructure.gateways.RepositorioDeUsuarioJpa;
import br.com.alura.codechella.infrastructure.gateways.UsuarioEntityMapper;
import br.com.alura.codechella.infrastructure.persistense.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuario criarUsuario(RepositorioDeUsuario repositorioDeUsuario){
        return new CriarUsuario(repositorioDeUsuario);
    }

    @Bean
    RepositorioDeUsuarioJpa criarRpositorioDeUsuarioJpa(UsuarioRepository repositorio, UsuarioEntityMapper mapper){
        return new RepositorioDeUsuarioJpa(repositorio, mapper);
    }

    @Bean
    UsuarioEntityMapper criarUsuarioEntityMapper(){
        return new UsuarioEntityMapper();
    }

    @Bean
    ListarUsuarios criarListarUsuario(RepositorioDeUsuario repositorioDeUsuario){
        return new ListarUsuarios(repositorioDeUsuario);
    }
}
