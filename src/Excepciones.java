import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double salario;

        try {
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
        }
        catch(Exception e){
            System.out.println("Tipo de dato no válido, debe ser una cadena");
        }

        try {
            System.out.println("Salario: ");
            salario=sc.nextDouble();
        }catch(Exception e){
            System.out.println("Debe ser un valor numérico entero");
        }


    }
}
