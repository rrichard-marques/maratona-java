package introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        int number1 = 10;
        double number2 = 20;
        double resultado = number1 / number2;
        System.out.println(resultado);

        int resto = 19 % 2;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezDiferenteQueVinte);

        // && (and)   || (or)   ! (not)

        int idade = 35;
        double salario = 2500;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 3000;
        boolean isDentroDaLeiMenorQueTrinta = idade < 40 && salario >= 2000;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);
        System.out.println();

        double corrente = 200;
        double poupanca = 3000;
        float play = 500;

        boolean issuficiente = corrente >= play || poupanca >= play;

        System.out.println("É suficiente? " +issuficiente);

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus += 3;
        bonus %= 2;

        System.out.println(bonus);

        int contador = 0;
        contador ++;

        System.out.println(contador);
    }
}
