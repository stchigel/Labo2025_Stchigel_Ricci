package Calorias;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

public class Persona{
    private HashMap<Plato, Integer> platos;
    private String nombre;
    private LocalDate nacimiento;

    public Persona() {
        this.platos = new HashMap<>();
        this.nombre = "N/A";
        this.nacimiento = LocalDate.now();
    }

    public Persona(String nombre, LocalDate nacimiento) {
        this.platos = new HashMap<>();
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public Persona(HashMap<Plato, Integer> platos, String nombre, LocalDate nacimiento) {
        this.platos = platos;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public HashMap<Plato, Integer> getPlatos() {
        return platos;
    }

    public void setPlatos(HashMap<Plato, Integer> platos) {
        this.platos = platos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void addPlato(Plato p){
        if(platos.containsKey(p)){
            Integer orig = platos.get(p);
            platos.put(p, orig+1);
        } else {
            platos.put(p, 1);
        }

    }

    public int caloriasTotales(){
        int total=0;
        for (Map.Entry<Plato, Integer> entry : platos.entrySet()) {
            Plato p = entry.getKey();
            Integer c = entry.getValue();
            total += p.getCalorias()*c;
        }
        return total;
    }


}
