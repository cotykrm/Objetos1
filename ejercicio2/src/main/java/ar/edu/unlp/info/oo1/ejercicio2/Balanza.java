package ar.edu.unlp.info.oo1.ejercicio2;
import java.time.LocalDate;

public class Balanza {
    private int cantidadProductos;
    private double precioTotal;
    private double pesoTotal;

    public Balanza(){
        this.cantidadProductos = 0;
        this.precioTotal = 0;
        this.pesoTotal = 0;
    }
    

    public int getCantidadDeProductos() {
        return this.cantidadProductos;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    public double getPesoTotal() {
        return this.pesoTotal;
    }

    public void ponerEnCero(){
        this.cantidadProductos = 0;
        this.precioTotal = 0;
        this.pesoTotal = 0;
    }

    public void agregarProducto(Producto producto){
        this.precioTotal += producto.getPrecio();
        this.cantidadProductos++;
        this.pesoTotal += producto.getPeso();
    }

    public Ticket emitirTicket(){
        Ticket ticket = new Ticket(LocalDate.now(),this.cantidadProductos, this.precioTotal, this.precioTotal);
        return ticket;
    }

    
}
