package ArcoFlecha;

public abstract class Beneficio {
    private String creador;
    private String nombre;

    public Beneficio() {
        this.creador = "creador";
        this.nombre = "nombre";
    }

    public Beneficio(String creador, String nombre) {
        this.creador = creador;
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
