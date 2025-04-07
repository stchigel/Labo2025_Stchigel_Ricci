package unid0;

import java.util.Scanner;

public class IngresarNumerosHastAmpliado {
    public static void main(String[] args) {
        int contador=0;
        int numero=0;
        int mayor=0;
        int menor=0;
        int sumaPOS=0;
        int sumaNEG=0;
        Scanner e=new Scanner(System.in);
        while (numero!=-1) {
            System.out.println("Ingresa un numero");
            numero=e.nextInt();
            if (numero != -1||numero==-1) {
                contador = contador + 1;
            }
            if(mayor<numero){
                mayor=numero;
            }
            if(menor>numero){
                menor=numero;
            }
            if(numero>0){
                sumaPOS=sumaPOS+numero;
            }
            if(numero<0){
                sumaNEG=sumaNEG+numero;
            }
        }
        System.out.println("La cantidad de numeros ingresados es "+contador);
        System.out.println("El numero mas grande es "+mayor);
        System.out.println("EL numero mas chico es "+menor);
        System.out.println("La suma de los numeros positivos es "+sumaPOS);
        System.out.println("La suma de los numeros negativos es "+sumaNEG);
    }
}
