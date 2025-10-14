package ar.edu.unlp.info.oo1.ejercicio8;
import java.util.Date;


public class Mamifero {
    private String id;
    private String especie;
    private Date fechaNacimiento;
    private Mamifero padre;
    private Mamifero madre;

    public Mamifero(String id){
        this.id = id;
    }

    public Mamifero(){
        
    }

    public String getIdentificador(){
        return this.id;
    }

    public void setIdentificador(String id){
        this.id = id;
    }

    public String getEspecie(){
        return this.especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    

    public Mamifero getPadre(){
        return this.padre;
    }

    public void setPadre(Mamifero padre){
        this.padre = padre;
    }

    public Mamifero getMadre(){
        return this.madre;
    }

    public void setMadre(Mamifero madre){
        this.madre = madre;
    }
    
    public Mamifero getAbueloPaterno(){
        if(this.getPadre() != null)
            return this.getPadre().getPadre();
        return null;
    }

    public Mamifero getAbuelaPaterna(){
        if(this.getPadre() != null)
            return this.getPadre().getMadre();
        return null;
    }

    public Mamifero getAbueloMaterno(){
        if(this.getMadre() != null)
            return this.getMadre().getPadre();
        return null;
    }
     public Mamifero getAbueloMaterno2() {
        return (this.getMadre() != null) ? this.getMadre().getPadre() : null; 
     }


    public Mamifero getAbuelaMaterna(){
        if(this.getMadre() != null)
            return this.getMadre().getMadre();   
        return null;
    }

    public boolean tieneComoAncestroA(Mamifero m){
        Mamifero madre = this.getMadre();
        if(madre != null){
            if(madre.getIdentificador().equals(m.getIdentificador()))
                return true;
            if (madre.tieneComoAncestroA(m))
                return true;
        }
        Mamifero padre = this.getPadre();
        if(padre != null){
            if(padre.getIdentificador().equals(m.getIdentificador()))
                return true;
            
            if (padre.tieneComoAncestroA(m))
                return true;
        }
        return false;
    }
}
