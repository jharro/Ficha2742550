import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el tamaño para el arreglo: ");
        int tamanio=input.nextInt();
        char letra[]=new char[tamanio];
        for (int i = 0; i < letra.length; i++) {
            System.out.println("Ingrese un caracter: ");
            letra[i]=input.next().charAt(0);
        }
        System.out.println("Datos en el orden ingresado");
        for (int i = 0; i < letra.length; i++) {
            System.out.println(letra[i]);
        }
        System.out.println("Datos del arreglo tipo char orden inverso");
        for (int i = letra.length-1; i >= 0; i--) {
            System.out.println(letra[i]);
        }
    }
}
