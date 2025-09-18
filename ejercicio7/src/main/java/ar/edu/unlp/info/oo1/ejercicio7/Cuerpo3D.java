package ar.edu.unlp.info.oo1.ejercicio7;

public class Cuerpo3D {
	private double altura;
	private Cara caraBasal;
	
	public Cuerpo3D() {};
	
	public Cuerpo3D(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Cara getCaraBasal() {
		return this.caraBasal;
	}
	
	public void setCaraBasal(Cara caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
		Cara cara = this.getCaraBasal();
		return cara.getArea()*this.getAltura();
	}
	
	public double getSuperficieExterior() {
		Cara cara = this.getCaraBasal();
		return 2*cara.getArea()+cara.getPerimetro()*this.getAltura();
	}

}


