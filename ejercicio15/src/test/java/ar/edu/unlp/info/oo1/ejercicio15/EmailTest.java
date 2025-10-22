package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {

    private Email email;
    private Email emailV;
    private Email emailC;

    //String titulo, String cuerpo
    @BeforeEach
    void setUp(){

        emailV = new Email("","");
        emailC = new Email("Cabecera","Solo titulo");
        email = new Email("Final octubre","LoremIpsum");
        Archivo ar1 = new Archivo("abc");
        email.addArchivo(ar1);
        Archivo ar2 = new Archivo("qwer");
        email.addArchivo(ar2);
        Archivo ar3 = new Archivo("patita");
        email.addArchivo(ar3);
    }

    @Test
    void getTamanioTest(){
        assertEquals(0,emailV.getTamanio());
        assertEquals(19,emailC.getTamanio());
        assertEquals(36,email.getTamanio());

    }

    @Test
    void buscarTest(){
        assertEquals(emailC,emailC.buscar("olo"));
        assertNotEquals(emailV, emailV.buscar("olo"));
    }

}