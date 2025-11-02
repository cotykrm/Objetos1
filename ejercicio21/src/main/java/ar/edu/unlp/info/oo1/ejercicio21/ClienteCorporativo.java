package ar.edu.unlp.info.oo1.ejercicio21;

public class ClienteCorporativo extends Cliente{
    private long cuil;

    public ClienteCorporativo(String nombre, String direccion, long cuil) {
        super(nombre, direccion);
        this.cuil = cuil;
    }

    public long getCuil(){
        return this.getCuil();
    }

    @Override
    public double calcularCosto() {
        return this.getEnvios().stream()
        .mapToDouble(envio -> envio.getMonto())
        .sum();
    }
        
    

    

}
