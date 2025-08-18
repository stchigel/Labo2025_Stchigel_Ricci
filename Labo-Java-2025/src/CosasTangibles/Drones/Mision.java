package CosasTangibles.Drones;

public class Mision {

    private Double latitudOrigen;
    private Double latitudDestino;
    private Double longitudOrigen;
    private Double longitudDestino;

    Mision() {
        this.latitudOrigen = -34.573195;
        this.latitudDestino = 0.0;
        this.longitudOrigen = -58.504111;
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

    public Double calcularDistancia(){
        // Convertir a radianes
        double lat1Rad = Math.toRadians(getLatitudOrigen());
        double lon1Rad = Math.toRadians(getLongitudOrigen());
        double lat2Rad = Math.toRadians(getLatitudDestino());
        double lon2Rad = Math.toRadians(getLongitudDestino());

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
