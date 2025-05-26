package introducao;

/*
Elabore um programa que apresente a
tabuadade um numero qualquer.
*/

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {


        for (int tabuada = 1; tabuada <= 10; tabuada++) {
            for (int number = 1; number <= 10 ; number++ ) {
                int resultado = number * tabuada;
                System.out.println(tabuada + " x " + number + " = " + resultado);
            }
            System.out.println("");
        }
    }
}