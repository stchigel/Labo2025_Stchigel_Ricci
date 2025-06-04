package flotaDeVehiculos;

import objetos.Color;
import tiempo.Fecha;

public class Bicicleta extends Vehiculo{
    public Bicicleta() {
        super();
    }

    public Bicicleta(String marca, String modelo, Color color, int cantidadRuedas, Fecha anioFabricacion) {
        super(marca, modelo, color, cantidadRuedas, anioFabricacion);
    }
}
