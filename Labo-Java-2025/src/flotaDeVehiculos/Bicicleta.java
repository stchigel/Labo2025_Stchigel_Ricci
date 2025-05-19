package flotaDeVehiculos;

import tiempo.Fecha;

public class Bicicleta extends Vehiculo{
    public Bicicleta() {
        super();
    }

    public Bicicleta(String marca, String modelo, String color, int cantidadRuedas, Fecha anioFabricacion) {
        super(marca, modelo, color, cantidadRuedas, anioFabricacion);
    }
}
