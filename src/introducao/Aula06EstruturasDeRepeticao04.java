package introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {

        /*Dado o valor de um carro, descrubra o valor que
        ele pode ser parcelado em determinadas vezes.*/

        double valorCelular = 40000;

        for (int parcela = 1 ; parcela <= valorCelular ; parcela++) {
            double parcelamento = valorCelular / parcela;
            if (parcelamento >= 1000) {
                System.out.println(parcela + " de R$" + parcelamento);
            }
        }
    }
}
