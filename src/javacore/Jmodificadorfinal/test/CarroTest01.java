package javacore.Jmodificadorfinal.test;

import javacore.Jmodificadorfinal.dominio.Carro;
import javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Richard");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("FXX Evoluzione");
        ferrari.imprime();

    }
}
