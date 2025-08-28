package TPREDES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class HostModerador extends Thread {
    BufferedReader in;
    boolean running=true;
    HashSet<PrintWriter> outClientes;

    public HostModerador(BufferedReader in) {
        this.in = in;
        outClientes = new HashSet<>();
    }

    public boolean isRunning() {
        return running;
    }

    public void addCliente(PrintWriter cli){
        outClientes.add(cli);
    }

    public void run(){
        System.out.println("Hola");
        Scanner scanner = new Scanner(System.in);
        try {
            while(running){
                String mensajeMod = in.readLine();
                System.out.println("Recibido mod " + mensajeMod);
                /*System.out.println("Cliente: " + mensajeCliente);
                System.out.println("¿Aprueba este mensaje? S/n");
                String resp = scanner.nextLine();*/
                if(mensajeMod.charAt(0)=='$'){
                    String sinPrimerCaracter = mensajeMod.substring(1);
                    System.out.println("Aceptado");
                    for (PrintWriter out : outClientes){
                        out.println(sinPrimerCaracter);
                    }
                } else {
                    for (PrintWriter out : outClientes){
                        System.out.println("Rechazado");
                        out.println("Un moderador ha quitado un mensaje");
                    }
                }
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
