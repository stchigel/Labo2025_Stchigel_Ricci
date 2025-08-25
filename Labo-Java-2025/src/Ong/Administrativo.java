package Ong;

import java.time.LocalDate;

public class Administrativo extends Sueldados{
    private String computadora;
    private String usuario;
    private String contrasenia;

    public Administrativo() {
        super();
        this.computadora = "computadora";
        this.usuario = "usuario";
        this.contrasenia = "contrasenia";
    }


    public Administrativo(String nombre, String apellido, LocalDate nacimiento, String direccion, int codigoPostal, boolean mensualidad, Banco banco, LocalDate alta, String computadora, String usuario, String contrasenia) {
        super(nombre, apellido, nacimiento, direccion, codigoPostal, mensualidad, banco, alta);
        this.computadora = computadora;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getComputadora() {
        return computadora;
    }

    public void setComputadora(String computadora) {
        this.computadora = computadora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia)  throws Exception{
        boolean tieneMayuscula = false;
        boolean tieneEspecial = false;
        for (char c : contrasenia.toCharArray()) {
            if (Character.isUpperCase(c)) tieneMayuscula = true;
            else if (!Character.isLetterOrDigit(c)) tieneEspecial = true;
        }
        if(usuario.length()>=8 && tieneMayuscula && tieneEspecial){
            this.contrasenia = contrasenia;
        } else {
            throw new Exception("Contraseña no sigue el formato indicado");
        }
    }

    @Override
    public void accionSolidaria() {
        System.out.println("Soy solidario! Mi usuario: "+usuario+", mi nombre: "+super.getNombre());
    }
}
