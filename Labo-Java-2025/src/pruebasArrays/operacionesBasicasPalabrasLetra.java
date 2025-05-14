package pruebasArrays;

import java.util.ArrayList;

public class operacionesBasicasPalabrasLetra {
    public static void main(String[] args) {
        ArrayList<String>Palapras = new ArrayList<String>();
        Palapras.add("Racing");
        Palapras.add("Verstappen");
        Palapras.add("Oliveira");
        Palapras.add("Maravilla");
        for(String palab : Palapras){
            if(palab.charAt(0)=='M'){
                System.out.println(palab);
            }
        }
    }
}
