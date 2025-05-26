package CursoRicci.quiz;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> empleados;

    public Department() {
        this.name = "Justicia";
        this.empleados = new ArrayList<>();
    }

    public Department(String name, ArrayList<Employee> empleados) {
        this.name = name;
        this.empleados = empleados;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmpleados() {
        return empleados;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.empleados = employees;
    }

    public void addEmployee(Employee empleado){
        this.empleados.add(empleado);
    }
}
