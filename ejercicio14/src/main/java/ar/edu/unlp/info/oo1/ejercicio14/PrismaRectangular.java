package ar.edu.unlp.info.oo1.ejercicio14;

public class PrismaRectangular extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	public PrismaRectangular(String color, String material, 
			double mayor, double menor, double h) {
		super(color,material);
		this.ladoMayor = mayor;
		this.ladoMenor = menor;
		this.altura = h;
	}
	
	public double getLadoMayor(){
		return this.ladoMayor;
	}

	public double getLadoMenor(){
		return this.ladoMenor;
	}

	public double getAltura(){
		return this.altura;
	}

	public double volumenDeMaterial(String material) {
		if(this.esMaterial(material)) {
			return this.getLadoMayor()*this.getLadoMenor()*this.getAltura();
		}
		return 0;
	}
	
	public double superficieDeColor(String color) {
		if(this.esColor(color)) {
			return 2*(this.getLadoMayor()*this.getLadoMenor() + 
			this.getLadoMayor()*this.getAltura() + this.getLadoMenor()*this.getAltura());
		}
		return 0;
	}


	/*Volumen del prisma: ladoMayor * ladoMenor * altura
Superficie del prisma: 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura)
 */


}
