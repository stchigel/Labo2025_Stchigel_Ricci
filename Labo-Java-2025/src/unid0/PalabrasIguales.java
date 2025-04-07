package unid0;

import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {
        int aux=0;
        Scanner e=new Scanner(System.in);
        System.out.println("Ingresa la primer palabra");
        String palabra1=e.nextLine();
        System.out.println("Ingresa la segunda palabra");
        String palabra2=e.nextLine();
        for(int i=0; i<palabra1.length();i++){
            if(palabra1.charAt(i)==palabra2.charAt(i)){
                aux = aux + 1;
            }
            else{
                aux = aux - 1;
            }
        }
        if(aux==palabra2.length()){
            System.out.println("La 2 palabras son iguales");
        }
        else{
            System.out.println("Las 2 palabras no son iguales");
        }
    }
}
