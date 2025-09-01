package electricidad;

import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private int codigoPostal;
    private Duenio duenio;
    private HashMap<Mes, Integer> consumo;

    public Vivienda() {
        this.direccion = "direccion";
        this.codigoPostal = 0;
        this.duenio = new Duenio();
        this.consumo = new HashMap<>();
    }

    public Vivienda(String direccion, int codigoPostal, Duenio duenio) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.duenio = duenio;
        this.consumo = new HashMap<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public HashMap<Mes, Integer> getConsumo() {
        return consumo;
    }

    public void setConsumo(HashMap<Mes, Integer> consumo) {
        this.consumo = consumo;
    }

    public void addConsumo(Mes m, int cant){
        if(!this.consumo.containsKey(m)){
            this.consumo.put(m, cant);
        }
    }

    /*public */abstract Double calcConsumo(Mes mes);
}
