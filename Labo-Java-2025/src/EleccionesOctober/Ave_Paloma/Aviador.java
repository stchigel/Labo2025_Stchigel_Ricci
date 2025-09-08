package EleccionesOctober.Ave_Paloma;

import CosasTangibles.objetos.Color;

public class Aviador {
    private Color color;
    private String nombre;
    private String especie;

    public Aviador() {
        this.color = Color.WHITE;
        this.nombre = "N/A";
        this.especie = "N/A";
    }

    public Aviador(Color color, String nombre, String especie) {
        this.color = color;
        this.nombre = nombre;
        this.especie = especie;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
