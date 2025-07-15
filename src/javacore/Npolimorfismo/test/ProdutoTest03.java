package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {

        Produto produto1 = new Computador("Ryzen 7", 3000);

        Tomate produto2 = new Tomate("Americano", 20);
        produto2.setDataValidade("12/01/2021");

        CalculadoraImposto.calcularImposto(produto1);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(produto2);

    }
}
