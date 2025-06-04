package javacore.Bintroducaometodos.test;


import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        estudante1.nome = "Wesley";
        estudante1.idade = 17;
        estudante1.sexo = 'M';


        Estudante estudante2 = new Estudante();
        estudante2.nome = "Larissa";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprime(estudante1);
        System.out.println("---------------");
        impressora.imprime(estudante2);

    }
}
