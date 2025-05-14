package Banco;
import Bases.Persona;

import java.time.LocalDate;

public class Empleado extends Persona {
    int dni;
    LocalDate antiguedad;
    LocalDate salida;

    public Empleado() {
        super("N/A", "N/A");
        this.dni = 0;
        this.antiguedad = LocalDate.of(1, 1, 1);
        this.salida = LocalDate.of(1, 1, 1);
    }

    public Empleado(String nombre, String apellido, int dni, LocalDate antiguedad, LocalDate salida) {
        super(nombre, apellido);
        this.dni = dni;
        this.antiguedad = antiguedad;
        this.salida = salida;
    }

    public Empleado(String nombre, String apellido, int dni, LocalDate antiguedad) {
        super(nombre, apellido);
        this.dni = dni;
        this.antiguedad = antiguedad;
        this.salida = null;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(LocalDate antiguedad) {
        this.antiguedad = antiguedad;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }



    public int antiguedad(){
        if (antiguedad==LocalDate.of(1, 1, 1) &&
        salida == LocalDate.of(1, 1, 1)){
            return 0;
        } else if (salida==null){
            return LocalDate.now().getYear() - antiguedad.getYear();
        } else {
            return salida.getYear() - antiguedad.getYear();
        }
    }

}
