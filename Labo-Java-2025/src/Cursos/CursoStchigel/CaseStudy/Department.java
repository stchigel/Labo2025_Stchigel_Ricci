package Cursos.CursoStchigel.CaseStudy;

public class Department {
    private Employee[] employees;
    private String name;

    public Department(String name) {
        this.employees = new Employee[]{};
        this.name = "name";
    }

    public Department(Employee[] employees, String name) {
        this.employees = employees;
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

}
