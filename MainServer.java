package TPREDES;

import java.io.*;
import java.net.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MainServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocketCli = new ServerSocket(30000);
             ServerSocket serverSocketMod = new ServerSocket(30001)) {

            Socket clientSocketMod = serverSocketMod.accept();

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocketMod.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocketMod.getOutputStream(), true);

            /*-
            BufferedReader in2 = new BufferedReader(new InputStreamReader(clientSocket2.getInputStream()));
            PrintWriter out2 = new PrintWriter(clientSocket2.getOutputStream(), true);
            */

            HostModerador hm = new HostModerador(in); //recibe de mod, envia a cliente
            hm.start();
            //recibe de cliente, envia a mod

            while (true) {
                Socket clientSocket = serverSocketCli.accept();
                BufferedReader inC = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter outC = new PrintWriter(clientSocket.getOutputStream(), true);
                hm.addCliente(outC);

                HostCliente hc = new HostCliente(inC, out);
                hc.start();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
