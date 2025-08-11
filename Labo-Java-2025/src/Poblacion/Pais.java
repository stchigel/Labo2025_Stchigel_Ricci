package Poblacion;

import java.util.HashSet;

public class Pais extends Lugar{
    HashSet<Provincia> provincias;

    public Pais() {
        super();
        this.provincias = new HashSet<>();
    }

    public Pais(String nombre, int codigo, double latitud, double longitud, HashSet<Provincia> provincias) {
        super(nombre, codigo, latitud, longitud);
        this.provincias = provincias;
    }

    public HashSet<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }

    @Override
    public int getPoblacion() {
        int total=0;
        for(Lugar l : provincias){
            total+=l.getPoblacion();
        }
        return total;
    }
}