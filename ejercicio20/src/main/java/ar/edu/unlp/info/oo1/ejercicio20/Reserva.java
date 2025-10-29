package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;

//import ar.edu.unlp.info.oo1.ejercicio19.DateLapse;

public class Reserva {
    private Propiedad propiedad;
    // private double precio;
    private DateLapse lapso;

    public Reserva(LocalDate inicio, LocalDate fin, Propiedad propiedad){
        this.lapso = new DateLapse(inicio,fin);
        this.propiedad = propiedad;
    }

    public double getPrecio(){
        return this.lapso.sizeInDays()*this.propiedad.getPrecioNoche();
    }

    public Propiedad getPropiedad(){
        return this.propiedad;
    }

    public DateLapse getLapso(){
        return this.lapso;
    }

    public boolean estaEnRango(){
        return this.lapso.getFrom().isAfter(LocalDate.now());
    }

    public boolean overlaps (DateLapse other){
        return this.getLapso().overlaps(other);
    }

    public double getRedistribucion(DateLapse periodo){
        if(this.overlaps(periodo)){
            return this.getPrecio();
        }
        return 0;
    }

    public void cancelarReserva(){
        if(this.estaEnRango()){
            this.getPropiedad().cancelarReserva(this);
        }
    }
}
