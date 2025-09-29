package Masterchef.Participante;

import Masterchef.Excepciones.NoIngredientesNecesarios;
import Masterchef.Extra.Color;
import Masterchef.Extra.Principal;
import Masterchef.Plato.Ingrediente;
import Masterchef.Plato.PlatoP;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Intermedio extends Participante implements Principal {
    HashMap<Ingrediente, Integer> ingredientes;

    public Intermedio(String nombre, String apellido, LocalDate fn, String localidad, Color color, HashMap<Ingrediente, Integer> ingredientes) {
        super(nombre, apellido, fn, localidad, color);
        this.ingredientes = ingredientes;
    }

    public Intermedio() {
        super();
        this.ingredientes = new HashMap<>();
    }

    public HashMap<Ingrediente, Integer> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashMap<Ingrediente, Integer> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    void prepararLugarTrabajo() {
        System.out.println("Mi stock a utilizar es: ");
        for (Map.Entry<Ingrediente, Integer> vals : ingredientes.entrySet()) {
            if (vals.getValue() > 1) {
                System.out.println(vals.getKey().getNombre() + " " + vals.getValue());
            }
        }
    }

    @Override
    public void prepararPlatoPrincipal(PlatoP plato) {
        prepararLugarTrabajo();
        try {
            for (Map.Entry<Ingrediente, Integer> vals : plato.getIngredientes().entrySet()) {
                if (!ingredientes.containsKey(vals.getKey()) || ingredientes.get(vals.getKey()) < vals.getValue()) {
                    throw new NoIngredientesNecesarios("El participante no tiene cantidad necesario");
                }
            }
            if (plato.getIngredientes().isEmpty()){
                throw new NoIngredientesNecesarios("El participante no tiene cantidad necesario");
            }
            System.out.println("El plato se cocino con exito");
        } catch (NoIngredientesNecesarios e) {
            throw new RuntimeException(e);
        }

    }
}