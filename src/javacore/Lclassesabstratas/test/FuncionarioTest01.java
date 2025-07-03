package javacore.Lclassesabstratas.test;

import javacore.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Nami", 5000);
        System.out.println(gerente1);

        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Touya", 12000);
        System.out.println(desenvolvedor1);

    }
}
