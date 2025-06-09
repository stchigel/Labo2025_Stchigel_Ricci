package tiendaElectronica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto p1=new Producto();
        Producto p2=new Producto();
        Producto p3=new Producto();
        Producto p4=new Producto();
        Producto p5=new Producto();
        Producto p6=new Producto();

        ArrayList<Producto>pds1=new ArrayList<>();
        pds1.add(p1);
        pds1.add(p2);
        pds1.add(p3);

        Sistema S=new Sistema(pds1);

    }
}
