package Prestamos;

import java.time.LocalDate;

public abstract class Publicacion {
    private String titulo;
    private String autor;
    private LocalDate publicacion;

    public Publicacion() {
        this.titulo = "titulo";
        this.autor = "autor";
        this.publicacion = LocalDate.now();
    }

    public Publicacion(String titulo, String autor, LocalDate publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(LocalDate publicacion) {
        this.publicacion = publicacion;
    }
}
