package javacore.Npolimorfismo.servico;

import estudos.richardmarques.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import estudos.richardmarques.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto.");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: R$" + produto.getValor());
        System.out.println("Imposto a ser pago: RS" + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }
    }

}
