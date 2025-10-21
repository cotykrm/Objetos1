package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {

    ClienteDeCorreo cliente;

    @BeforeEach
    void setUp(){
        cliente = new ClienteDeCorreo();
    }

    @Test
    void agregarEmailTest(){
        assertEquals(0, cliente.getInbox().);
    }

    @Test
    void buscarTest(){
        Carpeta c1 = new Carpeta("c1");
        cliente.agregarCarpeta(c1);
        Carpeta c2 = new Carpeta("c2");
        cliente.agregarCarpeta(c2);
        assertEquals("inbox",cliente.buscar("inbox"));

    }

}
