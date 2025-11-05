package ar.edu.unlp.info.oo1.ejercicio19bis;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Propiedad {
    private String nombre;
    private String direccion;
    private List<Reserva> reservas;
    private double precioNoche;

    public Propiedad (String nombre, String direccion, double pxn){
        this.direccion = direccion;
        this.nombre = nombre;
        precioNoche = pxn;
        this.reservas = new LinkedList<>();
    }

    public List<Reserva> getReservas(){
        return this.reservas;
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
        .allMatch(reserva -> reserva.getDisponibilidad(lapso));

    }

    public void crearReserva(LocalDate inicio, LocalDate fin){
        if((this.getDisponibilidad(inicio, fin))){
            Reserva reserva = new Reserva(inicio, fin);
            this.getReservas().add(reserva);
        }
    }

    public void cancelarReserva(Reserva reserva){
        if(!reserva.enCurso()){
            this.getReservas().remove(reserva);
        }
    }

    public double getRetribucion(DateLapse periodo){
        return this.getReservas().stream()
        .mapToDouble(reserva ->reserva.getRetribucion(periodo,this.getPrecioNoche()))
        .sum();
    }
}