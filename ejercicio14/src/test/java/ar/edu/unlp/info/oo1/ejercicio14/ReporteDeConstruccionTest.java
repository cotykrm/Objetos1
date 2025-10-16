package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {

    ReporteDeConstruccion repo;

    
    @BeforeEach
    void setUp(){
        repo = new ReporteDeConstruccion();
    }

    @Test
    void volumenDeMaterialTest(){
        assertEquals(expected, actual);
    }
    
    @Test
    void superficieDeColorTest(){

    }

}
