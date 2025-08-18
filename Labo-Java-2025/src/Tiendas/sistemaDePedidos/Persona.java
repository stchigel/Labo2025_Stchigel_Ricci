package Tiendas.sistemaDePedidos;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona() {
        this.nombre = "N/A";
        this.apellido = "N/A";
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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
}
