package Cursos.CursoStchigel.duke.choice;

import java.util.Objects;

public class Customer {
    private String name;
    private String size;
    private Clothing[] items;

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
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

    public void setSize(int size) {
        switch (size) {
            case 1, 2, 3:
                this.size="S";
                break;
            case 4, 5, 6:
                this.size="M";
                break;
            case 7, 8, 9:
                this.size="L";
                break;
            default:
                this.size="X";
                break;

        }
    }

    public Clothing[] getItems() {
        return items;
    }

    public void setItems(Clothing[] items) {
        this.items = items;
    }

    public void addItems(Clothing[] items) {
        this.items = items;
    }

    public double getTotalClothingCost(){
        double total = 0;
        for (Clothing item : items){
            if (Objects.equals(item.getSize(), this.size)){
                total+= item.getPrice();
            }
            if(total>15){
                break;
            }
        }
        return total;
    }
}
