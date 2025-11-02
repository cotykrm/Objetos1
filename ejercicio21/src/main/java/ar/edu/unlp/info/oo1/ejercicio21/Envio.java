package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public abstract class Envio {
    private LocalDate fechaDespacho;
    private String origen;
    private String destino;
    private double peso;

    public Envio(LocalDate despacho, String origen, String destino, double peso){
        this.fechaDespacho = despacho;
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    public LocalDate getFechaDespacho(){
        return this.fechaDespacho;
    }

    public String getOrigen(){
        return this.origen;
    }

    public String getDestino(){
        return this.destino;
    }

    public double getPeso(){
        return this.peso;
    }

    public boolean dentroPeriodo(DateLapse periodo){
        return periodo.includesDate(this.getFechaDespacho());
    }

    public abstract double getMonto();




}
