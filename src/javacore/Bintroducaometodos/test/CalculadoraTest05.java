package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {

        int[] num = new int[] {1,2,3,4,5};
        Calculadora calculadora = new Calculadora();
        calculadora.somaArrays(num);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
