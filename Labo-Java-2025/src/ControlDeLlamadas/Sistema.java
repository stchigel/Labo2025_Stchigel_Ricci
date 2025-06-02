package ControlDeLlamadas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Sistema {
    private ArrayList<Llamada> llamadas;
    private ArrayList<Empleado> empleados;

    public Sistema() {
        this.llamadas = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public Sistema(ArrayList<Llamada> llamadas, ArrayList<Empleado> empleados) {
        this.llamadas = llamadas;
        this.empleados = empleados;
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void addLlamada(String numOrigen, String numDestino, Double duracion){
        Empleado empOrigen = new Empleado();
        Empleado empDestino = new Empleado();
        for (Empleado emp : empleados){
            if(numOrigen.equals(emp.getTelefono())){
                empOrigen=emp;
            } else if(numDestino.equals(emp.getTelefono())){
                empDestino=emp;
            }
        }
        llamadas.add(new Llamada(empOrigen, empDestino, LocalDate.now(), 0.0));
    }

    public void listadoPorEmp(){
        for (Empleado emp : empleados){
            System.out.println("------------------------------");
            System.out.println("Nombre: "+emp.getNombre()+" "+emp.getApellido());
            System.out.println("DNI: "+emp.getDNI());
            System.out.println("Llamadas: ");
            System.out.println("- - - - - - - - - - - - - - - - -");
            for (Llamada llamada : llamadas){
                if(llamada.getOrigen().equals(emp)){
                    llamada.mostrarLlamada();
                }
            }
            System.out.println("- - - - - - - - - - - - - - - - -");
            System.out.println("------------------------------");
        }
    }

    public Empleado empMasDur(){
        Empleado empMas = empleados.getFirst();
        Double aux1=0.0;
        Double aux2=0.0;
        for(Empleado e : empleados){
            for(Llamada l : llamadas){
                if(e.equals(l.getOrigen())){
                    if(!l.getDestino().getPais().equals(e.getPais())){
                        aux1+=l.getDuracion();
                    }
                }
            }
            if(aux1>aux2){
                aux2=aux1;
                aux1=0.0;
                empMas=e;
            }
        }
        return empMas;
    }
}
