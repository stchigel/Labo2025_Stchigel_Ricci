package EleccionesOctober.Persona_Trabajador;

import EleccionesOctober.Bases_Y_Funcionamiento.Enviadores;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;

public class Trabajador extends Persona implements Enviadores {
    private int cuil;
    private static Double sueldo;
    private String direccion;
    private HashMap<DayOfWeek, Horario>horasLaborales;

    public Trabajador(String nombre, String apellido, int dni, LocalDate fn, int cuil, String direccion, HashMap<DayOfWeek, Horario> horasLaborales) {
        super(nombre, apellido, dni, fn);
        this.cuil = cuil;
        this.direccion = direccion;
        this.horasLaborales = horasLaborales;
    }

    public Trabajador() {
        super();
        this.cuil = 0;
        this.direccion = "N/A";
        this.horasLaborales = new HashMap<>();
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public static Double getSueldo() {
        return sueldo;
    }

    public static void setSueldo(Double sueldo) {
        Trabajador.sueldo = sueldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HashMap<DayOfWeek, Horario> getHorasLaborales() {
        return horasLaborales;
    }

    public void setHorasLaborales(HashMap<DayOfWeek, Horario> horasLaborales) {
        this.horasLaborales = horasLaborales;
    }

    @Override
    public void enviarMensaje(String mensajeBase) {
        DayOfWeek aux = LocalDate.now().getDayOfWeek();
        if(LocalTime.now().isAfter(horasLaborales.get(aux).getHoraEntrada()) && LocalTime.now().isBefore(horasLaborales.get(aux).getHoraSalida())){
            System.out.println("Yo " + getNombre() + " te invito a que " + mensajeBase);
        }
    }
}
