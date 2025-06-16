package javacore.Hheranca.test;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua Prado, nº50");
        endereco1.setCep("45400-000");

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua Oldak Nascimento, nº18");
        endereco2.setCep("45400-000");

        Pessoa pessoa1 = new Pessoa("Richard Marques");
        pessoa1.setCpf("076.566.175-66");
        pessoa1.setEndereco(endereco1);

        //pessoa1.imprime();

        Funcionario funcionario1 = new Funcionario("Jaqueline Marques");
        funcionario1.setCpf("321.654.897.21");
        funcionario1.setSalario(2500);
        funcionario1.setEndereco(endereco2);

        //funcionario1.imprime();
        funcionario1.relatorioPagamento();

    }
}