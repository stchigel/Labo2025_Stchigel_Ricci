package SistemaPesoAltura;

import tiempo.Fecha;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Humano> humanos;

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
}
