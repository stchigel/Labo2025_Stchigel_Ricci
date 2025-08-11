package Poblacion;

import java.util.HashSet;

public class Continente extends Lugar{
    HashSet<Pais> paises;

    public Continente() {
        super();
        this.paises = new HashSet<>();
    }

    public Continente(String nombre, int codigo, double latitud, double longitud, HashSet<Pais> paises) {
        super(nombre, codigo, latitud, longitud);
        this.paises = paises;
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }

    @Override
    public int getPoblacion() {
        int total=0;
        for(Lugar l : paises){
            total+=l.getPoblacion();
        }
        return total;
    }
}