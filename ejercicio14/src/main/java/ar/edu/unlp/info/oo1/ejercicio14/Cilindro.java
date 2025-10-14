package ar.edu.unlp.info.oo1.ejercicio14;

public class Cilindro extends Pieza{
	private double radio;
	private double altura;

	public Cilindro(String color, String material, 
			double radio, double altura) {
		super(color,material);
		this.radio = radio;
		this.altura = altura;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double volumenDeMaterial(String material) {
		if(this.esMaterial(material)) {
			return Math.PI*Math.pow(this.getRadio(),2)*this.getAltura();
		}
		return 0;
	}
	
	public double superficieDeColor(String color) {
		if(this.esColor(color)) {
			return 2*Math.PI*this.getRadio()*this.getAltura()+2*Math.PI*Math.pow(this.getRadio(),2);
		}
		return 0;
	}
	
}
