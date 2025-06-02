package sistemaAlarma.Dispositivos;

import java.time.LocalDate;

public class DetectorHumo extends Dispositivo {
    public DetectorHumo() {
        super();
    }

    public DetectorHumo(boolean estado, Double medida, Double umbralInicial, LocalDate anioAdquisicion) {
        super(estado, medida, umbralInicial, anioAdquisicion);
    }

    public void sensorActivado(){
            System.out.println("Humo en el edificio, llamen a los bomberos");
    }
}
