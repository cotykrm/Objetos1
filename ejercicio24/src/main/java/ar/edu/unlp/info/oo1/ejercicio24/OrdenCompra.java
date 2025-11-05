package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;

public class OrdenCompra extends Orden {
    private double precioEnvio;

    public OrdenCompra(LocalDate fecha, Usuario usuario, String domicilio) {
        super(fecha, usuario, domicilio);
    }

    @Override
    public double calcularCostoTotal() {
        return this.getProductos().stream()
        .mapToDouble(producto -> producto.getCosto())
        .sum();
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public boolean conDescuento(){
        long cant = this.getProductos().stream()
        .count();
        return cant >= 5;
    }
}