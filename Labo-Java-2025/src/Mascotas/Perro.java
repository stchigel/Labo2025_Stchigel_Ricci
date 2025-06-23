package Mascotas;

import Bases.Persona;

public class Perro extends Alegre{
    public Perro() {
        super();
    }

    public Perro(Persona duenio, String name) {
        super(duenio, name);
    }

    @Override
    public void Saludar(Persona saludador) {
        if(saludador==super.getDuenio()){
            if(getAlegria()==1){
                System.out.println("guau");
            } else {
                String sal = "";
                for(int i=0; i<getAlegria(); i++){
                    sal+="guau" + " ";
                }
                System.out.println(sal);
                setAlegria(getAlegria()-1);
            }
        } else {
            System.out.println("GUAU!");
        }
    }

    @Override
    public Tipo quienSoy() {
        return Tipo.PERRO;
    }
}
