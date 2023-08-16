import java.util.Scanner;

public class MisFunciones {

    public void Menu(){
        System.out.println("1. Ejecuta Hola");
        System.out.println("2. Pida dos números y los sume");
        System.out.println("3. Pedir valores, enviar a una función que retorna su producto");
        System.out.println("4. Pide un nombre y retorna un mensaje");
        System.out.println("5. Salir");
    }

    public void Hola(){
        System.out.println("Hola...");
    }

    public void Suma_numeros(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el 1er número: "); int num1= sc.nextInt();
        System.out.print("Ingrese el 2do número: "); int num2= sc.nextInt();
        System.out.println("La suma de los números es: "+(num1+num2));

    }
    public double Producto(double numero1,int numero2,float numero3){
        return numero1*numero2*numero3;
    }
    public String saludar(String nombre){
        return "Hola "+nombre+" bienvenido a mi clase";
    }
}
