package Tickets;

import Bases.Persona;

import java.time.LocalDateTime;

public class Software extends Ticket{

    private String dispositivo;
    private boolean hayPatch;
    public static int intentos_min = 3;
    private int intentos;

    public Software() {
        super();
        this.dispositivo = "dispositivo";
        this.hayPatch = false;
        this.intentos = intentos_min;
    }

    public Software(Persona cliente, String descripcion, LocalDateTime finalizacion, String dispositivo, boolean hayPatch) {
        super(cliente, descripcion, finalizacion);
        this.dispositivo = dispositivo;
        this.hayPatch = hayPatch;
        this.intentos = intentos_min;
    }

    @Override
    public boolean resolver() {
        if(hayPatch && intentos>0){
            super.setEstado(Estado.RESUELTO);
            return true;
        } else {
            intentos--;
            return false;
        }
    }
}
