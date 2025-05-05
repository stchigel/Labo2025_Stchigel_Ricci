package CursoRicci.ejercicio6;

public class Clothing {
    String description;
    Double price;
    String size;

    public Clothing() {
        this.description = "N/A";
        this.price = 0.0;
        this.size = "M";
    }

    public Clothing(String description, Double price, int measurement) {
        this.description = description;
        this.price = price;
        this.size = setSize(measurement);
    }

    private final double MIN_PRICE = 10.0;
    private final double MIN_TAX = 0.2;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price+(price*MIN_TAX);
    }

    public void setPrice(Double price) {
        if(price>=MIN_PRICE){
            this.price = price;
        }
        else{
            this.price = MIN_PRICE;
        }
    }

    public String getSize() {
        return size;
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
}