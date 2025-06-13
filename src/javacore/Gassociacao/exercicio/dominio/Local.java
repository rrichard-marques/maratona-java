package javacore.Gassociacao.exercicio.dominio;

public class Local {

    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getLocal() {
        return endereco;
    }

    public void setLocal(String local) {
        this.endereco = local;
    }
}