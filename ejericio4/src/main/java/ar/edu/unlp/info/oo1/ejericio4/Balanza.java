package ar.edu.unlp.info.oo1.ejericio4;
import java.time.LocalDate;
import java.util.List;
import java.util.LinkedList;

public class Balanza {
    private int cantidadProductos;
    private List<Producto> productos;

    public Balanza(){
        this.cantidadProductos = 0;
        this.productos = new LinkedList<Producto>();
    }
    

    public int getCantidadDeProductos() {
        return this.cantidadProductos;
    }

    public double getPrecioTotal() {
        double total = 0;
        for(Producto p : this.productos) {
        	total += p.getPrecio();
        }
    	return total;
    }

    public double getPesoTotal() {
    	double total = 0;
        for(Producto p : this.productos) {
        	total += p.getPeso();
        }
    	return total;
    }

    public void ponerEnCero(){
        this.cantidadProductos = 0;
        this.productos.clear();
    }

    public void agregarProducto(Producto producto){
        this.cantidadProductos++;
        this.productos.add(producto);
    }

    public Ticket emitirTicket(){
        Ticket ticket = new Ticket(LocalDate.now(),this.cantidadProductos, this.getPesoTotal(), this.getPrecioTotal());
        return ticket;
    }
    
    public List<Producto> getProductos(){
    	return this.productos;
    }

    
}
