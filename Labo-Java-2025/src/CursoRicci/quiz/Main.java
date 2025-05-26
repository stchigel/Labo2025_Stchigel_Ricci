package CursoRicci.quiz;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DepartmentFinder DF1 = new DepartmentFinder();
        Employee emp1 = new Employee();
        Department dep1 = new Department();
        dep1 = DF1.find(1);
        dep1.addEmployee(emp1);
        for(Employee e : dep1.getEmpleados()) {
            System.out.println(e);
        }
    }
}
