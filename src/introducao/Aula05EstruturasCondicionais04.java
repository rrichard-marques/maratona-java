package introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 45000;
        double imposto1 = salarioAnual * 9.70 / 100;
        double imposto2 = salarioAnual * 37.35 / 100;
        double imposto3 = salarioAnual * 49.50 / 100;


        if (salarioAnual <= 34712) {
            System.out.println(imposto1);
        }
        if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            System.out.println(imposto2);
        }
        if (salarioAnual >= 68508) {
            System.out.println(imposto3);
        }
    }
}
