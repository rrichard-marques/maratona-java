package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;
import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Carro carro1 = new Carro();
        System.out.println("Digite o carro:");
        carro1.nome = input.next();
        System.out.println("Digite o modelo:");
        carro1.modelo = input.next();
        System.out.println("Digite o ano:");
        carro1.ano = input.nextInt();

        Carro carro2 = new Carro();
        System.out.println("Digite o carro:");
        carro2.nome = input.next();
        System.out.println("Digite o modelo:");
        carro2.modelo = input.next();
        System.out.println("Digite o ano:");
        carro2.ano = input.nextInt();

        System.out.println("Carro: " + carro1.nome + " | Modelo: " + carro1.modelo + " | Ano: " + carro1.ano);
        System.out.println("Carro: " + carro2.nome + " | Modelo: " + carro2.modelo + " | Ano: " + carro2.ano);
    }
}
