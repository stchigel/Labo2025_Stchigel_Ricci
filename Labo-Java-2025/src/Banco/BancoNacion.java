package Banco;
import java.util.ArrayList;

public class BancoNacion {
    String nombre;
    String direccion;
    Boolean aja;
    Boolean eje;
    ArrayList<Empleado> empleados;

    public BancoNacion() {
        this.direccion = "N/A";
        this.aja = false;
        this.eje = false;
        this.empleados = new ArrayList<>();
    }

    public BancoNacion(String direccion, Boolean aja, Boolean eje, ArrayList<Empleado> empleados) {
        this.direccion = direccion;
        this.aja = aja;
        this.eje = eje;
        this.empleados = empleados;
    }

    public BancoNacion(String direccion, Boolean aja, Boolean eje) {
        this.direccion = direccion;
        this.aja = aja;
        this.eje = eje;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getAja() {
        return aja;
    }

    public void setAja(Boolean aja) {
        this.aja = aja;
    }

    public Boolean getEje() {
        return eje;
    }

    public void setEje(Boolean eje) {
        this.eje = eje;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarTrabajador(Empleado empleado){
        this.empleados.add(empleado);
    }

    public int cantidadTrabajadores(){
        return this.empleados.size();
    }

    public Empleado empleadoMayorAntiguedad(){
        Empleado empleadoMayor=this.empleados.getFirst();
        int cantMayor=this.empleados.getFirst().antiguedad();
        for (Empleado empActual : this.empleados){
            if(empActual.antiguedad()>cantMayor){
                cantMayor=empActual.antiguedad();
                empleadoMayor=empActual;
            }
        }
        return empleadoMayor;
    }
}
