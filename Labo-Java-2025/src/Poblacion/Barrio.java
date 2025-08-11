package Poblacion;

public class Barrio extends Lugar{
    private int poblacion;

    public Barrio() {
        super();
        this.poblacion = 0;
    }

    public Barrio(String nombre, int codigo, double latitud, double longitud, int poblacion) {
        super(nombre, codigo, latitud, longitud);
        this.poblacion = poblacion;
    }

    @Override
    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
}
