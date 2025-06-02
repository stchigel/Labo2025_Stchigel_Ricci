package ControlDeLlamadas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empleado e1=new Empleado("joaco", "gil", 23, "Argentina", "2424");
        Empleado e2=new Empleado("roaco", "gil", 11, "Paraguay", "5676");
        Empleado e3=new Empleado("koaco", "gil", 24, "Ucrania", "4576");
        Llamada l1=new Llamada(e1, e2, LocalDate.now(), 45.0);
        Llamada l2=new Llamada(e2, e3, LocalDate.now(), 73.0);
        Llamada l3=new Llamada(e3, e1, LocalDate.now(), 23.0);
        ArrayList<Empleado>emps1=new ArrayList<>();
        ArrayList<Llamada>llms1=new ArrayList<>();
        emps1.add(e1);
        emps1.add(e2);
        emps1.add(e3);
        llms1.add(l1);
        llms1.add(l2);
        llms1.add(l3);
        Sistema s1=new Sistema(llms1, emps1);

        s1.listadoPorEmp();
        Empleado empleado = s1.empMasDur();
        System.out.println("Mas: "+empleado.getNombre());
    }
}
