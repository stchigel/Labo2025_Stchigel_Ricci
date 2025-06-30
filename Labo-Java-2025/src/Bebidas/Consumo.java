package Bebidas;

public class Consumo {
    int cant;
    Bebida bebida;

    public Consumo() {
        this.cant = 0;
        this.bebida = null;
    }

    public Consumo(int cant, Bebida bebida) {
        this.cant = cant;
        this.bebida = bebida;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
}
