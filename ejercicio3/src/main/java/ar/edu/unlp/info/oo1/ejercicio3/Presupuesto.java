package ar.edu.unlp.info.oo1.ejercicio3;
import java.time.LocalDate;
import java.util.List;
import java.util.LinkedList;


public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		this.cliente = cliente;
	}
	
	public Presupuesto(String cliente, LocalDate fecha) {
		this.fecha = fecha;
		this.cliente = cliente;
		this.items = new LinkedList<Item>();
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public List<Item> getItems(){
		return this.items;
	}
	
	public void agregarItem(Item itemNuevo) {
		this.items.add(itemNuevo);
	}
	
	public double calcularTotal() {
		double costoT = 0;
		for(Item item : this.items) {
			costoT += item.costo();
		}
		return costoT;
	}
}
