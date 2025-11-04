package ar.edu.unlp.info.oo1.ejercicio19bis;

import java.time.LocalDate;

//import ar.edu.unlp.info.oo1.ejercicio19.DateLapse;

public class Reserva {
    private DateLapse lapso;

    public Reserva(LocalDate inicio, LocalDate fin){
        this.lapso = new DateLapse(inicio,fin);

    }

    public double getPrecio(double precioNoche){
        return this.lapso.sizeInDays()*precioNoche;
    }

    public DateLapse getLapso(){
        return this.lapso;
    }

    public boolean estaEnRango(){
        return this.lapso.getFrom().isAfter(LocalDate.now());
    }

    public boolean getDisponibilidad (DateLapse other){
        return !this.getLapso().overlaps(other);
    }

    public double getRedistribucion(DateLapse period){
        if(this.overlaps(periodo)){
            return this.getPrecio();
        }
        return 0;
    }
}
