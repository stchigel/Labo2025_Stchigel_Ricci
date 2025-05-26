package CursoStchigel.quiz;

public class Employee {
    private String name;
    private Department dep;

    public Employee() {
        this.name = "N/A";
        this.dep = new Department();
    }

    public Employee(String name, Department dep) {
        this.name = name;
        this.dep = dep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }
}
