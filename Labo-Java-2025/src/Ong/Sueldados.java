package Ong;

import java.time.LocalDate;
import java.util.HashMap;

public abstract class Sueldados extends Persona {
    private Banco banco;
    private HashMap<LocalDate, Double> sueldo;
    private LocalDate alta;

    public Sueldados() {
        super();
        this.banco = Banco.BBVA;
        this.sueldo = new HashMap<>();
        this.alta = LocalDate.now();
    }

    public Sueldados(String nombre, String apellido, LocalDate nacimiento, String direccion, int codigoPostal, boolean mensualidad, Banco banco, LocalDate alta) {
        super(nombre, apellido, nacimiento, direccion, codigoPostal, mensualidad);
        this.banco = banco;
        this.sueldo = new HashMap<>();
        this.alta = alta;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public HashMap<LocalDate, Double> getSueldo() {
        return sueldo;
    }

    public void setSueldo(HashMap<LocalDate, Double> sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getAlta() {
        return alta;
    }

    public void setAlta(LocalDate alta) {
        this.alta = alta;
    }

    public void addSueldo(LocalDate d, Double s){
        sueldo.put(d, s);
    }

    public Double buscarSueldo(LocalDate d){
        return sueldo.get(d);
    }
}
