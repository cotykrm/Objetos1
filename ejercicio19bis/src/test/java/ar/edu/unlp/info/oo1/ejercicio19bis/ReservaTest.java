package ar.edu.unlp.info.oo1.ejercicio19bis;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ReservaTest {
    Reserva r;

    @BeforeEach
    void setUp(){   
        r = new Reserva(LocalDate.of(2025, 01, 16), 
        LocalDate.of(2025,01, 20));

    }

    @Test 
    void testGetDisponibilidad(){
        DateLapse i1 = new DateLapse(LocalDate.of(2025, 01, 7),
        LocalDate.of(2025, 01, 15));

        DateLapse i2 = new DateLapse(LocalDate.of(2025, 01, 10), 
        LocalDate.of(2025, 01, 17));

        assertTrue(r.getDisponibilidad(i1));
        assertFalse(r.getDisponibilidad(i2));
    }

    @Test 
    void enCursoTest(){
        Reserva r2 = new Reserva(LocalDate.of(2025,11,1), 
        LocalDate.of(2025,11,5));

        Reserva r3 = new Reserva(LocalDate.of(2025,11,5), 
        LocalDate.of(2025,11,10));

        Reserva r4 = new Reserva(LocalDate.of(2025, 11, 06),
        LocalDate.of(2025, 11, 15));

        assertTrue(r2.enCurso());
        assertTrue(r3.enCurso());
        assertFalse(r4.enCurso());

    }

    
}