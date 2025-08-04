/*package Mascotas;

import Bases.Persona;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest {
    Sistema s1;
    @BeforeEach
    void init(){
        s1=new Sistema();
    }

    @org.junit.jupiter.api.Test
    void addMascota() {
        assertEquals(0, s1.getMascotas().size());
        Perro p=new Perro();
        s1.addMascota(p);
        assertEquals(1, s1.getMascotas().size());
    }

    @org.junit.jupiter.api.Test
    void saludo() {
    }

    @org.junit.jupiter.api.Test
    void matar() {
        assertEquals(0, s1.getMascotas().size());
        Perro p=new Perro(new Persona("Nico", "st", "lol"), "Juansitojuanseto");
        s1.addMascota(p);
        assertEquals(1, s1.getMascotas().size());
        s1.matar("Juansitojuanseto", "Nico");
        assertEquals(0, s1.getMascotas().size());
    }

    @org.junit.jupiter.api.Test
    void crearMascota() {
        assertEquals(0, s1.getMascotas().size());
        s1.crearMascota();
        assertEquals(1, s1.getMascotas().size());
    }

    @org.junit.jupiter.api.Test
    void menuInicio() {
        s1.menuInicio();
    }
}*/