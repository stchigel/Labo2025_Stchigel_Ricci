package Prestamos;

import Bases.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Usuario extends Persona {
    private double creditoGanado;
    private String mail;
    private HashSet<Publicacion>leidos;
    private HashMap<Publicacion, Integer>prestamos;

    public Usuario() {
        super();
        this.creditoGanado = 0.0;
        this.mail = "N/A";
        this.leidos = new HashSet<>();
        this.prestamos = new HashMap<>();
    }

    public Usuario(String nombre, String apellido, LocalDate fn, double creditoGanado, String mail, HashSet<Publicacion> leidos, HashMap<Publicacion, Integer> prestamos) {
        super(nombre, apellido, fn);
        this.creditoGanado = creditoGanado;
        this.mail = mail;
        this.leidos = leidos;
        this.prestamos = prestamos;
    }

    public double getCreditoGanado() {
        return creditoGanado;
    }

    public void setCreditoGanado(double creditoGanado) {
        this.creditoGanado = creditoGanado;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Publicacion> getLeidos() {
        return leidos;
    }

    public void setLeidos(HashSet<Publicacion> leidos) {
        this.leidos = leidos;
    }

    public HashMap<Publicacion, Integer> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(HashMap<Publicacion, Integer> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestamo(Publicacion p){
        prestamos.put(p, prestamos.get(p)+1);
    }
}
