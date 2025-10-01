package Prestamos;

import java.time.LocalDate;

public class Libro extends Publicacion{
    private boolean tieneSaga;

    public Libro() {
        this.tieneSaga = false;
    }

    public Libro(String titulo, String autor, LocalDate publicacion, boolean tieneSaga) {
        super(titulo, autor, publicacion);
        this.tieneSaga = tieneSaga;
    }

    public boolean isTieneSaga() {
        return tieneSaga;
    }

    public void setTieneSaga(boolean tieneSaga) {
        this.tieneSaga = tieneSaga;
    }
}
