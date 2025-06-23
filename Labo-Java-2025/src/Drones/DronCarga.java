package Drones;

import tiempo.Fecha;

public class DronCarga extends Dron{
    private Double carga;

    public DronCarga() {
        super();
        this.carga = 0.0;
    }

    public DronCarga(String nombre, Fecha fechaAdquisision, Double nivelCarga, Estado estado, Mision mision, Double carga) {
        super(nombre, fechaAdquisision, nivelCarga, estado, mision);
        this.carga = carga;
    }

    @Override
    public boolean puedoLlegar() {
        if(super.getMision().calcularDistancia()>30){
            return false;
        } else if (super.getNivelCarga()>=50.0){
            super.setNivelCarga(super.getNivelCarga()-50.0);
            return true;
        } else {
            return false;
        }
    }
}

