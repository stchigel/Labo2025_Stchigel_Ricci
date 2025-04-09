package unidad1;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public Coche(){
        this.marca="N/A";
        this.modelo="N/A";
        this.color="N/A";
        this.velocidad=0;
    }

    public Coche(String mc, String md, String cl, int vl){
        this.marca=mc;
        this.modelo=md;
        this.color=cl;
        this.velocidad=vl;
    }

    public String getMarca(){
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar(int ac){
        this.velocidad+=ac;
    }

    public void frenar(){
        this.velocidad=0;
    }

    public int mostrarVelocidadActual(){
        return velocidad;
    }

}
