package Bastaricci;

import Bases.Persona;

import java.util.ArrayList;

public class Mesa {
    private int Numero;
    private int tamanio;
    private ArrayList<Persona>integrantes;
    private Double precio;

    public Mesa() {
        Numero = 0;
        this.integrantes = new ArrayList<>();
        this.tamanio = 10;
        this.precio=250000.0;
    }

    public Mesa(int numero, ArrayList<Persona> integrantes, int tamanio, Double precio) {
        Numero = numero;
        this.integrantes = integrantes;
        this.tamanio = tamanio;
        this.precio=precio;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public ArrayList<Persona> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Persona> integrantes) {
        this.integrantes = integrantes;
    }

    public void addIntegrantes(Persona p) {
        integrantes.add(p);
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double calcularPrecioPorPersona(){
        Double precioPersona=(precio/integrantes.size());
        return precioPersona;
    }
}
