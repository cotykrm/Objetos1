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
		return this.piezas.stream()
		.mapToDouble(pieza->pieza.volumenDeMaterial(material))
		.sum();
	}
	
	
	public double superficieDeColor(String color) {
		return this.piezas.stream()
		.mapToDouble(pieza->pieza.superficieDeColor(color))
		.sum();
	}
	
}
