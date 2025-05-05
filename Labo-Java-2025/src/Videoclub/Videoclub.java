package Videoclub;

import java.util.ArrayList;

public class Videoclub {
    private String direccion;
    private String codigoPostal;
    private ArrayList<Estanteria> estanterias;

    public Videoclub(String direccion, String codigoPostal, ArrayList<Estanteria> estanterias) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.estanterias = estanterias;
    }

    public Videoclub(String direccion, String codigoPostal) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.estanterias = new ArrayList<>();
    }

    public Videoclub() {
        this.direccion = "N/A";
        this.codigoPostal = "N/A";
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

    public ArrayList<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(ArrayList<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }

    public void addEstanteria(Estanteria estanteria) {
        this.estanterias.add(estanteria);
    }

    public int cantPeliculas(){
        int cantPelis = 0;
        for(Estanteria estante : this.estanterias){
            cantPelis += estante.getPeliculas().size();
        }
        return cantPelis;
    }
}
