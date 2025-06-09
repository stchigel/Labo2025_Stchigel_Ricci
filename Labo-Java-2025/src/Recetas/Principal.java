package Recetas;

import java.util.ArrayList;

public class Principal extends Receta {
    private int coccion;
    private int comensales;

    public Principal() {
        super();
        this.coccion = 0;
        this.comensales = 0;
    }

    public Principal(String nombre, Dificultad dificultad, ArrayList<String> pasos, int coccion, int comensales) {
        super(nombre, dificultad, pasos);
        this.coccion = coccion;
        this.comensales = comensales;
    }

    public int getCoccion() {
        return coccion;
    }

    public void setCoccion(int coccion) {
        this.coccion = coccion;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    @Override
    void imprimirPasos() {
        System.out.println("Esta receta tarda en cocinarse: " + coccion + " y los pasos son: ");
        for(String paso : super.getPasos()){
            System.out.println(paso);
        }
    }
}
