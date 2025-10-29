package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Propiedad {
    private String nombre;
    private String direccion;
    private List<Reserva> reservas;
    private double precioNoche;
    private Politica politica;

    public Propiedad (String nombre, String direccion, double pxn, Politica politica){
        this.direccion = direccion;
        this.nombre = nombre;
        precioNoche = pxn;
        this.reservas = new LinkedList<>();
        this.politica = politica;
    }

    public List<Reserva> getReservas(){
        return this.reservas;
    }

    public Politica getPolitica(){
        return this.politica;
    }

    public void setPolitica(Politica politica){
        this.politica = politica;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }


    public double getPrecioNoche() {
        return this.precioNoche;
    }

    public boolean getDisponibilidad(LocalDate inicio, LocalDate fin){
        DateLapse lapso = new DateLapse(inicio, fin);
        return this.getReservas().stream()
        .allMatch(reserva -> reserva.overlaps(lapso));

    }

    public void crearReserva(LocalDate inicio, LocalDate fin){
        if((this.getDisponibilidad(inicio, fin))){
            Reserva reserva = new Reserva(inicio, fin, this);
            this.getReservas().add(reserva);
        }
    }

    public double cancelarReserva(Reserva reserva){
            this.getReservas().remove(reserva);
            return this.getPolitica().calcularReembolso(reserva);
    }

    public double getRedistribucion(DateLapse periodo){
        return this.getReservas().stream()
        .mapToDouble(reserva ->reserva.getRedistribucion(periodo))
        .sum();
    }
}