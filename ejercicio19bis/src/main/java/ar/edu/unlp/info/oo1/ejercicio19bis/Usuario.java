package ar.edu.unlp.info.oo1.ejercicio19bis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario{
    private String nombre;
    private String direccion;
    private List<Propiedad> propiedades;

    
    public Usuario(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.propiedades = new ArrayList<>();
    }

    public List<Propiedad> getPropiedades(){
        return this.propiedades;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public double getRetribucion(DateLapse periodo){
        double total = this.getPropiedades().stream()
        .mapToDouble(propiedad ->propiedad.getRetribucion(periodo))
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