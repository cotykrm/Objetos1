package ar.edu.unlp.info.oo1.ejercicio20;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario{
    private long dni;
    private String nombre;
    private String direccion;
    private List<Propiedad> propiedades;

    
    public Usuario(String nombre, String direccion, long dni){
        this.nombre = nombre;
        this.direccion = direccion;
        this.propiedades = new ArrayList<>();
        this.dni = dni;
    }

    public List<Propiedad> getPropiedades(){
        return this.propiedades;
    }

    public long getDni(){
        return this.dni;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public double getRedistribucion(DateLapse periodo){
        double total = this.getPropiedades().stream()
        .mapToDouble(propiedad ->propiedad.getRedistribucion(periodo))
        .sum();
        return total*0.75;
    }

    public void crearReserva(Propiedad propiedad, LocalDate inicio, LocalDate fin){
        propiedad.crearReserva(inicio, fin);
    }

    /*public void cancelarReserva(Reserva reserva){
        reserva.cancelarReserva();
    }*/


}