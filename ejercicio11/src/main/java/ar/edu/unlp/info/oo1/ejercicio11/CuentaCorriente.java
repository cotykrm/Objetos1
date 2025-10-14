package ar.edu.unlp.info.oo1.ejercicio11;

public class CuentaCorriente extends Cuenta{
    private double limiteDescubierto;

    public CuentaCorriente(){
        super();
        this.limiteDescubierto = 0;
    }

    public double geDescubierto(){
        return this.limiteDescubierto;
    }

    public void setDescubierto(double limite){
        this.limiteDescubierto = limite;
    }
    
    @Override
    protected boolean puedeExtraer(double monto) {
        if(this.getSaldo()-monto >= this.geDescubierto())
            return true;
        return false;
    }

}
