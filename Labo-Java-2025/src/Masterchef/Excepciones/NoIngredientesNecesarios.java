package Masterchef.Excepciones;

public class NoIngredientesNecesarios extends RuntimeException {
    public NoIngredientesNecesarios(String message) {
        super(message);
    }
}
