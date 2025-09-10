package Cursos.CursoRicci.ejercicio6;

import java.util.ArrayList;

public class ShopApp {
    public static void main(String[] args) {
        Clothing item1;
        Clothing item2;
        Clothing item3;
        Clothing item4;

        System.out.println("Precio minimo: "+ Clothing.MIN_PRICE);

        item1 = new Clothing("Blue Jacket", 20.9, 2);
        item2 = new Clothing("Orange T-Shirt", 10.5, 3);
        item3 = new Clothing("Green Scarf", 5.0, 1);
        item4 = new Clothing("Blue T-Shirt", 10.5, 4);
        ArrayList<Clothing> itemd = new ArrayList<>();
        itemd.add(item1);
        itemd.add(item2);
        itemd.add(item3);
        itemd.add(item4);

        Customer C1 = new Customer("Pinky", 3, itemd);

        C1.addItems(itemd);



        for(Clothing c : C1.getItems()){
            if (C1.getSize().equals(c.getSize())) {
                System.out.println("Description: " + c.getDescription() + ", size: " + c.getSize() + ", price: " + c.getPrice());
            }
        }
        System.out.println("Hola " + C1.getName() + " Size "+ C1.getSize() + " Total " + C1.getTotalClothingCost(C1));
    }
}
