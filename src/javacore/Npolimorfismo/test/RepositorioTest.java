package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.repositorio.Repositorio;
import javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");

        System.out.println(list);

    }
}
