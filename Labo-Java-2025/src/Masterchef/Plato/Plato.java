package Masterchef.Plato;

import java.util.HashMap;
import java.util.Map;

public class Plato {
    private String nombre;
    private HashMap<Ingrediente, Integer>ingredientes;

    public Plato() {
        this.nombre = "N/A";
        this.ingredientes = new HashMap<>();
    }

    public Plato(String nombre, HashMap<Ingrediente, Integer> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Ingrediente, Integer> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashMap<Ingrediente, Integer> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Double tiempoPreparacion(){
        Double tiempo=0.0;
        for(Map.Entry<Ingrediente, Integer>vals : ingredientes.entrySet()){
            tiempo+=(vals.getKey().getTiempoCocinar()*vals.getValue());
        }
        return tiempo;
    }
}
