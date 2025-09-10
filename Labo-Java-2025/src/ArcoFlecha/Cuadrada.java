package ArcoFlecha;

import java.util.HashMap;

public class Cuadrada extends Diana{
    private Double lado;

    public Cuadrada() {
        super();
        this.lado = 0.0;
    }

    public Cuadrada(String nombre, Dificultad dificultad, HashMap<Integer, Color> puntajes, Double lado) {
        super(nombre, dificultad, puntajes);
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    Double calcularArea() {
        return lado*lado;
    }
}
