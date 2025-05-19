package sistemaDePedidos;

public class Plato {
    private String nombre;
    private Double precio;
    private int vecesPedido;

    public Plato() {
        this.nombre = "N/A";
        this.precio = 0.0;
        this.vecesPedido = 0;
    }

    public Plato(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.vecesPedido = 0;
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

    public int getVecesPedido() {
        return vecesPedido;
    }

    public void setVecesPedido(int vecesPedido) {
        this.vecesPedido = vecesPedido;
    }
}
