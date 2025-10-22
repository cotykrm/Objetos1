package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
    private Carpeta c;
    private Carpeta cV;

    @BeforeEach
    void setUp(){
        c = new Carpeta("Carpeta1");
        cV = new Carpeta("Carpeta Vacia");
        Email e = new Email("Final octubre","LoremIpsum");
        c.agregarEmail(e);
        Email e2 =  new Email("Final octubre","LoremIpsum");
        c.agregarEmail(e2);

    }

    @Test
    void agregarEmailTest(){
        assertEquals(0,cV.getEmails().size());
        assertEquals(2,c.getEmails().size());
    }


    //Como se hace este test?
    @Test
    void moverTest(){
        Email e = new Email("Final octubre","LoremIpsum");
        c.agregarEmail(e);
        c.mover(e,cV);
        assertFalse(c.getEmails().contains(e));
        assertTrue(cV.getEmails().contains(e));
    }

    @Test
    void getTamanioTest(){
        assertEquals(0, cV.getTamanio());
        assertEquals(46, c.getTamanio());
    }
}
