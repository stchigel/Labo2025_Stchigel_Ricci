package curling;

import java.util.ArrayList;

public class Equipo {
    String nombre;
    String barrio;
    ArrayList<Jugador> jugadores;
    int turno;

    public Equipo() {
        this.nombre = "N/A";
        this.barrio = "N/A (como san lorenzo)";
        this.jugadores = new ArrayList<>();
        this.turno=0;
    }

    public Equipo(String nombre, String barrio, ArrayList<Jugador> jugadores, int turno) {
        this.nombre = nombre;
        this.barrio = barrio;
        this.jugadores = jugadores;
        this.turno = turno;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return this.barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public ArrayList<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getTurno() {
        return this.turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public Boolean numeroOcupadoJugador(Jugador jugador){
        for (Jugador jugadorAct : this.jugadores){
            if (jugadorAct.getNumeroCamiseta() == jugador.getNumeroCamiseta()){
                return true;
            }
        }
        return false;
    }

    public Boolean numeroOcupadoInt(int num){
        for (Jugador jugadorAct : this.jugadores){
            if (jugadorAct.getNumeroCamiseta() == num){
                return true;
            }
        }
        return false;
    }

    public Boolean capitanOcupado(){
        for (Jugador jugadorAct : this.jugadores){
            if (jugadorAct.getCapitan()){
                return true;
            }
        }
        return false;
    }

    public void addJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public Jugador getJugador(int num){
        return this.jugadores.get(num);
    }
}