package ArcoFlecha;

import java.util.HashSet;

public class Comida extends Beneficio implements Acumulable{
    private HashSet<String> comidas;
    public static Double descuentoExtra=4500.0;

    public Comida() {
        super();
        this.comidas = new HashSet<>();
    }

    public Comida(String creador, String nombre, HashSet<String> gaseosas) {
        super(creador, nombre);
        this.comidas = gaseosas;
    }

    public HashSet<String> getComidas() {
        return comidas;
    }

    public void setComidas(HashSet<String> comidas) {
        this.comidas = comidas;
    }

    public static Double getDescuentoExtra() {
        return descuentoExtra;
    }

    public static void setDescuentoExtra(Double descuentoExtra) {
        Comida.descuentoExtra = descuentoExtra;
    }

    @Override
    public Double aplicarDescuentoExtra() {
        return descuentoExtra;
    }
}
