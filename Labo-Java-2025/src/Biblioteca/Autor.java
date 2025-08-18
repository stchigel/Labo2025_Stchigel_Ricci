package Biblioteca;

import java.time.LocalDate;
import java.util.HashSet;

public class Autor extends Persona{
    HashSet<Libro> bibliografia;

    public Autor() {
        super();
        this.bibliografia = new HashSet<>();
    }

    public Autor(String nombre, LocalDate nacimiento, int dni, HashSet<Libro> bibliografia) {
        super(nombre, nacimiento, dni);
        this.bibliografia = bibliografia;
    }

    public HashSet<Libro> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(HashSet<Libro> bibliografia) {
        this.bibliografia = bibliografia;
    }

    public void addLibro(Libro l){
        bibliografia.add(l);
    }
}
