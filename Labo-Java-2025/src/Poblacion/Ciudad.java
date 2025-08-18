package Poblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Ciudad extends Lugar{
    HashMap<Integer, Barrio> barrios;

    public Ciudad() {
        super();
        this.barrios = new HashMap<>();
    }

    public Ciudad(String nombre, int codigo, double latitud, double longitud, HashMap<Integer, Barrio> barrios) {
        super(nombre, codigo, latitud, longitud);
        this.barrios = barrios;
    }

    public HashMap<Integer, Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashMap<Integer, Barrio> barrios) {
        this.barrios = barrios;
    }

    @Override
    public int getPoblacion() {
        int total=0;
        for(Lugar l : barrios.values()){
            total+=l.getPoblacion();
        }
        return total;
    }
}
