package ar.edu.unlp.info.oo1.ejercicio4;

//java.time.LocalDate. Para crear la fecha actual, puede utilizar LocalDate.now().
import java.time.LocalDate;
//import java.util.Date;

public class Ticket {
    private LocalDate fecha;
    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;
    
    public Ticket(LocalDate fecha,int cantProd, double pesoTotal, double precioTotal){
        this.fecha = fecha;
        this.cantidadDeProductos = cantProd;
        this.precioTotal = precioTotal;
        this.pesoTotal = pesoTotal;
    }
    

    public int getCantidadDeProductos() {
        return this.cantidadDeProductos;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    public double getPesoTotal() {
        return this.pesoTotal;
    }
    
    public LocalDate getFecha() {
    	return this.fecha;
    }
    
    public double impuesto() {
    	return this.precioTotal * 0.21;
    }
}
