package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
    private Carpeta c;

    @BeforeEach
    void setUp(){
        c = new Carpeta("Carpeta1");

    }

    @Test
    void agregarEmailTest(){
        assertEquals(0,c.getEmails().size());
        Email e = new Email("Final octubre","LoremIpsum");
        c.agregarEmail(e);
        Email e2 =  new Email("Final octubre","LoremIpsum");
        c.agregarEmail(e2);
        assertEquals(2,c.getEmails().size());
    }


    //Como se hace este test?
    @Test
    void moverTest(){
        Email e = new Email("Final octubre","LoremIpsum");
        c.agregarEmail(e);
        Email e2 =  new Email("Final octubre","LoremIpsum");
        c.agregarEmail(e2);
    }

    @Test
    void getTamanioTest(){
        Email e = new Email("Final octubre","LoremIpsum");
        c.agregarEmail(e);
        Email e2 =  new Email("Final octubre","LoremIpsum");
        c.agregarEmail(e2);

        assertEquals(46, c.getTamanio());
    }
}
