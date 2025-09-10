package Cursos.CursoRicci.ejercicio9caseStudy;

import java.util.ArrayList;

public class Departamento {
    private int idDep;
    private String nombreDep;
    private ArrayList<Empleado> empleados;

    public Departamento(int idDep, String nombreDep, ArrayList<Empleado> ems) {
        this.idDep = idDep;
        this.nombreDep = nombreDep;
        this.empleados = ems;
    }

    public Departamento() {
        this.idDep = 0;
        this.nombreDep = "N/A";
        this.empleados = new ArrayList<>();
    }

    public int getIdDep() {
        return idDep;
    }

    public void setIdDep(int idDep) {
        this.idDep = idDep;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public ArrayList<Empleado> getEmpleados() {
        borrarNulls();
        mantener10();
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String toString() {
        return "Id departamento " + idDep + " nombre " + nombreDep + " cantidad empleados " + cuantosEmps();
    }

    public void borrarNulls() {
        for (Empleado e : empleados) {
            if (e == null) {
                empleados.remove(e);
            }
        }
    }

    public int cuantosEmps() {
        int cont = 0;
        for (Empleado e : empleados) {
            if (e != null) {
                cont++;
            }
        }
        return cont;
    }

    public void addEmp(Empleado e) {
        borrarNulls();
        if (cuantosEmps() < 10 && e != null) {
            empleados.add(e);
        } else {
            System.out.println("No hay espacio disponible");
        }
    }

    public void mantener10() {
        borrarNulls();
        while (cuantosEmps() > 10) {
            empleados.removeFirst();
        }
    }

    public Empleado empPorID(int cod) {
        Empleado aux = null;
        try {
            for (Empleado e : empleados) {
                if (e.getIdentificador() == cod) {
                    aux = e;
                }
            }
        } catch (NullPointerException e) {
            System.err.println("Error: la lista de empleados no está inicializada.");
            e.printStackTrace();
        }
        return aux;
    }

    public Double salarioTotal() {
        Double total = 0.0;
        borrarNulls();
        mantener10();
        try {
            for (Empleado e : empleados) {
                total += e.getSalario();
            }
            return total;
        } catch (NullPointerException e) {
            System.err.println("Error: la lista de empleados no está inicializada o está vacía.");
            return 0.0;
        }
    }


    public Double promedioSalario() {
        Double total = 0.0;
        borrarNulls();
        mantener10();
        try {
            return salarioTotal()/cuantosEmps();
        } catch (NullPointerException e) {
            System.err.println("Error: la lista de empleados no está inicializada o está vacía.");
            return 0.0;
        }
    }
}
