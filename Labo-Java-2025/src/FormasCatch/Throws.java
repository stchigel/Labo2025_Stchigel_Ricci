package FormasCatch;

public class Throws {
    public static void cantLetras(String nombre)throws Exception{
        System.out.println("El largo del nombre es:" + nombre.length());
    }

    public static void main(String[] args) {
        try {
            cantLetras(null);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Copyright StchigelRicci & Company");
    }
}
