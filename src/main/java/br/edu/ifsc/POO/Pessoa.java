package br.edu.ifsc.POO;

import java.util.Date;

public class Pessoa{

    String nome;
    String telefone;
    String cpf;
    String genero;
    Date dataNascimento;
    Pessoa[] responsaveis;
    Pessoa conjuge;
    Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pessoa[] getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(Pessoa[] responsaveis) {
        this.responsaveis = responsaveis;
    }

    public Pessoa getConjuge() {
        return conjuge;
    }

    public void setConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return  "Nome:'" + nome + '\'' +
                ", Cpf: '" + cpf + '\'';
    }
}


