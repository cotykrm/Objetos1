package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Orden {
    protected LocalDate fecha;
    protected Usuario usuario;
    protected String domicilio;
    protected List<Producto> productos;

    public Orden(LocalDate fecha, Usuario usuario, String domicilio) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.domicilio = domicilio;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public abstract double calcularCostoTotal();

    public LocalDate getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public abstract boolean conDescuento();

    public double calcularCosto(){
        double total = this.calcularCostoTotal();
        if(this.conDescuento()){
            return total*0.9;
        }
        return total;
    }
}