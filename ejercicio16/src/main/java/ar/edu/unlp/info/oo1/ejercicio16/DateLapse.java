package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
    private LocalDate from;
    private LocalDate to;

    public DateLapse(LocalDate from, LocalDate to){
        if (from.isAfter(to)||from.isEqual(to)) {
            throw new IllegalArgumentException("La fecha 'from' debe ser anterior a 'to'");
        }

        this.from = from;
        this.to = to;
    }


    public LocalDate getFrom(){
        return this.from;
    }

    public LocalDate getTo(){
        return this.to;
    }

    //“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
    //Cambiando .DAYS por.MONTHS o .YEARS
    public long sizeInDays(){
        return ChronoUnit.DAYS.between(this.getFrom(), this.getTo());
    }


    //“recibe un objeto LocalDate y retorna true si la fecha está entre el from y 
    //el to del receptor y false en caso contrario”.

    public boolean includesDate(LocalDate other){
        return (other.isAfter(this.getFrom()) || other.isEqual(this.getFrom())) &&
            (other.isBefore(this.getTo()) || other.isEqual(this.getTo()));
    }
       



    /*
     * fecha a y fecha b
     * si fecha a-medio 
     * 
     * 
     */
}
