package Cursos.CursoRicci.ejercicio5;

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

    public Customer(String name, String size, ArrayList<Clothing>items) {
        this.name = name;
        this.size = size;
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

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1,2,3:
                setSize("S");
                break;
            case 4,5,6:
                setSize("M");
                break;
            case 7,8,9:
                setSize("L");
                break;
            default:
                setSize("X");
                break;
        }
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
