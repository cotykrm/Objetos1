package ar.edu.unlp.info.oo1.ejercicio19bis;

import java.time.LocalDate;

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

    public boolean enCurso(){
        return this.getLapso().getFrom().isBefore(LocalDate.now()) || this.getLapso().getFrom().equals(LocalDate.now()) && this.getLapso().getTo().isAfter(LocalDate.now());
    }

    public boolean getDisponibilidad (DateLapse other){
        return !this.getLapso().overlaps(other);
    }

    public double getRetribucion(DateLapse periodo, double precioNoche){
        if(this.getLapso().overlaps(periodo)){
            return this.getPrecio(precioNoche);
        }
        return 0;
    }
}
