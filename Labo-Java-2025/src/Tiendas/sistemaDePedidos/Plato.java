package Tiendas.sistemaDePedidos;

public class Plato {
    private String nombre;
    private Double precio;

    public Plato() {
        this.nombre = "N/A";
        this.precio = 0.0;
    }

    public Plato(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
