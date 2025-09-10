package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item() {

    }
	
	public Item(String detalle, int cant, double costoUn) {
		this.detalle = detalle;
		this.cantidad = cant;
		this.costoUnitario = costoUn;
	}
	
	public String getDetalle() {
		return this.detalle;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public double costo() {
		return this.costoUnitario*this.cantidad;
	}
}
