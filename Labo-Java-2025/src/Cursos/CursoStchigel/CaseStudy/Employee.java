package Cursos.CursoStchigel.CaseStudy;

public class Employee {
    private int ID;
    private String name;
    private Double salary;

    public Employee() {
        this.ID = 0;
        this.name = "name";
        this.salary = 0.0;
    }

    public Employee(int ID, String name, Double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void printInfo(){
        System.out.printf("Employee "+name+" tiene salario "+salary+" y su id es "+ID);
    }
}
