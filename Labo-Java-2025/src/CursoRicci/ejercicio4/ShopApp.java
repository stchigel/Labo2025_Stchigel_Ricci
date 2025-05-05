package CursoRicci.ejercicio4;

import java.util.ArrayList;

public class ShopApp {
    public static void main(String[] args) {
        Double tax;
        tax = 0.2;
        Double total;
        total =0.0;


        Customer C1 = new Customer();
        C1.setName("Pinky");
        C1.setSize("S");
        System.out.println("Hola " + C1.getName() + " Size "+ C1.getSize());

        int measurement;
        measurement = 3;

        Clothing item1;
        Clothing item2;
        Clothing item3;
        Clothing item4;

        item1 = new Clothing("Blue Jacket", 20.9, "M");
        item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        item3 = new Clothing("Green Scarf", 5.0, "S");
        item4 = new Clothing("Blue T-Shirt", 10.5, "S");
        ArrayList<Clothing> prendas = new ArrayList<>();
        prendas.add(item1);
        prendas.add(item2);
        prendas.add(item3);
        prendas.add(item4);

        //System.out.println("Description: " + item1.getDescription() + ", size: " + item1.getSize() + ", price: " + item1.getPrice());
        //System.out.println("Description: " + item2.getDescription() + ", size: " + item2.getSize() + ", price: " + item2.getPrice());

        //total = ((item1.price * 2) + item2.price) * tax;
        //System.out.println(total);

        switch (measurement) {
            case 1,2,3:
                C1.setSize("S");
                break;
            case 4,5,6:
                C1.setSize("M");
                break;
            case 7,8,9:
                C1.setSize("L");
                break;
            default:
                C1.setSize("X");
                break;
        }

        for(Clothing c : prendas){
            if(C1.getSize().equals(c.getSize())){
                System.out.println("Description: " + c.getDescription() + ", size: " + c.getSize() + ", price: " + c.getPrice());
                total += c.price + (c.price * tax);
                if (total >= 15.0) {
                    break;
                }
            }
        }
        System.out.println(total);
    }
}
