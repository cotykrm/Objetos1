package ar.edu.unlp.info.oo1.ejercicio14;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza(String color, String material) {
		this.color = color;
		this.material = material;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	protected boolean esColor(String color) {
		return this.getColor().equals(color);

	}
	
	protected boolean esMaterial(String material) {
		return this.getMaterial().equals(material);
	}
	
	public abstract double volumenDeMaterial(String material);
	
	public abstract double superficieDeColor(String color);
	
}
