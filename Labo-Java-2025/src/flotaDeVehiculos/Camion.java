package flotaDeVehiculos;

import tiempo.Fecha;

public class Camion extends CuatroRuedas{
    private Double capacidadCarga;

    public Camion() {
        super();
        this.capacidadCarga = 1700.0;
    }

    public Camion(String marca, String modelo, String color, int cantidadRuedas, Fecha anioFabricacion, String patente, Double capacidadCarga) {
        super(marca, modelo, color, cantidadRuedas, anioFabricacion, patente);
        this.capacidadCarga = capacidadCarga;
    }
}
