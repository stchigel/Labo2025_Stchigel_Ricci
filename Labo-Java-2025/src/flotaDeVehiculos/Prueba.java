package flotaDeVehiculos;

import objetos.Color;
import org.junit.jupiter.api.*;
import tiempo.Fecha;

public class Prueba {
    Flota f;
    @BeforeEach
    public void init(){
        f = new Flota();
        f.addAuto(new Auto("Volkswagen", "Gol",     Color.GREEN, 4, new Fecha(12,12,2008), "AB-123-CD", false));
        f.addAuto(new Auto("Ford",       "Fiesta",  Color.BLUE,  4, new Fecha(5, 6, 2012), "AB-123-CD", true ));
        f.addAuto(new Auto("Renault",    "Sandero", Color.RED,  4, new Fecha(23,9, 2015), "AB-123-CD", false));
        f.addAuto(new Auto("Peugeot",    "208",     Color.WHITE,4, new Fecha(14,2, 2019), "AB-123-CD", true ));
        f.addAuto(new Auto("Toyota",     "Yaris",   Color.GRAY,  4, new Fecha(30,11,2021), "AB-123-CD", false));
        f.addAuto(new Auto("Chevrolet",  "Onix",    Color.BLACK, 4, new Fecha(1, 4, 2024), "AB-123-CD", false));
        Camion c1 = new Camion("Mercedes‑Benz","Actros 2545",Color.WHITE,4,new Fecha(17,3,2018),"AB‑123‑CD",28000.0,0.0);
        c1.agregarPeso(3000.0);
        f.addCamion(c1);
        f.addCamion(new Camion("Scania","R 450",Color.RED,4,new Fecha(9,11,2019),"EF‑456‑GH",30000.0,0.0));
        f.addCamion(new Camion("Volvo","FH 540",Color.BLUE,4,new Fecha(25,7,2020),"IJ‑789‑KL",32000.0,0.0));
        f.addCamion(new Camion("Iveco","S‑Way 570",Color.GRAY,4,new Fecha(2,1,2021),"MN‑012‑OP",31500.0,0.0));
        f.addCamion(new Camion("MAN","TGX 18.510",Color.GREEN,4,new Fecha(14,6,2022),"QR‑345‑ST",29500.0,0.0));
        f.addCamion(new Camion("DAF","XF 530",Color.BLACK,4,new Fecha(30,10,2023),"UV‑678‑WX",30500.0,0.0));
        f.addBicicleta(new Bicicleta("Trek","Domane SL6",Color.BLUE,2,new Fecha(12,5,2019)));
        f.addBicicleta(new Bicicleta("Specialized","Allez Sprint",Color.RED,2,new Fecha(27,8,2020)));
        f.addBicicleta(new Bicicleta("Giant","Defy Advanced",Color.BLACK,2,new Fecha(3,3,2021)));
        f.addBicicleta(new Bicicleta("Cannondale","Synapse Carbon",Color.GRAY,2,new Fecha(15,9,2022)));
        f.addBicicleta(new Bicicleta("Scott","Addict RC",Color.WHITE,2,new Fecha(21,1,2023)));
        f.addBicicleta(new Bicicleta("Bianchi","Infinito CV",Color.MAGENTA,2,new Fecha(7,6,2024)));
        f.addBicicleta(new Bicicleta("Merida","Reacto 5000",Color.RED,2,new Fecha(11,11,2024)));
        f.addBicicleta(new Bicicleta("Orbea","Orca M20",Color.TEAL,2,new Fecha(4,4,2025)));
        f.addBicicleta(new Bicicleta("Cervélo","R5",Color.YELLOW,2,new Fecha(29,7,2023)));
        f.addBicicleta(new Bicicleta("Pinarello","Dogma F",Color.MAROON,2,new Fecha(18,2,2022)));


    }

    //masTenemos
    @Test
    public void masTenemos(){
        System.out.println(f.tipoMasTenemos());
    }

    //porcentajeDescapotable
    @Test
    public void descapot(){
        System.out.println(f.porcentajeDescapotable());
    }

    //agregarPeso
    @Test
    public void peso(){
        Camion c1 = new Camion("Mercedes‑Benz","Actros 2545", Color.WHITE, 4,new Fecha(17,3,2018),"AB‑123‑CD",28000.0,0.0);
        System.out.println(c1.getPesoAcumulado());
        c1.agregarPeso(3000.0);
        System.out.println(c1.getPesoAcumulado());
        c1.agregarPeso(30000.0);
        System.out.println(c1.getPesoAcumulado());
    }
}
