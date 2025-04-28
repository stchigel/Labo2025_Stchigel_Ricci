package curling;

import java.util.ArrayList;
import java.util.Date;

public class Jugador {
    String nombre;
    Date fechaNacimiento;
    int numeroCamiseta;
    Boolean capitan;

    public Jugador() {
        this.nombre = "N/A";
        this.fechaNacimiento = new Date();
        this.numeroCamiseta= 0;
        this.capitan = false;
    }

    public Jugador(String nombre, Date fechaNacimiento, int numeroCamiseta, Boolean capitan) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCamiseta = numeroCamiseta;
        this.capitan = capitan;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumeroCamiseta() {
        return this.numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public Boolean getCapitan() {
        return this.capitan;
    }

    public void setCapitan(Boolean capitan) {
        this.capitan = capitan;
    }
}
