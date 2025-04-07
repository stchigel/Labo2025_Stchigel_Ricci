package unid0;

import java.util.Scanner;

public class IngresarNumerosHasta {
    public static void main(String[] args) {
        int contador=0;
        int numero=0;
        Scanner e=new Scanner(System.in);
        while (numero!=-1) {
            System.out.println("Ingresa un numero");
            numero=e.nextInt();
            if (numero != -1) {
                contador = contador + 1;
            }
        }
        System.out.println("La cantidad de numeros ingresados es "+contador);
    }
}
