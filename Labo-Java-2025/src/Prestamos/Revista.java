package Prestamos;

import java.time.LocalDate;

public class Revista extends Publicacion{
    private String distribuidora;

    public Revista() {
        this.distribuidora = "distribuidora";
    }

    public Revista(String titulo, String autor, LocalDate publicacion, String distribuidora) {
        super(titulo, autor, publicacion);
        this.distribuidora = distribuidora;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }
}
