package flotaDeVehiculos;

import objetos.Color;
import tiempo.Fecha;

public class Camion extends CuatroRuedas{
    private Double capacidadCarga;
    private Double pesoAcumulado;

    public Camion() {
        super();
        this.capacidadCarga = 1700.0;
        this.pesoAcumulado = 0.0;
    }

    public Camion(String marca, String modelo, Color color, int cantidadRuedas, Fecha anioFabricacion, String patente, Double capacidadCarga, Double pesoAcumulado) {
        super(marca, modelo, color, cantidadRuedas, anioFabricacion, patente);
        this.capacidadCarga = capacidadCarga;
        this.pesoAcumulado = pesoAcumulado;
    }

    public Double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Double getPesoAcumulado() {
        return pesoAcumulado;
    }

    public void setPesoAcumulado(Double pesoAcumulado) {
        this.pesoAcumulado = pesoAcumulado;
    }

    public void agregarPeso(Double carga){
        if(pesoAcumulado+carga <= capacidadCarga){
            pesoAcumulado+=carga;
        }
    }
}
