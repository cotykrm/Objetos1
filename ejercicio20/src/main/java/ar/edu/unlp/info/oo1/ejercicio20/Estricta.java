package ar.edu.unlp.info.oo1.ejercicio20;

/*Política de cancelación estricta: no reembolsará nada (0, cero) sin importar la fecha tentativa de cancelación.   */
public class Estricta implements Politica{
    
    @Override
    public double calcularReembolso(Reserva reserva){
        return 0.0;
    }


}
