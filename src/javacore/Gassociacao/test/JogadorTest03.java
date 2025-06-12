package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador[] jogadores = new Jogador[] {jogador1, jogador2};
        Time time = new Time("Seleção Brasileira", jogadores);

        jogador1.setTime(time);
        jogador2.setTime(time);

        //time.imprime();
        jogador1.imprime();
        time.imprime();

    }
}
