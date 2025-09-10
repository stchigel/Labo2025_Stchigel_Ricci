package ArcoFlecha;

import java.util.HashSet;

public class Gaseosa extends Beneficio implements Acumulable{
    private HashSet<String> gaseosas;
    public static Double descuentoExtra=1000.0;

    public Gaseosa() {
        super();
        this.gaseosas = new HashSet<>();
    }

    public Gaseosa(String creador, String nombre, HashSet<String> gaseosas) {
        super(creador, nombre);
        this.gaseosas = gaseosas;
    }

    public HashSet<String> getGaseosas() {
        return gaseosas;
    }

    public void setGaseosas(HashSet<String> gaseosas) {
        this.gaseosas = gaseosas;
    }

    public static Double getDescuentoExtra() {
        return descuentoExtra;
    }

    public static void setDescuentoExtra(Double descuentoExtra) {
        Gaseosa.descuentoExtra = descuentoExtra;
    }

    @Override
    public Double aplicarDescuentoExtra() {
        return descuentoExtra;
    }
}
