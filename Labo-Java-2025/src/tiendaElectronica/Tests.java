package tiendaElectronica;

import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

public class Tests {
    Sistema s1;
    @BeforeEach
    void init(){
        s1=new Sistema();
    }

    @Test
    void MasAlto(){
        Producto p1=new Producto("Galaxy s22", 10000000.0, 35, Categoria.DEFAULT);
        Producto p2=new EquipoDeSonido("LG XBOOM CM4340", 3567.89, 13, true);
        s1.addProducto(p1);
        s1.addProducto(p2);
        assertEquals(s1.maxStock(), p1);
    }

    @Test
    void MasBajo(){
        Producto p1=new Producto("Galaxy s22", 10000000.0, 35, Categoria.DEFAULT);
        Producto p2=new EquipoDeSonido("LG XBOOM CM4340", 3567.89, 13, true);
        s1.addProducto(p1);
        s1.addProducto(p2);
        assertEquals(s1.minStock(), p2);
    }
}
