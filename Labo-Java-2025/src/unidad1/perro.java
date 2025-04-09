package unidad1;

public class perro {
    private String nombre;
    private String raza;
    private int edad;
    private String color;
    public perro(){
        this.nombre = "Lola";
        this.raza = "Caniche";
        this.edad = 1;
        this.color = "Blanco";
    }
    public perro(String nombre, String raza, int edad, String color){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }
}
