package EleccionesOctober.Ave_Paloma;

import CosasTangibles.objetos.Color;
import EleccionesOctober.Bases_Y_Funcionamiento.Enviadores;

public class Paloma extends Aviador implements Enviadores {
    private Boolean aprendioAvolar;

    public Paloma(Color color, String nombre, String especie, Boolean aprendioAvolar) {
        super(color, nombre, especie);
        this.aprendioAvolar = aprendioAvolar;
    }

    public Paloma() {
        super();
        this.aprendioAvolar = false;
    }

    public Boolean getAprendioAvolar() {
        return aprendioAvolar;
    }

    public void setAprendioAvolar(Boolean aprendioAvolar) {
        this.aprendioAvolar = aprendioAvolar;
    }

    @Override
    public void enviarMensaje(String mensajeBase) {
        if(getAprendioAvolar()){
            System.out.println("Lanzando un papelito que dice: "+mensajeBase);
        }
    }
}
