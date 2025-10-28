package ar.edu.unlp.info.oo1.ejercicio19;

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

    public double getRedistribucion(DateLapse periodo){
        double total = this.getPropiedades().stream()
        .mapToDouble(propiedad ->propiedad.getRedistribucion(periodo))
        .sum();
        return total*0.75;
    }


}