package curling;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCurling {
    public static void main(String[] args) {
        ArrayList<Equipo> equipos = new ArrayList<>();
        ArrayList<Equipo> equiposManana = new ArrayList<>();
        ArrayList<Equipo> equiposTarde = new ArrayList<>();
        ArrayList<Equipo> equiposNoche = new ArrayList<>();
        ArrayList<Partido> partidos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            Equipo newEquipo = new Equipo();
            System.out.println("Ingresar nombre del equipo");
            newEquipo.setNombre(sc.nextLine());
            System.out.println("Ingresar barrio del equipo");
            newEquipo.setBarrio(sc.nextLine());
            System.out.println("Ingresar turno (1=Mañana, 2=Tarde, 3=Noche)");
            switch (sc.nextInt()){
                case 1:
                    newEquipo.setTurno(Turno.MANIANA);
                    break;
                case 2:
                    newEquipo.setTurno(Turno.TARDE);
                    break;
                case 3:
                    newEquipo.setTurno(Turno.NOCHE);
                    break;
                default:
                    break;
            }
            Boolean yaHayCapitan=false;
            for (int j = 0; j < 11; j++) {
                Jugador newJugador = new Jugador();
                int dia=0;
                int mes=0;
                int anio=0;
                System.out.println("Ingresar datos del jugador n" + (j + 1) + " :");
                System.out.println("Ingresar nombre del jugador: ");
                sc.nextLine();
                newJugador.setNombre(sc.nextLine());
                System.out.println("Ingresar nacimiento: ");
                System.out.print("Día ");
                dia=sc.nextInt();
                System.out.print("Mes ");
                mes=sc.nextInt();
                System.out.println("Año ");
                anio=sc.nextInt();
                LocalDate newDate = LocalDate.of(anio,mes,dia);
                newJugador.setFechaNacimiento(newDate);
                newJugador.setNumeroCamiseta(j);
                if (yaHayCapitan){
                    newJugador.setCapitan(false);
                } else {
                    System.out.println("Es capitan? (true = si, false = no)");
                    yaHayCapitan=sc.nextBoolean();
                    newJugador.setCapitan(yaHayCapitan);
                    /*if (sc.nextBoolean()){
                        newJugador.setCapitan(true);
                        yaHayCapitan=true;
                    } else {
                        newJugador.setCapitan(false);
                    }*/
                }
                newEquipo.addJugador(newJugador);
            }
            equipos.add(newEquipo);
        }
        /*ya cree todo*/

        for (Equipo equipo : equipos){
            switch (equipo.getTurno()){
                case Turno.MANIANA:
                    equiposManana.add(equipo);
                    break;
                case Turno.TARDE:
                    equiposTarde.add(equipo);
                    break;
                case Turno.NOCHE:
                    equiposNoche.add(equipo);
                    break;
                default:
                    break;
            }
        }
        LocalDate hoy = LocalDate.now();
        for (int i = 0; i < equiposManana.size(); i++) {
            for (int j = i + 1; j < equiposManana.size(); j++) {
                Partido partido = new Partido();
                partido.setEquipoLocal(equiposManana.get(i));
                partido.setEquipoVisitante(equiposManana.get(j));
                partido.setTurno(Turno.MANIANA);
                partido.setDia(hoy.plusDays(30 + i));
                partidos.add(partido);
            }
        }
        for (int i = 0; i < equiposTarde.size(); i++) {
            for (int j = i + 1; j < equiposTarde.size(); j++) {
                Partido partido = new Partido();
                partido.setEquipoLocal(equiposTarde.get(i));
                partido.setEquipoVisitante(equiposTarde.get(j));
                partido.setTurno(Turno.MANIANA);
                partido.setDia(hoy.plusDays(30 + i));
                partidos.add(partido);
            }
        }
        for (int i = 0; i < equiposNoche.size(); i++) {
            for (int j = i + 1; j < equiposNoche.size(); j++) {
                Partido partido = new Partido();
                partido.setEquipoLocal(equiposNoche.get(i));
                partido.setEquipoVisitante(equiposNoche.get(j));
                partido.setTurno(Turno.MANIANA);
                partido.setDia(hoy.plusDays(30 + i));
                partidos.add(partido);
            }
        }

        for (Partido partido : partidos) {
            System.out.println("Local: " + partido.getEquipoLocal().getNombre());
            System.out.println("Visitante: " + partido.getEquipoVisitante().getNombre());
            System.out.println("Día: " + partido.getDia().toString());
            System.out.println("Turno: " + partido.getTurno().name());
            System.out.println("-------------------------");
        }
    }
}
