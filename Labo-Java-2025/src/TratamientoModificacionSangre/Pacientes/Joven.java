package TratamientoModificacionSangre.Pacientes;

import TratamientoModificacionSangre.Bases.Paciente;
import TratamientoModificacionSangre.Tratamiento;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;

public class Joven extends Paciente implements Tratamiento {
    public static int edadMin=20;
    public static int edadMax=30;
    private static final Double precioPorMes=760000.00;
    private static final Double precioPorDia=145400.00;
    private HashSet<String>actDeport;

    public Joven(HashSet<String> actDeport) {
        this.actDeport = actDeport;
    }

    public HashSet<String> getActDeport() {
        return actDeport;
    }

    public void setActDeport(HashSet<String> actDeport) {
        this.actDeport = actDeport;
    }

    @Override
    public boolean puedeSolicitarTratamiento(){
        if(actDeport.size()%2==0 && (super.calcularEdad()-edadMax) > 2){
            System.out.println("Va a ser caro pero es posible");
            return true;
        }
        else{
            System.out.println("No es posible lograr el tratamiento");
            return false;
        }
    }

    @Override
    public Double caclularPrecioTratamiento() {
        int mes = super.getFn().getMonthValue();
        int dia = super.getFn().getDayOfMonth();
        int anio = super.getFn().getYear();

        if(anio%2>0){
            return mes*precioPorMes;
        }else{
            return dia*precioPorDia;
        }
    }
}
