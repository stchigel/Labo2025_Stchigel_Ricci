package SistemaPesoAltura;

import Bases.Persona;
import Vacunatorio.Ciudadano;

import java.time.LocalDate;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;

public class Humano extends Persona {
    private LocalDate fechaNacimiento;
    private HashMap <LocalDate, Registro> registros;

    public Humano() {
        super();
        this.fechaNacimiento = LocalDate.now();
        this.registros=new HashMap<>();
    }

    public Humano(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, HashMap <LocalDate, Registro> registros) {
        super(nombre, apellido, edad, direccion);
        this.fechaNacimiento = fechaNacimiento;
        this.registros=new HashMap<>();
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public HashMap<LocalDate, Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(HashMap<LocalDate, Registro> registros) {
        this.registros = registros;
    }

    public void addRegistro(LocalDate fecha, Registro datos){
        registros.put(fecha, datos);
    }

    public String alturaPesoFecha(LocalDate f){
        String mensaje="";
        for(Map.Entry<LocalDate, Registro > regis : registros.entrySet()){
            LocalDate fecha = regis.getKey();
            Registro regs = regis.getValue();
            if(fecha.equals(f)){
                mensaje="Peso: " + regs.getPeso().toString() + " Altura: " + regs.getAltura().toString();
            }
        }
        return mensaje;
    }

    public String promAnio(int y){
        String mensaje="";
        int aux=0;
        Double auxPeso=0.0;
        Double auxAltura=0.0;
        for(Map.Entry<LocalDate, Registro > regis : registros.entrySet()) {
            LocalDate fecha = regis.getKey();
            Registro regs = regis.getValue();
            if (fecha.getYear() == (y)) {
                aux++;
                auxPeso += regs.getPeso();
                auxAltura += regs.getAltura();
            }
        }
        mensaje="En "+ y + " el promedio altura fue: " + (auxAltura/=aux).toString() + " y el promedio de peso fue: " +  (auxPeso/=aux).toString();
        return mensaje;
    }
}
