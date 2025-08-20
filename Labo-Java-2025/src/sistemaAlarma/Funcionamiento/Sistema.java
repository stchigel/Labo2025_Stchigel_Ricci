package sistemaAlarma.Funcionamiento;

import sistemaAlarma.Dispositivos.Dispositivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sistema {
    ArrayList<Dispositivo>alarmas;

    public Sistema(){
        alarmas = new ArrayList<>();
    }

    public Sistema(ArrayList<Dispositivo>alarmas){
        alarmas=alarmas;
    }

    public ArrayList<Dispositivo> getAlarmas() {
        return alarmas;
    }

    public void setAlarmas(ArrayList<Dispositivo> alarmas) {
        this.alarmas = alarmas;
    }

    Scanner sc = new Scanner(System.in);

    public String obtenerInfo()throws Exception {
        System.out.println("Ingresa un numero de la alarma que quieras ver su info");
        int numero = sc.nextInt();
        return ("Nombre: " + alarmas.get(numero).getClass().getName() +
        " Año de adquisision: " + alarmas.get(numero).getAnioAdquisicion() +
        " Medida: " + alarmas.get(numero).getMedida() +
        " Umbral inicial: " + alarmas.get(numero).getUmbralInicial());
    }

    public static void main(String[] args) {
        Sistema s = new Sistema();
        try {
            s.obtenerInfo();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hola");
    }
}
