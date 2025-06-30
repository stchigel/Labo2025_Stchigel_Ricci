package Mascotas;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void matar(String mNom, String nomDuenio){
        for(Mascota m:mascotas){
            if(m.getName().equals(mNom)){
                if(m.getDuenio().getNombre().equals(nomDuenio)){
                    mascotas.remove(m);
                }
            }
        }
    }

    public void matar2(Mascota m){
        mascotas.remove(m);
    }

    public void crearMascota(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nomDue = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        String apeDue = scanner.nextLine();
        System.out.println("Ingrese su dirección");
        String dirDue = scanner.nextLine();

        Persona duenio = new Persona(nomDue, apeDue, dirDue);

        boolean nombre=false;
        int vecesUsado=0;
        String nomMas="";

        while(!nombre){
            System.out.println("Ingrese el nombre de su mascota");
            nomMas = scanner.nextLine();
            for (Mascota m : mascotas){
                if(m.getName().equals(nomMas)){
                    vecesUsado++;
                }
            }
            if(vecesUsado==0){
                nombre=true;
            } else {
                System.out.println("nombre no válido elija otro");
            }
        }

        System.out.println("Que tipo de mascota es?");
        System.out.println("1- Perro");
        System.out.println("2- Gato");
        System.out.println("3- Pez");
        System.out.println("4- Pajarito");
        System.out.println("5- Pajarito Cantor");

        int res = scanner.nextInt();

        switch (res) {
            case 1:
                mascotas.add(new Perro(duenio, nomMas));
                break;
            case 2:
                mascotas.add(new Gato(duenio, nomMas));
                break;
            case 3:
                mascotas.add(new Pez(duenio, nomMas));
                break;
            case 4:
                mascotas.add(new Pajarito(duenio, nomMas));
                break;
            case 5:
                System.out.println("Ingrese el canto de su pajaro");
                String canto = scanner.nextLine();
                mascotas.add(new Cantor(duenio, nomMas, canto));
                break;
            default:
                System.out.println("No válido");
                crearMascota();
        }
    }

    public void menuInicio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que quiere hacer?");
        System.out.println("1- Agregar tu mascota");
        System.out.println("2- Saludar a una mascota");
        System.out.println("3- Matar a tu mascota (borrarla)");

        int res = scanner.nextInt();

        String nomDue;
        String nomMas;

        switch (res) {
            case 1:
                crearMascota();
                break;
            case 2:
                System.out.println("Cual es tu nombre?");
                nomDue = scanner.nextLine();
                System.out.println("Cual es el nombre de la mascota?");
                nomMas = scanner.nextLine();
                saludo(nomMas, nomDue);
                break;
            case 3:
                System.out.println("Cual es tu nombre?");
                nomDue = scanner.nextLine();
                System.out.println("Cual es el nombre de la mascota?");
                nomMas = scanner.nextLine();
                matar(nomMas, nomDue);
                break;
            default:
                System.out.println("No válido");
                menuInicio();
        }
    }
}
