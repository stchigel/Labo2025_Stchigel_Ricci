package ControlDeLlamadas;

public class Empleado {
    private String nombre;
    private String apellido;
    private int DNI;
    private String pais;
    private String telefono;

    public Empleado() {
        this.nombre = "";
        this.apellido = "";
        this.DNI = 0;
        this.pais = "";
        this.telefono = "";
    }

    public Empleado(String nombre, String apellido, int DNI, String pais, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.pais = pais;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
