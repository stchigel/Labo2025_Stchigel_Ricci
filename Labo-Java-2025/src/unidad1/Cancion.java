package unidad1;

import java.util.Scanner;

public class Cancion {
    private String titulo;
    private String autor;

    public Cancion(){
        this.titulo="";
        this.autor="";
    }

    public Cancion(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static void main(String[] args) {
        String t="";
        String a="";
        Cancion c1 = new Cancion();
        Scanner e=new Scanner(System.in);
        System.out.println("Ingrese nombre de la canción: ");
        t=e.nextLine();
        System.out.println("Ingrese nombre del/la autor/a: ");
        a=e.nextLine();
        c1.setAutor(a);
        c1.setTitulo(t);

        System.out.println("Ahora reproduciendo '"+c1.getTitulo()+"' de "+c1.getAutor());
    }
}
