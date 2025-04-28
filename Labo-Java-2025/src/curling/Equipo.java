package curling;

import java.util.ArrayList;

public class Equipo {
    String nombre;
    String barrio;
    ArrayList<Jugador> jugadores;
    Boolean manana;
    Boolean tarde;
    Boolean noche;

    public Equipo() {
        this.nombre = "N/A";
        this.barrio = "N/A (como san lorenzo)";
        this.jugadores = new ArrayList<Jugador>();
        this.manana = false;
        this.tarde = false;
        this.noche = false;
    }

    public Equipo(String nombre, String barrio, ArrayList<Jugador> jugadores, Boolean manana, Boolean tarde, Boolean noche) {
        this.nombre = nombre;
        this.barrio = barrio;
        this.jugadores = jugadores;
        this.manana = manana;
        this.tarde = tarde;
        this.noche = noche;
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

    public Boolean getManana() {
        return this.manana;
    }

    public void setManana(Boolean manana) {
        this.manana = manana;
    }

    public Boolean getTarde() {
        return this.tarde;
    }

    public void setTarde(Boolean tarde) {
        this.tarde = tarde;
    }

    public Boolean getNoche() {
        return this.noche;
    }

    public void setNoche(Boolean noche) {
        this.noche = noche;
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