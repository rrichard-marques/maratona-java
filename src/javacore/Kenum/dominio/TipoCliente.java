package javacore.Kenum.dominio;

public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Física");

    public final int VALOR;
    public final String RELATORIO;

    TipoCliente(int valor, String relatorio) {
        this.RELATORIO = relatorio;
        this.VALOR = valor;
    }

}
