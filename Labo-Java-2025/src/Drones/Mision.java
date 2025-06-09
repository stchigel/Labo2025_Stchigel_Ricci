package Drones;

public enum Mision {
    ENTREGA, VIGILANCIA;

    private Double latitudOrigen;
    private Double latitudDestino;
    private Double longitudOrigen;
    private Double longitudDestino;

    Mision() {
        this.latitudOrigen = 0.0;
        this.latitudDestino = 0.0;
        this.longitudOrigen = 0.0;
        this.longitudDestino = 0.0;
    }

    Mision(Double latitudOrigen, Double latitudDestino, Double longitudOrigen, Double longitudDestino) {
        this.latitudOrigen = latitudOrigen;
        this.latitudDestino = latitudDestino;
        this.longitudOrigen = longitudOrigen;
        this.longitudDestino = longitudDestino;
    }

    public Double getLatitudOrigen() {
        return latitudOrigen;
    }

    public void setLatitudOrigen(Double latitudOrigen) {
        this.latitudOrigen = latitudOrigen;
    }

    public Double getLatitudDestino() {
        return latitudDestino;
    }

    public void setLatitudDestino(Double latitudDestino) {
        this.latitudDestino = latitudDestino;
    }

    public Double getLongitudOrigen() {
        return longitudOrigen;
    }

    public void setLongitudOrigen(Double longitudOrigen) {
        this.longitudOrigen = longitudOrigen;
    }

    public Double getLongitudDestino() {
        return longitudDestino;
    }

    public void setLongitudDestino(Double longitudDestino) {
        this.longitudDestino = longitudDestino;
    }
}
