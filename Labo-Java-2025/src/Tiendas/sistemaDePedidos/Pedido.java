package Tiendas.sistemaDePedidos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido{
    /*Al registrar un pedido, incluir fecha de creación, plato, solicitante, hora de entrega y estado de entrega.*/
    private LocalDate creacion;
    private Plato plato;
    private Persona solicitante;
    private LocalTime hora;
    private String estado;

    public Pedido() {
        this.creacion = LocalDate.now();
        this.plato = new Plato();
        this.solicitante = new Persona();
        this.hora = LocalTime.now();
        this.estado = "No existe";
    }

    public Pedido(LocalDate creacion, Plato plato, Persona solicitante, LocalTime hora, String estado) {
        this.creacion = creacion;
        this.plato = plato;
        this.solicitante = solicitante;
        this.hora = hora;
        this.estado = estado;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double calcularPrecio(){
        if(this.solicitante instanceof Profesor){
            return this.plato.getPrecio()-this.plato.getPrecio()*((Profesor) this.solicitante).getDescuento();
        } else {
            return this.plato.getPrecio();
        }
    }
}
