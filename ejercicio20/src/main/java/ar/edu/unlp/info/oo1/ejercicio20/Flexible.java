package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;

/*reembolsa el monto total sin importar la fecha de cancelación (que de todas maneras 
debe ser anterior a la fecha de inicio de la reserva). 
 */
public class Flexible implements Politica{  

    @Override
    public double calcularReembolso(Reserva reserva){

        if(LocalDate.now().isBefore(reserva.getLapso().getFrom())){
            return reserva.getPrecio();
        }

        return 0.0;
    }

}
