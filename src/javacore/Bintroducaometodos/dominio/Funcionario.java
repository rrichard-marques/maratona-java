package javacore.Bintroducaometodos.dominio;

public class Funcionario {

    /*public String nome;
    public int idade;
    public double salario1;
    public double salario2;
    public double salario3;*/

    /*public void mediaSalario() {
        System.out.println("Média Salarial: " + (this.salario1 + this.salario2 + this.salario3) / 3);
    }*/

    public String nome;
    public int idade;
    public double[] salarios;


    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public void imprimeMediaSalarial() {
        double media = 0;
        if (salarios != null) {
            for (double salario : salarios) {
                media = media + salario;
            }
            media = media / salarios.length;
        }
        System.out.println("Média salarial: " + media);
    }
}
