package EleccionesOctober.Dispositivo_Celular;

public class Dispositivo {
    private int numSerie;
    private String fabricante;
    private String modelo;
    private Boolean prendido;

    public Dispositivo(int numSerie, String fabricante, String modelo, Boolean prendido) {
        this.numSerie = numSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.prendido = prendido;
    }

    public Dispositivo() {
        this.numSerie = 0;
        this.fabricante = "Samsung";
        this.modelo = "S23";
        this.prendido = false;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getPrendido() {
        return prendido;
    }

    public void setPrendido(Boolean prendido) {
        this.prendido = prendido;
    }
}
