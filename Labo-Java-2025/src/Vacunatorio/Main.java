package Vacunatorio;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Creamos algunas vacunas
        Vacuna vacuna1 = new Vacuna(LocalDate.of(2024, 1, 10), LocalDate.of(2024, 2, 1), 101, 1, "Pfizer");
        Vacuna vacuna2 = new Vacuna(LocalDate.of(2023, 5, 15), LocalDate.of(2023, 6, 1), 102, 2, "Moderna");
        Vacuna vacuna3 = new Vacuna(LocalDate.of(2024, 3, 20), LocalDate.of(2024, 4, 5), 103, 3, "Sputnik");
        Vacuna vacuna4 = new Vacuna(LocalDate.of(2024, 3, 20), LocalDate.of(2024, 4, 5), 104, 4, "Astrasenica");


        // Creamos ciudadanos
        Ciudadano ciudadano1 = new Ciudadano("Juan", "Pérez", 30, "Calle Falsa 123", Provincias.CABA, "juan@mail.com");
        Ciudadano ciudadano2 = new Ciudadano("Ana", "Gomez", 40, "Av. Siempre Viva 742", Provincias.BUENOS_AIRES, "ana@mail.com");
        Ciudadano ciudadano3 = new Ciudadano("Luis", "Lopez", 50, "Ruta 3 KM 45", Provincias.CABA, "luis@mail.com");

        // Les damos algunas vacunas
        ciudadano1.addVaccines(vacuna1);
        ciudadano1.addVaccines(vacuna2);
        ciudadano2.addVaccines(vacuna1);
        ciudadano2.addVaccines(vacuna3);
        ciudadano3.addVaccines(vacuna2);
        ciudadano3.addVaccines(vacuna3);

        // Creamos el mapa de ciudadanos con DNI como clave
        HashMap<Integer, Ciudadano> mapa = new HashMap<>();
        mapa.put(12345678, ciudadano1);
        mapa.put(87654321, ciudadano2);
        mapa.put(11223344, ciudadano3);

        // Creamos sistema
        Sistema sistema = new Sistema(mapa);


        sistema.regisVacuna(11223344, vacuna4);

        sistema.vacunasCiudadano(87654321);

        sistema.vacunadosXProvincia();

        sistema.cumplenCantVacs(2);

        sistema.ciudadanosConCiertaVacuna(vacuna4);
    }
}
