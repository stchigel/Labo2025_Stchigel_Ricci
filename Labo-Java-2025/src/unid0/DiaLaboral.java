package unid0;

import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa un dia de la semana");
        String Dia = entrada.nextLine();
        if(Dia.equals("Lunes") || Dia.equals("Martes") || Dia.equals("Miercoles") || Dia.equals("Jueves") || Dia.equals("Viernes")) {
            System.out.println(Dia + " es un dia laboral");
        }
        else if(Dia.equals("Sabado") || Dia.equals("Domingo")){
            System.out.println(Dia + " no es un dia laboral");
        }
        else{
            System.out.println(Dia + " no es un dia existente");
        }
    }
}
