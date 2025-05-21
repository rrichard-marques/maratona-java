package introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        double salario = 6000;
        String mensagemDoar = "Vou dor 500 reais.";
        String mensagemNãoDoar = "Não vou doar.";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNãoDoar;

        boolean possoDoar = salario > 5000;


        System.out.println(possoDoar);
    }
}
