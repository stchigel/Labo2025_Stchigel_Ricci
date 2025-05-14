package Medios;

import Bases.Persona;

import java.util.Scanner;

public class Cancion {
    private String titulo;
    private Persona autor;

    public Cancion(){
        this.titulo="";
        this.autor= new Persona();
    }

    public Cancion(String titulo, Persona autor){
        this.titulo=titulo;
        this.autor=autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Persona getAutor() {
        return this.autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static void main(String[] args) {
        String t="";
        Persona a=new Persona();
        Cancion c1 = new Cancion();
        Scanner e=new Scanner(System.in);
        System.out.println("Ingrese nombre de la canción: ");
        t=e.nextLine();
        System.out.println("Ingrese nombre del/la autor/a: ");
        a.setNombre(e.nextLine());
        c1.setAutor(a);
        c1.setTitulo(t);

        System.out.println("Ahora reproduciendo '"+c1.getTitulo()+"' de "+c1.getAutor().getNombre());
    }
}
