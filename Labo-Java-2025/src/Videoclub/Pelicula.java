package Videoclub;
import Bases.Persona;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private Genero genero;
    private int duracion;
    private ArrayList<Persona> directores;
    private ArrayList<Persona> actores;
    private ArrayList<Idioma> idiomas;

    public Pelicula() {
        this.nombre = "N/A";
        this.genero = Genero.NINGUNO;
        this.duracion = 0;
        this.directores = new ArrayList<>();
        this.actores = new ArrayList<>();
        this.idiomas = new ArrayList<>();
    }

    public Pelicula(String nombre, Genero genero, int duracion, ArrayList<Persona> directores, ArrayList<Persona> actores, ArrayList<Idioma> idiomas) {
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
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

    public ArrayList<Idioma> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<Idioma> idiomas) {
        this.idiomas = idiomas;
    }

    public void addIdioma(Idioma idioma) {
        this.idiomas.add(idioma);
    }

    public void printInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Género: " + this.genero.toString());
        System.out.println("Duración: " + this.duracion + " minutos");

        System.out.print("Directores: ");
        for (Persona director : this.directores) {
            System.out.print(director.getNombre() + " ");
        }
        System.out.println();

        System.out.print("Actores: ");
        for (Persona actor : this.actores) {
            System.out.print(actor.getNombre() + " ");
        }
        System.out.println();

        System.out.print("Idiomas: ");
        for (Idioma idioma : this.idiomas) {
            System.out.print(idioma.toString() + " ");
        }
        System.out.println();
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
