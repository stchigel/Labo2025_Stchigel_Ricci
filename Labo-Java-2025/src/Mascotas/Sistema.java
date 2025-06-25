package Mascotas;

import java.util.ArrayList;

import Bases.Persona;

public class Sistema {
    ArrayList<Mascota> mascotas;
    Persona Paux=new Persona();

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void addMascota(Mascota mascota){
        mascotas.add(mascota);
    }

    public void saludo(String nomMas, String nomDuenio){
       for(Mascota m:mascotas){
            if(m.getName().equals(nomMas)){
                m.Saludar(nomDuenio);
            }
       }
    }

    public void Matar1(String mNom){
        for(Mascota m:mascotas){
            if(m.getName().equals(mNom)){
                mascotas.remove(m);
            }
        }
    }

    public void Matar2(Mascota m){
        mascotas.remove(m);
    }

    public void irme_a_NON(Mesa mesa, Persona p){
        if(mesa.getTamanio()-mesa.getIntegrantes().size()>0){
            mesa.addIntegrantes(p);
            System.out.println("Agregado exitosamente, tendra que pagar "
            + mesa.calcularPrecioPorPersona() +", disfrute su noche");
        }
        else{
            System.out.println("No hay mas espacio");
        }
    }



    public void menuInicio(){
        System.out.println("Que quiere hacer?");
        System.out.println("1- Agregar tu mascota");
        System.out.println("2- Saludar a una mascota");
        System.out.println("3- Matar a tu mascota (borrarla)");
    }
}
