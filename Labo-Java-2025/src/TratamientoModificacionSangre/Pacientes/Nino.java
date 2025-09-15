package TratamientoModificacionSangre.Pacientes;

import TratamientoModificacionSangre.Bases.Genero;
import TratamientoModificacionSangre.Bases.Paciente;
import TratamientoModificacionSangre.Bases.Sangre;

import java.time.LocalDate;

public class Nino extends Paciente {
    private int nivelTolerancia;

    int tolMax=10;
    int tolMin=1;

    public Nino() {
        super();
        this.nivelTolerancia = 1;
    }

    public Nino(String nombre, String apellido, LocalDate fn, Genero genero, Sangre tipoSangre, int nt) {
        super(nombre, apellido, fn, genero, tipoSangre);
        if(nt<tolMin){
            nivelTolerancia=tolMin;
        }
        else if(nt>tolMax){
            nivelTolerancia=tolMax;
        }
        else{
            nivelTolerancia=nt;
        }
    }

    public int getNivelTolerancia() {
        return nivelTolerancia;
    }

    public void setNivelTolerancia(int nivelTolerancia) {
        this.nivelTolerancia = nivelTolerancia;
    }

    private void solicitarTratamiento(){
        if(super.calcularEdad()>3){
            System.out.println("tu tratamiento es de: "+nivelTolerancia*2+" dias");
        }
    }
}
