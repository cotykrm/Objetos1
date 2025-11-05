package ar.edu.unlp.info.oo1.ejercicio19bis;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropiedadTest {

    Propiedad p0;
    Propiedad p1;
    Propiedad p2;

    @BeforeEach
    void setUp(){
        p0 = new Propiedad("Cabaña", "cualquiera", 800);
        p1 = new Propiedad("Aguada", "que se yo", 1000);
        p2 = new Propiedad("Entre casa", "uno original", 950);

    }

    @Test 
    void crearReservaTest(){

        assertEquals(0, p0.getReservas().size());

        p0.crearReserva(LocalDate.of(2025, 11, 06),
        LocalDate.of(2025, 11, 15));

        assertEquals(1, p0.getReservas().size());
    }
}
