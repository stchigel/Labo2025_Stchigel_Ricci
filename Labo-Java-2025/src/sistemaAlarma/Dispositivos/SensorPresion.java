package sistemaAlarma.Dispositivos;

import java.time.LocalDate;

public class SensorPresion extends Dispositivo {
    public SensorPresion() {
        super();
    }

    public SensorPresion(Double medida, Double umbralInicial, LocalDate anioAdquisicion) {
        super(medida, umbralInicial, anioAdquisicion);
    }

    public void sensorActivado(){
            System.out.println("Sensor de presion activado");
    }
}
