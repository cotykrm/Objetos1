package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {

    ClienteDeCorreo c;
    ClienteDeCorreo cV;

    @BeforeEach
    void setUp(){
        c = new ClienteDeCorreo();Carpeta c1 = new Carpeta("c1");
        c.agregarCarpeta(c1);
        Carpeta c2 = new Carpeta("c2");
        c.agregarCarpeta(c2);
        Email e = new Email("Final octubre","LoremIpsum");
        c.recibir(e);
        cV = new ClienteDeCorreo();
    }

    @Test
    void agregarEmailTest(){
        assertEquals(0, cV.getInbox().getEmails().size());
        assertEquals(1,c.getInbox().getEmails().size());

    }

    @Test
    void buscarTest(){
        assertEquals("inbox",c.buscar("inbox"));

    }

    @Test 
    void espacioOcupadoTest(){

    }

}
