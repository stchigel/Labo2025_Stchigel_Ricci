package sistemaDePedidos;

public class Alumno extends Persona{
    private String division;

    public Alumno() {
        super();
        this.division = "N/A";
    }

    public Alumno(String nombre, String apellido, String division) {
        super(nombre, apellido);
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
