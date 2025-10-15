package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class Email {
    private List<Archivo> adjuntos;
    private String titulo;
    private String cuerpo;    
    
    public Email(String titulo, String cuerpo){
        this.adjuntos = new LinkedList<>();
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getCuerpo(){
        return this.cuerpo;
    }

    public List<Archivo>getAdjuntos(){
        return this.adjuntos;
    }

    public int getTamanio(){
        int aux = this.getAdjuntos().stream()
        .mapToInt(adjunto->adjunto.getTamanio())
        .sum(); 
        return aux + this.getCuerpo().length() + this.getTitulo().length();
    }
}
