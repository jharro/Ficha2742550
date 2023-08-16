import java.util.Scanner;

public class Leer {

    public static void main(String[] args) {
        //instanciar una variable de tipo Scanner
      Scanner sc = new Scanner(System.in);
      //Definición de variables
        String nombre;
        int edad;
        //Solicitud de datos de entrada
        System.out.println("Ingrese el nombre de la persona: ");
        nombre=sc.nextLine();
        System.out.println("Ingrese la edad: ");
        edad=sc.nextInt();

        //Mostrar los datos de salida
        System.out.println("El nombre ingresado fue: "+nombre);
        System.out.println("La edad ingresada fue: "+edad);

    }
}
