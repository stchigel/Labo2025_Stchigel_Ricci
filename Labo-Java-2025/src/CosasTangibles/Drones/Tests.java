/*package CosasTangibles.Drones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tiempo.Fecha;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    Sistema s1;
    @BeforeEach
    void init(){
        s1=new Sistema();
    }

    @Test
    void addDron() {
        assertEquals(0, s1.getDrones().size());
        s1.addDron(new DronVigilancia());
        assertEquals(1, s1.getDrones().size());
    }

    @Test
    void delDron() {
        DronVigilancia dronprueba = new DronVigilancia("DJI Neo Motion Fly", new Fecha(12, 5, 2017), 70.0, Estado.INACTIVO, new Mision(), 20.0);
        assertEquals(0, s1.getDrones().size());
        s1.addDron(dronprueba);
        assertEquals(1, s1.getDrones().size());
        s1.delDron(dronprueba);
        assertEquals(0, s1.getDrones().size());
    }

    @Test
    void modDron() {
        DronVigilancia dronprueba = new DronVigilancia("DJI Neo Motion Fly", new Fecha(12, 5, 2017), 70.0, Estado.INACTIVO, new Mision(), 20.0);
        DronVigilancia dronprueba2 = new DronVigilancia("DJI Neo Motion", new Fecha(12, 5, 2017), 70.0, Estado.INACTIVO, new Mision(), 20.0);
        assertEquals(0, s1.getDrones().size());
        s1.addDron(dronprueba);
        assertEquals(dronprueba, s1.selDron(0));
        s1.modDron(dronprueba, dronprueba2);
        assertEquals(dronprueba2, s1.selDron(0));
    }


}*/
