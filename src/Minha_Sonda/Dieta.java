package Minha_Sonda;

public class Dieta extends MinhaSonda {
    private String proteinas;
    private String carboidratos;
    private String gorduras;
    private String fibras;
    private String vitaminas;


    public String calcularCalorias(String proteinas, String carboidratos, String gorduras){
        this.proteinas = "80g";
        this.carboidratos = "150g";
        this.gorduras = "50g";

        return proteinas + gorduras + carboidratos;
    }
}
