package poo;

import java.util.Date;

public class Aprendiz extends Human{
    private String correo;
    private double estatura;
    private double peso;

    public Aprendiz(String nombre, int edad, String sexo, String correo, double estatura, double peso) {
        super(nombre, edad, sexo);
        this.correo=correo;
        this.estatura=estatura;
        this.peso=peso;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int calcularIMC(double peso, double estatura) {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCorreo: "+this.correo+
                "\nEstatura: "+this.estatura+"\nPeso: "+this.peso;
    }
}
