package Calorias;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Familia f = new Familia();

        Persona p1 = new Persona("Juan", LocalDate.of(2005,5,7));
        Persona p2 = new Persona("María", LocalDate.of(1998, 12, 15));
        Persona p3 = new Persona("Carlos", LocalDate.of(2010, 3, 22));
        Persona p4 = new Persona("Lucía", LocalDate.of(2000, 7, 9));
        Persona p5 = new Persona("Sofía", LocalDate.of(1995, 11, 30));

        HashSet<String> i1 = new HashSet<>(Arrays.asList("Tomate", "Lechuga", "Carne", "Pan", "Queso"));
        Plato pl1 = new Plato("Hamburguesa completa", i1, 5000);
        HashSet<String> i2 = new HashSet<>(Arrays.asList("Pollo", "Arroz", "Ensalada"));
        Plato pl2 = new Plato("Pollo con arroz", i2, 3500);
        HashSet<String> i3 = new HashSet<>(Arrays.asList("Pasta", "Salsa tomate", "Queso"));
        Plato pl3 = new Plato("Pasta con salsa", i3, 4000);
        HashSet<String> i4 = new HashSet<>(Arrays.asList("Lechuga", "Tomate", "Cebolla", "Aceite"));
        Plato pl4 = new Plato("Ensalada mixta", i4, 1200);
        HashSet<String> i5 = new HashSet<>(Arrays.asList("Pan", "Jamón", "Queso"));
        Plato pl5 = new Plato("Sándwich mixto", i5, 2800);
        HashSet<String> i6 = new HashSet<>(Arrays.asList("Carne", "Papas fritas", "Mayonesa"));
        Plato pl6 = new Plato("Hamburguesa con papas", i6, 5500);
        HashSet<String> i7 = new HashSet<>(Arrays.asList("Arroz", "Vegetales", "Tofu"));
        Plato pl7 = new Plato("Salteado vegetariano", i7, 3200);
        HashSet<String> i8 = new HashSet<>(Arrays.asList("Pescado", "Limón", "Ensalada"));
        Plato pl8 = new Plato("Pescado al limón", i8, 3700);
        HashSet<String> i9 = new HashSet<>(Arrays.asList("Sopa", "Fideos", "Verduras"));
        Plato pl9 = new Plato("Sopa de verduras", i9, 1500);
        HashSet<String> i10 = new HashSet<>(Arrays.asList("Carne", "Pan", "Queso", "Lechuga"));
        Plato pl10 = new Plato("Hamburguesa clásica", i10, 4800);
        HashSet<String> i11 = new HashSet<>(Arrays.asList("Huevos", "Pan", "Tomate"));
        Plato pl11 = new Plato("Desayuno completo", i11, 3000);
        HashSet<String> i12 = new HashSet<>(Arrays.asList("Pollo", "Lechuga", "Tomate", "Pan"));
        Plato pl12 = new Plato("Sándwich de pollo", i12, 3500);
        HashSet<String> i13 = new HashSet<>(Arrays.asList("Carne", "Cebolla", "Pimiento"));
        Plato pl13 = new Plato("Guiso de carne", i13, 4200);
        HashSet<String> i14 = new HashSet<>(Arrays.asList("Pasta", "Salsa blanca", "Queso"));
        Plato pl14 = new Plato("Pasta con salsa blanca", i14, 4300);
        HashSet<String> i15 = new HashSet<>(Arrays.asList("Lechuga", "Tomate", "Aceite", "Vinagre"));
        Plato pl15 = new Plato("Ensalada verde", i15, 1100);

        p1.addPlato(pl2);
        p1.addPlato(pl5);
        p1.addPlato(pl12);
        p1.addPlato(pl3);
        p2.addPlato(pl3);
        p2.addPlato(pl7);
        p2.addPlato(pl10);
        p2.addPlato(pl15);
        p3.addPlato(pl1);
        p3.addPlato(pl4);
        p3.addPlato(pl5);
        p4.addPlato(pl2);
        p4.addPlato(pl6);
        p4.addPlato(pl8);
        p4.addPlato(pl9);
        p4.addPlato(pl11);
        p5.addPlato(pl12);
        p5.addPlato(pl13);
        p5.addPlato(pl14);

        f.addPersona(p1);
        f.addPersona(p2);
        f.addPersona(p3);
        f.addPersona(p4);
        f.addPersona(p5);

        //Ej1
        System.out.println(p3.getNombre()+" consumió "+p3.caloriasTotales()+" calorias");

        //Ej2
        System.out.println("La familia consumió un promedio de "+f.caloriasPromedio()+" calorias");

        //Ej3
        System.out.println("El que más consumió fue "+f.masCalorias().getNombre());

        //Ej4
        System.out.println("El que menos consumió fue "+f.menosCalorias().getNombre());

    }
}
