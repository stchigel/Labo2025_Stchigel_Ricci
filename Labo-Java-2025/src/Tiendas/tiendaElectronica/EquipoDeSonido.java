package Tiendas.tiendaElectronica;

public class EquipoDeSonido extends Producto{
    private boolean bluetooth;
    static String nomCategoria = Categoria.MULTIMEDIA.name();

    public EquipoDeSonido() {
        super(Categoria.MULTIMEDIA);
        this.bluetooth = false;
    }

    public EquipoDeSonido(String nombre, Double precio, int stock, boolean bluetooth) {
        super(nombre, precio, stock, Categoria.MULTIMEDIA);
        this.bluetooth = bluetooth;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}
