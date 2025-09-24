package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.LinkedList;
import java.util.List;

public class Farola {
	private boolean interruptor;
	private List<Farola> vecinas;
	
	
	public Farola() {
		this.interruptor = false;
		this.vecinas = new LinkedList<Farola>();
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		this.getNeighbors().add(otraFarola);
		otraFarola.getNeighbors().add(this);
	}
	
	public List<Farola> getNeighbors(){
		return this.vecinas;
	}
	
	public void turnOn() {
		if(!this.isOn()) {
			this.interruptor = true;
			for(Farola f : this.getNeighbors()) {
				f.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if(this.isOn()) {
			this.interruptor = false;
			for(Farola f : this.getNeighbors()) {
				f.turnOff();
			}
		}
	}
	
	public boolean isOn() {
		return this.interruptor;
	}
	
	public boolean isOff() {
		return !this.interruptor;
	}
}
