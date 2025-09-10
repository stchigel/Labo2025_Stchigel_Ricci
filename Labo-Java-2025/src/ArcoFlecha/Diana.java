package ArcoFlecha;

import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private Dificultad dificultad;
    private HashMap<Integer, Color> puntajes;

    public Diana() {
        this.nombre = "nombre";
        this.dificultad = Dificultad.FACIL;
        this.puntajes = new HashMap<>();
    }

    public Diana(String nombre, Dificultad dificultad, HashMap<Integer, Color> puntajes) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.puntajes = puntajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public HashMap<Integer, Color> getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(HashMap<Integer, Color> puntajes) {
        this.puntajes = puntajes;
    }

    abstract Double calcularArea();
}
