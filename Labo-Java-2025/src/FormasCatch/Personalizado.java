package FormasCatch;

public class Personalizado {
    public static void cantLetras(String nombre)throws NombreNullException{
        if(nombre==null){
            throw new NombreNullException("El nombre esta null");
        } else {
            System.out.println("El largo del nombre es:" + nombre.length());
        }

    }

    public static void main(String[] args) {
        try {
            cantLetras(null);
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        System.out.println("Copyright StchigelRicci & Company");
    }
}
