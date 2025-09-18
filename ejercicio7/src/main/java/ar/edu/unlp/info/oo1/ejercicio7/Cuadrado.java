package ar.edu.unlp.info.oo1.ejercicio7;

public class Cuadrado implements Cara{
	private double lado;
	
	public Cuadrado() {};
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getPerimetro() {
		return this.getLado()*4;
	}
	
	public double getArea() {
		return Math.pow(this.getLado(), 2);
	}
}
