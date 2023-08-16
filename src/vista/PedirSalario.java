package vista;
import modelo.Metodos;

import javax.swing.*;

//Pilares de la POO
//1. Abstracción
//2. Encapsulamiento
//3. herencia
//4.Polimorfismo

//Clase - Objeto - Constructor

public class PedirSalario {
    public static void main(String[] args) {
        double salario= Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario: "));
        double aumento= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el % aumento: "));

        Metodos metodos=new Metodos();//instanciado una variable de tipo Metodos
        metodos.nombre="Yolanda";
        double nuevoSalario=metodos.calcularNuevoSalario(salario,aumento);
        metodos.imprimirNuevoSalario(nuevoSalario);


    }
}
