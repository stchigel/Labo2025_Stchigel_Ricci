package TratamientoModificacionSangre.Pacientes;

import TratamientoModificacionSangre.Bases.Paciente;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;

public class Joven extends Paciente {
    public static int edadMin=20;
    public static int edadMax=30;
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

    public Boolean solicitarTratamiento(){
        Boolean result=false;
        try{
            if(actDeport.size()%2==0 && (super.calcularEdad()-edadMax) > 2){
                System.out.println("Va a ser caro pero es posible");
                result=true;
            }
            else{
                throw new RuntimeException("No es posible lograr el tratamiento");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
