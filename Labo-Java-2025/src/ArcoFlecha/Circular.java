package ArcoFlecha;

import java.util.HashMap;

public class Circular extends Diana{
    private Double radio;

    public Circular() {
        super();
        this.radio = 0.0;
    }

    public Circular(String nombre, Dificultad dificultad, HashMap<Integer, Color> puntajes, Double radio) {
        super(nombre, dificultad, puntajes);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    Double calcularArea() {
        return Math.PI * radio * radio;
    }
}
