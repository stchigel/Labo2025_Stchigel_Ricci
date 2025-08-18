package Poblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Pais extends Lugar{
    HashMap<Integer, Provincia> provincias;

    public Pais() {
        super();
        this.provincias = new HashMap<>();
    }

    public Pais(String nombre, int codigo, double latitud, double longitud, HashMap<Integer, Provincia> provincias) {
        super(nombre, codigo, latitud, longitud);
        this.provincias = provincias;
    }

    public HashMap<Integer, Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashMap<Integer, Provincia> provincias) {
        this.provincias = provincias;
    }

    @Override
    public int getPoblacion() {
        int total=0;
        for(Lugar l : provincias.values()){
            total+=l.getPoblacion();
        }
        return total;
    }
}