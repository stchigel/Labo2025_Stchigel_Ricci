package Cursos.CursoRicci.ejercicio8webServer;

public class Clothing implements Comparable<Clothing>{
    private String description;
    private Double price;
    private String size;

    public final static double MIN_PRICE = 10.0;
    public final static double TAX_RATE = 0.2;

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
        return price + (price * TAX_RATE);
    }

    public void setPrice(Double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    //@Override
    public String toSting(){
        return getDescription() + ", " + getSize() + ", " + getPrice();
    }

    @Override
    public int compareTo(Clothing c){
        return this.description.compareTo(c.getDescription());
    }
}


