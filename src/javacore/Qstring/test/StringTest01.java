package javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {

        String nome = "Willian";
        String nome2 = "Willian";
        nome = nome.concat(" Suane");
        System.out.println(nome);

        String nome3 = new String("Willian");
        System.out.println(nome2 == nome3);

    }
}
