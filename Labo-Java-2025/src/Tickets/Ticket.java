package Tickets;

import Bases.Persona;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Ticket {
    private Persona cliente;
    private ArrayList<Persona> desarolladores;
    private String descripcion;
    private LocalDateTime creacion;
    private LocalDateTime finalizacion;
    private ArrayList<String> comentarios;
    private Estado estado;

    public Ticket() {
        this.cliente = new Persona();
        this.desarolladores = new ArrayList<>();
        this.descripcion = "descripcion";
        this.creacion = LocalDateTime.now();
        this.finalizacion = LocalDateTime.now();
        this.comentarios = new ArrayList<>();
        this.estado = Estado.ABIERTO;
    }

    public Ticket(Persona cliente, ArrayList<Persona> desarolladores, String descripcion, LocalDateTime creacion, LocalDateTime finalizacion, ArrayList<String> comentarios, Estado estado) {
        this.cliente = cliente;
        this.desarolladores = desarolladores;
        this.descripcion = descripcion;
        this.creacion = creacion;
        this.finalizacion = finalizacion;
        this.comentarios = comentarios;
        this.estado = estado;
    }

    public Ticket(Persona cliente, String descripcion, LocalDateTime finalizacion) {
        this.cliente = cliente;
        this.desarolladores = new ArrayList<>();
        this.descripcion = descripcion;
        this.creacion = LocalDateTime.now();
        this.finalizacion = finalizacion;
        this.comentarios = new ArrayList<>();
        this.estado = Estado.ABIERTO;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Persona> getDesarolladores() {
        return desarolladores;
    }

    public void setDesarolladores(ArrayList<Persona> desarolladores) {
        this.desarolladores = desarolladores;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDateTime creacion) {
        this.creacion = creacion;
    }

    public LocalDateTime getFinalizacion() {
        return finalizacion;
    }

    public void setFinalizacion(LocalDateTime finalizacion) {
        this.finalizacion = finalizacion;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
            this.estado = estado;
    }

    public void comentar(String comentario){
        comentarios.add(comentario);
    }

    public abstract boolean resolver();

}
