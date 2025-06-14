package flotaDeVehiculos;

import objetos.Color;
import tiempo.Fecha;

public class CuatroRuedas extends Vehiculo{
    private String patente;


    public CuatroRuedas() {
        super("Mercedes Benz", "F1 W11", Color.BLACK, 4, new Fecha(12,12,21));
        this.patente = "ABC123";
    }

    public CuatroRuedas(String marca, String modelo, Color color, int cantidadRuedas, Fecha anioFabricacion, String patente) {
        super(marca, modelo, color, cantidadRuedas, anioFabricacion);
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
