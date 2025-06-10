package javacore.Csobrecargametodos.test;

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {


        /*Anime anime1 = new Anime();
        anime1.init("Sorriso Real" , "Dorama" , 26 , "Comédia");
        anime1.imprime();

        System.out.println("------------");

        Anime anime2 = new Anime();
        anime2.init("Naturo" , "Desenho" , 720 , "Ação");
        anime2.imprime();*/

        Anime anime1 = new Anime();
        anime1.setNome("Sorriso Real");
        anime1.setTipo("Dorama");
        anime1.setEpisodios(26);
        anime1.setGenero("Comédia");
        anime1.imprime();

        System.out.println("------------");

        Anime anime2 = new Anime();
        anime2.setNome("Naruto");
        anime2.setTipo("Desenho");
        anime2.setEpisodios(720);
        anime2.setGenero("Ação");
        anime2.imprime();

    }
}
