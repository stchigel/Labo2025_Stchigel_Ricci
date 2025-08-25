package Ong;

import java.time.LocalDate;
import java.util.HashMap;

public class Profesor extends Sueldados {
    private String materia;
    private Double horas;

    public Profesor() {
        super();
        this.materia = "materia";
    }

    public Profesor(String nombre, String apellido, LocalDate nacimiento, String direccion, int codigoPostal, boolean mensualidad, Banco banco, LocalDate alta, String materia, Double horas) {
        super(nombre, apellido, nacimiento, direccion, codigoPostal, mensualidad, banco, alta);
        this.materia = materia;
        this.horas = horas;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }

    @Override
    public void accionSolidaria() {
        System.out.println(materia);
    }
}
