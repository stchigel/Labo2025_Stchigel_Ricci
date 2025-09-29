package Masterchef.Participante;

import Masterchef.Excepciones.ElementoProhibido;
import Masterchef.Extra.Color;
import Masterchef.Extra.Entrada;
import Masterchef.Plato.Ingrediente;
import Masterchef.Plato.Plato;
import Masterchef.Plato.PlatoE;

import java.time.LocalDate;
import java.util.HashSet;

public class Principiante extends Participante implements Entrada {
    HashSet<Ingrediente>ingredientesProhibidos;

    public Principiante(String nombre, String apellido, LocalDate fn, String localidad, Color color, HashSet<Ingrediente> ingredientesProhibidos) {
        super(nombre, apellido, fn, localidad, color);
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    public Principiante() {
        super();
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    public HashSet<Ingrediente> getIngredientesProhibidos() {
        return ingredientesProhibidos;
    }

    public void setIngredientesProhibidos(HashSet<Ingrediente> ingredientesProhibidos) {
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    @Override
    void prepararLugarTrabajo() {
        System.out.println("Ya guarde los ingredientes prohibidos ");
        for(Ingrediente ing : ingredientesProhibidos){
            System.out.println(ing.getNombre());
        }
    }

    @Override
    public void prepararEntrada(PlatoE plato) {
        prepararLugarTrabajo();
        try {
            for(Ingrediente ing : ingredientesProhibidos){
                if(plato.getIngredientes().containsKey(ing)){
                    throw new ElementoProhibido("No se puede cocinar el plato ya que tiene ingredientes prohibidos");
                }
            }
            System.out.println("El plato se cocino con exito");
        } catch (ElementoProhibido e) {
            throw new RuntimeException(e);
        }
    }
}
