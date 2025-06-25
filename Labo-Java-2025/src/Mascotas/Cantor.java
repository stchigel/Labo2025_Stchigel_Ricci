package Mascotas;

import Bases.Persona;

public class Cantor extends Pajarito{
    private String canto;

    public Cantor() {
        super();
        this.canto = "pio";
    }

    public Cantor(Persona duenio, String name, String canto) {
        super(duenio, name);
        this.canto = canto;
    }

    @Override
    public void Saludar(String saludador) {
        if(saludador==super.getDuenio().getNombre()){
            System.out.println(canto);
        } else {
            System.out.println("*silencio*");
        }
    }
}
