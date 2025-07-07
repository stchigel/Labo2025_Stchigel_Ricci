package Tickets;

import Bases.Persona;

import java.time.LocalDateTime;

public class Hardware extends Ticket{

    private String dispositivo;
    private boolean hayPartes;

    public Hardware() {
        super();
        this.dispositivo = "dispositivo";
        this.hayPartes = false;
    }

    public Hardware(Persona cliente, String descripcion, LocalDateTime finalizacion, String dispositivo, boolean hayPartes) {
        super(cliente, descripcion, finalizacion);
        this.dispositivo = dispositivo;
        this.hayPartes = hayPartes;
    }

    @Override
    public boolean resolver() {
        if(hayPartes && super.getEstado()==Estado.PROGRESO){
            super.setEstado(Estado.RESUELTO);
            return true;
        } else {
            return false;
        }
    }
}
