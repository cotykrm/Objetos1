package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class Local extends Envio{
    private boolean envioRapido;

    public Local(LocalDate despacho, String origen, String destino, double peso, boolean envio) {
        super(despacho, origen, destino, peso);
        this.envioRapido = envio;
    }

    public boolean getEnvioRapido(){
        return this.envioRapido;
    }

    @Override
    public double getMonto(){
        double costoFijo = 1000;
        if(this.getEnvioRapido()){
            return costoFijo + 500;
        }
        return costoFijo;
    }

}
