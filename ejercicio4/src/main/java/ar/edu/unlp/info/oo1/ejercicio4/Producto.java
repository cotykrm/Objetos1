package ar.edu.unlp.info.oo1.ejercicio4;

public class Producto {
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public Producto(String descripcion, double peso, double precioKilo ){
        this.peso = peso;
        this.precioPorKilo = precioKilo;
        this.descripcion = descripcion;
    }

    public double getPrecioPorKilo(){
        return this.precioPorKilo;
    }

    public double getPrecio(){
        return this.getPeso()*this.getPrecioPorKilo();
    }
    
    public void setPrecioPorKilo(double precioxKilo) {
    	this.precioPorKilo = precioxKilo;
    }

    public double getPeso(){
        return this.peso;
    }
    
    public String getDescripcion() {
    	return this.descripcion;
    }
}
