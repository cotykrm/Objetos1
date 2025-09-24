package ar.edu.unlp.info.oo1.ejercicio10;

public class main {
	public static void main(String[]args) {
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		System.out.println("aportes: "+ aportesDeAlan);
		System.out.println("sueldo basico: "+ sueldoBasicoDeAlan);
		
	}
}
