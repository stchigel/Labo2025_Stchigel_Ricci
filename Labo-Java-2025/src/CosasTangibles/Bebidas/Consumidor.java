package CosasTangibles.Bebidas;

import Bases.Persona;

import java.util.ArrayList;

public class Consumidor extends Persona {
    int DNI;
    ArrayList<Consumo> consumos;

    public Consumidor() {
        super("N/A", "N/A");
        this.DNI = 0;
    }

    public Consumidor(String nombre, String apellido, int DNI) {
        super(nombre, apellido);
        this.DNI = DNI;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int calcularHidratacion(){
        int hidratacion = 0;
        for(Consumo con : consumos){
            hidratacion+=con.getCant()*con.getBebida().getPositividad();
            hidratacion-=con.getCant()*con.getBebida().getNegatividad();
        }
        return hidratacion;
    }
}
