package CosasTangibles.objetos;

public class Coche {
    private String marca;
    private String modelo;
    private Color color;
    private int velocidad;

    public Coche(){
        this.marca="N/A";
        this.modelo="N/A";
        this.color=Color.WHITE;
        this.velocidad=0;
    }

    public Coche(String marca, String modelo, Color color, int velocidad){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.velocidad=velocidad;
    }

    public String getMarca(){
        return this.marca;
    }

    public Color getColor() {
        return this.color;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setColor(Color color) {
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
        return this.velocidad;
    }

    public static void main(String[] args) {
        Coche c1 = new Coche("Volkswagen","Suran 2012", Color.RED, 7);
        System.out.println("Velocidad actual: " + c1.mostrarVelocidadActual());
        System.out.println("Acelero 5");
        c1.acelerar(5);
        System.out.println("Velocidad actual: " + c1.mostrarVelocidadActual());
        System.out.println("freno");
        c1.frenar();
        System.out.println("Velocidad actual: " + c1.mostrarVelocidadActual());
    }

}
