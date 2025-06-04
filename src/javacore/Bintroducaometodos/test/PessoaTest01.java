package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Tommy");
        pessoa1.setIdade(26);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

    }
}
