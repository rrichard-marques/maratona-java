package introducao;

/*

Prática

Crie variáveis para os campos descritos abaixos entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no <endereço>, confirmo que
recebi o salário de <salario>, na data <data>.

 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Fáfá da Quebrada";
        String endereco = "Rua Prado, nº50";
        double salario = 1412;
        String data = "12 de setembro de 2024";
        String relatorio = "Eu "+nome+", morando na "+endereco+
                ", confirmo que recebi o salário de "+salario+", na data "
                +data+".";

                System.out.println (relatorio);

    }
}
