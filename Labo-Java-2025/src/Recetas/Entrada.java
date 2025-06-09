package Recetas;

import java.util.ArrayList;

public class Entrada extends Receta {
    private Temperatura temperatura;

    public Entrada() {
        super();
        this.temperatura = Temperatura.CALIENTE;
    }

    public Entrada(String nombre, Dificultad dificultad, ArrayList<String> pasos, Temperatura temperatura) {
        super(nombre, dificultad, pasos);
        this.temperatura = temperatura;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    void imprimirPasos() {
        if(temperatura==Temperatura.CALIENTE){
            System.out.printf("Recordar prender el horno!!");
        }
        System.out.println("Los pasos son: ");
        for(String paso : super.getPasos()){
            System.out.println(paso);
        }
        if(temperatura==Temperatura.FRIO){
            System.out.printf("Recordar poner en la healdera!!");
        }
    }
}
