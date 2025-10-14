package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class EsferaTest {

    Esfera esfera;

    //tring color, String material, double radio
    @BeforeEach
    void setUp(){
        esfera = new Esfera("Rosa", "Papel", 3.7);
    }

    //4/3 * Math.PI * Math.pow(this.getRadio(), 3);
    @Test
    void testVolumenDeMaterial(){
        assertEquals(4/3*Math.PI*Math.pow(3.7, 3), esfera.volumenDeMaterial("Papel"));
    }

    //4*Math.PI*Math.pow(this.getRadio(),2);
    @Test
    void testSuperficieDeColor(){
        assertEquals(4*Math.PI*Math.pow(3.7,2), esfera.superficieDeColor("Rosa"));
    }

}
