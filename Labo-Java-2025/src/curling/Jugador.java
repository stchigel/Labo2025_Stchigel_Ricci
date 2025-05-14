package curling;

import Bases.Persona;

import java.util.ArrayList;
import java.time.LocalDate;

public class Jugador extends Persona {
    LocalDate fechaNacimiento;
    int numeroCamiseta;
    Boolean capitan;

    public Jugador() {
        super("N/A");
        this.fechaNacimiento = LocalDate.of(1, 1, 1);
        this.numeroCamiseta= 0;
        this.capitan = false;
    }

    public Jugador(String nombre, LocalDate fechaNacimiento, int numeroCamiseta, Boolean capitan) {
        super(nombre);
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCamiseta = numeroCamiseta;
        this.capitan = capitan;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
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
