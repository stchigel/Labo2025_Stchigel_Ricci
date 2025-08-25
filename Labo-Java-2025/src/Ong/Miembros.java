package Ong;

import java.time.LocalDate;

public class Miembros extends Persona{
    private int puntos;

    public Miembros() {
        super();
        this.puntos = 0;
    }

    public Miembros(String nombre, String apellido, LocalDate nacimiento, String direccion, int codigoPostal, boolean mensualidad) {
        super(nombre, apellido, nacimiento, direccion, codigoPostal, mensualidad);
        this.puntos = 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public void accionSolidaria() {
        System.out.println(" ____________________");
        System.out.println("/  ofrezco mi ayuda   \\");
        System.out.println("!     para los que    !");
        System.out.println("!     la necesiten    !");
        System.out.println("\\____________________/");
        System.out.println("         !  !");
        System.out.println("         !  !");
        System.out.println("         L_ !");
        System.out.println("        / _ )!");
        System.out.println("       / /__L");
        System.out.println(" _____/ (____)");
        System.out.println("        (____)");
        System.out.println(" _____  (____)");
        System.out.println("      \\_(____)");
        System.out.println("         !  !");
        System.out.println("         !  !");
        System.out.println("         \\__/");
        puntos++;
    }
}
