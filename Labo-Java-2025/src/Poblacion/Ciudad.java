package Poblacion;

import java.util.HashSet;

public class Ciudad extends Lugar{
    HashSet<Barrio> barrios;

    public Ciudad() {
        super();
        this.barrios = new HashSet<>();
    }

    public Ciudad(String nombre, int codigo, double latitud, double longitud, HashSet<Barrio> barrios) {
        super(nombre, codigo, latitud, longitud);
        this.barrios = barrios;
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    @Override
    public int getPoblacion() {
        int total=0;
        for(Lugar l : barrios){
            total+=l.getPoblacion();
        }
        return total;
    }
}
