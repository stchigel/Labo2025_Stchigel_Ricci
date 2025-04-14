package unidad1;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(){
        this.nombre="N/A";
        this.edad=0;
        this.direccion="N/A";
    }

    public Persona(String nm, int ed, String dr){
        this.nombre=nm;
        this.edad=ed;
        this.direccion=dr;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
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

    public void imprimir(){
        System.out.println("Nombre: "+nombre+" | Edad: "+edad+" | Dirección: "+direccion);
    }

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Juan");
        p1.setEdad(23);
        p1.setDireccion("Nazca 21442");
        p1.imprimir();
    }
}
