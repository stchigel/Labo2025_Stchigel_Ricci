package TratamientoModificacionSangre.Bases;
import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fn;

    public Persona(String nombre, String apellido, LocalDate fn) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fn = fn;
    }

    public Persona() {
        this.nombre = "N/A";
        this.apellido = "N/A";
        this.fn = LocalDate.now();
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

    public LocalDate getFn() {
        return fn;
    }

    public void setFn(LocalDate fn) {
        this.fn = fn;
    }
}
