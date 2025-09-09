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

    public void ponerEnCero(){
        this.cantidadProductos = 0;
        this.precioTotal = 0;
        this.pesoTotal = 0;
    }

    public void agregarProducto(Prodcuto producto){
        this.precioTotal += producto.getPrecio();
        this.cantidadProductos++;
        this.pesoTotal += producto.getPeso();
    }

    public Ticket emitirTicket(){
        
    }

    
}
