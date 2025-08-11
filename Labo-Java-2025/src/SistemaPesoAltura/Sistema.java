package SistemaPesoAltura;

import tiempo.Fecha;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Humano> humanos;

    public Sistema() {
        this.humanos = new HashSet<>();
    }

    public Sistema(HashSet<Humano> humanos) {
        this.humanos = humanos;
    }

    public HashSet<Humano> getHumanos() {
        return humanos;
    }

    public void setHumanos(HashSet<Humano> humanos) {
        this.humanos = humanos;
    }

    //PUNTO 1
    public void alturaPesoFechaParticular(LocalDate fecha){
        for(Humano h : humanos){
            System.out.println(h.alturaPesoFecha(fecha));
        }
    }

    //PUNTO 2
    public void promedioEnAnio(int anio){
        for(Humano h : humanos){
            System.out.println(h.promAnio(anio));
        }
    }

    //PUNTO 3
    public void porcentajeCrecimiento(LocalDate f1, LocalDate f2){
        for(Humano h : humanos){
            System.out.println(h.porcCreci(f1,f2));
        }
    }
}
