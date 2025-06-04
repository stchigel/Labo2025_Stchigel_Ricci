package flotaDeVehiculos;

import objetos.Color;
import tiempo.Fecha;

public class Auto extends CuatroRuedas{
    private boolean descapotable;

    public Auto() {
        super();
        this.descapotable = false;
    }

    public Auto(String marca, String modelo, Color color, int cantidadRuedas, Fecha anioFabricacion, String patente, boolean descapotable) {
        super(marca, modelo, color, cantidadRuedas, anioFabricacion, patente);
        this.descapotable = descapotable;
    }

    public boolean getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}
