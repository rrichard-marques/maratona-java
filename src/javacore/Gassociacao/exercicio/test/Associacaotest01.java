package javacore.Gassociacao.exercicio.test;

import javacore.Gassociacao.exercicio.dominio.Aluno;
import javacore.Gassociacao.exercicio.dominio.Local;
import javacore.Gassociacao.exercicio.dominio.Professor;
import javacore.Gassociacao.exercicio.dominio.Seminario;

public class Associacaotest01 {
    public static void main(String[] args) {

        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("barba Branca", "Pirata");
        Aluno[] alunos = new Aluno[] {aluno};
        Seminario seminario = new Seminario("Onde encontrar One Piece", alunos, local);

    }
}
