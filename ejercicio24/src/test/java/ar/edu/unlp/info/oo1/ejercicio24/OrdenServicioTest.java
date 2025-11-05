package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrdenServicioTest {

    OrdenServicio o1;
    OrdenServicio o10;
    OrdenServicio o11;

    @BeforeEach 
    void setUp(){
        Usuario juan = new Usuario("Juan", "Larrea 5800, Mar del Plata");
        o1 = new OrdenServicio(LocalDate.now(), juan, juan.getDomicilio(), "instalación de calefón solar", 5);
        Tecnico lu = new Tecnico("Lucía Iraola", "Instalaciones solares", 4500);
        Producto calefon = new Producto("Calefon solar", "Reciclable", 50000, false);
        o1.agregarProducto(calefon);
        o1.agregarTecnico(lu);
        juan.agregarOrden(o1);
        o10 = new OrdenServicio(LocalDate.now(), juan, juan.getDomicilio(), "Una orden con 10 horas de trabajo", 10);
        o10.agregarProducto(calefon);
        o10.agregarTecnico(lu);
        o11 = new OrdenServicio(LocalDate.now(), juan, juan.getDomicilio(), "Una orden con 11 horas de trabajo", 11);
        o11.agregarProducto(calefon);
        o11.agregarTecnico(lu);

    }

    @Test
    void calcularCostoTotalTest(){
        assertEquals(72500, o1.calcularCostoTotal());
    }

    /*
     * si una orden de servicio requiere más de diez horas de trabajo
    */

    @Test
    void conDescuentoTest(){
        assertFalse(o1.conDescuento());
        assertFalse(o10.conDescuento());
        assertTrue(o11.conDescuento());
    }

    @Test
    void calcularCosoTest(){
        assertEquals(72500, o1.calcularCosto());
        assertEquals(95000, o10.calcularCosto());
        assertEquals(89550, o11.calcularCosto());
    }



}
