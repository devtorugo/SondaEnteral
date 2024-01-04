package Minha_Sonda;

import Minha_Sonda.MinhaSonda;

public class Dados extends MinhaSonda {
    private String temperatura;
    private String nivel;
    private String consistencia;

    public Dados(String temperatura, String nivel, String consistencia) {
        this.temperatura = temperatura;
        this.nivel = nivel;
        this.consistencia = consistencia;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getConsistencia() {
        return consistencia;
    }

    public void setConsistencia(String consistencia) {
        this.consistencia = consistencia;
    }
}
