package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DataLapseTest {

    DateLapseI lap;
    DateLapseI lapCruceInf;
    DateLapseI lapCruce;
    DateLapseI lapCruceSup;


    @BeforeEach
    void setUp(){
        lap = new DateLapse(LocalDate.of(2004,07,15), LocalDate.of(2005,06,16));
        lapCruceInf = new DateLapse(LocalDate.of(2004,07,15), LocalDate.of(2004,07,15));
        lapCruce = new DateLapse(LocalDate.of(2005,06,16), LocalDate.of(2004,07,15));
        lapCruceSup = new DateLapse(LocalDate.of(2005,06,16), LocalDate.of(2005,06,16));
    
    }

    //testear cruces, o si el mismo dia da 0, todo eso.
    @Test
    void sizeInDaysTest(){
        assertEquals(336,lap.getSizeInDays());
        assertEquals(0, lapCruceInf.getSizeInDays());
        assertEquals(0, lapCruceSup.getSizeInDays());

    }

    @Test
    void includseDate(){
        LocalDate fli = LocalDate.of(2004,07,15);
        assertTrue(lap.includesDate(fli));
        LocalDate fls = LocalDate.of(2005,06,16);
        assertTrue(lap.includesDate(fls));
        LocalDate ffi = LocalDate.of(2004,07,14);
        assertFalse(lap.includesDate(ffi));
        LocalDate ffs = LocalDate.of(2005,06,17);
        assertFalse(lap.includesDate(ffs));
        LocalDate dentro = LocalDate.of(2005,01,8);
        assertTrue(lap.includesDate(dentro));

    }

}
