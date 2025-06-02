package sistemaAlarma.Dispositivos;

import java.time.LocalDate;

public class Dispositivo {
    private boolean estado;
    private Double medida;
    private Double umbralInicial;
    private LocalDate anioAdquisicion;

    public Dispositivo(){
        this.estado = false;
        this.medida = 16.25;
        this.umbralInicial = 20.0;
        this.anioAdquisicion = LocalDate.now();
    }

    public Dispositivo(boolean estado, Double medida, Double umbralInicial, LocalDate anioAdquisicion) {
        this.estado = estado;
        this.medida = medida;
        this.umbralInicial = umbralInicial;
        this.anioAdquisicion = anioAdquisicion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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
            setEstado(true);
        }
    }
}
