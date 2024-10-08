package br.com.alura.codechella.domain.entities.usuario;

import br.com.alura.codechella.domain.Endereco;
import java.time.LocalDate;
import java.time.Period;

public class Usuario {

    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String email;
    private Endereco endereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario(String cpf, String nome, LocalDate nascimento, String email) {

        if(cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")){
            throw new IllegalArgumentException("CPF fora do padrão desejado.");
        }

        if(email == null || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new IllegalArgumentException("Email no formato inválido");
        }


        int idade = Period.between(nascimento, LocalDate.now()).getYears();

        if(nascimento == null || idade < 18 ){
            throw new IllegalArgumentException("Idade do usuário deve ser maior que 18 anos!"
                    + "");
        }


        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
    }
}
