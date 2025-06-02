package sistemaAlarma.Dispositivos;

import java.util.ArrayList;

public class SensorCompuesto {
    ArrayList<Dispositivo> dispositivos;
    private Double umbralInicial;

    public SensorCompuesto() {
        this.dispositivos = new ArrayList<>();
        this.umbralInicial = 0.0;
    }

    public SensorCompuesto(ArrayList<Dispositivo> dispositivos, Double umbralInicial) {
        this.dispositivos = dispositivos;
        this.umbralInicial = umbralInicial;
    }

    public Double sumaDisp(){
        Double aux=0.0;
        for (Dispositivo dispositivo : dispositivos){
            aux+=dispositivo.getMedida();
        }
        return aux;
    }

    public void calcularUmbral(){
        if((sumaDisp()/3)>umbralInicial){
            System.out.println("Alarma compuesta activada, Evacuar");
        }
    }
}
