package Tiendas.sistemaDePedidos;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Prueba {
    Sistema s;
    @BeforeEach
    void init(){
        this.s = new Sistema();
        s.agregarPlato(new Plato("Hamburguesa", 7500.0));
        s.agregarPlato(new Plato("Milanesa", 10000.0));
        s.agregarPlato(new Plato("Pizza", 9500.0));
        s.agregarPlato(new Plato("Empanadas", 6000.0));
        s.agregarPlato(new Plato("Lomito", 11000.0));
        s.agregarPlato(new Plato("Tarta de Jamón y Queso", 7000.0));
        s.agregarPlato(new Plato("Ensalada César", 8500.0));
        s.agregarPlato(new Plato("Pollo al horno", 9800.0));
        s.agregarPlato(new Plato("Papas fritas", 4500.0));
        s.agregarPedido(new Pedido(LocalDate.now(), s.buscarPlato("Empanadas"),
                new Alumno("Juan", "Manuel", "3C"), LocalTime.now(), "En Proceso"));
        s.agregarPedido(new Pedido(LocalDate.now(), s.buscarPlato("Milanesa"),
                new Profesor("Alberto", "Dobric", 25.0), LocalTime.now(), "Entregado"));
        s.agregarPedido(new Pedido(LocalDate.of(2025, 5, 20), s.buscarPlato("Pizza"),
                new Alumno("Lucía", "Fernández", "2A"), LocalTime.of(12, 15), "En Proceso"));

        s.agregarPedido(new Pedido(LocalDate.of(2025, 5, 18), s.buscarPlato("Lomito"),
                new Profesor("Ricardo", "Sosa", 15.0), LocalTime.of(13, 30), "Entregado"));

        s.agregarPedido(new Pedido(LocalDate.of(2025, 5, 21), s.buscarPlato("Tarta de Jamón y Queso"),
                new Alumno("Valentina", "Méndez", "4B"), LocalTime.of(11, 45), "Pendiente"));

        s.agregarPedido(new Pedido(LocalDate.of(2025, 5, 19), s.buscarPlato("Pollo al horno"),
                new Profesor("María", "Gómez", 20.0), LocalTime.of(14, 5), "En Proceso"));

        s.agregarPedido(new Pedido(LocalDate.of(2025, 5, 17), s.buscarPlato("Ensalada César"),
                new Alumno("Santiago", "Ibarra", "1D"), LocalTime.of(12, 0), "Cancelado"));

        s.agregarPedido(new Pedido(LocalDate.of(2025, 5, 21), s.buscarPlato("Ñoquis con salsa"),
                new Profesor("Claudia", "Martínez", 10.0), LocalTime.of(13, 10), "Entregado"));

        s.agregarPedido(new Pedido(LocalDate.of(2025, 5, 20), s.buscarPlato("Papas fritas"),
                new Alumno("Camila", "Ruiz", "5C"), LocalTime.of(11, 20), "En Proceso"));

        s.agregarPedido(new Pedido(LocalDate.of(2025, 5, 16), s.buscarPlato("Hamburguesa"),
                new Profesor("Esteban", "Lopez", 5.0), LocalTime.of(12, 40), "Pendiente"));
    }

    //agregar un plato
    @Test
    public void agregarPlato(){
        System.out.println(s.getPlatos().size());
        s.agregarPlato(new Plato("Ñoquis con salsa", 9000.0));
        System.out.println(s.getPlatos().size());
    }
    //quitar un plato
    @Test
    public void quitarPlato(){
        System.out.println(s.getPlatos().size());
        s.eliminarPlato("Milanesa");
        System.out.println(s.getPlatos().size());
    }

    //Platos a cocinar
    @Test
    public void platosACocinar(){
        s.pedidosHoy();
    }

    //Precio Pedido alumno
    @Test
    public void pedidoAlumno(){
        s.agregarPlato(new Plato("Varenikes", 75000.0));
        Pedido p1 = new Pedido(LocalDate.now(), s.buscarPlato("Varenikes"),
                new Alumno("Manuel", "Merlo", "3C"), LocalTime.now(), "En Proceso");
        System.out.println(p1.calcularPrecio());
    }

    //Precio Pedido docente
    @Test
    public void pedidoDocente(){
        s.agregarPlato(new Plato("Varenikes", 75000.0));
        Pedido p1 = new Pedido(LocalDate.now(), s.buscarPlato("Varenikes"),
                new Profesor("Santiago", "Baietti", 23.0), LocalTime.now(), "En Proceso");
        System.out.println(p1.calcularPrecio());
    }
    //Top 3
    @Test
    public void top3(){
        s.topTres();
    }
}
