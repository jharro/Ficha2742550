import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        for(int i=10;i>=5;i++){
            System.out.print("Ingrese un valor numérico: ");
            numero=sc.nextInt();
            if (numero % 2 ==0){
                System.out.println("El número es par");
            }else {
                System.out.println("El núemro es impar");
            }
        }
    }
}
