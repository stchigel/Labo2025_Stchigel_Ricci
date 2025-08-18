/*package CosasTangibles.flotaDeVehiculos;

import java.util.ArrayList;

public class Flota {
    private ArrayList<Vehiculo> vehiculos;

    public Flota() {
        this.vehiculos = new ArrayList<>();
    }

    public Flota(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }



    public void addBicicleta(Bicicleta b) {
        vehiculos.add(b);
    }

    public void addAuto(Auto a) {
        vehiculos.add(a);
    }

    public void addCamion(Camion c) {
        vehiculos.add(c);
    }

    public String tipoMasTenemos(){
        int bici=0;
        int auto=0;
        int camion=0;
        for (Vehiculo v : vehiculos){
            if(v instanceof Auto){
                auto++;
            } else if (v instanceof Camion) {
                camion++;
            } else if (v instanceof Bicicleta){
                bici++;
            }
        }
        if (bici>auto && bici>camion){
            return "Bicicleta";
        } else if (auto>bici && auto>camion){
            return "Auto";
        } else if (camion>bici && camion>auto){
            return "Camion";
        } else {
            return "Empate";
        }
    }

    public Double porcentajeDescapotable(){
        int aux=0;
        int aux2=0;
        Double porcentaje=0.0;
        for(Vehiculo v : vehiculos){
            if(v instanceof Auto a) {
                aux2++;
                if (a.getDescapotable()) {
                    aux++;
                }
            }
        }
        porcentaje=(aux/aux2)*100.0;
        return porcentaje;
    }
}
*/