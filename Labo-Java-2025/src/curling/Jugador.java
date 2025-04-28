package curling;

import java.util.ArrayList;
import java.time.LocalDate;

public class Jugador {
    String nombre;
    LocalDate fechaNacimiento;
    int numeroCamiseta;
    Boolean capitan;

    public Jugador() {
        this.nombre = "N/A";
        this.fechaNacimiento = LocalDate.of(1, 1, 1);
        this.numeroCamiseta= 0;
        this.capitan = false;
    }

    public Jugador(String nombre, LocalDate fechaNacimiento, int numeroCamiseta, Boolean capitan) {
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
