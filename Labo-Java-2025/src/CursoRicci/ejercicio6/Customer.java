package CursoRicci.ejercicio6;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String size;
    private ArrayList<Clothing>items;

    public Customer() {
        this.name = "N/A";
        this.size = "N/A";
        this.items = new ArrayList<>();
    }

    public Customer(String name, int measurement, ArrayList<Clothing>items) {
        this.name = name;
        this.size = setSize(measurement);
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize() {
        this.size = size;
    }

    public String setSize(int measurement) {
        switch (measurement) {
            case 1,2,3:
                size = "S";
                break;
            case 4,5,6:
                size = "M";
                break;
            case 7,8,9:
                size = "L";
                break;
            default:
                size = "X";
                break;
        }
        return size;
    }

    public ArrayList<Clothing> getItems() {
        return items;
    }

    public void setItems(ArrayList<Clothing> items) {
        this.items = items;
    }

    public void addItems(ArrayList<Clothing> aitems){
        items = aitems;
    }

    public double getTotalClothingCost(Customer ci){
        Double total;
        total =0.0;
        for(Clothing c : items) {
            if (ci.getSize().equals(c.getSize())) {
                total += c.getPrice();
            }
        }
        return total;
    }
}
