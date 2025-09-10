package Cursos.CursoRicci.ejercicio7exeptions;

import java.util.ArrayList;

public class ShopApp {
    public static void main(String[] args) {
        double impuesto = 0.2;
        double total = 0.0;

        System.out.println("Bienvenido a Duke Choise Shop");

        Customer c1 = new Customer("Pinky", 14);

        System.out.println("Precio minimo " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Campera Azul", 20.9, "M");
        Clothing item2 = new Clothing("Campera Naranja", 10.5, "S");

        ArrayList<Clothing>items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        items.add(new Clothing("Bufanda verde", 5.0, "S"));
        items.add(new Clothing("Remera azul", 10.5, "S"));

        int measurment = 8;

        c1.addItems(items);

        System.out.println("El cliente es " + c1.getName() + "," + c1.getSize() + "," + c1.getTotalClothingCost());

        for(Clothing i : c1.getItems()){
            System.out.println("Items " + i.getDescription());
        }

        int promedio = 0;
        int contador = 0;

        for(Clothing i : c1.getItems()){
            if(i.getSize().equals("L")){
                contador++;
                promedio+=i.getPrice();
            }
        }

        try {
            promedio = (contador==0) ? 0 : promedio/contador;
            promedio/=contador;
            System.out.println("Precio promedio " + promedio + ", contador " + contador);
        } catch (ArithmeticException e){
            System.out.println("No dividas por 0");
        }

    }
}

