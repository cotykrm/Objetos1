package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrdenServicio extends Orden {
    private String descripcion;
    private int horas;
    private List<Tecnico> tecnicos;

    public OrdenServicio(LocalDate fecha, Usuario usuario, String domicilio, String descripcion, int horas) {
        super(fecha, usuario, domicilio);
        this.descripcion = descripcion;
        this.horas = horas;
        this.tecnicos = new ArrayList<>();
    }

    public void agregarTecnico(Tecnico tecnico) {
        this.tecnicos.add(tecnico);
    }

    @Override
    public double calcularCostoTotal() {
        return this.getProductos().stream()
        .mapToDouble(producto -> producto.getCosto())
        .sum() +  this.getTecnicos().stream()
        .mapToDouble(tecnico -> tecnico.getValorHora()*this.getHoras())
        .sum();
        
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getHoras() {
        return horas;
    }

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public boolean conDescuento(){
        return this.getHoras()>10;
    }
}