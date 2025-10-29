package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements Politica{


/*Política de cancelación moderada: reembolsa el monto total si la 
cancelación se hace hasta una semana antes y 50% si se hace hasta 2 días antes. */
    @Override
    public double calcularReembolso(Reserva reserva) {
        long diferencia = ChronoUnit.DAYS.between(LocalDate.now(), reserva.getLapso().getFrom());
        if(diferencia >= 7){
            return reserva.getPrecio();
        }
        if(diferencia >= 2){
            return reserva.getPrecio()*0.5;
        }
        return 0;
        
    }
    

}
