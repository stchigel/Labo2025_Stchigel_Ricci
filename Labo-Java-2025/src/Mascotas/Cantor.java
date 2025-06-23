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
    public void Saludar(Persona saludador) {
        if(saludador==super.getDuenio()){
            System.out.println(canto);
        } else {
            System.out.println("*silencio*");
        }
    }
}
