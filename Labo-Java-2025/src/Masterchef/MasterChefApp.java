package Masterchef;

import Masterchef.Extra.Color;
import Masterchef.Participante.*;
import Masterchef.Plato.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class MasterChefApp {
    public static void main(String[] args) {

        // Ingredientes
        Ingrediente tomate = new Ingrediente("Tomate", 20.0, 2.0);
        Ingrediente lechuga = new Ingrediente("Lechuga", 5.0, 1.0);
        Ingrediente carne = new Ingrediente("Carne", 250.0, 15.0);
        Ingrediente pollo = new Ingrediente("Pollo", 200.0, 12.0);
        Ingrediente queso = new Ingrediente("Queso", 150.0, 3.0);

        // Platos de entrada
        HashMap<Ingrediente, Integer> ensaladaIngredientes = new HashMap<>();
        ensaladaIngredientes.put(tomate, 2);
        ensaladaIngredientes.put(lechuga, 1);
        PlatoE ensalada = new PlatoE("Ensalada Mixta", ensaladaIngredientes);

        // Platos principales
        HashMap<Ingrediente, Integer> carneIngredientes = new HashMap<>();
        carneIngredientes.put(carne, 1);
        carneIngredientes.put(queso, 1);
        PlatoP carneAsada = new PlatoP("Carne Asada", carneIngredientes);

        HashMap<Ingrediente, Integer> polloIngredientes = new HashMap<>();
        polloIngredientes.put(pollo, 2);
        polloIngredientes.put(queso, 1);
        PlatoP polloRelleno = new PlatoP("Pollo Relleno", polloIngredientes);

        // Principiante con ingredientes prohibidos
        HashSet<Ingrediente> prohibidos = new HashSet<>();
        prohibidos.add(queso);
        Principiante principiante = new Principiante("Juan", "Perez", LocalDate.of(2005, 5, 20),
                "Buenos Aires", Color.AZUL, prohibidos);

        // Intermedio con stock de ingredientes
        HashMap<Ingrediente, Integer> stockIntermedio = new HashMap<>();
        stockIntermedio.put(carne, 1);
        stockIntermedio.put(queso, 1);
        Intermedio intermedio = new Intermedio("Ana", "Lopez", LocalDate.of(2003, 8, 15),
                "Córdoba", Color.ROJO, stockIntermedio);

        // Experto con tiempo limitado
        Experto experto = new Experto("Luis", "Gomez", LocalDate.of(1998, 2, 10),
                "Rosario", Color.VERDE);

        // --- Simulación ---

        System.out.println("\n--- Principiante preparando entrada ---");
        try {
            principiante.prepararEntrada(ensalada);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Intermedio preparando plato principal ---");
        try {
            intermedio.prepararPlatoPrincipal(carneAsada);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Experto preparando entrada ---");
        try {
            experto.prepararEntrada(ensalada);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Experto preparando plato principal ---");
        try {
            experto.prepararPlatoPrincipal(polloRelleno);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
