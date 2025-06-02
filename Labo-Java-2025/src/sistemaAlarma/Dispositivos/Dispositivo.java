package sistemaAlarma.Dispositivos;

import java.time.LocalDate;

public class Dispositivo {
    private Double medida;
    private Double umbralInicial;
    private LocalDate anioAdquisicion;

    public Dispositivo(){
        this.medida = 16.25;
        this.umbralInicial = 20.0;
        this.anioAdquisicion = LocalDate.now();
    }

    public Dispositivo(Double medida, Double umbralInicial, LocalDate anioAdquisicion) {
        this.medida = medida;
        this.umbralInicial = umbralInicial;
        this.anioAdquisicion = anioAdquisicion;
    }

    public LocalDate getAnioAdquisicion() {
        return anioAdquisicion;
    }

    public void setAnioAdquisicion(LocalDate anioAdquisicion) {
        this.anioAdquisicion = anioAdquisicion;
    }

    public Double getUmbralInicial() {
        return umbralInicial;
    }

    public void setUmbralInicial(Double umbralInicial) {
        this.umbralInicial = umbralInicial;
    }

    public Double getMedida() {
        return medida;
    }

    public void setMedida(Double medida) {
        this.medida = medida;
    }

    public void calcularUmbral(){
        if(medida>umbralInicial){
            sensorActivado();
        }
    }

    public void sensorActivado(){

    }
}
