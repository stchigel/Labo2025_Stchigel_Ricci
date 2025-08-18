package Biblioteca;

import java.time.LocalDate;

public class Usuario extends Persona{
    private String mail;
    private Membresia membresia;
    private int cupo;

    public Usuario() {
        super();
        this.mail = "mail@mail.mail";
        this.membresia = Membresia.BRONCE;
        this.cupo = Membresia.BRONCE.cantidad;
    }

    public Usuario(String nombre, LocalDate nacimiento, int dni, String mail, Membresia membresia) {
        super(nombre, nacimiento, dni);
        this.mail = mail;
        this.membresia = membresia;
        this.cupo = membresia.cantidad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public boolean prestarLibro() throws MembresiaException {
        if(cupo>0){
            cupo--;
            return true;
        } else {
            throw new MembresiaException("No quedan suficiente cupo para la cuenta "+this.mail);
        }
    }
}
