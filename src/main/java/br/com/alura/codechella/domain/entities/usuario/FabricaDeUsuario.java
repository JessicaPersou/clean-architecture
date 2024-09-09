package br.com.alura.codechella.domain.entities.usuario;

import br.com.alura.codechella.domain.Endereco;
import java.time.LocalDate;

public class FabricaDeUsuario {
    private Usuario usuario;

    public Usuario criaUsuarioComNomeCpfNascimentoEmail( String cpf, String nome, LocalDate nascimento, String email) {
        this.usuario = new Usuario(cpf, nome, nascimento, email);
        return this.usuario;
    }

    public Usuario usuarioComEndereco(String cep, Integer numero, String complemento) {
        this.usuario.setEndereco(new Endereco(cep, numero, complemento));
        return this.usuario;
    }
}