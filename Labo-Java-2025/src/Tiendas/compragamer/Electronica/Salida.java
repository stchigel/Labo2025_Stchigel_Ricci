package Tiendas.compragamer.Electronica;

import java.util.ArrayList;

public class Salida extends Componente {
    private ArrayList<String> puertos;

    public Salida() {
        super();
        this.puertos = new ArrayList<>();
    }

    public Salida(String modelo, String fabricante, Double precio, int stock, String conector, ArrayList<String> puertos) {
        super(modelo, fabricante, precio, stock);
        this.puertos = puertos;
    }

    public ArrayList<String> getPuertos() {
        return puertos;
    }

    public void setPuertos(ArrayList<String> puertos) {
        this.puertos = puertos;
    }
}
