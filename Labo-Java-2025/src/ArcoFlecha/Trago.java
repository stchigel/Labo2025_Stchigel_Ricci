package ArcoFlecha;

import java.util.HashSet;

public class Trago extends Beneficio{
    private HashSet<String> tragos;

    public Trago() {
        super();
        this.tragos = new HashSet<>();
    }

    public Trago(String creador, String nombre, HashSet<String> gaseosas) {
        super(creador, nombre);
        this.tragos = gaseosas;
    }

    public HashSet<String> getTragos() {
        return tragos;
    }

    public void setTragos(HashSet<String> tragos) {
        this.tragos = tragos;
    }
}
