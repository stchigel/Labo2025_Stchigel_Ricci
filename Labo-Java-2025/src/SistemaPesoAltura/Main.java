package SistemaPesoAltura;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //HUMANOS
        Registro r1 = new Registro(70.0, 1.75);
        Registro r2 = new Registro(72.0, 1.76);
        Registro r3 = new Registro(75.0, 1.78);

        LocalDate f1 = LocalDate.of(2023, 1, 10);
        LocalDate f2 = LocalDate.of(2024, 6, 15);
        LocalDate f3 = LocalDate.of(2024, 12, 1);

        HashMap regsh1 = new HashMap<>();
        regsh1.put(f1, r1);
        regsh1.put(f2, r2);
        regsh1.put(f3, r3);

        Humano h1 = new Humano("Juan", "Perez", 25, "Calle Falsa 123",LocalDate.of(1999, 5, 20), regsh1);


        Registro r4 = new Registro(60.0, 1.65);
        Registro r5 = new Registro(61.0, 1.66);
        Registro r6 = new Registro(63.0, 1.67);

        HashMap<LocalDate, Registro> regsh2 = new HashMap<>();
        regsh2.put(f1, r4);
        regsh2.put(f2, r5);
        regsh2.put(f3, r6);

        Humano h2 = new Humano("Maria", "Gomez", 30, "Av. Principal 456", LocalDate.of(1994, 8, 14), regsh2);


        Registro r7 = new Registro(80.0, 1.80);
        Registro r8 = new Registro(82.0, 1.81);
        Registro r9 = new Registro(85.0, 1.82);

        HashMap<LocalDate, Registro> regsh3 = new HashMap<>();
        regsh3.put(f1, r7);
        regsh3.put(f2, r8);
        regsh3.put(f3, r9);

        Humano h3 = new Humano("Carlos", "Lopez", 28, "Pasaje Verde 789", LocalDate.of(1996, 2, 11), regsh3);


        Registro r10 = new Registro(55.0, 1.60);
        Registro r11 = new Registro(56.0, 1.61);
        Registro r12 = new Registro(57.0, 1.62);

        HashMap<LocalDate, Registro> regsh4 = new HashMap<>();
        regsh4.put(f1, r10);
        regsh4.put(f2, r11);
        regsh4.put(f3, r12);

        Humano h4 = new Humano("Lucia", "Martinez", 22, "Calle Azul 321", LocalDate.of(2002, 9, 30), regsh4);


        Registro r13 = new Registro(90.0, 1.85);
        Registro r14 = new Registro(92.0, 1.86);
        Registro r15 = new Registro(94.0, 1.87);

        HashMap<LocalDate, Registro> regsh5 = new HashMap<>();
        regsh5.put(f1, r13);
        regsh5.put(f2, r14);
        regsh5.put(f3, r15);

        Humano h5 = new Humano("Pedro", "Fernandez", 35, "Ruta 5 Km 12", LocalDate.of(1989, 12, 5), regsh5);


        Registro r16 = new Registro(65.0, 1.70);
        Registro r17 = new Registro(66.0, 1.71);
        Registro r18 = new Registro(68.0, 1.72);

        HashMap<LocalDate, Registro> regsh6 = new HashMap<>();
        regsh6.put(f1, r16);
        regsh6.put(f2, r17);
        regsh6.put(f3, r18);

        Humano h6 = new Humano("Sofia", "Ramirez", 27, "Barrio Norte 15", LocalDate.of(1997, 7, 8), regsh6);

        //SISTEMA
        Sistema s = new Sistema();

        HashSet hums = new HashSet<>();
        hums.add(h1);
        hums.add(h2);
        hums.add(h3);
        hums.add(h4);
        hums.add(h5);
        hums.add(h6);

        s.setHumanos(hums);

        // PRUEBAS
        s.alturaPesoFechaParticular(f2);
        s.promedioEnAnio(2024);
        s.porcentajeCrecimiento(f1,f2);
    }
}
