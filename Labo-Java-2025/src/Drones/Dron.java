package Drones;

import tiempo.Fecha;

public class Dron {
    private String nombre;
    private Fecha fechaAdquisision;
    private Double nivelCarga;
    private Estado estado;
    private Mision mision;

    public Dron() {
        this.nombre = "N/A";
        this.fechaAdquisision = new Fecha(0,0,0);
        this.nivelCarga = 100.0;
        this.estado = Estado.INACTIVO;
        this.mision = Mision.ENTREGA;
    }

    public Dron(String nombre, Fecha fechaAdquisision, Double nivelCarga, Estado estado, Mision mision) {
        this.nombre = nombre;
        this.fechaAdquisision = fechaAdquisision;
        this.nivelCarga = nivelCarga;
        this.estado = estado;
        this.mision = mision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFechaAdquisision() {
        return fechaAdquisision;
    }

    public void setFechaAdquisision(Fecha fechaAdquisision) {
        this.fechaAdquisision = fechaAdquisision;
    }

    public Double getNivelCarga() {
        return nivelCarga;
    }

    public void setNivelCarga(Double nivelCarga) {
        this.nivelCarga = nivelCarga;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public void recargarBateria(){
        if(nivelCarga<=20.0){
            setNivelCarga(100.0);
        }
        else{
            nivelCarga+=10;
        }
    }

    public Double calcularDistancia(){
        // Convertir a radianes
        double lat1Rad = Math.toRadians(mision.getLatitudOrigen());
        double lon1Rad = Math.toRadians(mision.getLongitudOrigen());
        double lat2Rad = Math.toRadians(mision.getLatitudDestino());
        double lon2Rad = Math.toRadians(mision.getLongitudDestino());

        // Fórmula de Haversine
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;
        return radioTierraKm * c;
    }
}
