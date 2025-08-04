package Vacunatorio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vacuna {
    private LocalDate fecFabric;
    private LocalDate fecAplic;
    private int lote;
    private int numFabric;
    private String nomComerc;

    public Vacuna() {
        this.fecFabric = LocalDate.now();
        this.fecAplic = LocalDate.now();
        this.lote = 0;
        this.numFabric = 0;
        this.nomComerc = "anashei";
    }

    public Vacuna(LocalDate fecFabric, LocalDate fecAplic, int lote, int numFabric, String nomComerc) {
        this.fecFabric = fecFabric;
        this.fecAplic = fecAplic;
        this.lote = lote;
        this.numFabric = numFabric;
        this.nomComerc = nomComerc;
    }

    public LocalDate getFecFabric() {
        return fecFabric;
    }

    public void setFecFabric(LocalDate fecFabric) {
        this.fecFabric = fecFabric;
    }

    public LocalDate getFecAplic() {
        return fecAplic;
    }

    public void setFecAplic(LocalDate fecAplic) {
        this.fecAplic = fecAplic;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getNumFabric() {
        return numFabric;
    }

    public void setNumFabric(int numFabric) {
        this.numFabric = numFabric;
    }

    public String getNomComerc() {
        return nomComerc;
    }

    public void setNomComerc(String nomComerc) {
        this.nomComerc = nomComerc;
    }
}
