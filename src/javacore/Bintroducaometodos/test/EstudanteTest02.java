package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        estudante1.nome = "Wesley";
        estudante1.idade = 17;
        estudante1.sexo = 'M';
        estudante1.imprime();

        System.out.println("");

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Larissa";
        estudante2.idade = 16;
        estudante2.sexo = 'F';
        estudante2.imprime();

    }
}
