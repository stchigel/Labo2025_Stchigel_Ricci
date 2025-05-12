package Videoclub;

import org.junit.jupiter.api.*;
import unidad1.Persona;

import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Estanteria {
    private int numero;
    private ArrayList<Pelicula> peliculas;

    @BeforeEach
    public void setUp(){
        numero=2;
        ArrayList<Pelicula> peliculas=new ArrayList<>();
    }

    public Estanteria(int numero, ArrayList<Pelicula> peliculas) {
        this.numero = numero;
        this.peliculas = peliculas;
    }
    public Estanteria(int numero) {
        this.numero = numero;
        this.peliculas = new ArrayList<>();
    }
    public Estanteria() {
        this.numero = 0;
        this.peliculas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void addPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }
    @Test
    public void agregarPeli(){
        ArrayList<Persona> directores1 = new ArrayList<>();
        directores1.add(new Persona("Robert Zemeckis", 72, "N/A"));
        ArrayList<Persona> actores1 = new ArrayList<>();
        actores1.add(new Persona("Michael J. Fox", 63, "N/A"));
        ArrayList<String> idiomas1 = new ArrayList<>();
        idiomas1.add("Español");
        idiomas1.add("Inglés");
        idiomas1.add("Alemán");
        idiomas1.add("Árabe");
        Pelicula p1 = new Pelicula("Volver al Futuro", "Ciencia Ficción", 116, directores1, actores1, idiomas1);
        assertEquals(0, peliculas.size());
        addPelicula(p1);
        assertEquals(1, peliculas.size());
    }

    public void removePelicula(Pelicula pelicula) {
        this.peliculas.remove(pelicula);
    }

    public void updatePelicula(Pelicula peliculaViejo, Pelicula peliculaNuevo) {
        for (Pelicula pelicula : this.peliculas){
            if (pelicula==peliculaViejo){
                pelicula=peliculaNuevo;
            }
        }
    }

    public Pelicula mayorTiempo(){
        Pelicula peliMAStiempo=this.peliculas.getFirst();
        for(Pelicula peli: this.peliculas){
            if(peli.getDuracion()>peliMAStiempo.getDuracion()){
                peliMAStiempo=peli;
            }
        }
        return peliMAStiempo;
    }

    public ArrayList<Persona> masDeUnaPeli() {
        ArrayList<Pelicula> peliculas2=this.peliculas;
        ArrayList<Persona> directores = new ArrayList<>();
        for (int i=0; i< peliculas2.size(); i++){
            Pelicula pelicula = peliculas2.get(i);
            peliculas2.remove(i);
            for (Persona director : pelicula.getDirectores()){
                for (Pelicula pelicula2 : peliculas2){
                    for (Persona director2 : pelicula2.getDirectores()){
                        if (director.equals(director2)){
                            if (!directores.contains(director)){
                                directores.add(director);
                            }
                        }
                    }
                }
            }
        }
        return directores;
    }


}
