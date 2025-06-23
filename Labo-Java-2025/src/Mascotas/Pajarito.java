package Mascotas;

import Bases.Persona;

public class Pajarito extends Alegre{
    public Pajarito() {
        super();
    }

    public Pajarito(Persona duenio, String name) {
        super(duenio, name);
    }

    @Override
    public void Saludar(Persona saludador) {
        if(saludador==super.getDuenio()){
            if(getAlegria()==1){
                System.out.println("pio");
            } else {
                String sal = "";
                for(int i=0; i<getAlegria(); i++){
                    sal+="pio" + " ";
                }
                System.out.println(sal);
                setAlegria(getAlegria()-1);
            }
        } else {
            System.out.println("*silencio*");
        }
    }

    @Override
    public Tipo quienSoy() {
        return Tipo.PAJARITO;
    }
}
