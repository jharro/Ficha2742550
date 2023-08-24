package poo;

import java.util.Scanner;

public class MainOperaciones {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double valor1,valor2;
        System.out.println("SISTEMA DE OPERACIONES BÁSICAS");
        System.out.println("SUMAR");
        System.out.println("Ingrese el primer valor para sumar");
        valor1=leer.nextDouble();
        System.out.println("Ingrese el segundo valor para sumar");
        valor2=leer.nextDouble();

        Operaciones operaciones=new Operaciones();
        operaciones.setValor1(valor1);
        operaciones.setValor2(valor2);
        System.out.println("El resultado de la suma es: "+operaciones.Sumar());
        System.out.println("El resultado de la resta es: "+operaciones.Restar());
        System.out.println("El resultado de la multiplicación es: "+operaciones.Multiplicar());
        System.out.println("El resultado de la división es: "+operaciones.Dividir());
    }
}
