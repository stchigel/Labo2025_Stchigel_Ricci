package sistemaAlarma.Dispositivos;

import java.time.LocalDate;

public class SensorTemperatura extends Dispositivo {
    public SensorTemperatura() {
        super();
    }

    public SensorTemperatura(Double medida, Double umbralInicial, LocalDate anioAdquisicion) {
        super(medida, umbralInicial, anioAdquisicion);
    }

    public void sensorActivado(){
            System.out.println("Cuidado, la temperatura sube");
    }
    /*freed form desire, mind and sense are purified*/
}
