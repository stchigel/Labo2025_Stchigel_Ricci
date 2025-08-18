package FormasCatch;

public class Throw {
    public static void main(String[] args) {
        try{
            String nombre = null;
            if(nombre==null){
                throw new IllegalArgumentException("ES NULL");
            }
            System.out.println("El largo del nombre es:" + nombre.length());
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
        System.out.println("Copyright StchigelRicci & Company");
    }
}
