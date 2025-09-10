package ArcoFlecha;

import java.util.HashSet;

public class Bar {
    private HashSet<Diana> dianas;
    private int clientes;
    private Double recaudado;
    private HashSet<Beneficio> beneficios;
    private HashSet<Acumulable> acumulables;

    public Bar() {
        this.dianas = new HashSet<>();
        this.clientes = 0;
        this.recaudado = 0.0;
        this.beneficios = new HashSet<>();
        this.acumulables = new HashSet<>();
    }

    public Bar(HashSet<Diana> dianas, int clientes, Double recaudado, HashSet<Beneficio> beneficios, HashSet<Acumulable> acumulables) {
        this.dianas = dianas;
        this.clientes = clientes;
        this.recaudado = recaudado;
        this.beneficios = beneficios;
        this.acumulables = acumulables;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    public Double getRecaudado() {
        return recaudado;
    }

    public void setRecaudado(Double recaudado) {
        this.recaudado = recaudado;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public HashSet<Acumulable> getAcumulables() {
        return acumulables;
    }

    public void setAcumulables(HashSet<Acumulable> acumulables) {
        this.acumulables = acumulables;
    }

    public void addBeneficio(){

    }

    public Diana masPuntaje(){
        int aux=0;
        Diana dAux=null;
        for(Diana d : dianas){
            if(d.getPuntajes().size()>aux){
                aux=d.getPuntajes().size();
                dAux=d;
            }
        }
        return dAux;
    }

    public int noAcumulables(){
        /*int aux=0;
        for (Beneficio b : beneficios){
            if(b.getClass()== Trago.class){
                aux++;
            }
        }
        return aux;*/
        return beneficios.size()-acumulables.size();
    }
}
