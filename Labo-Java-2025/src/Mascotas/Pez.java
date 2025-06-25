package Mascotas;

import Bases.Persona;

public class Pez extends Mascota{
    private int vida;

    public Pez() {
        super();
        this.vida = 10;
    }

    public Pez(Persona duenio, String name) {
        super(duenio, name);
        this.vida = 10;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean esVivo(){
        if (vida<=0){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void Saludar(String saludador) {
        if(saludador==super.getDuenio().getNombre()){
            vida--;
        } else {
            vida=0;
            System.out.println("A la lobby malo de mierda");
        }
    }

    @Override
    public void Alimentar(){
        vida++;
    }

    @Override
    public Tipo quienSoy() {
        return Tipo.PEZ;
    }
}
