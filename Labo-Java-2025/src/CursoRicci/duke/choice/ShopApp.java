package CursoRicci.duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        Double tax;
        tax=0.2;
        Double total;
        Customer C1 = new Customer("Pinky");
        System.out.println("Hola "+C1.getName());

        Clothing item1;
        Clothing item2;

        item1 = new Clothing("Blue Jacket", 20.9, "M");
        item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        System.out.println("Description: " + item1.getDescription() + ", size: " + item1.getSize() + ", price: " + item1.getPrice());
        System.out.println("Description: " + item2.getDescription() + ", size: " + item2.getSize() + ", price: " + item2.getPrice());
        total= ((item1.price*2)+item2.price)*tax;

        System.out.println(total);
    }
}
