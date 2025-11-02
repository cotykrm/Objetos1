package ar.edu.unlp.info.oo1.ejercicio21;

import java.util.LinkedList;
import java.util.List;

public class Empresa {  
    private List<Cliente> clientes;
    
    public Empresa(){
        this.clientes = new LinkedList<>();

    }

    public double calcularCosto(Cliente cliente, DateLapse periodo){
        if(this.getClientes().contains(cliente)){
            return cliente.calcularCosto(periodo);
        }
        return 0;

    }

    public void agregarEnvio(Cliente cliente, Envio envio){
        if(!this.getClientes().contains(cliente)){
            this.getClientes().add(cliente);
        }
        cliente.agregarEnvio(envio);

    }

    public List<Cliente> getClientes(){
        return this.clientes;
    }

}
