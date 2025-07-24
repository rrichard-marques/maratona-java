package javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExcepitionTest02 {
    public static void main(String[] args) throws IOException {

        criarNovoArquivo();

        System.out.println("Finalizado.");

    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Arquivo criado" + isCreate);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

}
