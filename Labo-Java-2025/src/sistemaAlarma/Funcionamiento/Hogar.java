package sistemaAlarma.Funcionamiento;

import sistemaAlarma.Dispositivos.DetectorHumo;
import sistemaAlarma.Dispositivos.SensorPresion;
import sistemaAlarma.Dispositivos.SensorTemperatura;

public class Hogar {
    private String direccion;
    private DetectorHumo humo;
    private SensorPresion presion;
    private SensorTemperatura temperatura;

    public Hogar() {
        this.direccion = "Sarmiento 1662";
        this.humo = new DetectorHumo();
        this.presion = new SensorPresion();
        this.temperatura = new SensorTemperatura();
    }

    public Hogar(String direccion, DetectorHumo humo, SensorPresion presion, SensorTemperatura temperatura) {
        this.direccion = direccion;
        this.humo = humo;
        this.presion = presion;
        this.temperatura = temperatura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public DetectorHumo getHumo() {
        return humo;
    }

    public void setHumo(DetectorHumo humo) {
        this.humo = humo;
    }

    public SensorPresion getPresion() {
        return presion;
    }

    public void setPresion(SensorPresion presion) {
        this.presion = presion;
    }

    public SensorTemperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(SensorTemperatura temperatura) {
        this.temperatura = temperatura;
    }

    public void detectar(){
        Double auxM= humo.getMedida()+ temperatura.getMedida()+ presion.getMedida();
        Double auxU= humo.getUmbralInicial()+ temperatura.getUmbralInicial()+ presion.getUmbralInicial();
        if(auxM>auxU){
            humo.llamarBomberos();
            temperatura.TemperaturaSube();
            presion.sensorActivado();
        }
    }
}
