package Recetas;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Receta> recetas;

    public Sistema() {
        this.recetas = new ArrayList<>();
    }

    public Sistema(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public void addReceta(Receta receta){
        recetas.add(receta);
    }

    public void borrarReceta(Receta receta){
        recetas.remove(receta);
    }

    public ArrayList<Receta> filtrarRecetasDificultad(Dificultad d){
        ArrayList<Receta> aux = new ArrayList<>();
        for(Receta p : recetas){
            if(p.getDificultad().equals(d)){
                aux.add(p);
            }
        }
        return aux;
    }

    public ArrayList<Receta> filtrarRecetasTipo(String tipo){
        ArrayList<Receta> aux = new ArrayList<>();
        for(Receta p : recetas){
            if(p.getClass().toString().equals(tipo)){
                aux.add(p);
            }
        }
        return aux;
    }

    public int cantRecetas(){
        return recetas.size();
    }

    public Receta recetaMasLarga(){
        Receta aux = recetas.getFirst();
        for(Receta p : recetas){
            if(p.getPasos().size()>aux.getPasos().size()){
                aux=p;
            }
        }
        return aux;
    }

}
