package tiendaElectronica;

public class Television extends Producto{
    private Resolucion resolucion;
    static String nomCategoria = Categoria.MULTIMEDIA.name();

    public Television(){
        super(Categoria.MULTIMEDIA);
        resolucion=resolucion.NINGUNA;
    }

    public Television(String nombre, Double precio, int stock, Categoria categoria, Resolucion resolucion) {
        super(nombre, precio, stock, categoria);
        this.resolucion = resolucion;
    }

    public Resolucion getResolucion() {
        return resolucion;
    }

    public void setResolucion(Resolucion resolucion) {
        this.resolucion = resolucion;
    }
}
