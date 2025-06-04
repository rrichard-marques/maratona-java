package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        /*Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Fabiana";
        funcionario1.idade = 44;
        funcionario1.salario1 = 800;
        funcionario1.salario2 = 1000;
        funcionario1.salario3 = 300;
        funcionario1.imprimeDados();
        funcionario1.mediaSalario();

        System.out.println("------------------------");

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Glauber";
        funcionario2.idade = 24;
        funcionario2.salario1 = 400;
        funcionario2.salario2 = 2000;
        funcionario2.salario3 = 100;
        funcionario2.imprimeDados();
        funcionario2.mediaSalario(); */

        Funcionario funcionario3 = new Funcionario();
        funcionario3.nome = "Richard";
        funcionario3.idade = 25;
        funcionario3.salarios = new double[] {2500,2000,1300,1000};
        funcionario3.imprimeDados();
        funcionario3.imprimeMediaSalarial();

        System.out.println("");

        Funcionario funcionario4 = new Funcionario();
        funcionario4.nome = "Vilsinho";
        funcionario4.idade = 51;
        funcionario4.salarios = new double[] {3600,800,1300,700};
        funcionario4.imprimeDados();
        funcionario4.imprimeMediaSalarial();

    }
}
