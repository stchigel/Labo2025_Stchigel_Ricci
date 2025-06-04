package flotaDeVehiculos;

import objetos.Color;
import tiempo.Fecha;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Color color;
    private int cantidadRuedas;
    private Fecha anioFabricacion;

    public Vehiculo(){
        this.marca="N/A";
        this.modelo="N/A";
        this.color=Color.WHITE;
        this.cantidadRuedas=0;
        this.anioFabricacion=new Fecha(23,11,24);
    }

    public Vehiculo(String marca, String modelo, Color color, int cantidadRuedas, Fecha anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidadRuedas = cantidadRuedas;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public Fecha getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Fecha anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}
