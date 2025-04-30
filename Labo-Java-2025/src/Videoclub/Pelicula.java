package Videoclub;
import unidad1.Persona;

import java.util.ArrayList;

public class Pelicula {
    String nombre;
    String genero;
    int duracion;
    ArrayList<Persona> directores;
    ArrayList<Persona> actores;
    ArrayList<String> idiomas;

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
}
