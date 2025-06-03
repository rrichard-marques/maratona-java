package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(input.nextDouble(), input.nextDouble());
    }
}
