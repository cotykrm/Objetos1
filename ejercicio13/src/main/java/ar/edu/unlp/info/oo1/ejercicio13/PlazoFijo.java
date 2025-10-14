package ar.edu.unlp.info.oo1.ejercicio13;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	private LocalDate fecha;
	private double montoDepositado;
	private double porcentajeInteres;
	
	public PlazoFijo(double montoDepositado, double interes) {
		this.fecha = LocalDate.now();
		this.montoDepositado = montoDepositado;
		this.porcentajeInteres = interes;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double getMontoDepositado() {
		return this.montoDepositado;
	}
	
	public double getPorcentajeInteres() {
		return this.porcentajeInteres;
	}
	
	public double getValorActual() {
		Long dias = ChronoUnit.DAYS.between(LocalDate.now(), this.getFecha());
		return this.getMontoDepositado() + dias*this.getPorcentajeInteres();
 	}
}
