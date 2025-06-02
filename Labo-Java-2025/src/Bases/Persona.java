package Bases;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;

    public Persona(){
        this.nombre="N/A";
        this.edad=0;
        this.direccion="N/A";
    }

    public Persona(String nombre, int edad, String direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;
    }

    public Persona(String nombre, String apellido, String direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=0;
        this.direccion=direccion;
    }

    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public Persona(String nombre){
        this.nombre=nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void imprimir(){
        System.out.println("Nombre: "+this.nombre+" | Edad: "+this.edad+" | Dirección: "+this.direccion);
    }

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Juan");
        p1.setEdad(23);
        p1.setDireccion("Nazca 21442");
        p1.imprimir();
    }
}
