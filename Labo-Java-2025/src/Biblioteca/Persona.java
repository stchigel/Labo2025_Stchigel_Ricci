package Biblioteca;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate nacimiento;
    private int dni;

    public Persona() {
        this.nombre = "nombre";
        this.nacimiento = LocalDate.now();
        this.dni = 0;
    }

    public Persona(String nombre, LocalDate nacimiento, int dni) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
