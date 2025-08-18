package Animales.Mascotas;

import Bases.Persona;

public class Gato extends Alegre{
    public Gato() {
        super();
    }

    public Gato(Persona duenio, String name) {
        super(duenio, name);
    }

    @Override
    public void Saludar(String saludador) {
        if(saludador==super.getDuenio().getNombre()){
            if(getAlegria()==1){
                System.out.println("miau");
            } else {
                String sal = "";
                for(int i=0; i<getAlegria(); i++){
                    sal+="miau" + " ";
                }
                System.out.println(sal);
                setAlegria(getAlegria()-1);
            }
        } else {
            System.out.println("MIAU!");
        }
    }

    @Override
    public Tipo quienSoy() {
        return Tipo.GATO;
    }
}
