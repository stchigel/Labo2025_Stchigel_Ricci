package ArcoFlecha;

import java.util.HashMap;

public class Rectangular extends Diana{
    private Double base;
    private Double altura;

    public Rectangular() {
        super();
        this.base = 0.0;
        this.altura = 0.0;
    }

    public Rectangular(String nombre, Dificultad dificultad, HashMap<Integer, Color> puntajes, Double base, Double altura) {
        super(nombre, dificultad, puntajes);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    Double calcularArea() {
        return base*altura;
    }
}
