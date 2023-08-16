package poo;

import java.util.Date;

public abstract class Human {
    private String nombre;
    private int edad;
    private String sexo;

    public Human(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public abstract int calcularIMC(double peso, double estatura);

    @Override
    public String toString() {
        return "Datos de la persona\n" +
                "Nombre: " + nombre +
                "\nEdad:" + edad +
                "\nSexo:" + sexo;
    }
}
