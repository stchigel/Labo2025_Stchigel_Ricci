package unid0;

public class ReemplazoLetr {
    public static void main(String[] args) {
        String frase = "Ayer me compré muñecos de la marca ‘ToyCo’ por internet.";
        String e = "eE";
        int cont=0;
        for (int i = 0; i < frase.length(); i++) {
            char f=frase.charAt(i);
            for (int ii = 0; ii < e.length(); ii++) {
                char v=e.charAt(ii);
                if (f==v){
                    cont++;
                }
            }
        }
        System.out.println(cont + " E");
    }
}
