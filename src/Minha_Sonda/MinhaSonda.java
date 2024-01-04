package Minha_Sonda;

public class MinhaSonda {
    private String dados;
    private String informacoes;
    private String dieta;

    public MinhaSonda(){

    }

    public MinhaSonda(String dados, String informacoes, String dieta) {
        this.dados = dados;
        this.informacoes = informacoes;
        this.dieta = dieta;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
}
