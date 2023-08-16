import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        //10000 - 30000 - 45980.67 - 34500
        //  0       1       2          3
        //iterar: llenar- imprimir- recorrer
        // for

        Scanner input=new Scanner(System.in);
        System.out.print("Defina el tamaño del arreglo: ");
        int tamanio=input.nextInt();
        double [] salarios = new double[tamanio];
    int contadorMayoresMil=0;
       //length - tamaño

        System.out.println("Recorrer el arreglo");

        //punto o índice inicial: 0
        //condición de parada: 3------>
        //incremento: +1
        double acumulador=0;
        //Bucle for para llenar el arreglo
        //tamanio=30
        System.out.println("Ingrese la cantidad de valores para el arreglo: ");
        int cantidad=input.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un valor numérico: ");
            salarios[i]=input.nextDouble();
            acumulador+=salarios[i];
            if (salarios[i]>1000){
                contadorMayoresMil++;
            }
        }

        //Bucle for para imprimir el arreglo
        for (int i = 0; i < cantidad; i++) {
            System.out.println(salarios[i]);
        }

        //Valores en posiciones PARES---> 0 2 4 6 ....                                1 3
        //Valores que sean PARES--------> 1 6 5 10
        //Valores que sean múltiplos de 5
        System.out.println("El total de salarios es: "+acumulador);
        System.out.println("Cantidad de valores superiores a 1000---> "+contadorMayoresMil);
    }
}
