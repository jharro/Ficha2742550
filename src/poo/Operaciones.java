package poo;

public class Operaciones {
    private double valor1;
    private double valor2;



    public Operaciones(){

    }
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double Sumar(){
        double resultado=valor1+valor2;
        return resultado;
    }

    public double Restar(){
        double resultado=valor1-valor2;
        return resultado;
    }

    public double Multiplicar(){
        double resultado=valor1*valor2;
        return resultado;
    }
    public double Dividir(){
        double resultado=valor1/valor2;
        return resultado;
    }
}
