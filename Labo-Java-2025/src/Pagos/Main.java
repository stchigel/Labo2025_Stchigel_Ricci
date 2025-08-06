package Pagos;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Nicolas", "Maduro", 62, "La Casona", TipoDiseñador.UX);
        Empleado e2 = new Empleado("Maria", "Lopez", 30, "Av. Siempreviva 742", TipoDiseñador.UI);
        Empleado e3 = new Empleado("Juan", "Pérez", 45, "Calle Falsa 123", TipoDiseñador.IT);
        Empleado e4 = new Empleado("Lucia", "Fernandez", 28, "Diagonal Norte 800", TipoDiseñador.UX);
        Empleado e5 = new Empleado("Carlos", "Gomez", 39, "Ruta 8 km 34", TipoDiseñador.UI);


        Proyecto p1 = new Proyecto("Aplicación web para Instagram");
        Double pago1=10000000.0;
        Proyecto p2 = new Proyecto("Aplicación de edicion para Coscu 'Coscu Army Video'");
        Double pago2=27.0;
        Proyecto p3 = new Proyecto("Casco WWII para Gerónimo 'El Momo' Benavidez");
        Double pago3=1945.0;
        e1.addProyecto(p1, pago1);
        e1.addProyecto(p2, pago2);
        e1.addProyecto(p3, pago3);

        Proyecto p4 = new Proyecto("Diseño UI para sitio de Messi");
        Double pago4 = 1000000.0;
        Proyecto p5 = new Proyecto("Dashboard financiero para MercadoLibre");
        Double pago5 = 450000.0;
        e2.addProyecto(p4, pago4);
        e2.addProyecto(p5, pago5);

        Proyecto p6 = new Proyecto("Infraestructura backend para YPF");
        Double pago6 = 800000.0;
        Proyecto p7 = new Proyecto("Sistema de reservas para Aerolíneas Argentinas");
        Double pago7 = 900000.0;
        Proyecto p8 = new Proyecto("Seguridad IT para la Casa Rosada");
        Double pago8 = 500000.0;
        e3.addProyecto(p6, pago6);
        e3.addProyecto(p7, pago7);
        e3.addProyecto(p8, pago8);

        Proyecto p9 = new Proyecto("Rediseño UX para ANSES");
        Double pago9 = 350000.0;
        Proyecto p10 = new Proyecto("Mejora de accesibilidad para MiArgentina");
        Double pago10 = 290000.0;
        e4.addProyecto(p9, pago9);
        e4.addProyecto(p10, pago10);

        Proyecto p11 = new Proyecto("UI Kit para app de delivery");
        Double pago11 = 150000.0;
        Proyecto p12 = new Proyecto("Diseño web para banda indie de Geronimo 'El Momo' Benavidez con su canción 'Ella me Llama'");
        Double pago12 = 30000.0;
        Proyecto p13 = new Proyecto("Landing page para apuestas online");
        Double pago13 = 70000.0;
        e5.addProyecto(p11, pago11);
        e5.addProyecto(p12, pago12);
        e5.addProyecto(p13, pago13);

        System.out.println("Empleado 1:");
        System.out.println(e1.sueldoTotal());
        System.out.println(e1.cantProyectos());
        System.out.println(e1.cuantoGaneEnProyectoEspecifico(p1));
        e1.infoProyecto();

        System.out.println("-----------------------");
        System.out.println("Empleado 2:");
        System.out.println(e2.sueldoTotal());
        System.out.println(e2.cantProyectos());
        System.out.println(e2.cuantoGaneEnProyectoEspecifico(p4));
        e2.infoProyecto();

        System.out.println("-----------------------");
        System.out.println("Empleado 3:");
        System.out.println(e3.sueldoTotal());
        System.out.println(e3.cantProyectos());
        System.out.println(e3.cuantoGaneEnProyectoEspecifico(p7));
        e3.infoProyecto();

        System.out.println("-----------------------");
        System.out.println("Empleado 4:");
        System.out.println(e4.sueldoTotal());
        System.out.println(e4.cantProyectos());
        System.out.println(e4.cuantoGaneEnProyectoEspecifico(p10));
        e4.infoProyecto();

        System.out.println("-----------------------");
        System.out.println("Empleado 5:");
        System.out.println(e5.sueldoTotal());
        System.out.println(e5.cantProyectos());
        System.out.println(e5.cuantoGaneEnProyectoEspecifico(p12));
        e5.infoProyecto();

    }
}
