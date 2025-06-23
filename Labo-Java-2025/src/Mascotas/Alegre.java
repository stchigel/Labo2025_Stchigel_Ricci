package Mascotas;

import Bases.Persona;

public abstract class Alegre extends Mascota{
    private int Alegria;

    public Alegre() {
        super();
        Alegria=0;
    }

    public Alegre(Persona duenio, String name) {
        super(duenio, name);
        Alegria=0;
    }

    public int getAlegria() {
        return Alegria;
    }

    public void setAlegria(int alegria) {
        Alegria = alegria;
    }

    @Override
    public void Alimentar(){
        Alegria++;
    }
}
