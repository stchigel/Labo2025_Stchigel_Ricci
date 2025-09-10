package Cursos.CursoRicci.ejercicio9caseStudy;

public class Empleado {
    private int identificador;
    private String nombre;
    private Double salario;

    public Empleado(int identificador, String nombre, Double salario) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado() {
        this.identificador = 0;
        this.nombre = "N/A";
        this.salario = 0.0;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado "+nombre + " id "+identificador+ " salario "+salario;
    }
}
