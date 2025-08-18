package Tiendas.compragamer.Pago;

public class Efectivo extends Metodopago {
    private int cantidad;

    public Efectivo() {
        super();
        cantidad = 0;
    }

    public Efectivo(String tipo, int cantidad) {
        super(tipo);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}