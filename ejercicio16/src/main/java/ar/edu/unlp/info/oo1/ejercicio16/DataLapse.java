package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataLapse {
    private LocalDate from;
    private LocalDate to;

    public DataLapse(LocalDate from, LocalDate to){
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
        //long fo = ChronoUnit.DAYS.between(this.getFrom(), other);
        //long ot = ChronoUnit.DAYS.between(other, this.getTo());
        if ((other.isAfter(this.getFrom()) || other.isEqual(this.getFrom())) &&
            (other.isBefore(this.getTo()) || other.isEqual(this.getTo()))) {
                return true;
        }
        return false;
    }
       



    /*
     * fecha a y fecha b
     * si fecha a-medio 
     * 
     * 
     */
}
