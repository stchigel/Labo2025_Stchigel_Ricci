package Cursos.CursoRicci.quiz;

public class Employee {
    private String name;
    private Department deparment;

    public Employee() {
        this.name = "Geronimo";
        this.deparment = new Department();
    }

    public Employee(String name, Department deparment) {
        this.name = name;
        this.deparment = deparment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDep() {
        return deparment;
    }

    public void setDeparment(Department dep) {
        this.deparment = deparment;
    }
}
