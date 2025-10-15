package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class PrismaRectangularTest {
    PrismaRectangular prisma;

    //(String color, String material, double mayor, double menor, double h
    @BeforeEach
    void setUp(){
        prisma = new PrismaRectangular("Amarillo","Papel",12.0,5.5,10.0);
    }

    @Test
    void testVolumenDeMaterial(){
        assertEquals(12.0*5.5*10.0, prisma.volumenDeMaterial("Papel"));
    }

    @Test
    void testSuperficieDeColor(){
        assertEquals(2*(12.0*5.5+12.0*10.0+5.5*10.0), prisma.superficieDeColor("Amarillo"));
    }
}
