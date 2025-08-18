package Poblacion;

import java.util.HashMap;

public class Continente extends Lugar{
    HashMap<Integer, Pais> paises;

    public Continente() {
        super();
        this.paises = new HashMap<>();
    }

    public Continente(String nombre, int codigo, double latitud, double longitud, HashMap<Integer, Pais> paises) {
        super(nombre, codigo, latitud, longitud);
        this.paises = paises;
    }

    public HashMap<Integer, Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashMap<Integer, Pais> paises) {
        this.paises = paises;
    }

    @Override
    public int getPoblacion() {
        int total=0;
        for(Lugar l : paises.values()){
            total+=l.getPoblacion();
        }
        return total;
    }
}