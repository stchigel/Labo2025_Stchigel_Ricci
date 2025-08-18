package Cursos.CursoRicci.duke.choice;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}