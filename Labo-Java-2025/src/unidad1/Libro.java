package unidad1;

public class Libro {
    private String titulo;
    private Persona autor;
    private int ISBN;
    private int paginas;
    private String editorial;
    private Fecha fechaPublicacion;

    public Libro(){
        this.titulo="N/A";
        this.autor = new Persona();
        this.ISBN=0;
        this.paginas=0;
        this.editorial="N/A";
        this.fechaPublicacion= new Fecha();
    }

    public Libro(String titulo, Persona autor, int ISBN, int paginas, String editorial, Fecha fechaPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
        this.paginas=paginas;
        this.editorial=editorial;
        this.fechaPublicacion=fechaPublicacion;
    }

    public Libro(String titulo, String nm, int ed, String dr, int ISBN, int paginas, String editorial, int d, int m, int a){
        this.titulo=titulo;
        this.autor=new Persona(nm, ed, dr);
        this.ISBN=ISBN;
        this.paginas=paginas;
        this.editorial=editorial;
        this.fechaPublicacion=new Fecha(d, m, a);
    }

    public String getTitulo() {
        return titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
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

    public void setEditorial(String editorial) {
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
        Libro l1 = new Libro("El Libro Troll", autor, 1829289434, 325, "MasivoBro Publicaciones", fechaPublicacion);
        System.out.println(l1.getTitulo() + " de " + l1.getAutor().getNombre());
    }
}
