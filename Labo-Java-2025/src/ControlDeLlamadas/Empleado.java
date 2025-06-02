package ControlDeLlamadas;

public class Empleado extends Bases.Persona {
    private int DNI;
    private String telefono;

    public Empleado() {
        super();
        this.DNI = 0;
        this.telefono = "";
    }

    public Empleado(String nombre, String apellido, int DNI, String pais, String telefono) {
        super(nombre, apellido, pais);
        this.DNI = DNI;
        this.telefono = telefono;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
