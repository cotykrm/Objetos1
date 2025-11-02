package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class InterUrbano extends Envio{
    private double distancia;

    public InterUrbano(LocalDate despacho, String origen, String destino, double peso, double distancia, boolean rapido) {
        super(despacho, origen, destino, peso);
        this.distancia = distancia;
    }

    public double getDistancia(){
        return this.distancia;
    }

    public double getMonto(){
        double distancia = this.getDistancia();
        if(distancia>0 && distancia<100){
            return distancia*this.getPeso()*20;
        }
        if((distancia>=100)&&(distancia<=500)){
            return distancia*this.getPeso()*25;
        }
        if(distancia>500){
            return distancia*this.getPeso()*30;
        }
        return 0;
    }

    
}
