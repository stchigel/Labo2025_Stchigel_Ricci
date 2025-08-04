package Bastaricci;

import Bases.Persona;

import java.util.HashSet;

public class Publica extends Persona {
    HashSet<Mesa>mesasVende;

    public Publica(String nombre,String apellido, int edad, String direccion, HashSet<Mesa> mesasVende) {
        super(nombre, apellido, edad, direccion);
        this.mesasVende = new HashSet<>();
    }

    public Publica() {
        super();
        this.mesasVende = new HashSet<>();
    }

    public HashSet<Mesa> getMesasVende() {
        return mesasVende;
    }

    public void setMesasVende(HashSet<Mesa> mesasVende) {
        this.mesasVende = mesasVende;
    }
}
