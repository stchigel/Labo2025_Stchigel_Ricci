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

    //No me habla bonito, tampoco me habla bien, a mi me da lo mismo total no me voy a envolver, yo nunca la ame, nunca la quise ni la voy a querer, solo se lo meto cuando nos vamo a ver, yo nunca mi amor, yo nunca te ame pero chingamos bien rico, chingamos bien rico
}
