package Recetas;

import java.util.ArrayList;

public abstract class Receta {
    private String nombre;
    private Dificultad dificultad;
    private ArrayList<String> pasos;

    public Receta() {
        this.nombre = "N/A";
        this.dificultad = Dificultad.MEDIO;
        this.pasos = new ArrayList<>();
    }
    public Receta(String nombre, Dificultad dificultad, ArrayList<String> pasos) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.pasos = pasos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    abstract void imprimirPasos();

}
