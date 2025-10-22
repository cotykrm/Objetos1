package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class Carpeta {
    private String nombre;
    private List<Email> emails;

    public Carpeta(String nombre){
        this.nombre = nombre;
        this.emails = new LinkedList<>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public List<Email> getEmails(){
        return this.emails;
    }

    public void agregarEmail(Email email){
        this.getEmails().add(email);
    }

    public void mover(Email email, Carpeta destino){
        destino.getEmails().add(email);
        this.getEmails().remove(email);
    }

    public int getTamanio(){
        return this.getEmails().stream()
        .mapToInt(email->email.getTamanio())
        .sum(); 
    }

    public Email buscar(String texto){
        return this.getEmails().stream()
        .map(mail -> mail.buscar(texto))
        .findFirst()
        .orElse(null);

    }



}
