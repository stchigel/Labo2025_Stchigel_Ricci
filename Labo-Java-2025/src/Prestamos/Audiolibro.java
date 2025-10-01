package Prestamos;

import java.time.LocalDate;

public class Audiolibro extends Publicacion{
    private Double duracion;
    private Double peso;

    public Audiolibro() {
        this.duracion = 0.0;
        this.peso = 0.0;
    }

    public Audiolibro(String titulo, String autor, LocalDate publicacion, Double duracion, Double peso) {
        super(titulo, autor, publicacion);
        this.duracion = duracion;
        this.peso = peso;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
