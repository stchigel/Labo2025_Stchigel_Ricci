package Cursos.CursoRicci.ejercicio5;

import java.util.ArrayList;

public class ShopApp {
    public static void main(String[] args) {
        Customer C1 = new Customer();
        C1.setName("Pinky");
        C1.setSize("S");

        int measurement;
        measurement = 3;
        C1.setSize(measurement);

        Clothing item1;
        Clothing item2;
        Clothing item3;
        Clothing item4;

        item1 = new Clothing("Blue Jacket", 20.9, "M");
        item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        item3 = new Clothing("Green Scarf", 5.0, "S");
        item4 = new Clothing("Blue T-Shirt", 10.5, "S");
        ArrayList<Clothing> itemd = new ArrayList<>();
        itemd.add(item1);
        itemd.add(item2);
        itemd.add(item3);
        itemd.add(item4);

        C1.addItems(itemd);

        for(Clothing c : C1.getItems()){
            if(C1.getSize().equals(c.getSize())){
                System.out.println("Description: " + c.getDescription() + ", size: " + c.getSize() + ", price: " + c.getPrice());
            }
        }
        System.out.println("Hola " + C1.getName() + " Size "+ C1.getSize() + " Total " + C1.getTotalClothingCost(C1));
    }
}
