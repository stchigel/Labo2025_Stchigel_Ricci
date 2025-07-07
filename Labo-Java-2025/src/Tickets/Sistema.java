package Tickets;

import Bases.Persona;

import java.time.Duration;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Ticket> tickets;
    private ArrayList<Persona> empleados;

    public Sistema() {
        this.tickets = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public Sistema(ArrayList<Ticket> tickets, ArrayList<Persona> empleados) {
        this.tickets = tickets;
        this.empleados = empleados;
    }

    public int ticketsEnEstado(Estado est){
        int total=0;
        for (Ticket t : tickets){
            if(t.getEstado().equals(est)){
                total++;
            }
        }
        return total;
    }

    public int ticketsEnTotal(){
        return tickets.size();
    }

    public Ticket ticketMasAntiguo(){
        Ticket masAntiguo=tickets.getFirst();
        for(Ticket t : tickets){
            if(t.getCreacion().isBefore(masAntiguo.getCreacion())){
                masAntiguo=t;
            }
        }
        return masAntiguo;
    }

    public Persona desarolladorMasResolvido(){
        Persona desMas = empleados.getFirst();
        int cantResMas = 0;
        for (Persona d : empleados){
            int cantRes=0;
            for (Ticket t : tickets){
                if(t.getEstado().equals(Estado.RESUELTO)){
                    for (Persona dd : t.getDesarolladores()){
                        if(d==dd){
                            cantRes++;
                        }
                    }
                }
            }
            if (cantRes>cantResMas){
                desMas=d;
                cantResMas=cantRes;
            }
        }
        return desMas;
    }

    public ArrayList<Ticket> ticketsPorPersona(Persona emp){
        ArrayList<Ticket> ticketsDePersona = new ArrayList<>();
        for (Ticket t : tickets){
            for (Persona d : t.getDesarolladores()){
                if(d==emp){
                    ticketsDePersona.add(t);
                }
            }
        }
        return ticketsDePersona;
    }

    //tendria que haber hecho class desarollador con feha de inicio

    public ArrayList<Persona> empDeTicket(Ticket t){
        return t.getDesarolladores();
    }

    public long tiempoPromedio(){
        Duration total=Duration.ZERO;
        for (Ticket t : tickets){
            total= total.plus(Duration.between(t.getCreacion(), t.getFinalizacion()));
        }
        return total.getSeconds() / tickets.size();
    }
}
