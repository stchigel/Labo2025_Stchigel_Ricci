package unidad2;

import tiempo.Fecha;

import java.util.ArrayList;
import java.time.LocalDate;



public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private int edad;
    private ArrayList<Double> listaDeNotas;

    public Alumno(){
        this.nombre = "N/A";
        this.apellido = "N/A";
        this.fechaNacimiento = new Fecha(25, 12, 0);
        this.listaDeNotas = new ArrayList<Double>();
    }

    public Alumno(String nombre, String apellido, Fecha fechaNacimiento, ArrayList<Double> listaDeNotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.listaDeNotas = listaDeNotas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getfechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setfechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Double> getListaDeNotas() {
        return this.listaDeNotas;
    }

    public void setListaDeNotas(ArrayList<Double> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }

    public void agregarNota(Double nota){
        this.listaDeNotas.add(nota);
    }

    public Double menorNota(){
        Double menor=this.listaDeNotas.getFirst();
        for (Double aux : this.listaDeNotas){
            if (aux<menor){
                menor=aux;
            }
        }
        return menor;
    }

    public Double mayorNota(){
        Double mayor=this.listaDeNotas.getFirst();
        for (Double aux : this.listaDeNotas){
            if (aux>mayor){
                mayor=aux;
            }
        }
        return mayor;
    }

    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - this.fechaNacimiento.getAnio();
        if (hoy.getMonthValue() < this.fechaNacimiento.getMes() ||
                (hoy.getMonthValue() == this.fechaNacimiento.getMes() && hoy.getDayOfMonth() < this.fechaNacimiento.getDia())) {
            edad--;
        }
        return edad;
    }


    public static void main(String[] args) {
        Alumno stchigel = new Alumno();
        ArrayList<Double> ricciNotas = new ArrayList<Double>();
        ricciNotas.add(7.2);
        ricciNotas.add(6.5);
        ricciNotas.add(10.0);
        Alumno ricci = new Alumno("Benjamin", "Ricći", new Fecha(29, 02, 2008), ricciNotas);

        stchigel.setNombre("Nicóĺás");
        stchigel.agregarNota(10.0);
        stchigel.agregarNota(8.1);
        stchigel.agregarNota(6.7);

        System.out.println("La mejor nota de " + ricci.getNombre() + " es " + ricci.mayorNota());
        System.out.println("La peor nota de " + ricci.getNombre() + " es " + ricci.menorNota());

        System.out.println("La mejor nota de " + stchigel.getNombre() + " es " + stchigel.mayorNota());
        System.out.println("La peor nota de " + stchigel.getNombre() + " es " + stchigel.menorNota());
    }
}

