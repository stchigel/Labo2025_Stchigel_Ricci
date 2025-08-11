package Calorias;

import java.util.HashSet;

public class Familia {
    private HashSet<Persona> personas;

    public Familia() {
        this.personas = new HashSet<>();
    }

    public Familia(HashSet<Persona> personas) {
        this.personas = personas;
    }

    public HashSet<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(HashSet<Persona> personas) {
        this.personas = personas;
    }

    public void addPersona(Persona p){
        personas.add(p);
    }

    public float caloriasPromedio(){
        int total=0;
        for (Persona p : personas){
            total+=p.caloriasTotales();
        }
        return (float) total/personas.size();
    }

    public Persona masCalorias(){
        int mayor=0;
        Persona mayorp=new Persona();
        for (Persona p : personas){
            if(p.caloriasTotales()>mayor){
                mayor=p.caloriasTotales();
                mayorp=p;
            }
        }
        return mayorp;
    }

    public Persona menosCalorias(){
        int menor=masCalorias().caloriasTotales();
        Persona menorp=new Persona();
        for (Persona p : personas){
            if(p.caloriasTotales()<menor){
                menor=p.caloriasTotales();
                menorp=p;
            }
        }
        return menorp;
    }
}
