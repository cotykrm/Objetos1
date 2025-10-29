package ar.edu.unlp.info.oo1.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class ReservaTest {

    Reserva r1;
    Reserva r2;

    @BeforeEach
    void setUp(){
        Propiedad p = new Propiedad("Casa", "Calle 1", 10);
        Propiedad p1 = new Propiedad("Departamento", "Calle 69", 15);
        r1 = new Reserva(LocalDate.of(2025, 12, 20), 
        LocalDate.of(2025, 12, 31), p);
        r2 = new Reserva(LocalDate.of(2026, 01, 10), 
        LocalDate.of(2026, 01, 21), p1);

    }

    @Test
    void getPrecioTest(){
        assertEquals(110,r1.getPrecio());
    }

    @Test
    void getRedistribucionTest(){
        DateLapse periodo = new DateLapse(LocalDate.of(2026, 01, 01), 
        LocalDate.of(2026, 01, 30));
        assertEquals(0, r1.getRedistribucion(periodo));
        assertEquals(r2.getPrecio(), r2.getRedistribucion(periodo));
    }
}
