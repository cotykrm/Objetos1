package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements DateLapseI{
    private LocalDate from;
    private LocalDate to;

    public DateLapse(LocalDate from, LocalDate to){
        if (from.isAfter(to)||from.isEqual(to)) {
            throw new IllegalArgumentException("La fecha 'from' debe ser anterior a 'to'");
        }
        this.from = from;
        this.to = to;
    }

    @Override
    public LocalDate getFrom(){
        return this.from;
    }
    @Override
    public LocalDate getTo(){
        return this.to;
    }

    //“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
    //Cambiando .DAYS por.MONTHS o .YEARS
    @Override
    public long getSizeInDays(){
        return ChronoUnit.DAYS.between(this.getFrom(), this.getTo());
    }


    //“recibe un objeto LocalDate y retorna true si la fecha está entre el from y 
    //el to del receptor y false en caso contrario”.

    @Override
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

