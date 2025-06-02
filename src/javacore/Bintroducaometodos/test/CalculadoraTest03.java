package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calculadora divide = new Calculadora();
        double resultado = divide.divideDoisNumeros(input.nextDouble(), input.nextDouble());
        System.out.println(resultado);


    }
}
