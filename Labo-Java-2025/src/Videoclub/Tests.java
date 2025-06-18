package Videoclub;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;
import Bases.Persona;

import java.util.ArrayList;

public class Tests {
    Estanteria es1;
    Pelicula p1;
    @BeforeEach
    public void setUp(){
        this.es1=new Estanteria();
        ArrayList<Persona> directores1 = new ArrayList<>();
        directores1.add(new Persona("Robert Zemeckis", 72, "N/A"));
        ArrayList<Persona> actores1 = new ArrayList<>();
        actores1.add(new Persona("Michael J. Fox", 63, "N/A"));
        ArrayList<Idioma> idiomas1 = new ArrayList<>();
        idiomas1.add(Idioma.ESPANOL);
        idiomas1.add(Idioma.INGLES);
        idiomas1.add(Idioma.ALEMAN);
        idiomas1.add(Idioma.ARABE);
        this.p1 = new Pelicula("Volver al Futuro", Genero.CIENCIA_FICCION, 116, directores1, actores1, idiomas1);
    }

    @Test
    public void agregarPeli(){
        assertEquals(0, this.es1.getPeliculas().size());
        this.es1.addPelicula(this.p1);
        assertEquals(1, this.es1.getPeliculas().size());
    }
}
