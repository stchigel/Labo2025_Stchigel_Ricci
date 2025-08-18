package Tiendas.compragamer.Electronica;

public class Componente {
    private String modelo;
    private String fabricante;
    private Double precio;
    private int stock;

    public Componente() {
        this.modelo = "N/A";
        this.fabricante = "N/A";
        this.precio = 0.0;
        this.stock = 0;
    }

    public Componente(String modelo, String fabricante, Double precio, int stock) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.precio = precio;
        this.stock = stock;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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

    public void actualizarStock(){
        stock+=1;
    }
}
