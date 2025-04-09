package unidad1;

public class Circulo {
    private double radio;

    public Circulo(){
        this.radio=2;
    }

    public Circulo(double rad){
        this.radio=rad;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double rad){
        this.radio=rad;
    }

    public double calcArea(){
        return Math.PI * (radio*radio);
    }

    public double calcPerimetro(){
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo(3);

        System.out.println("radio actual: "+c1.getRadio());
        c1.setRadio(4.5);
        System.out.println("Nuevo radio: "+c1.getRadio());
        System.out.println("perim: "+c1.calcPerimetro());
        System.out.println("Area: "+c1.calcArea());
    }
}
