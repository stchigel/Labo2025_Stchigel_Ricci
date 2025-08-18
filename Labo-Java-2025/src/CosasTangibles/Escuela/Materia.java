/*package CosasTangibles.Escuela;

import java.util.ArrayList;


public class Materia {
    private String nombre;
    private ArrayList<String> Contenidos;
    private ArrayList<Alumno> alumnosInscriptos;
    private ArrayList<Double> notas;

    public Materia(){
        this.nombre = "N/A";
        this.Contenidos = new ArrayList<String>();
        this.alumnosInscriptos = new ArrayList<Alumno>();
    }

    public Materia(String nombre, ArrayList<String> Contenidos, ArrayList<Alumno> alumnosInscriptos){
        this.nombre = nombre;
        this.Contenidos = Contenidos;
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getContenidos() {
        return this.Contenidos;
    }

    public void setContenidos(ArrayList<String> contenidos) {
        Contenidos = contenidos;
    }

    public ArrayList<Alumno> getAlumnosInscriptos() {
        return this.alumnosInscriptos;
    }

    public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public ArrayList<Double> getNotas() {
        return this.notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public float promedioEdad(){
        int suma=0;
        int cant=0;
        for (Alumno alumno : this.alumnosInscriptos){
            suma+=alumno.calcularEdad();
            cant++;
        }
        return (float) suma/cant;
    }

    public float promedioNotasAlumno() {
        float aux = 0;
        ArrayList<Float> promedios = new ArrayList<Float>();
        int cant = 0;
            for (Double notasAux : this.notas) {
                aux += notasAux;
                cant++;
            }
        return aux / cant;
    }

    public void agregarMateria(ArrayList<Materia> materias){
        materias. add(new Materia());
    }

    public static void main(String[] args) {
        ArrayList<Materia> materias = new ArrayList<Materia>();
    }
}*/