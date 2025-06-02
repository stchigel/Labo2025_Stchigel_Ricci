package sistemaAlarma.Dispositivos;

import java.time.LocalDate;

public class SensorTemperatura extends Dispositivo {
    public SensorTemperatura() {
        super();
    }

    public SensorTemperatura(boolean estado, Double medida, Double umbralInicial, LocalDate anioAdquisicion) {
        super(estado, medida, umbralInicial, anioAdquisicion);
    }

    public void TemperaturaSube(){
        if(super.isEstado()) {
            System.out.println("Cuidado, la temperatura sube");
        }
    }
    /*freed form desire, mind and sense are purified*/
}
