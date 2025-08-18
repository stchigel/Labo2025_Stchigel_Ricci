package Poblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Provincia extends Lugar{
    HashMap<Integer, Ciudad> ciudades;

    public Provincia() {
        super();
        this.ciudades = new HashMap<>();
    }

    public Provincia(String nombre, int codigo, double latitud, double longitud, HashMap<Integer, Ciudad> ciudades) {
        super(nombre, codigo, latitud, longitud);
        this.ciudades = ciudades;
    }

    public HashMap<Integer, Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashMap<Integer, Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public int getPoblacion() {
        int total=0;
        for(Lugar l : ciudades.values()){
            total+=l.getPoblacion();
        }
        return total;
    }
}