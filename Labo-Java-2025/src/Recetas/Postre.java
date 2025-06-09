package Recetas;

import java.util.ArrayList;

public class Postre extends Receta {
    private int temperatura;
    private boolean diabetico;

    public Postre() {
        super();
        this.temperatura = 0;
        this.diabetico = false;
    }

    public Postre(String nombre, Dificultad dificultad, ArrayList<String> pasos, int temperatura, boolean diabetico) {
        super(nombre, dificultad, pasos);
        this.temperatura = temperatura;
        this.diabetico = diabetico;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isDiabetico() {
        return diabetico;
    }

    public void setDiabetico(boolean diabetico) {
        this.diabetico = diabetico;
    }

    @Override
    void imprimirPasos() {
        System.out.println("Los pasos son: ");
        for(String paso : super.getPasos()){
            System.out.println(paso+", recorda mantener la cocina limpia y el horno al minimo, ");
        }
    }
}
