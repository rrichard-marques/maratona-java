package javacore.Oexception.exception.test;

import java.io.File;

public class ExcepitionTest01 {
    public static void main(String[] args) {

        criarNovoArquivo();



    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo");
//        try {
//            boolean isCreate = file.createNewFile();
//            System.out.println("Arquivo criado" + isCreate);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        file.delete();
    }

}
