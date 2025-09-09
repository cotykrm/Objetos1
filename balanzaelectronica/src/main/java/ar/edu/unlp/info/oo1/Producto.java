public class Producto {
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public Producto(double peso, double precioKilo, String descripcion){
        this.peso = peso;
        this.precioPorKilo = precioKilo;
        this.descripcion = descripcion;
    }

    public double getPrecio(){
        return this.precioPorKilo;
    }

    public double getPeso(){
        return this.peso*this.precioPorKilo;
    }


}
