package ar.edu.unlp.info.oo1.ejercicio7;

public class Circulo implements Cara {
	private double radio;
	
	public Circulo() {};
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getDiametro() {
		return this.getRadio()*2;
	}
	
	public double getPerimetro() {
		return this.getRadio()*2*Math.PI;
	}
	
	public double getArea() {
		return Math.PI*Math.pow(this.getRadio(), 2);
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
}
