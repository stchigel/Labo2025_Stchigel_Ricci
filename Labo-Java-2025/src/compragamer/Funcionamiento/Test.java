package compragamer.Funcionamiento;
import compragamer.Compra.Pedido;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    public Sistema s;
    @BeforeEach
    public void init(){
        s=new Sistema();
    }

    @org.junit.jupiter.api.Test
    public void agregarCompra(){
        int aux = s.getPedidos().size();;
        assertEquals(aux, s.getPedidos().size());
        compragamer.Compra.Pedido p1 = new Pedido();
        s.agregarPedido(p1);
        assertEquals(aux+1, s.getPedidos().size());
        s.actualizarStock();
    }
}
