package ar.edu.unlp.info.oo1.ejercicio19bis;

import static org.junit.jupiter.api.Asserts.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio19bis.DateLapse;

public class ReservaTest {
    Reserva r;

    @BeforeEach
    void setUp(){   
        DateLapse inter = new DateLapse(LocalDate.of(2025, 01, 7),LocalDate.of(2025, 01, 15));
        r = new Reser

    }

    @Test 
    void testGetDisponibilidad(){
        DateLapse inter = new DateLapse(LocalDate.of(0, 0, 0))
    }


}
