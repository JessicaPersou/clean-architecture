package br.com.alura.codechella.domain.entities.usuario;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class UsuarioTest {

    @Test
    public void naoDeveCadastrarUmUsuarioComCpfNoFormatoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Usuario("111222.333-00", "Jessica Sousa",
                LocalDate.parse("1993-03-19"), "jessica.persou@gmail.com"));
    }

    @Test
    public void deveCadastrarUmUsuarioComCpfNoFormatoValido() {
        assertDoesNotThrow(() -> new Usuario("111.222.333-00", "Jessi",
                LocalDate.parse("1993-03-19"), "jessica.persou@gmail.com"));
    }

    @Test
    public void naoDeveCadastrarUmUsuarioComEmailNoFormatoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Usuario("111.222.333-00", "Jessi",
                LocalDate.parse("1993-03-19"), "jessica.persou"));
    }

    @Test
    public void deveCadastrarUmUsuarioComEmailNoFormatoValido() {
        assertDoesNotThrow(() -> new Usuario("111.222.333-00", "Jessi",
                LocalDate.parse("1993-03-19"), "jessica.persou@gmail.com"));
    }

    @Test
    public void deveCriarUsuarioUsandoFabricaDeUsuario(){
        FabricaDeUsuario fabricaDeUsuario = new FabricaDeUsuario();
        Usuario usuario = fabricaDeUsuario.criaUsuarioComNomeCpfNascimentoEmail("111.222.333-00", "Maria",
                LocalDate.parse("1993-03-19"), "maria@gmail.com");

        assertEquals("Maria", usuario.getNome());

        usuario = fabricaDeUsuario.usuarioComEndereco( "123456-000", 123,"apto 201");

        assertEquals("123456-000",usuario.getEndereco().getCep());
    }

    @Test
    public void naoDeveCriarUsuarioMenorDeIdade() {
        LocalDate nascimentoUsuario = LocalDate.now().minusYears(17);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                new Usuario("111.222.333-00", "Maria", nascimentoUsuario, "maria@gmail.com"));

        assertEquals("Idade do usuário deve ser maior que 18 anos!", exception.getMessage());

    }

}