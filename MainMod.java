package TPREDES;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MainMod {
    public static void main(String[] args) {
        try {
            // Conexión al servidor en el puerto 40001
            Socket socket = new Socket(InetAddress.getLocalHost(), 30001);

            // Flujo de entrada: mensajes desde el servidor (si se envían)
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Flujo de salida: mensajes hacia el servidor
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Scanner para leer desde la consola lo que escriba el moderador
            Scanner scanner = new Scanner(System.in);

            System.out.println("Moderador conectado. Use '$' al inicio para aprobar un mensaje.");

            // Bucle principal
            while (true) {
                System.out.print("Escriba mensaje a enviar: ");
                String mensaje = scanner.nextLine();

                // Envía el mensaje al servidor
                out.println(mensaje);

                // Opcional: si el servidor enviara algo de vuelta al moderador
                // (no parece estar implementado, pero lo dejamos preparado)
                if (in.ready()) {
                    String respuesta = in.readLine();
                    System.out.println("Servidor dice: " + respuesta);
                }
            }

        } catch (IOException e) {
            System.out.println("Error en el moderador: " + e.getMessage());
        }
    }
}
