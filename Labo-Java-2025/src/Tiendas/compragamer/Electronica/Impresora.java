package Tiendas.compragamer.Electronica;

import java.util.ArrayList;

public class Impresora extends Salida {
    private String metodoIMP;

    public Impresora(){
        super();
        this.metodoIMP="Inyeccion";
    }

    public Impresora(String modelo, String fabricante, Double precio, int stock, String conector, ArrayList<String> puertos, String metodoIMP) {
        super(modelo, fabricante, precio, stock, conector, puertos);
        this.metodoIMP = metodoIMP;
    }

    public String getMetodoIMP() {
        return metodoIMP;
    }

    public void setMetodoIMP(String metodoIMP) {
        this.metodoIMP = metodoIMP;
    }
}
