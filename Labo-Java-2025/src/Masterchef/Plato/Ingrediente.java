package Masterchef.Plato;

public class Ingrediente {
    private String nombre;
    private Double calorias;
    private Double tiempoCocinar;

    public Ingrediente(String nombre, Double calorias, Double tiempoCocinar) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.tiempoCocinar = tiempoCocinar;
    }

    public Ingrediente() {
        this.nombre = "N/A";
        this.calorias = 0.0;
        this.tiempoCocinar = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }

    public Double getTiempoCocinar() {
        return tiempoCocinar;
    }

    public void setTiempoCocinar(Double tiempoCocinar) {
        this.tiempoCocinar = tiempoCocinar;
    }
}
