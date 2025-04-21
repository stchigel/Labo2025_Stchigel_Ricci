package unidad2;

import java.util.ArrayList;

public class operacionesBasicasSumaNumeros {
    public static void main(String[] args) {
        ArrayList<Double>Nambers = new ArrayList<Double>();
        float numerous=0;
        Nambers.add(73.0);
        Nambers.add(21.1);
        Nambers.add(23.1124);
        Nambers.add(33.1);
        for(Double numero : Nambers){
            numerous+=numero;
        }
        System.out.println(numerous);
    }
}
