package sistemaDePedidos;

import tiempo.Fecha;

public class Pedido{
    /*Al registrar un pedido, incluir fecha de creación, plato, solicitante, hora de entrega y estado de entrega.*/
    private Fecha creacion;
    private Plato plato;
    private Persona solicitante;
    private int hora;
    private String estado;

    public Pedido() {
        this.creacion = new Fecha(0, 0, 0);
        this.plato = new Plato();
        this.solicitante = new Persona();
        this.hora = 0;
        this.estado = "No existe";
    }

    public Pedido(Fecha creacion, Plato plato, Persona solicitante, int hora, String estado) {
        this.creacion = creacion;
        this.plato = plato;
        this.solicitante = solicitante;
        this.hora = hora;
        this.estado = estado;
    }

    public Fecha getCreacion() {
        return creacion;
    }

    public void setCreacion(Fecha creacion) {
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

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
