package Minha_Sonda;

public class DietaIdosos extends Dieta {
    public String calcularCalorias(String proteinas, String carboidratos, String gorduras) {
        proteinas = "100g";
        carboidratos = "120g";
        gorduras = "55g";

        return proteinas + gorduras + carboidratos;


    }
}
