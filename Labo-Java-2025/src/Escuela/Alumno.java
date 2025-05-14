package Escuela;

import tiempo.Fecha;
import Bases.Persona;

import java.util.ArrayList;
import java.time.LocalDate;



public class Alumno extends Persona {
    private Fecha fechaNacimiento;
    private ArrayList<Double> listaDeNotas;
    private ArrayList<Materia> materias;

    public Alumno(){
        super("N/A", "N/A");
        this.fechaNacimiento = new Fecha(25, 12, 0);
        this.listaDeNotas = new ArrayList<Double>();
        ArrayList<Materia> materias = new ArrayList<Materia>();
    }

    public Alumno(String nombre, String apellido, Fecha fechaNacimiento, ArrayList<Double> listaDeNotas) {
        super(nombre, apellido);
        this.fechaNacimiento = fechaNacimiento;
        this.listaDeNotas = listaDeNotas;
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

