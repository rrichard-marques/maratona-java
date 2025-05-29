package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor();
        professor1.nome = "Batoré";
        professor1.idade = 39;
        professor1.sexo = 'M';

        System.out.println("Professor : " + professor1.nome + " - Idade : " + professor1.idade + " - Sexo : " + professor1.sexo);

    }
}
