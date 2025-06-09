package tiendaElectronica;

import org.junit.jupiter.api.*;

public class Test {
    Sistema s1;
    @org.junit.jupiter.api.Test
    void init(){
        s1=new Sistema();
    }

    @org.junit.jupiter.api.Test
    void MasAlto(){
        Producto p1=new Producto("Galaxy s22", 10000000.0, 35, Categoria.DEFAULT);
        Producto p2=new EquipoDeSonido("LG XBOOM CM4340", 3567.89, 13, true);
        s1.addProducto(p1);
        s1.addProducto(p2);
        assertEquals(s1.maxStock(), p1);
    }

    @org.junit.jupiter.api.Test
    void MasBajo(){
        Producto p1=new Producto("Galaxy s22", 10000000.0, 35, Categoria.DEFAULT);
        Producto p2=new EquipoDeSonido("LG XBOOM CM4340", 3567.89, 13, true);
        s1.addProducto(p1);
        s1.addProducto(p2);
        assertEquals(s1.minStock(), p2);
    }
}
