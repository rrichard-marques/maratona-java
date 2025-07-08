package javacore.Minterfaces.dominio;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;

    public abstract void load();

    public default void checkPermisson() {
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxdataSize() {
        System.out.println("Dentro do retrieveMaxdataSize na interface");
    }

}
