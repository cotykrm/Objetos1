package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public interface DateLapseI {
    public LocalDate getFrom();
    public LocalDate getTo();
    public long getSizeInDays();
    boolean includesDate(LocalDate other);

}
