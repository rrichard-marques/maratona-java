package javacore.Qstring.test;

public class StringPerformaceTest01 {
    public static void main(String[] args) {

        Long inicio = System.currentTimeMillis();
        concatString(10_000);
        Long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(10_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms");

    }

    private static void concatString(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            String texto = "";
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
            StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }

}
