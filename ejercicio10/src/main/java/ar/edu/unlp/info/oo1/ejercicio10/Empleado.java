package ar.edu.unlp.info.oo1.ejercicio10;

public class Empleado {
	private String nombre;
	
	
	public Empleado(String nombre) {
        this.nombre = nombre;
	}
	
	public double montoBasico() {
		return 35000;
	}
	
	public double aportes() {
		return 135000;
	}
	
	public double sueldoBasico() {
		return this.montoBasico() + this.aportes();
	}
	


}
