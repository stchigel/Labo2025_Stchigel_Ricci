package Drones;

import tiempo.Fecha;

public class DronVigilancia extends Dron{
    private Double memoriaSD;

    public DronVigilancia() {
        super();
        this.memoriaSD = 0.0;
    }

    public DronVigilancia(String nombre, Fecha fechaAdquisision, Double nivelCarga, Estado estado, Mision mision, Double memoriaSD) {
        super(nombre, fechaAdquisision, nivelCarga, estado, mision);
        this.memoriaSD = memoriaSD;
    }

    @Override
    public boolean puedoLlegar() {
        Double memoriaNecesaria = (super.getMision().calcularDistancia() / 2) * 12;
        if(memoriaSD>=memoriaNecesaria){
            return true;
        } else {
            return false;
        }
    }

}
