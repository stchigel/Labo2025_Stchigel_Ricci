package CosasTangibles.figuras_geometricas;

public class Rectangulo extends Forma {
    private double base;
    private double altura;

    public Rectangulo(){
        this.base=0;
        this.altura=0;
    }

    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }

    public void setBase(double base){
        this.base=base;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }

    public double calcArea(){
        return this.base*this.altura;
    }

    public double calcPerimetro(){
        return this.base*2+this.altura*2;
    }

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(3,5);

        System.out.println("base actual: "+r1.getBase());
        System.out.println("Altra actual: "+r1.getAltura());
        r1.setBase(6.5);
        System.out.println("Nueva base: "+r1.getBase());
        System.out.println("perim: "+r1.calcPerimetro());
        System.out.println("Area: "+r1.calcArea());
    }
}
