package Cursos.CursoRicci.ejercicio9caseStudy;

import java.util.ArrayList;

public class HRapp {
    public static void main(String[] args) {
        System.out.println("Aplicacion iniciandose");

        Empleado e1 = new Empleado(1,"Juan",450.0);
        Empleado e2 = new Empleado(1,"Juan",703.0);
        Empleado e3 = new Empleado(1,"Juan",2311.0);

        ArrayList<Empleado>emps1 = new ArrayList<>();
        emps1.add(e1);
        emps1.add(e2);
        emps1.add(e3);

        Departamento dep1 = new Departamento(1, "Justicia", emps1);

        System.out.println(dep1.toString());
        System.out.println(dep1.empPorID(1).toString());
        System.out.println(dep1.getEmpleados().toString());
        System.out.println(dep1.salarioTotal());
        System.out.println(dep1.promedioSalario());
    }
}
