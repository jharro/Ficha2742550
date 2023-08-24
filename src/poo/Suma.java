package poo;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double valor1,valor2,resultado=0;

        System.out.println("Valor 1: ");
        valor1=leer.nextDouble();
        System.out.println("Valor 2: ");
        valor2=leer.nextDouble();

        resultado=valor1+valor2;

        System.out.println("La suma es :"+resultado);

    }
}
