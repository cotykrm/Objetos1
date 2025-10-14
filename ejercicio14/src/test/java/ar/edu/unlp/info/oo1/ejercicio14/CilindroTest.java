package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class CilindroTest {

    Cilindro cilindro;

    //String color, String material, double radio, double altura)
    @BeforeEach
    void setUp(){
        cilindro = new Cilindro("Violeta","Carton",5.0,10.0);

    }

    //Math.PI*Math.pow(this.getRadio(),2)*this.getAltura();
    @Test
    void testVolumenDeMaterial(){
        assertEquals(Math.PI*Math.pow(5.0,2)*10,cilindro.volumenDeMaterial("Carton"));
    }
    
    //2*Math.PI*this.getRadio()*this.getAltura()+2*Math.PI*Math.pow(this.getRadio(),2);
    @Test
    void testSuperficie(){
        assertEquals(2*Math.PI*5.0*10.0+2*Math.PI*Math.pow(5.0,2),cilindro.superficieDeColor("Violeta"));
    }

}
