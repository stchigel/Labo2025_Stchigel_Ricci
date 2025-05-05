package Videoclub;
import unidad1.Persona;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String genero;
    private int duracion;
    private ArrayList<Persona> directores;
    private ArrayList<Persona> actores;
    private ArrayList<String> idiomas;

    public Pelicula() {
        this.nombre = "N/A";
        this.genero = "N/A";
        this.duracion = 0;
        this.directores = new ArrayList<>();
        this.actores = new ArrayList<>();
        this.idiomas = new ArrayList<>();
    }

    public Pelicula(String nombre, String genero, int duracion, ArrayList<Persona> directores, ArrayList<Persona> actores, ArrayList<String> idiomas) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.directores = directores;
        this.actores = actores;
        this.idiomas = idiomas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Persona> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<Persona> directores) {
        this.directores = directores;
    }

    public void addDirector(Persona director) {
        this.directores.add(director);
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }

    public void addActores(Persona actor) {
        this.actores.add(actor);
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public void addIdioma(String idioma) {
        this.idiomas.add(idioma);
    }

    public ArrayList<Persona> actoresMayores(){
        ArrayList<Persona> actoresMayores= new ArrayList<>();
        for(Persona actoor : this.actores){
            if(actoor.getEdad()>18){
                actoresMayores.add(actoor);
            }
        }
        return actoresMayores;
    }
}
