package Vacunatorio;

import Bases.Persona;

import java.util.HashSet;

public class Ciudadano extends Persona {
    private Provincias PR;
    private String mail;
    HashSet<Vacuna> vaccines;

    public Ciudadano(){
        super();
        this.PR=Provincias.CABA;
        this.mail="anashei@anshei.com";
        this.vaccines=new HashSet<>();
    }

    public Ciudadano(String nombre,String apellido, int edad, String direccion, Provincias PR, String mail) {
        super(nombre, apellido, edad, direccion);
        this.PR = PR;
        this.mail = mail;
        this.vaccines=new HashSet<>();
    }

    public Provincias getPR() {
        return PR;
    }

    public void setPR(Provincias PR) {
        this.PR = PR;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Vacuna> getVaccines() {
        return vaccines;
    }

    public void setVaccines(HashSet<Vacuna> vaccines) {
        this.vaccines = vaccines;
    }

    public int cantVaccines(){
        return vaccines.size();
    }

    public void addVaccines(Vacuna v){
        vaccines.add(v);
    }
}
