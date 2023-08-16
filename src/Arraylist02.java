

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist02 {
    public static void main(String[] args) {
        ArrayList<Integer> enteros=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        while(true){
            mostrarMenu();
            int opcion=input.nextInt();
            int numeroBorrar;
            if (opcion==1){
                System.out.println("Ingrese un valor entero: ");
                enteros.add(input.nextInt());
                System.out.println("Agregado");
            }else if(opcion==2){
                System.out.println("Ingrese el número a borrar");
                numeroBorrar= input.nextInt();
                    if (enteros.contains(numeroBorrar)){
                        enteros.remove(Integer.valueOf(numeroBorrar));
                        System.out.println("Eliminado");
                    }else{
                        System.out.println("Elemento no encontrado");
                    }
            }else if(opcion==3){
                System.out.println("Su lista: "+enteros);
            }else if(opcion==4){
                System.out.println("Chao");
                break;
            }
        }

    }
    private static void mostrarMenu(){
        System.out.println();
        System.out.println("1. Agregar elemento");
        System.out.println("2. Borrar elemento");
        System.out.println("3. Mostrar elementoe");
        System.out.println("4. Salir");
        System.out.println();

    }
}
