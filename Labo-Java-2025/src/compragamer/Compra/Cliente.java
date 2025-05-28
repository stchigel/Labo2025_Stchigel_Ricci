package compragamer.Compra;

public class Cliente extends sistemaDePedidos.Persona{
    private String celular;

    public Cliente() {
        super();
        this.celular = "N/A";
    }

    public Cliente(String nombre, String apellido, String celular) {
        super(nombre, apellido);
        this.celular = celular;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
