package Biblioteca;

public enum Membresia{
    BRONCE(5), PLATA(15), ORO(30);
    int cantidad;

    Membresia(int cantidad) {
        this.cantidad = cantidad;
    }
}
