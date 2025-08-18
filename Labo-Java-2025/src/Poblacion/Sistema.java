package Poblacion;

import Vacunatorio.Ciudadano;

import java.util.HashMap;
import java.util.Map;

public class Sistema {
    /*HashMap<Integer, Integer> barrioACiudad = new HashMap<>();
    HashMap<Integer, Integer> ciudadAProvincia = new HashMap<>();
    HashMap<Integer, Integer> provinciaAPais = new HashMap<>();
    HashMap<Integer, Integer> paisAContinente = new HashMap<>();*/
    HashMap<Integer, Continente> continentes = new HashMap<>();
    HashMap<Integer, Lugar> lugares = new HashMap<>();


    /*Ej 1*/
    public void alta(Lugar l){
        lugares.put(l.getCodigo(), l);
    }

    public void baja(int idLugar){
        lugares.remove(idLugar);
    }

    public void modif(int idLugar, Lugar l){
        lugares.replace(idLugar, l);
    }

    /*Ej 2*/
    public int poblacionPorID(int id){
        return lugares.get(id).getPoblacion();
    }

    /*Ej 3*/
    public Continente contMasPob(){
        Continente cMas = new Continente();
        int cantMas= cMas.getPoblacion();
        for(Continente c : continentes.values()){
            if(c.getPoblacion()>cantMas){
                cMas=c;
                cantMas=cMas.getPoblacion();
            }
        }
        return cMas;
    }

    public Continente contMenosPob(){
        Continente cMenos = new Continente();
        long cantMenos= 999999999999999999L;
        for(Continente c : continentes.values()){
            if(c.getPoblacion()<cantMenos){
                cMenos=c;
                cantMenos=cMenos.getPoblacion();
            }
        }
        return cMenos;
    }

    public Pais paisMasPob(){
        Pais pMas = new Pais();
        int cantMas= pMas.getPoblacion();
        for(Continente c : continentes.values()) {
            for (Pais p : c.getPaises().values()) {
                if (p.getPoblacion() > cantMas) {
                    pMas = p;
                    cantMas = pMas.getPoblacion();
                }
            }
        }
        return pMas;
    }

    public Pais paisMenosPob(){
        Pais pMenos = new Pais();
        long cantMenos= 999999999999999999L;
        for(Continente c : continentes.values()) {
            for (Pais p : c.getPaises().values()) {
                if (p.getPoblacion() < cantMenos) {
                    pMenos = p;
                    cantMenos = pMenos.getPoblacion();
                }
            }
        }
        return pMenos;
    }

    public void pantallaInformacion(){
        Continente cMas=contMasPob();
        Continente cMenos=contMenosPob();
        Pais pMas = paisMasPob();
        Pais pMenos = paisMenosPob();

        System.out.println("Cont mas pob "+cMas.getNombre());
        System.out.println("Cont menos pob "+cMenos.getNombre());
        System.out.println("Pais mas pob "+pMas.getNombre());
        System.out.println("Pais menos pob "+pMenos.getNombre());
    }


}
