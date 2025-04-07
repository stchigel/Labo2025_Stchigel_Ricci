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
        if(palabra1.equals(palabra2)){
            System.out.println("La 2 palabras son iguales");
        }
        else{
            System.out.println("La 2 palabras no son iguales");
        }
    }
}
