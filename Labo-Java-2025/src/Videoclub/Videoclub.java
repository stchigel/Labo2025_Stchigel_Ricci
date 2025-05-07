package Videoclub;

import java.util.ArrayList;

public class Videoclub {
    private String direccion;
    private String codigoPostal;
    private int comuna;
    private ArrayList<Estanteria> estanterias;

    public Videoclub(String direccion, String codigoPostal, int comuna, ArrayList<Estanteria> estanterias) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.comuna = comuna;
        this.estanterias = estanterias;
    }

    public Videoclub(String direccion, String codigoPostal, int comuna) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.comuna = comuna;
        this.estanterias = new ArrayList<>();
    }

    public Videoclub() {
        this.direccion = "N/A";
        this.codigoPostal = "N/A";
        this.comuna = 0;
        this.estanterias = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }

    public ArrayList<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(ArrayList<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }

    public void addEstanteria(Estanteria estanteria) {
        this.estanterias.add(estanteria);
    }

    public void removeEstanteria(Estanteria estanteria) {
        this.estanterias.remove(estanteria);
    }

    public void updateEstanteria(Estanteria estanteriaViejo, Estanteria estanteriaNuevo) {
        for (Estanteria estanteria : this.estanterias){
            if (estanteria==estanteriaViejo){
                estanteria=estanteriaNuevo;
            }
        }
    }

    public ArrayList<Pelicula> getPeliculas90(){
        ArrayList<Pelicula> peliculas90=new ArrayList<>();
            for(Estanteria estanteria:this.getEstanterias()){
                for(Pelicula pelicula : estanteria.getPeliculas()){
                    if(pelicula.getDuracion()<90){
                        peliculas90.add(pelicula);
                    }
                }
            }
        return peliculas90;
    }

    public int cantPeliculas(){
        int cantPelis = 0;
        for(Estanteria estante : this.estanterias){
            cantPelis += estante.getPeliculas().size();
        }
        return cantPelis;
    }
}
