package Ong;

import java.time.LocalDate;
import java.util.HashMap;

public class ProfesorInterino extends Sueldados {
    private HashMap<String, Double> materias;

    public ProfesorInterino() {
        super();
        this.materias = new HashMap<>();
    }


    public ProfesorInterino(String nombre, String apellido, LocalDate nacimiento, String direccion, int codigoPostal, boolean mensualidad, Banco banco, LocalDate alta, HashMap<String, Double> materias) {
        super(nombre, apellido, nacimiento, direccion, codigoPostal, mensualidad, banco, alta);
        this.materias = materias;
    }

    public ProfesorInterino(String nombre, String apellido, LocalDate nacimiento, String direccion, int codigoPostal, boolean mensualidad, Banco banco, LocalDate alta) {
        super(nombre, apellido, nacimiento, direccion, codigoPostal, mensualidad, banco, alta);
        this.materias = new HashMap<>();
    }

    public HashMap<String, Double> getMaterias() {
        return materias;
    }

    public void setMaterias(HashMap<String, Double> materias) {
        this.materias = materias;
    }

    public void agregarMateria(String m, Double h) {
        this.materias.put(m, h);
    }

    @Override
    public void accionSolidaria() {
        for (String s : materias.keySet()) {
            System.out.println(s);
        }
    }
}
