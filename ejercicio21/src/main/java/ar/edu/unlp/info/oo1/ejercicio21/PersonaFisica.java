package ar.edu.unlp.info.oo1.ejercicio21;

public class PersonaFisica extends Cliente{
    private long dni;


    public PersonaFisica(String nombre, String direccion, long dni) {
        super(nombre, direccion);
        this.dni = dni;
    }

    public long getDni(){
        return this.dni;
    }

    @Override
    public double calcularCosto(DateLapse periodo) {
        return this.getEnvios().stream()
        .mapToDouble(envio -> envio.getMonto())
        .sum() * 0.9;
    }

}
