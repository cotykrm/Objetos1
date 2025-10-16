package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {

    private Email email;

    //String titulo, String cuerpo
    @BeforeEach
    void setUp(){
        email = new Email("Final octubre","LoremIpsum");
    }

    /*public int getTamanio(){
        int aux = this.getAdjuntos().stream()
        .mapToInt(adjunto->adjunto.getTamanio())
        .sum(); 
        return aux + this.getCuerpo().length() + this.getTitulo().length();
    }*/

    @Test
    void getTamanioTest(){
        assertEquals(23,email.getTamanio());

        Archivo ar1 = new Archivo("abc");
        email.addArchivo(ar1);
        Archivo ar2 = new Archivo("qwer");
        email.addArchivo(ar2);

        assertEquals(30,email.getTamanio());

        Archivo ar3 = new Archivo("patita");
        email.addArchivo(ar3);
        assertEquals(36,email.getTamanio());

    }

}