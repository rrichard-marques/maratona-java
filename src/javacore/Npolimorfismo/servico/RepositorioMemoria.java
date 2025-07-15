package javacore.Npolimorfismo.servico;

import estudos.richardmarques.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em memoria.");
    }

}
