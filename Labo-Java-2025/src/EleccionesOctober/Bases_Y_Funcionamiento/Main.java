package EleccionesOctober.Bases_Y_Funcionamiento;

import EleccionesOctober.Ave_Paloma.Paloma;
import EleccionesOctober.Bases_Y_Funcionamiento.Enviadores;
import EleccionesOctober.Bases_Y_Funcionamiento.PartidoPoliticoPolimorfico;
import EleccionesOctober.Dispositivo_Celular.Celular;
import EleccionesOctober.Dispositivo_Celular.CompaniaTelefonica;
import EleccionesOctober.Persona_Trabajador.Horario;
import EleccionesOctober.Persona_Trabajador.Persona;
import EleccionesOctober.Persona_Trabajador.Trabajador;
import CosasTangibles.objetos.Color;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Se crea un partido político
        PartidoPoliticoPolimorfico partido = new PartidoPoliticoPolimorfico();
        partido.setNombre("Partido del Futuro");

        // Se crea un mensajero Paloma que sabe volar
        Paloma palomaMensajera = new Paloma(Color.WHITE, "Mensajera", "Paloma", true);

        // Se crea un mensajero Paloma que NO sabe volar
        Paloma palomaNovata = new Paloma(Color.GRAY, "Novata", "Paloma", false);

        // Se crea un mensajero Celular que está prendido y tiene crédito
        Celular celularConCredito = new Celular(1234, "Samsung", "S21", true, 1155556666, CompaniaTelefonica.MOVISTAR, 20.5);

        // Se crea un mensajero Celular que no tiene crédito
        Celular celularSinCredito = new Celular(5678, "Apple", "iPhone 13", true, 1177778888, CompaniaTelefonica.CLARO, 0.0);

        // Se crea un mensajero Trabajador
        HashMap<DayOfWeek, Horario> horarios = new HashMap<>();
        horarios.put(LocalDate.now().getDayOfWeek(), new Horario(LocalTime.of(9, 0), LocalTime.of(17, 0)));
        Trabajador trabajadorActivo = new Trabajador("Ana", "Lopez", 12345678, LocalDate.of(1990, 1, 1), 12345, "Calle Falsa 123", horarios);

        // Se agregan los mensajeros al partido
        partido.addMensajeros(palomaMensajera);
        partido.addMensajeros(palomaNovata);
        partido.addMensajeros(celularConCredito);
        partido.addMensajeros(celularSinCredito);
        partido.addMensajeros(trabajadorActivo);

        // Se inicia la campaña
        System.out.println("Iniciando la campaña del " + partido.getNombre() + ":");
        partido.hacerCamapaña();

        System.out.println("\n--- Pruebas de funcionalidades ---");

        // Se prueba que un mensajero que no cumple los requisitos no envía el mensaje
        System.out.println("Prueba: Paloma que no sabe volar");
        palomaNovata.enviarMensaje("Este mensaje no se debería enviar.");

        // Se prueba que un celular sin crédito no envía el mensaje
        System.out.println("Prueba: Celular sin crédito");
        celularSinCredito.enviarMensaje("Este mensaje no se debería enviar.");

        // Se cambia el estado de un mensajero para que cumpla los requisitos
        System.out.println("\nPrueba: Habilitando mensajeros que antes no cumplían");
        palomaNovata.setAprendioAvolar(true);
        celularSinCredito.setCreditoDisponible(5.0);

        // Se vuelve a probar
        System.out.println("La paloma 'Novata' ahora sabe volar:");
        palomaNovata.enviarMensaje("El mensaje ahora debería ser enviado por la paloma Novata.");

        System.out.println("El celular que no tenía crédito, ahora lo tiene:");
        celularSinCredito.enviarMensaje("El mensaje ahora debería ser enviado por el celular sin crédito inicial.");
    }
}