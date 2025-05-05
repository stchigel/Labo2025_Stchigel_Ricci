package CursoRicci.ejercicio4;

public class Customer {
    private String name;
    private String size;

    public Customer() {
        this.name = "N/A";
        this.size = "N/A";
    }

    public Customer(String name, String size) {
        this.name = name;
        this.size = size;
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
}
