package CursoStchigel.duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("Pecio mínimo estandard: " + Clothing.minPrice);
        Customer c1 = new Customer("Pinky", 3);
        /*c1.setName("Pinky");
        c1.setSize("S");*/
        System.out.println("El nombre del cliente es: " + c1.getName());

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

        /*item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");
        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");
        item3.setDescription("Green Scarf");
        item3.setPrice(5);
        item3.setSize("S");
        item4.setDescription("Blue T-Shirt");
        item4.setPrice(10.5);
        item4.setSize("S");*/

        /*System.out.println("Item uno datos: "+item1.description+", "+item1.price+", "+item1.size);
        System.out.println("Item dos datos: "+item2.description+", "+item2.price+", "+item2.size);*/

        Clothing[] items = {item1, item2, item3, item4};

        c1.addItems(items);

        for (Clothing item : items){
            if (item.getSize() == c1.getSize()){
                System.out.println(item);
            }
        }

        /*for (Clothing item : items){
            if (item.getSize() == c1.getSize()){
                total+= item.getPrice()+(item.price*tax);
            }
            if(total>15){
                break;
            }
        } */

        /*total+=item1.price+(item1.price*tax);
        total+=(item2.price+(item2.price*tax))*2;*/

        System.out.println("Su total es: "+c1.getTotalClothingCost());

        c1.setSize(3);
        /*int measurement = 3;
        switch (measurement) {
            case 1, 2, 3:
                c1.size="S";
                break;
            case 4, 5, 6:
                c1.size="M";
                break;
            case 7, 8, 9:
                c1.size="L";
                break;
            default:
                c1.size="X";
                break;

        }*/


    }
}
