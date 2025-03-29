package org.example;

import br.edu.ifsc.POO.Endereco;
import br.edu.ifsc.POO.Pessoa;


public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Endereco end = new Endereco();

        end.setLogradouro("7 de setembro");
        end.setNumero("29");

        pessoa1.setNome("Guilherme");
        pessoa1.setCpf("12345678910");
        pessoa1.setEndereco(end);

        pessoa2.setNome("Renato");
        pessoa2.setCpf("01234567890");
        pessoa2.setEndereco(end);

        end.setNumero("1014801fnkan");

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(end);

    }
}