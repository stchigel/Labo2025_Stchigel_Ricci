package sistemaAlarma.Dispositivos;

import java.time.LocalDate;

public class SensorPresion extends Dispositivo {
    public SensorPresion() {
        super();
    }

    public SensorPresion(boolean estado, Double medida, Double umbralInicial, LocalDate anioAdquisicion) {
        super(estado, medida, umbralInicial, anioAdquisicion);
    }

    public void sensorActivado(){
        if(super.isEstado()){
            System.out.println("Sensor de presion activado");
        }
    }
}
