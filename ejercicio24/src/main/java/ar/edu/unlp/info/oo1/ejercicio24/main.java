package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;

public class main {

    public static void main (String[] args) {
        Usuario juan = new Usuario("Juan", "Larrea 5800, Mar del Plata");
        Producto panel = new Producto("Panel solar", "Reciclable", 35000, false);
        Producto compo = new Producto("Compostera", "Madera", 8000, true);
        OrdenCompra o1 = new OrdenCompra(LocalDate.now(), juan, juan.getDomicilio());
        o1.agregarProducto(panel);
        o1.agregarProducto(compo);
        OrdenServicio o2 = new OrdenServicio(LocalDate.now(), juan, juan.getDomicilio(), "instalación de calefón solar", 5);
        Tecnico lu = new Tecnico("Lucía Iraola", "Instalaciones solares", 4500);
        Producto calefon = new Producto("Calefon solar", "Reciclable", 50000, false);
        o2.agregarProducto(calefon);
        o2.agregarTecnico(lu);
        juan.agregarOrden(o1);
        juan.agregarOrden(o2);

        System.out.println();
        
    }

}
