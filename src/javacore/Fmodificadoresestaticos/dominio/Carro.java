package javacore.Fmodificadoresestaticos.dominio;

public class Carro {

    private String nome;
    private double veloxidadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro(String nome, double veloxidadeMaxima) {
        this.nome = nome;
        this.veloxidadeMaxima = veloxidadeMaxima;
    }

    public void imprime () {
        System.out.println("----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.veloxidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVeloxidadeMaxima() {
        return veloxidadeMaxima;
    }

    public void setVeloxidadeMaxima(double veloxidadeMaxima) {
        this.veloxidadeMaxima = veloxidadeMaxima;
    }
}
