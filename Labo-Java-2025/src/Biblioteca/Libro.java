package Biblioteca;

public class Libro {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private String archivo;
    private int disponible;

    public Libro() {
        this.titulo = "titulo";
        this.autor = new Autor();
        this.genero = Genero.AVENTURA;
        this.archivo = "archivo";
        this.disponible = 145;
    }

    public Libro(String titulo, Autor autor, Genero genero, String archivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.archivo = archivo;
        this.disponible = 145;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public boolean descargarLibro() throws LimiteDePrestamosAlcanzadoException {
        if(disponible>0){
            disponible--;
            return true;
        } else {
            throw new LimiteDePrestamosAlcanzadoException("No quedan suficientes copias de "+this.titulo);
        }
    }
}
