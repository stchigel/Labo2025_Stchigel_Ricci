package Masterchef.Plato;

import java.util.HashMap;

public class PlatoP extends Plato{
    public PlatoP() {
    }

    public PlatoP(String nombre, HashMap<Ingrediente, Integer> ingredientes) {
        super(nombre, ingredientes);
    }
}
