package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class Internacional extends Envio{
    private boolean envioRapido;
    
    public Internacional(LocalDate despacho, String origen, String destino, double peso, boolean envio) {
        super(despacho, origen, destino, peso);
        this.envioRapido = envio;
    }

    public boolean getEnvioRapido(){
        return this.envioRapido;
    }

    @Override
    public double getMonto() {
        double costoFijo = 5000;
        if(this.getEnvioRapido()){
            costoFijo += 800;
        }
        if(this.getPeso()<=1000){
            return this.getPeso()*10 + costoFijo;
        }
        if(this.getPeso()>1000){
            return this.getPeso()*12 + costoFijo;
        }
        return 0;
    }

}
