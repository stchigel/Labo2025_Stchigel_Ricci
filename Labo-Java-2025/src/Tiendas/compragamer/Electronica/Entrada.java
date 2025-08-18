package Tiendas.compragamer.Electronica;

import java.util.ArrayList;

public class Entrada extends Componente {
    private String conector;
    private ArrayList<String> puertos;

    public Entrada() {
        super();
        this.conector = "N/A";
        this.puertos = new ArrayList<>();
    }

    public Entrada(String modelo, String fabricante, Double precio, int stock, String conector, ArrayList<String> puertos) {
        super(modelo, fabricante, precio, stock);
        this.conector = conector;
        this.puertos = puertos;
    }

    public String getConector() {
        return conector;
    }

    public void setConector(String conector) {
        this.conector = conector;
    }

    public ArrayList<String> getPuertos() {
        return puertos;
    }

    public void setPuertos(ArrayList<String> puertos) {
        this.puertos = puertos;
    }
}