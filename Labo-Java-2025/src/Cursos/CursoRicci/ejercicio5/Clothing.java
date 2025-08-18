package Cursos.CursoRicci.ejercicio5;

public class Clothing {
    String description;
    Double price;
    String size;

    public Clothing() {
        this.description = "N/A";
        this.price = 0.0;
        this.size = "M";
    }

    public Clothing(String description, Double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
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

    public void setSize(String size) {
        this.size = size;
    }
}