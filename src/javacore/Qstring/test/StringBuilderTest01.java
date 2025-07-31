package javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String nome = "Willian Suane";
        nome.concat(" DevDojo");
        nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Willian Suane");
        sb.append(" DevDojo").append(" Academi");
        System.out.println(sb);



//        String nome = "Richard Marques";
//        StringBuilder nome2 = new StringBuilder(nome);
//        System.out.println(nome2.reverse());

    }
}
