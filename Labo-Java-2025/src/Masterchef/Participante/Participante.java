package Masterchef.Participante;

import Masterchef.Extra.Color;

import java.time.LocalDate;

public abstract class Participante {
    private String nombre;
    private String apellido;
    private LocalDate fn;
    private String localidad;
    private Color color;

    public Participante(String nombre, String apellido, LocalDate fn, String localidad, Color color) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fn = fn;
        this.localidad = localidad;
        this.color = color;
    }

    public Participante() {
        this.nombre = "N/A";
        this.apellido = "N/A";
        this.fn = LocalDate.now();
        this.localidad = "N/A";
        this.color = Color.AZUL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFn() {
        return fn;
    }

    public void setFn(LocalDate fn) {
        this.fn = fn;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void prepararLugarTrabajo();
}
