package Ong;

import java.time.LocalDate;
import java.time.Period;

public abstract class Persona {
    private String nombre;
    private String  apellido;
    private LocalDate nacimiento;
    private  String  direccion;
    private int codigoPostal;
    private boolean mensualidad;

    public Persona() {
        this.nombre = "nombre";
        this.apellido = "apellido";
        this.nacimiento = LocalDate.now();
        this.direccion = "direccion";
        this.codigoPostal = 0;
        this.mensualidad = false;
    }

    public Persona(String nombre, String apellido, LocalDate nacimiento, String direccion, int codigoPostal, boolean mensualidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.mensualidad = mensualidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public boolean isMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(boolean mensualidad) {
        this.mensualidad = mensualidad;
    }

    public boolean esMayor(){
        Period periodo = Period.between(nacimiento, LocalDate.now());
        return periodo.getYears() >= 18;
    }

    public abstract void accionSolidaria();
}
