package unidad1;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(){
        this.base=0;
        this.altura=0;
    }

    public Rectangulo(double b, double a){
        this.base=b;
        this.altura=a;
    }

    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }

    public void setBase(double b){
        this.base=b;
    }
    public void setAltura(double a){
        this.altura=a;
    }

    public double calcArea(){
        return base*altura;
    }

    public double calcPerimetro(){
        return base*2+altura*2;
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
