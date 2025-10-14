package ar.edu.unlp.info.oo1.ejercicio14;

public class Esfera extends Pieza{
	private double radio;
	
	public Esfera(String color, String material, double radio) {
		super(color,material);
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double volumenDeMaterial(String material) {
		if(this.esMaterial(material)) {
			return 4/3 * Math.PI * Math.pow(this.getRadio(), 3);
		}
		return 0;
	}
	
	public double superficieDeColor(String color) {
		if(this.esColor(color)) {
			return 4*Math.PI*Math.pow(this.getRadio(),2);
		}
		return 0;
	}

}
