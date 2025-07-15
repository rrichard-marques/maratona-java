package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Computador computador1 = new Computador("NUC10i7", 11000);
        Tomate tomate1 = new Tomate("Tomate Siciliano", 10);
        Televisao televisao1 = new Televisao("Samsung 50\"", 2500);

        CalculadoraImposto.calcularImposto(computador1);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(tomate1);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(televisao1);

    }
}
