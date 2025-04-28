package curling;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        ArrayList<Equipo> equipos = new ArrayList<Equipo>();
        ArrayList<Partido> partidos = new ArrayList<Partido>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            Equipo newEquipo = new Equipo();
            System.out.println("Ingresar nombre del equipo");
            newEquipo.setNombre(sc.nextLine());
            System.out.println("Ingresar barrio del equipo");
            newEquipo.setBarrio(sc.nextLine());
            System.out.println("Ingresar disponibilidad turno mañana (true = puede, false = no puede)");
            newEquipo.setManana(sc.nextBoolean());
            System.out.println("Ingresar disponibilidad turno tarde");
            newEquipo.setTarde(sc.nextBoolean());
            System.out.println("Ingresar disponibilidad turno noche");
            newEquipo.setNoche(sc.nextBoolean());
            Boolean yaHayCapitan=false;
            for (int j = 0; j < 11; j++) {
                Jugador newJugador = new Jugador();
                System.out.println("Ingresar datos del jugador n" + j + " :");
            }
        }
    }
}
