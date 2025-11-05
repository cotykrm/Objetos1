package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class OrdenCompraTest {

    OrdenCompra o1;
    OrdenCompra o5;
    OrdenCompra o6;

    @BeforeEach
    void setUp(){
        Usuario juan = new Usuario("Juan", "Larrea 5800, Mar del Plata");

        Producto panel = new Producto("Panel solar", "Reciclable", 35000, false);
        Producto compo = new Producto("Compostera", "Madera", 8000, true);
        Producto deter = new Producto("Detergente ecológico", "Plástico reciclado", 500, true);
        Producto cep = new Producto("Cepillo", "Madera", 200, true);
        Producto espon = new Producto("Esponja vegetal","Fibras naturales compostables",800,true);
        Producto desi = new Producto("Desinfectante","Con amonio cuaternario", 500, false);

        o1 = new OrdenCompra(LocalDate.now(), juan, juan.getDomicilio());
        o1.agregarProducto(panel);
        o1.agregarProducto(compo);

        o5 = new OrdenCompra(LocalDate.now(), juan, juan.getDomicilio());
        o5.agregarProducto(panel);
        o5.agregarProducto(compo);
        o5.agregarProducto(deter);
        o5.agregarProducto(cep);
        o5.agregarProducto(espon);

        o6 = new OrdenCompra(LocalDate.now(), juan, juan.getDomicilio());
        o6.agregarProducto(panel);
        o6.agregarProducto(compo);
        o6.agregarProducto(deter);
        o6.agregarProducto(cep);
        o6.agregarProducto(espon);
        o6.agregarProducto(desi);


    }

    @Test
    void calcularCostoTotalTest(){
        assertEquals(43000, o1.calcularCostoTotal());
    }

    /*
     * si una orden de compra incluye cinco o más productos
    */


    @Test
    void conDescuentoTest(){
        assertFalse(o1.conDescuento());
        assertTrue(o5.conDescuento());
        assertTrue(o6.conDescuento());
    }

    @Test
    void CalcularCostoTest(){
        assertEquals(43000, o1.calcularCosto());
        assertEquals(40050, o5.calcularCosto());
        assertEquals(40500, o6.calcularCosto());
    }
}
