package pruebasArrays;

import Bases.Persona;

import java.util.ArrayList;

public class arrayPersonasEdad30 {
    public static void main(String[] args) {
        ArrayList<Persona>Gente = new ArrayList<Persona>();
        Gente.add(new Persona("Max",27,"Monaco" ));
        Gente.add(new Persona("Lewis",40,"Inglaterra" ));
        for(Persona sujeto : Gente){
            if(sujeto.getEdad()>30){
                System.out.println(sujeto.getNombre());
            }
        }
    }
}
