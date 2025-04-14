package unidad1;

public class Cafetera {
    private float cantidadMaxima;
    private float cantidadActual;

    public Cafetera(){
        this.cantidadMaxima=1000;
        this.cantidadActual=0;
    }

    public Cafetera(float max){
        this.cantidadMaxima=max;
        this.cantidadActual=max;
    }

    public Cafetera(float max, float act){
        this.cantidadMaxima=max;
        if(act<=max){
            this.cantidadActual=act;
        } else {
            this.cantidadActual=max;
        }
    }

    public float getCantidadActual() {
        return cantidadActual;
    }

    public float getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadActual(float cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void setCantidadMaxima(float cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public void llenarCafetera(){
        this.cantidadActual=cantidadMaxima;
    }

    public void servirTaza(int capacidad){
        if(cantidadActual>=capacidad){
            this.cantidadActual-=capacidad;
        } else {
            this.cantidadActual=0;
        }
    }

    public void vaciarCafetera(){
        this.cantidadActual=0;
    }

    public void agregarCafe(int capacidad){
        if(cantidadActual+capacidad>cantidadMaxima){
            this.cantidadActual=cantidadMaxima;
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
