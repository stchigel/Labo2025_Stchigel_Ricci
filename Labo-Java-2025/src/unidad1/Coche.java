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

    public static void main(String[] args) {
        Coche c1 = new Coche("Volkswagen","Suran 2012", "Rojo", 7);
        System.out.println("Velocidad actual: " + c1.mostrarVelocidadActual());
        System.out.println("Acelero 5");
        c1.acelerar(5);
        System.out.println("Velocidad actual: " + c1.mostrarVelocidadActual());
        System.out.println("freno");
        c1.frenar();
        System.out.println("Velocidad actual: " + c1.mostrarVelocidadActual());
    }

}
