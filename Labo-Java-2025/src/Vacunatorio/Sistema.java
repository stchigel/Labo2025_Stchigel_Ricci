package Vacunatorio;

import java.util.HashMap;
import java.util.Map;

public class Sistema {
    HashMap<Integer, Ciudadano> ciudadanos;

    public Sistema(HashMap<Integer, Ciudadano> ciudadanos) {
        this.ciudadanos = ciudadanos;
    }

    public Sistema() {
        this.ciudadanos = new HashMap<>();
    }

    public HashMap<Integer, Ciudadano> getciudadanos() {
        return ciudadanos;
    }

    public void setciudadanos(HashMap<Integer, Ciudadano> ciudadanos) {
        this.ciudadanos = ciudadanos;
    }

    // PUNTO 1
    public void regisVacuna(int dni, Vacuna vacuna){
        int aux = ciudadanos.get(dni).getVaccines().size();

        ciudadanos.get(dni).addVaccines(vacuna);

        if(ciudadanos.get(dni).getVaccines().size()>aux){
            System.out.println("El ciudadano "+dni+"se aplico la vacuna "+vacuna.getNomComerc());
        }
    }

    // PUNTO 2
    public void vacunasCiudadano(int dni){
        for(Vacuna v : ciudadanos.get(dni).getVaccines()){
            System.out.println("Vacuna: "+v.getNomComerc()+" Aplicada en "+v.getFecAplic().toString());
        }
    }

    // PUNTO 3
    public void vacunadosXProvincia(){
        for(Provincias p : Provincias.values()){
            int cantVacs=0;
            for(Ciudadano c : ciudadanos.values()){
                if(c.getPR().equals(p)){
                    cantVacs++;
                }
            }
            System.out.println("En " + p.name() + " se vacunaron " + cantVacs + " personas");
        }
    }

    // PUNTO 4
    public void cumplenCantVacs(int cantVacs){
        for(Map.Entry<Integer, Ciudadano> valores : ciudadanos.entrySet()){
            int dni = valores.getKey();
            Ciudadano c= valores.getValue();
            if(c.cantVaccines()>=cantVacs){
                System.out.println("El ciudadano "+ dni + "cumple el parametro necesario de vacunas");
            }
        }
    }

    // PUNTO 5
    public void ciudadanosConCiertaVacuna(Vacuna v){
        for(Map.Entry<Integer, Ciudadano> valores : ciudadanos.entrySet()) {
            int dni = valores.getKey();
            Ciudadano c = valores.getValue();
            if(c.vaccines.contains(v)){
                System.out.println("El ciudadano "+dni+"se dio la vacuna "+v.getNomComerc());
            }
        }
    }
}