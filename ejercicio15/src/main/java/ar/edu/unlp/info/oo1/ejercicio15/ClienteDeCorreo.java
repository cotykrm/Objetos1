package ar.edu.unlp.info.oo1.ejercicio15;


/*
 * En respuesta al mensaje mover, mueve el email desde una carpeta de origen a una carpeta destino 
 * (asuma que el email está en la carpeta origen cuando se recibe este mensaje). 
En respuesta al mensaje buscar retorna el primer email en el Cliente de Correo cuyo título o cuerpo 
contienen el texto indicado como parámetro. Busca en todas las carpetas. 

 */

import java.util.LinkedList;
import java.util.List;

public class ClienteDeCorreo {
    private Carpeta inbox;
    private List<Carpeta> carpetas;

    public ClienteDeCorreo(){
        this.carpetas = new LinkedList<>();
        this.inbox = new Carpeta("inbox");
        this.carpetas.add(this.inbox);
    }

    public List<Carpeta> getCarpetas(){
        return this.carpetas;
    }

    public Carpeta getInbox(){
        return this.inbox;
    }

    public void agregarCarpeta(Carpeta carpeta){
        this.getCarpetas().add(carpeta);
    }

    public void agregarEmail(Email email){
        this.getInbox().agregarEmail(email);
    }

    public Email buscar(String texto){
        return this.carpetas.stream()
        .map(carpeta -> carpeta.buscar(texto))
        .findFirst()
        .orElse(null);
    }

    public int espacioOcupado(){
        return this.getInbox().getTamanio() + this.getCarpetas()
        .stream()
        .mapToInt(carpeta->carpeta.getTamanio())
        .sum();
    }

}
