package javacore.Dconstrutores.test;


import javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime1 = new Anime("Dragon Ball Z" , "Desenho" , 500 , "Luta");
        Anime anime2 = new Anime("Naruto" , "Desenho" , 720 , "Ação" , "Sony");
        anime1.imprime();
        System.out.println("------------");
        anime2.imprime();






    }
}
