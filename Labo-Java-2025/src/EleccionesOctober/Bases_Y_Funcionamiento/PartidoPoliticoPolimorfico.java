package EleccionesOctober.Bases_Y_Funcionamiento;

import EleccionesOctober.Persona_Trabajador.Persona;

import java.util.HashSet;

public class PartidoPoliticoPolimorfico {
    private String nombre;
    private String direccOfice;
    private HashSet<Persona>dirigentes;
    private int afiliados;
    private HashSet<Enviadores> mensajeros;

    public PartidoPoliticoPolimorfico(String nombre, String direccOfice, HashSet<Persona> dirigentes, int afiliados, HashSet<Enviadores> mensajeros) {
        this.nombre = nombre;
        this.direccOfice = direccOfice;
        this.dirigentes = dirigentes;
        this.afiliados = afiliados;
        this.mensajeros = mensajeros;
    }

    public PartidoPoliticoPolimorfico() {
        this.nombre = "N/A";
        this.direccOfice = "N/A";
        this.dirigentes = new HashSet<>();
        this.afiliados = 0;
        this.mensajeros = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccOfice() {
        return direccOfice;
    }

    public void setDireccOfice(String direccOfice) {
        this.direccOfice = direccOfice;
    }

    public HashSet<Persona> getDirigentes() {
        return dirigentes;
    }

    public void setDirigentes(HashSet<Persona> dirigentes) {
        this.dirigentes = dirigentes;
    }

    public int getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(int afiliados) {
        this.afiliados = afiliados;
    }

    public HashSet<Enviadores> getMensajeros() {
        return mensajeros;
    }

    public void setMensajeros(HashSet<Enviadores> mensajeros) {
        this.mensajeros = mensajeros;
    }

    public void addMensajeros(Enviadores e){
        if(!mensajeros.contains(e)){
            mensajeros.add(e);
        }
    }

    public void hacerCamapaña(){
        for(Enviadores e : mensajeros){
            e.enviarMensaje("Vote por el partido para un mejor futuro");
        }
    }
}
