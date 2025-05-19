package sistemaDePedidos;

public class Profesor extends Persona{
    private Double descuento;

    public Profesor() {
        super();
        this.descuento = 0.0;
    }

    public Profesor(String nombre, String apellido, Double descuento) {
        super(nombre, apellido);
        this.descuento = descuento;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
}
