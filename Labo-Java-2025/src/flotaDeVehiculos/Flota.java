package flotaDeVehiculos;

import java.util.ArrayList;

public class Flota {
    private ArrayList<Bicicleta> bicicletas;
    private ArrayList<Auto> autos;
    private ArrayList<Camion> camiones;

    public Flota() {
        this.bicicletas = new ArrayList<>();
        this.autos = new ArrayList<>();
        this.camiones = new ArrayList<>();
    }

    public Flota(ArrayList<Bicicleta> bicicletas, ArrayList<Auto> autos, ArrayList<Camion> camiones) {
        this.bicicletas = bicicletas;
        this.autos = autos;
        this.camiones = camiones;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }
    public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }
    public ArrayList<Auto> getAutos() {
        return autos;
    }
    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }
    public ArrayList<Camion> getCamiones() {
        return camiones;
    }
    public void setCamiones(ArrayList<Camion> camiones) {
        this.camiones = camiones;
    }

    public void addBicicleta(Bicicleta b) {
        bicicletas.add(b);
    }

    public void addAuto(Auto a) {
        autos.add(a);
    }

    public void addCamion(Camion c) {
        camiones.add(c);
    }

    public String tipoMasTenemos(){
        if(this.bicicletas.size()>this.autos.size() && this.bicicletas.size()>this.camiones.size()){
            return "Bicicletas";
        } else if(this.camiones.size()>this.autos.size() && this.camiones.size()>this.bicicletas.size()){
            return "Camiones";
        } else if(this.autos.size()>this.camiones.size() && this.autos.size()>this.bicicletas.size()){
            return "Autos";
        } else {
            return "Empate";
        }
    }

    public Double porcentajeDescapotable(){
        Double aux=0.0;
        Double porcentaje=0.0;
        for(Auto a : autos){
            if(a.getDescapotable()==true){
                aux++;
            }
        }
        porcentaje=(aux/ autos.size())*100;
        return porcentaje;
    }
}
