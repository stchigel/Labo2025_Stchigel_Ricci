package Videoclub;

import unidad1.Persona;

import java.util.ArrayList;

public class Estanteria {
    private ArrayList<Pelicula> peliculas;

    public Estanteria(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    public Estanteria() {
        this.peliculas = new ArrayList<>();
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void addPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }

    public Pelicula mayorTiempo(){
        Pelicula peliMAStiempo=this.peliculas.getFirst();
        for(Pelicula peli: this.peliculas){
            if(peli.getDuracion()>peliMAStiempo.getDuracion()){
                peliMAStiempo=peli;
            }
        }
        return peliMAStiempo;
    }

    public ArrayList<Persona> masDeUnaPeli() {
        ArrayList<Pelicula> peliculas2=this.peliculas;
        ArrayList<Persona> directores = new ArrayList<>();
        for (int i=0; i< peliculas2.size(); i++){
            Pelicula pelicula = peliculas2.get(i);
            peliculas2.remove(i);
            for (Persona director : pelicula.getDirectores()){
                for (Pelicula pelicula2 : peliculas2){
                    for (Persona director2 : pelicula2.getDirectores()){
                        if (director.equals(director2)){
                            if (!directores.contains(director)){
                                directores.add(director);
                            }
                        }
                    }
                }
            }
        }
        return directores;
    }


}
