package Ong;

import java.time.LocalDate;

public class Externo extends Persona{
    private Institucion institucion;

    public Externo(Institucion institucion) {
        super();
        this.institucion = new Institucion();
    }

    public Externo(String nombre, String apellido, LocalDate nacimiento, String direccion, int codigoPostal, boolean mensualidad, Institucion institucion) {
        super(nombre, apellido, nacimiento, direccion, codigoPostal, mensualidad);
        this.institucion = institucion;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
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
    }
}
