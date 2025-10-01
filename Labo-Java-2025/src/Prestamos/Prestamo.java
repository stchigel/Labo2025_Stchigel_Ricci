package Prestamos;

import Bastaricci.Mesa;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fp;
    private LocalDate fdpreestablecida;
    private Publicacion publicacion;
    private int numSocio;

    public Prestamo(){
        this.fp = LocalDate.now();
        this.fdpreestablecida = LocalDate.now();
        this.publicacion = new Libro();
        this.numSocio = 0;
    }

    public Prestamo(LocalDate fp, LocalDate fdpreestablecida, Publicacion publicacion, int numSocio) {
        this.fp = fp;
        this.fdpreestablecida = fdpreestablecida;
        this.publicacion = publicacion;
        this.numSocio = numSocio;
    }

    public LocalDate getFp() {
        return fp;
    }

    public void setFp(LocalDate fp) {
        this.fp = fp;
    }

    public LocalDate getFdpreestablecida() {
        return fdpreestablecida;
    }

    public void setFdpreestablecida(LocalDate fdpreestablecida) {
        this.fdpreestablecida = fdpreestablecida;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }


}
