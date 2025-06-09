package Recetas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class Tests {
    Sistema s1;
    @BeforeEach
    void init(){
        s1=new Sistema();
    }

    @Test
    void addReceta() {
        assertEquals(0, s1.getRecetas().size());
        s1.addReceta(new Postre());
        assertEquals(1, s1.getRecetas().size());
    }

    @Test
    void borrarReceta() {
        Postre p1=new Postre();
        assertEquals(0, s1.getRecetas().size());
        s1.addReceta(p1);
        assertEquals(1, s1.getRecetas().size());
        s1.borrarReceta(p1);
        assertEquals(0, s1.getRecetas().size());
    }

    @Test
    void filtrarRecetasDificultad() {
        Principal p1 = new Principal( "Spaghetti con tomate", Dificultad.FACIL, new ArrayList<>(List.of("Hervir agua", "Cocinar la pasta", "Preparar la salsa", "Mezclar todo")), 15, 2);
        Principal p2 = new Principal("Pollo al horno", Dificultad.MEDIO, new ArrayList<>(List.of("Marinar el pollo", "Precalentar el horno", "Hornear 45 minutos", "Servir con guarnición")), 45, 4);
        Principal p3 = new Principal("Paella de mariscos", Dificultad.AVANZADO, new ArrayList<>(List.of("Preparar el caldo", "Sofreír mariscos", "Agregar arroz y caldo", "Cocinar hasta absorber")), 50, 6);
        Principal p4 = new Principal("Ensalada César", Dificultad.FACIL, new ArrayList<>(List.of("Lavar la lechuga", "Preparar la salsa", "Tostar pan", "Mezclar todos los ingredientes")), 10, 2);
        Principal p5 = new Principal("Lasaña", Dificultad.MEDIO, new ArrayList<>(List.of("Preparar la carne", "Preparar la salsa blanca", "Armar las capas", "Hornear 30 minutos")), 30, 4);
        Principal p6 = new Principal("Ramen casero", Dificultad.AVANZADO, new ArrayList<>(List.of("Preparar el caldo base", "Cocer los fideos","Sacar los fideos", "Preparar los toppings", "Servir en tazón")), 60, 3);

        ArrayList<Receta> aux = new ArrayList<>();
        aux.add(p2);
        aux.add(p5);

        s1.addReceta(p1);
        s1.addReceta(p2);
        s1.addReceta(p3);
        s1.addReceta(p4);
        s1.addReceta(p5);
        s1.addReceta(p6);

        assertEquals(aux, s1.filtrarRecetasDificultad(Dificultad.MEDIO));
    }

    @Test
    void filtrarRecetasTipo() { /*ERROR*/
        Principal p1 = new Principal( "Spaghetti con tomate", Dificultad.FACIL, new ArrayList<>(List.of("Hervir agua", "Cocinar la pasta", "Preparar la salsa", "Mezclar todo")), 15, 2);
        Principal p2 = new Principal("Pollo al horno", Dificultad.MEDIO, new ArrayList<>(List.of("Marinar el pollo", "Precalentar el horno", "Hornear 45 minutos", "Servir con guarnición")), 45, 4);
        Principal p3 = new Principal("Paella de mariscos", Dificultad.AVANZADO, new ArrayList<>(List.of("Preparar el caldo", "Sofreír mariscos", "Agregar arroz y caldo", "Cocinar hasta absorber")), 50, 6);
        Principal p4 = new Principal("Ensalada César", Dificultad.FACIL, new ArrayList<>(List.of("Lavar la lechuga", "Preparar la salsa", "Tostar pan", "Mezclar todos los ingredientes")), 10, 2);
        Principal p5 = new Principal("Lasaña", Dificultad.MEDIO, new ArrayList<>(List.of("Preparar la carne", "Preparar la salsa blanca", "Armar las capas", "Hornear 30 minutos")), 30, 4);
        Principal p6 = new Principal("Ramen casero", Dificultad.AVANZADO, new ArrayList<>(List.of("Preparar el caldo base", "Cocer los fideos","Sacar los fideos", "Preparar los toppings", "Servir en tazón")), 60, 3);
        Postre postre1 = new Postre("Flan casero", Dificultad.FACIL, new ArrayList<>(List.of("Mezclar ingredientes", "Caramelizar molde", "Hornear a baño María", "Enfriar")), 180, false);
        Postre postre2 = new Postre("Tarta de manzana", Dificultad.MEDIO, new ArrayList<>(List.of("Preparar masa", "Pelar manzanas", "Armar la tarta", "Hornear")), 200, false);
        Postre postre3 = new Postre("Mousse de chocolate", Dificultad.AVANZADO, new ArrayList<>(List.of("Derretir chocolate", "Batir crema", "Incorporar claras", "Refrigerar")), 5, false);
        Postre postre4 = new Postre("Gelatina light", Dificultad.FACIL, new ArrayList<>(List.of("Disolver gelatina", "Verter en moldes", "Llevar a la heladera")), 4, true);
        Postre postre5 = new Postre("Helado artesanal", Dificultad.MEDIO, new ArrayList<>(List.of("Preparar base", "Batir constantemente", "Congelar", "Servir")), -10, true);
        Postre postre6 = new Postre("Brownie sin azúcar", Dificultad.MEDIO, new ArrayList<>(List.of("Derretir manteca", "Mezclar ingredientes", "Hornear", "Cortar en cuadros")), 180, true);
        Entrada entrada1 = new Entrada("Bruschettas", Dificultad.FACIL, new ArrayList<>(List.of("Tostar pan", "Picar tomates", "Agregar aceite de oliva", "Servir")), Temperatura.FRIO);
        Entrada entrada2 = new Entrada("Sopa de calabaza", Dificultad.MEDIO, new ArrayList<>(List.of("Cortar calabaza", "Hervir", "Procesar", "Servir caliente")), Temperatura.CALIENTE);
        Entrada entrada3 = new Entrada("Ensalada caprese", Dificultad.FACIL, new ArrayList<>(List.of("Cortar tomate y mozzarella", "Agregar albahaca", "Rociar con aceite")), Temperatura.FRIO);
        Entrada entrada4 = new Entrada("Empanadas de carne", Dificultad.MEDIO, new ArrayList<>(List.of("Preparar relleno", "Armar empanadas", "Hornear", "Servir")), Temperatura.CALIENTE);
        Entrada entrada5 = new Entrada("Rolls de jamón y queso", Dificultad.FACIL, new ArrayList<>(List.of("Enrollar jamón con queso", "Pinchar con palillo", "Servir frío")), Temperatura.FRIO);
        Entrada entrada6 = new Entrada("Mini quiches", Dificultad.AVANZADO, new ArrayList<>(List.of("Preparar masa", "Preparar relleno", "Hornear", "Servir")), Temperatura.CALIENTE);
        s1.addReceta(postre1);
        s1.addReceta(postre2);
        s1.addReceta(postre3);
        s1.addReceta(postre4);
        s1.addReceta(postre5);
        s1.addReceta(postre6);
        s1.addReceta(entrada1);
        s1.addReceta(entrada2);
        s1.addReceta(entrada3);
        s1.addReceta(entrada4);
        s1.addReceta(entrada5);
        s1.addReceta(entrada6);
        s1.addReceta(p1);
        s1.addReceta(p2);
        s1.addReceta(p3);
        s1.addReceta(p4);
        s1.addReceta(p5);
        s1.addReceta(p6);

        ArrayList<Receta> aux = new ArrayList<>();
        aux.add(p1);
        aux.add(p2);
        aux.add(p3);
        aux.add(p4);
        aux.add(p5);
        aux.add(p6);

        assertEquals(aux, s1.filtrarRecetasTipo("Principal"));
    }

    @Test
    void cantRecetas() {
        assertEquals(0, s1.cantRecetas());
        s1.addReceta(new Postre());
        assertEquals(1, s1.cantRecetas());
    }

    @Test
    void recetaMasLarga() {
        Principal p1 = new Principal( "Spaghetti con tomate", Dificultad.FACIL, new ArrayList<>(List.of("Hervir agua", "Cocinar la pasta", "Preparar la salsa", "Mezclar todo")), 15, 2);
        Principal p2 = new Principal("Pollo al horno", Dificultad.MEDIO, new ArrayList<>(List.of("Marinar el pollo", "Precalentar el horno", "Hornear 45 minutos", "Servir con guarnición")), 45, 4);
        Principal p3 = new Principal("Paella de mariscos", Dificultad.AVANZADO, new ArrayList<>(List.of("Preparar el caldo", "Sofreír mariscos", "Agregar arroz y caldo", "Cocinar hasta absorber")), 50, 6);
        Principal p4 = new Principal("Ensalada César", Dificultad.FACIL, new ArrayList<>(List.of("Lavar la lechuga", "Preparar la salsa", "Tostar pan", "Mezclar todos los ingredientes")), 10, 2);
        Principal p5 = new Principal("Lasaña", Dificultad.MEDIO, new ArrayList<>(List.of("Preparar la carne", "Preparar la salsa blanca", "Armar las capas", "Hornear 30 minutos")), 30, 4);
        Principal p6 = new Principal("Ramen casero", Dificultad.AVANZADO, new ArrayList<>(List.of("Preparar el caldo base", "Cocer los fideos","Sacar los fideos", "Preparar los toppings", "Servir en tazón")), 60, 3);

        s1.addReceta(p1);
        s1.addReceta(p2);
        s1.addReceta(p3);
        s1.addReceta(p4);
        s1.addReceta(p5);
        s1.addReceta(p6);

        assertEquals(p6, s1.recetaMasLarga());
    }
}