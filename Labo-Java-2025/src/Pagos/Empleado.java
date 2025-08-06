package Pagos;

import Bases.Persona;
import Vacunatorio.Ciudadano;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Empleado extends Persona{
    private TipoDiseñador TD;
    private HashMap<Proyecto, Double> proyectos;

    public Empleado(String nombre, String apellido, int edad, String direccion, TipoDiseñador TD) {
        super(nombre, apellido, edad, direccion);
        this.TD = TD;
        this.proyectos = new HashMap<>();
    }

    public Empleado() {
        super();
        this.TD = TipoDiseñador.IT;
        this.proyectos = new HashMap<>();
    }

    public TipoDiseñador getTD() {
        return TD;
    }

    public void setTD(TipoDiseñador TD) {
        this.TD = TD;
    }

    public HashMap<Proyecto, Double> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashMap<Proyecto, Double> proyectos) {
        this.proyectos = proyectos;
    }

    public void addProyecto(Proyecto p, Double s){
        proyectos.put(p, s);
    }

    //PUNTO 1
    public Double sueldoTotal(){
        Double total=0.0;
        for(Double p : proyectos.values()){
            total+=p;
        }
        total=(total + (total * (TD.getComision() /100)));
        return total;
    }

    //PUNTO 2
    public int cantProyectos(){
        return proyectos.size();
    }

    //PUNTO 3
    public Double cuantoGaneEnProyectoEspecifico(Proyecto proy){
        return proyectos.get(proy).doubleValue();
    }

    //PUNTO 4
    public HashMap infoProyecto(){
        HashMap<Proyecto, HashMap> proyectoInfo = new HashMap<>();

        for(Map.Entry<Proyecto, Double> valores : proyectos.entrySet()){
            HashMap<Double,Double>pagos=new HashMap<>();

            Proyecto p = valores.getKey();
            Double plata = valores.getValue();
            Double comision = plata*(TD.getComision() /100);

            pagos.put(plata,comision);
            proyectoInfo.put(p, pagos);
        }
        return proyectoInfo;
    }
}