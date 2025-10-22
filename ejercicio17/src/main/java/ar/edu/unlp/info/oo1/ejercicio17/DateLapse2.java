package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public class DateLapse2 implements DateLapseI{
    private LocalDate from;
    private long sizeInDays;

    public DateLapse2(LocalDate from, long size){
        if(size>0){
            this.from = from;
            this.sizeInDays = size;
        }
    }

    @Override
    public LocalDate getFrom(){
        return this.from;
    }

    @Override
    public long getSizeInDays(){
        return this.sizeInDays;
    } 

    @Override
    public LocalDate getTo() {
        return from.plusDays(sizeInDays);
    }


    @Override
    public boolean includesDate(LocalDate other){
        return (other.isAfter(this.getFrom()) || other.isEqual(this.getFrom())) &&
            (other.isBefore(this.getTo()) || other.isEqual(this.getTo()));
    }

}
