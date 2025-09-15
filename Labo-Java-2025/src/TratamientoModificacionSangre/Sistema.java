package TratamientoModificacionSangre;

import TratamientoModificacionSangre.Bases.Paciente;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Paciente> pacientes;
    private HashMap<Tratamiento, Integer> pacientesTratamiento;

    public Sistema() {
        this.pacientes = new HashSet<>();
        this.pacientesTratamiento = new HashMap<>();
    }

    public Sistema(HashSet<Paciente> pacientes, HashMap<Tratamiento, Integer> pacientesTratamiento) {
        this.pacientes = pacientes;
        this.pacientesTratamiento = pacientesTratamiento;
    }

    public HashSet<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(HashSet<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public HashMap<Tratamiento, Integer> getPacientesTratamiento() {
        return pacientesTratamiento;
    }

    public void setPacientesTratamiento(HashMap<Tratamiento, Integer> pacientesTratamiento) {
        this.pacientesTratamiento = pacientesTratamiento;
    }

    public void agregarPaciente(Paciente p){
        pacientes.add(p);
        if(p instanceof Tratamiento){
            pacientesTratamiento.put((Tratamiento) p, 0);
        }
    }

    public void tratarPacientes(){
        for(Tratamiento t : pacientesTratamiento.keySet()){
            if(t.puedeSolicitarTratamiento()){
                int cantActual=pacientesTratamiento.get(t);
                pacientesTratamiento.put(t, cantActual+1);
            }
        }
    }

    public int cantSinTratamiento(){
        return pacientes.size()-pacientesTratamiento.size();
    }
}
