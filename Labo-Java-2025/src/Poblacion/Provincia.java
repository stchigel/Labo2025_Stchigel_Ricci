package Poblacion;

import java.util.HashSet;

public class Provincia extends Lugar{
    HashSet<Ciudad> ciudades;

    public Provincia() {
        super();
        this.ciudades = new HashSet<>();
    }

    public Provincia(String nombre, int codigo, double latitud, double longitud, HashSet<Ciudad> ciudades) {
        super(nombre, codigo, latitud, longitud);
        this.ciudades = ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public int getPoblacion() {
        int total=0;
        for(Lugar l : ciudades){
            total+=l.getPoblacion();
        }
        return total;
    }
}