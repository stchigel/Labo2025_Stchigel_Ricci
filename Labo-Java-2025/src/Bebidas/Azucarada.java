package Bebidas;

public class Azucarada extends Bebida{
    int cantAzucar;

    public Azucarada() {
        super("N/A", 1, 0);
        this.cantAzucar = 0;
    }

    public Azucarada(String nombre, int positividad, int negatividad, int cantAzucar) {
        super(nombre, 1, cantAzucar*10);
        this.cantAzucar = cantAzucar;
    }

    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
        super.setNegatividad(cantAzucar*10);
    }
}
