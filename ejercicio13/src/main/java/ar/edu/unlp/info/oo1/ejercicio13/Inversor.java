package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	List<Inversion> cartera;
	
	public Inversor () {
		this.cartera = new ArrayList<>();
		
	}
	
	public List<Inversion> getCartera(){
		return this.cartera;
	}
	
	public void agregarInversion(Inversion inve) {
		this.getCartera().add(inve);
	}
	
	public void quitarInversion(Inversion inve) {
		this.getCartera().remove(inve);
	}
	
	public double getValorInversionActual() {
		double total = 0;
		for(Inversion inve : this.getCartera()) {
			total += inve.getValorActual();
		}
		return total;
	}
}
