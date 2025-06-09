package tiendaElectronica;

public enum Resolucion {
    ULTRAHD("Ultra-Hd", 3840, 2160),
    CUATROK("4K", 4096, 2160),
    FULLHD("Full-Hd", 1920, 1080),
    NINGUNA("N/A",0,0);



    private String nombre;
    private int ancho;
    private int alto;

    private Resolucion(String nombre, int ancho, int alto){
        nombre=nombre;
        ancho=ancho;
        alto=alto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }
}
