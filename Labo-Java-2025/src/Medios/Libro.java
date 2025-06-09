package Medios;

import tiempo.Fecha;
import Bases.Persona;

public class Libro {
    public enum Editorial {
        KAPELUSZ, SUDAMERICANA, ATLANTIDA, EL_ATENEO, INTERZONA, SUR, ALIANZA
        }
    private String titulo;
    private Persona autor;
    private int ISBN;
    private int paginas;
    private Editorial editorial;
    private Fecha fechaPublicacion;

    public Libro(){
        this.titulo="N/A";
        this.autor = new Persona();
        this.ISBN=0;
        this.paginas=0;
        this.editorial=Editorial.SUR;
        this.fechaPublicacion= new Fecha();
    }

    public Libro(String titulo, Persona autor, int ISBN, int paginas, Editorial editorial, Fecha fechaPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
        this.paginas=paginas;
        this.editorial=editorial;
        this.fechaPublicacion=fechaPublicacion;
    }

    public Libro(String titulo, String nm, int ed, String dr, int ISBN, int paginas, Editorial editorial, int d, int m, int a){
        this.titulo=titulo;
        this.autor=new Persona(nm, ed, dr);
        this.ISBN=ISBN;
        this.paginas=paginas;
        this.editorial=editorial;
        this.fechaPublicacion=new Fecha(d, m, a);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Persona getAutor() {
        return this.autor;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public Editorial getEditorial() {
        return this.editorial;
    }

    public String getEditorialNombre() {
        return this.editorial.name();
    }

    public Fecha getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean menorQue (Libro libro){
            if (this.getFechaPublicacion().getAnio() > libro.getFechaPublicacion().getAnio()) {
                return false;
            } else if (this.getFechaPublicacion().getAnio() < libro.getFechaPublicacion().getAnio()) {
                return true;
            } else if (this.getFechaPublicacion().getMes() > libro.getFechaPublicacion().getMes()) {
                return false;
            } else if (this.getFechaPublicacion().getMes() < libro.getFechaPublicacion().getMes()) {
                return true;
            } else if (this.getFechaPublicacion().getDia() > libro.getFechaPublicacion().getDia()) {
                return false;
            } else if (this.getFechaPublicacion().getDia() < libro.getFechaPublicacion().getDia()) {
                return true;
            } else {
                return false;
            }
    }

    public static void main(String[] args) {
        Persona autor = new Persona("Edgar Alan Poe", 87, "El mcdonalds de walmart");
        Fecha fechaPublicacion = new Fecha(13, 07, 1983);
        Libro l1 = new Libro("El Libro Troll", autor, 1829289434, 325, /*"MasivoBro Publicaciones"*/ Editorial.KAPELUSZ, fechaPublicacion);
        System.out.println(l1.getTitulo() + " de " + l1.getAutor().getNombre());

        Libro l2 = new Libro("El libro Troll 2", "Dante", 3457, "España", 23452343, 32, Editorial.SUDAMERICANA/*"1xBet"*/, 13, 25, 1984);

        System.out.println("Fue " + l2.getTitulo() + " publicado después que " + l1.getTitulo() + "? " + l1.menorQue(l2));
    }
}
