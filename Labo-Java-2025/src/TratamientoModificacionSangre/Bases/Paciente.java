package TratamientoModificacionSangre.Bases;

import java.time.LocalDate;
import java.time.Period;

public abstract class Paciente extends Persona {
    private Genero genero;
    private Sangre tipoSangre;

    public Paciente() {
        super();
        this.genero = Genero.MASCULINO;
        this.tipoSangre = Sangre.AB_POS;
    }

    public Paciente(String nombre, String apellido, LocalDate fn, Genero genero, Sangre tipoSangre) {
        super(nombre, apellido, fn);
        this.genero = genero;
        this.tipoSangre = tipoSangre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Sangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(Sangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public int calcularEdad(){
        int aux= Period.between(LocalDate.now(),super.getFn()).getYears();
        return aux;
    }
}
