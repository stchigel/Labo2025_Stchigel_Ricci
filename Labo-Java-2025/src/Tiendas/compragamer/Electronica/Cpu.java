package Tiendas.compragamer.Electronica;

import java.util.ArrayList;

public class Cpu {
    private ArrayList<Componente> componentes;

    public Cpu() {
        this.componentes = new ArrayList<>();
    }

    public Cpu(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public Double calcPrecio(){
        Double aux=0.0;
        for(Componente componente : componentes){
            aux+=componente.getPrecio();
        }
        return aux;
    }
}
