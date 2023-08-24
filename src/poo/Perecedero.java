package poo;

public class Perecedero extends Producto{

    private int dias_a_caducar;

    public Perecedero(String nombre, double precio, int dias_a_caducar) {
        super(nombre, precio);
        this.dias_a_caducar = dias_a_caducar;
    }

    @Override
    public double calcular(int cantidad) {
        return cantidad*5;
    }
}
