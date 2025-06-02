package ControlDeLlamadas;

import java.time.LocalDate;

public class Llamada {
    private Empleado origen;
    private Empleado destino;
    private LocalDate fecha;
    private Double duracion;

    public Llamada() {
        this.origen = new Empleado();
        this.destino = new Empleado();
        this.fecha = LocalDate.now();
        this.duracion = duracion;
    }

    public Llamada(Empleado origen, Empleado destino, LocalDate fecha, Double duracion) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public Empleado getOrigen() {
        return origen;
    }

    public void setOrigen(Empleado origen) {
        this.origen = origen;
    }

    public Empleado getDestino() {
        return destino;
    }

    public void setDestino(Empleado destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public void mostrarLlamada(){
        System.out.println("Número origen: "+origen.getTelefono()+" Numero destino: "+destino.getTelefono()+" fecha: "+fecha+" duracion: "+duracion);
    }
}
