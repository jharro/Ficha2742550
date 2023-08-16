import javax.swing.*;
import java.util.Scanner;

public class MainMisFunciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        MisFunciones misFunciones = new MisFunciones();
        double numero1;
        int numero2;
        float numero3;

        misFunciones.Menu();
        int opcion =leer.nextInt();
        switch (opcion){
            case 1:
                misFunciones.Hola();
                break;
            case 2:
                misFunciones.Suma_numeros();
                break;
            case 3:
                System.out.print("Número 1 double: ");
                numero1=leer.nextDouble();
                System.out.print("Número 2 int: ");
                numero2=leer.nextInt();
                System.out.print("Número 2 float: ");
                numero3=leer.nextFloat();

                System.out.println("El producto es "+ misFunciones.Producto(numero1,numero2,numero3));
            break;
                case 4:
                String nombre= JOptionPane.showInputDialog("Ingrese su nombre");
                String mensaje=misFunciones.saludar(nombre);
                System.out.println(mensaje);
                break;
        }
    }
}
