package Cursos.CursoStchigel.CaseStudy;

public class Systemm {
    public static void main(String[] args) {
        Employee e1 = new Employee(100, "nico", 10000.00);
        Employee e2 = new Employee(101, "juan", 13000.00);

        Department d1 = new Department(new Employee[]{e1, e2}, "aceituna");

        e1.printInfo();
        d1.printName();
    }

}
