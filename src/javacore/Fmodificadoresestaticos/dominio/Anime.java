package javacore.Fmodificadoresestaticos.dominio;

public class Anime {

    private String nome;
    private static int[] episodios;

    static  {
        System.out.println("Dentro do cloco de inicialização");
    }

    public Anime() {

        System.out.println("Dentro do cloco de inicialização");
        episodios = new int[50];
        for (int i = 0 ; i < episodios.length; i++) {
            episodios[i] = i + 1;
            System.out.println(episodios[i]);
        }
    }
}
