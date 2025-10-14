package ar.edu.unlp.info.oo1.ejercicio14;

import java.util.List;
import java.util.ArrayList;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	
	
	public List<Pieza> getPieza(){
		return this.piezas;
	}
	
	public double volumenDeMaterial(String material) {
		double total = 0;
		for(Pieza pieza : this.getPieza()) {
			total += pieza.volumenDeMaterial(material);
		}
		return total;
	}
	
	
	public double superficieDeColor(String color) {
		double total = 0;
		for(Pieza pieza : this.getPieza()) {
			total += pieza.superficieDeColor(color);
		}
		return total;
	}
	
}
