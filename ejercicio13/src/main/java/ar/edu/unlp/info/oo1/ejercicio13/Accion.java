package ar.edu.unlp.info.oo1.ejercicio13;

public class Accion implements Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public Accion(String nombre, double valorUnitario) {
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getValorUnitario() {
		return this.valorUnitario;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public double getValorActual() {
		return this.getCantidad()*this.getValorUnitario();
	}
	
	
}
