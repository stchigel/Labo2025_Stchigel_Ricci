package Medios;
import Bases.Persona;

import java.util.ArrayList;

public class CD{
    private ArrayList<Cancion> Canciones;

    public CD(){
        this.Canciones = new ArrayList<Cancion>();
    }

    public CD(ArrayList<Cancion> Canciones){
        this.Canciones=Canciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return this.Canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.Canciones = canciones;
    }

    public Cancion verCancion(int posicion){
        if (this.Canciones.size()>=posicion) {
            return this.Canciones.get(posicion-1);
        } else {
            return this.Canciones.getLast();
        }
    }

    public void grabaCancion(int posicion, Cancion nuevaCancion){
        if (this.Canciones.size()>=posicion) {
            this.Canciones.set(posicion-1, nuevaCancion);
        } else {
            this.Canciones.set(this.Canciones.size()-1, nuevaCancion);
        }
    }

    public void agrega(Cancion cancion){
        this.Canciones.add(cancion);
    }

    public void elimina(int posicion){
        this.Canciones.remove(posicion);
    }

    public static void main(String[] args) {
        CD CD1= new CD();
        Cancion c1= new Cancion("Ella me llama", new Persona("Gerónimo ´Momo´ Benavidez", 37, "Italia"));
        CD1.agrega(c1);
        Cancion cancionActual = CD1.verCancion(3);
        System.out.println(cancionActual.getTitulo()+ " de "+cancionActual.getAutor().getNombre());
    }

}
