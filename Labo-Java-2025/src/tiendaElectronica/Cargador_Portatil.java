package tiendaElectronica;

public class Cargador_Portatil extends Producto{
    private int cantCargas;

    public Cargador_Portatil(){
        super("Cargador portatil", 47.0, 345, Categoria.CARGADORES);
    }

    public Cargador_Portatil(String nombre, Double precio, int stock, Categoria categoria, int cantCargas) {
        super(nombre, precio, stock, categoria);
        this.cantCargas = cantCargas;
    }

    public int getCantCargas() {
        return cantCargas;
    }

    public void setCantCargas(int cantCargas) {
        this.cantCargas = cantCargas;
    }
}
