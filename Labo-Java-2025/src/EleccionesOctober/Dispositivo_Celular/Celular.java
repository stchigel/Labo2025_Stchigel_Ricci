package EleccionesOctober.Dispositivo_Celular;

import EleccionesOctober.Bases_Y_Funcionamiento.Enviadores;

public class Celular extends Dispositivo implements Enviadores {
    private int numeroCelular;
    private CompaniaTelefonica ct;
    private Double creditoDisponible;

    public Celular(int numSerie, String fabricante, String modelo, Boolean prendido, int numeroCelular, CompaniaTelefonica ct, Double creditoDisponible) {
        super(numSerie, fabricante, modelo, prendido);
        this.numeroCelular = numeroCelular;
        this.ct = ct;
        this.creditoDisponible = creditoDisponible;
    }

    public Celular() {
        super();
        this.numeroCelular = 0;
        this.ct = CompaniaTelefonica.CLARO;
        this.creditoDisponible = 0.0;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public CompaniaTelefonica getCt() {
        return ct;
    }

    public void setCt(CompaniaTelefonica ct) {
        this.ct = ct;
    }

    public Double getCreditoDisponible() {
        return creditoDisponible;
    }

    public void setCreditoDisponible(Double creditoDisponible) {
        this.creditoDisponible = creditoDisponible;
    }

    @Override
    public void enviarMensaje(String mensajeBase) {
        if(getPrendido()&&creditoDisponible>0){
            System.out.println("Conectando con la antena más cercana: " + mensajeBase);
        }
    }
}
