package introducao;



public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {

        double valorNot = 2800;

        for (int parcela = 1; parcela <= 12; parcela++) {
            double parcelamento = valorNot / parcela;
            if (parcelamento >= 12) {
                System.out.println(parcela + " parcelas de: R$" + parcelamento);
            }
        }
    }
}
