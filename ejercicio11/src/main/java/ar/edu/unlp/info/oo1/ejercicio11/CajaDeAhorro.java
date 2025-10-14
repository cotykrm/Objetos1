package ar.edu.unlp.info.oo1.ejercicio11;
public class CajaDeAhorro extends Cuenta{

    public CajaDeAhorro(){
        super();
    }
    @Override
    public boolean puedeExtraer(double monto){
        double comision = monto * 00.2;
        if(this.getSaldo() - monto - comision >= 0)
            return true;
        return false;
    }

}
