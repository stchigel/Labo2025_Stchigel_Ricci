package compragamer.Pago;

public class Metodopago {
    private String tipo;

    public Metodopago() {
        this.tipo = "N/A";
    }

    public Metodopago(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
