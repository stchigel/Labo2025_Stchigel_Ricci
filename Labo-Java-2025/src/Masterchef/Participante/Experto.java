package Masterchef.Participante;

import Masterchef.Excepciones.NoAlcanzaTiempo;
import Masterchef.Extra.Color;
import Masterchef.Extra.Entrada;
import Masterchef.Extra.Principal;
import Masterchef.Plato.PlatoE;
import Masterchef.Plato.PlatoP;

import java.time.LocalDate;

public class Experto extends Participante implements Entrada, Principal{
    private Double tiempoParaCocinar;

    public Experto(String nombre, String apellido, LocalDate fn, String localidad, Color color) {
        super(nombre, apellido, fn, localidad, color);
        this.tiempoParaCocinar = 80.0;
    }

    public Experto() {
        super();
        this.tiempoParaCocinar = 80.0;
    }

    public Double getTiempoParaCocinar() {
        return tiempoParaCocinar;
    }

    public void setTiempoParaCocinar(Double tiempoParaCocinar) {
        this.tiempoParaCocinar = tiempoParaCocinar;
    }

    @Override
    void prepararLugarTrabajo() {
        tiempoParaCocinar-=5.0;
        System.out.println("Perdi 5 minutos preparando la mesa, mi tiempo restante es " + tiempoParaCocinar + " minutos");
    }

    @Override
    public void prepararEntrada(PlatoE plato) {
        prepararLugarTrabajo();
        try {
            if(tiempoParaCocinar < plato.tiempoPreparacion()){
                throw new NoAlcanzaTiempo("No tenes el tiempo suficiente para cocinar este plato");
            }
            else{
                tiempoParaCocinar-= plato.tiempoPreparacion();
                System.out.println("Plato cocinado con exito");
            }
        } catch (NoAlcanzaTiempo e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void prepararPlatoPrincipal(PlatoP plato) {
        prepararLugarTrabajo();
        try {
            if(tiempoParaCocinar < plato.tiempoPreparacion()){
                throw new NoAlcanzaTiempo("No tenes el tiempo suficiente para cocinar este plato");
            }
            else{
                tiempoParaCocinar-= plato.tiempoPreparacion();
                System.out.println("Plato cocinado con exito");
            }
        } catch (NoAlcanzaTiempo e) {
            throw new RuntimeException(e);
        }
    }
}
