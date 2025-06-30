package Bebidas;

public class Alcoholica extends Bebida{
    int cantAlcohol;

    public Alcoholica() {
        super("N/A", 1, 0);
        this.cantAlcohol = 0;
    }

    public Alcoholica(String nombre, int positividad, int negatividad, int cantAlcohol) {
        super(nombre, 0, cantAlcohol*20);
        this.cantAlcohol = cantAlcohol;
    }

    public int getCantAlcohol() {
        return cantAlcohol;
    }

    public void setCantAlcohol(int cantAlcohol) {
        this.cantAlcohol = cantAlcohol;
        super.setNegatividad(cantAlcohol*10);
    }
}
