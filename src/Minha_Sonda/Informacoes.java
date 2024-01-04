package Minha_Sonda;

import Minha_Sonda.MinhaSonda;

import java.util.Date;

public class Informacoes extends MinhaSonda {
    private String tipo;
    private String modelo;
    private String fabricante;
    private Date data;
    private String status;



    public Informacoes(String dados, String informacoes, String dieta, String tipo, String modelo, String fabricante, Date data, String status) {
        super(dados, informacoes, dieta);
        this.tipo = tipo;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.data = data;
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
