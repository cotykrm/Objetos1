package ar.edu.unlp.info.oo1.ejercicio21;

import java.util.LinkedList;
import java.util.List;

public abstract class Cliente {
    private String nombre;
    private String direccion;
    private List<Envio> envios;

    public Cliente(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.envios = new LinkedList<>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public List<Envio> getEnvios(){
        return this.envios;
    } 

    public void agregarEnvio(Envio envio){
        this.getEnvios().add(envio);
    }

    public abstract double calcularCosto(DateLapse periodo);
    


}
