package ar.edu.unlp.info.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
 
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class DateLapseTest {

    DateLapse lap;
    DateLapse lapCruceInf;
    DateLapse lapCruce;
    DateLapse lapCruceSup;


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
        assertEquals(336,lap.sizeInDays());
        assertEquals(0, lapCruceInf.sizeInDays());
        assertEquals(0, lapCruceSup.sizeInDays());
        

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
