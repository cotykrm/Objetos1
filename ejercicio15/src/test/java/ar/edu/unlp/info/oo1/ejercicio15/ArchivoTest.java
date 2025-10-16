package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {

    private Archivo ar;

    @BeforeEach
    void setUp(){
        ar = new Archivo("halo");
    }

    @Test
    void getTamanioTest(){
        assertEquals(4, ar.getTamanio());
    }



}
