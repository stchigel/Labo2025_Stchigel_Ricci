package Tiendas.tiendaElectronica;

public class Producto{
    private String nombre;
    private Double precio;
    private int stock;
    private Categoria categoria;


    public Producto() {
        this.nombre = "N/A";
        this.precio = 0.0;
        this.stock = 0;
        this.categoria=Categoria.DEFAULT;
    }

    public Producto(Categoria categoria) {
        this.nombre = "N/A";
        this.precio = 0.0;
        this.stock = 0;
        this.categoria=categoria;
    }

    public Producto(String nombre, Double precio, int stock, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria=categoria;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
