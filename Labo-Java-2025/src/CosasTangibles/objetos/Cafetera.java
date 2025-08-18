package CosasTangibles.objetos;

public class Cafetera {
    private float cantidadMaxima;
    private float cantidadActual;

    public Cafetera(){
        this.cantidadMaxima=1000;
        this.cantidadActual=0;
    }

    public Cafetera(float cantidadMaxima){
        this.cantidadMaxima=cantidadMaxima;
        this.cantidadActual=cantidadMaxima;
    }

    public Cafetera(float cantidadMaxima, float cantidadActual){
        this.cantidadMaxima=cantidadMaxima;
        if(cantidadActual<=cantidadMaxima){
            this.cantidadActual=cantidadActual;
        } else {
            this.cantidadActual=cantidadMaxima;
        }
    }

    public float getCantidadActual() {
        return this.cantidadActual;
    }

    public float getCantidadMaxima() {
        return this.cantidadMaxima;
    }

    public void setCantidadActual(float cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void setCantidadMaxima(float cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public void llenarCafetera(){
        this.cantidadActual=this.cantidadMaxima;
    }

    public void servirTaza(int capacidad){
        if(this.cantidadActual>=capacidad){
            this.cantidadActual-=capacidad;
        } else {
            this.cantidadActual=0;
        }
    }

    public void vaciarCafetera(){
        this.cantidadActual=0;
    }

    public void agregarCafe(int capacidad){
        if(this.cantidadActual+capacidad>this.cantidadMaxima){
            this.cantidadActual=this.cantidadMaxima;
        } else {
            this.cantidadActual+=capacidad;
        }
    }

    public static void main(String[] args) {
        Cafetera c1 = new Cafetera(1500);
        c1.servirTaza(250);
        System.out.println("Ahora tiene: " + c1.getCantidadActual());
        c1.vaciarCafetera();
        c1.agregarCafe(250);
        System.out.println("Ahora tiene: " + c1.getCantidadActual());
        c1.llenarCafetera();
        System.out.println("Ahora tiene: " + c1.getCantidadActual());
    }
}
