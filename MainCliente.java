package TPREDES;

import TCP.ClienteEnviar;
import TCP.ClienteRecibir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainCliente {
    public static void main(String[] args) {
        try {
            Socket socketTCP = new Socket(InetAddress.getLocalHost(), 30000);

            BufferedReader in = new BufferedReader(new InputStreamReader(socketTCP.getInputStream()));
            PrintWriter out = new PrintWriter(socketTCP.getOutputStream(), true);


                ClienteEnviar ce = new ClienteEnviar(out);
                ClienteRecibir cr = new ClienteRecibir(in);



            //in.close();
            //out.close();
            //socketTCP.close();

        } catch (UnknownHostException e) {
            System.out.println("Host desconocido: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error de I/O: " + e.getMessage());
        }
    }
}