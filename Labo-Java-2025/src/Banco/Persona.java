package Banco;
import java.time.LocalDate;

public class Persona {
    String nombre;
    String apellido;
    int dni;
    LocalDate antiguedad;
    LocalDate salida;

    public Persona() {
        this.nombre = "N/A";
        this.apellido = "N/A";
        this.dni = 0;
        this.antiguedad = LocalDate.of(1, 1, 1);
        this.salida = LocalDate.of(1, 1, 1);
    }

    public Persona(String nombre, String apellido, int dni, LocalDate antiguedad, LocalDate salida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.antiguedad = antiguedad;
        this.salida = salida;
    }

    public Persona(String nombre, String apellido, int dni, LocalDate antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.antiguedad = antiguedad;
        this.salida = null;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(LocalDate antiguedad) {
        this.antiguedad = antiguedad;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }



    public int antiguedad(){
        if (antiguedad==LocalDate.of(1, 1, 1) &&
        salida == LocalDate.of(1, 1, 1)){
            return 0;
        } else if (salida==null){
            return LocalDate.now().getYear() - antiguedad.getYear();
        } else {
            return salida.getYear() - antiguedad.getYear();
        }
    }

}
