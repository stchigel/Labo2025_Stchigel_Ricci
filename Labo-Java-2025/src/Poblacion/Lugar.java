package Poblacion;

public abstract class Lugar {
    private String nombre;
    private int codigo;
    private double latitud;
    private double longitud;

    public Lugar() {
        this.nombre = "nombre";
        this.codigo = 0;
        this.latitud = 0.0;
        this.longitud = 0.0;
    }

    public Lugar(String nombre, int codigo, double latitud, double longitud) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public abstract int getPoblacion();
}
