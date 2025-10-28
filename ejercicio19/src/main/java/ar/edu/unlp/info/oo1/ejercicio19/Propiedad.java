package ar.edu.unlp.info.oo1.ejercicio19;

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
        

    }

    
}
