package Animales.Mascotas;

import Bases.Persona;

public abstract class Mascota {
    private Persona duenio;
    private String name;

    public Mascota() {
        this.duenio = new Persona();
        this.name = "N/A";
    }

    public Mascota(Persona duenio, String name) {
        this.duenio = duenio;
        this.name = name;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void Saludar(String saludador);
    public abstract void Alimentar();
    public abstract Tipo quienSoy();
}
