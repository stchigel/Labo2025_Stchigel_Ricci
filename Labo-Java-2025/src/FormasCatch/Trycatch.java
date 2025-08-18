package FormasCatch;

public class Trycatch {
    public static void main(String[] args) {
        try{
            String nombre = null;
            System.out.println("El largo del nombre es:" + nombre.length());
        } catch (NullPointerException e){
            System.out.println(e);
        }
        System.out.println("Copyright StchigelRicci & Company");
    }
}
