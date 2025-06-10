package javacore.Eblocosinicializacao.dominio;

public class Anime {

    private String nome;
    private int[] episodios;

    public Anime() {

        episodios = new int[50];
        for (int i = 0 ; i < episodios.length; i++) {
            episodios[i] = i + 1;
            System.out.println(episodios[i]);
        }
    }
}
