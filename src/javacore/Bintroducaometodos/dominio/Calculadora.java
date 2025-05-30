package javacore.Bintroducaometodos.dominio;

import java.util.Scanner;

public class Calculadora {

    Scanner input = new Scanner(System.in);

    public void somaDoisNumeros() {
        System.out.println(input.nextInt() + input.nextInt());
    }

    public void subtraiDoisNumeros() {
        System.out.println(input.nextInt() - input.nextInt());
    }

    public void multiplicaDoisNumeros(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);

    }

    public void somaArrays(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma = soma + num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma = soma + num;
        }
        System.out.println(soma);
    }

    
}
